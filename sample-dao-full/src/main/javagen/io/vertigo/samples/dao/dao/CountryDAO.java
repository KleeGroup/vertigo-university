package io.vertigo.samples.dao.dao;

import javax.inject.Inject;

import io.vertigo.core.lang.Generated;
import io.vertigo.core.node.Home;
import io.vertigo.dynamo.task.metamodel.TaskDefinition;
import io.vertigo.dynamo.task.model.Task;
import io.vertigo.dynamo.task.model.TaskBuilder;
import io.vertigo.datastore.entitystore.EntityStoreManager;
import io.vertigo.datastore.impl.dao.DAO;
import io.vertigo.datastore.impl.dao.StoreServices;
import io.vertigo.dynamo.ngdomain.ModelManager;
import io.vertigo.dynamo.task.TaskManager;
import io.vertigo.samples.dao.domain.Country;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class CountryDAO extends DAO<Country, java.lang.Long> implements StoreServices {

	/**
	 * Contructeur.
	 * @param entityStoreManager Manager de persistance
	 * @param taskManager Manager de Task
	 */
	@Inject
	public CountryDAO(final EntityStoreManager entityStoreManager, final TaskManager taskManager, final ModelManager modelManager) {
		super(Country.class, entityStoreManager, taskManager, modelManager);
	}


	/**
	 * Creates a taskBuilder.
	 * @param name  the name of the task
	 * @return the builder 
	 */
	private static TaskBuilder createTaskBuilder(final String name) {
		final TaskDefinition taskDefinition = Home.getApp().getDefinitionSpace().resolve(name, TaskDefinition.class);
		return Task.builder(taskDefinition);
	}

	/**
	 * Execute la tache StTkInsertCountriesBatch.
	 * @param countryList DtList de Country
	*/
	@io.vertigo.dynamo.task.proxy.TaskAnnotation(
			dataSpace = "mine",
			name = "TkInsertCountriesBatch",
			request = "INSERT INTO MY_COUNTRY (COU_ID, NAME) values (#COUNTRY_LIST.COU_ID#, #COUNTRY_LIST.NAME#)",
			taskEngineClass = io.vertigo.dynamox.task.TaskEngineProcBatch.class)
	public void insertCountriesBatch(@io.vertigo.dynamo.task.proxy.TaskInput(name = "countryList", domain = "STyDtCountry") final io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.Country> countryList) {
		final Task task = createTaskBuilder("TkInsertCountriesBatch")
				.addValue("countryList", countryList)
				.build();
		getTaskManager().execute(task);
	}

	/**
	 * Execute la tache StTkLoadCountries.
	 * @return DtList de Country countryList
	*/
	@io.vertigo.dynamo.task.proxy.TaskAnnotation(
			name = "TkLoadCountries",
			request = "select * from COUNTRY",
			taskEngineClass = io.vertigo.dynamox.task.TaskEngineSelect.class)
	@io.vertigo.dynamo.task.proxy.TaskOutput(domain = "STyDtCountry")
	public io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.Country> loadCountries() {
		final Task task = createTaskBuilder("TkLoadCountries")
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

}
