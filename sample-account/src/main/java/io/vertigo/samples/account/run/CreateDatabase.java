/**
 *
 */
package io.vertigo.samples.account.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Collections;

import javax.inject.Inject;

import io.vertigo.core.lang.WrappedException;
import io.vertigo.core.node.AutoCloseableNode;
import io.vertigo.core.resource.ResourceManager;
import io.vertigo.core.util.InjectorUtil;
import io.vertigo.database.sql.SqlManager;
import io.vertigo.database.sql.connection.SqlConnection;
import io.vertigo.database.sql.statement.SqlStatement;
import io.vertigo.samples.account.config.SampleConfigBuilder;

public class CreateDatabase {

	@Inject
	private ResourceManager resourceManager;
	@Inject
	private SqlManager sqlManager;

	public static void main(final String[] args) {
		try (final AutoCloseableNode node = new AutoCloseableNode(SampleConfigBuilder.createNodeConfigBuilder().build())) {
			final CreateDatabase createDatabase = new CreateDatabase();
			InjectorUtil.injectMembers(createDatabase);
			//-----
			createDatabase.createDataBase();
			createDatabase.initData();

		}
	}

	private void createDataBase() {
		SqlConnection connection;
		connection = sqlManager.getConnectionProvider(SqlManager.MAIN_CONNECTION_PROVIDER_NAME).obtainConnection();
		execSqlScript(connection, "sqlgen/crebas.sql");
	}

	private void initData() {
		SqlConnection connection;
		connection = sqlManager.getConnectionProvider(SqlManager.MAIN_CONNECTION_PROVIDER_NAME).obtainConnection();
		execSqlScript(connection, "sql/initdata.sql");
	}

	private void execSqlScript(final SqlConnection connection, final String scriptPath) {
		try {
			final StringBuilder crebaseSql = new StringBuilder();
			final BufferedReader in = new BufferedReader(new InputStreamReader(resourceManager.resolve(scriptPath).openStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				final String adaptedInputLine = inputLine.replaceAll("-- .*", "");//removed comments
				if (!"".equals(adaptedInputLine)) {
					crebaseSql.append(adaptedInputLine).append('\n');
				}
				if (inputLine.trim().endsWith(";")) {
					execPreparedStatement(connection, sqlManager, crebaseSql.toString());
					crebaseSql.setLength(0);
				}
			}
			in.close();
		} catch (final IOException e) {
			throw WrappedException.wrap(e, "Can't exec script {0}", scriptPath);
		}
	}

	private static void execPreparedStatement(final SqlConnection connection, final SqlManager sqlManager, final String sql) {
		try {
			sqlManager
					.executeUpdate(SqlStatement.builder(sql).build(), Collections.emptyMap(), connection);
		} catch (final SQLException e) {
			throw WrappedException.wrap(e, "Can't exec command {0}", sql);
		}
	}

}
