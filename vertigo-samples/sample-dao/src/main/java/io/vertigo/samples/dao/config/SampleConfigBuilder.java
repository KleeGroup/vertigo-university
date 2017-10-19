package io.vertigo.samples.dao.config;

import io.vertigo.app.config.AppConfig;
import io.vertigo.app.config.AppConfigBuilder;
import io.vertigo.app.config.DefinitionProviderConfig;
import io.vertigo.app.config.ModuleConfig;
import io.vertigo.commons.impl.CommonsFeatures;
import io.vertigo.commons.plugins.cache.memory.MemoryCachePlugin;
import io.vertigo.core.param.Param;
import io.vertigo.core.plugins.resource.classpath.ClassPathResourceResolverPlugin;
import io.vertigo.database.impl.sql.vendor.h2.H2DataBase;
import io.vertigo.database.plugins.sql.connection.c3p0.C3p0ConnectionProviderPlugin;
import io.vertigo.dynamo.impl.DynamoFeatures;
import io.vertigo.dynamo.plugins.environment.DynamoDefinitionProvider;
import io.vertigo.dynamo.plugins.store.datastore.sql.SqlDataStorePlugin;
import io.vertigo.samples.dao.aspect.SupervisionAspect;

public class SampleConfigBuilder {
	public static AppConfigBuilder createAppConfigBuilder() {
		// @formatter:off
				return createAppConfigBuilderCore();
		// @formatter:on
	}

	public static AppConfigBuilder createAppConfigBuilderCore() {
		// @formatter:off
		return AppConfig.builder()
				.beginBoot()
					.withLocales("fr_FR")
					.addPlugin(ClassPathResourceResolverPlugin.class)
				.endBoot()
				.addModule(new CommonsFeatures()
					.withCache(MemoryCachePlugin.class)
					.withScript()
					.build())
				.addModule(new DynamoFeatures()
					.withStore()
					.withSqlDataBase()
					.addSqlConnectionProviderPlugin(C3p0ConnectionProviderPlugin.class,
							Param.of("dataBaseClass", H2DataBase.class.getName()),
							Param.of("jdbcDriver", org.h2.Driver.class.getName()),
							Param.of("jdbcUrl", "jdbc:h2:D:/atelier/database/formation_loaded"))
					.addDataStorePlugin(SqlDataStorePlugin.class,
							Param.of("sequencePrefix", "SEQ_"))
					.build())
				.addModule(ModuleConfig.builder("ressources")
						.addDefinitionProvider(DefinitionProviderConfig.builder(DynamoDefinitionProvider.class)
								.addDefinitionResource("kpr", "application.kpr")
								.build())
						.build())
				.addModule(ModuleConfig.builder("aspect")
						.addAspect(SupervisionAspect.class)
						.build());
		// @formatter:on
	}

}