package io.vertigo.samples.dao.dao;

import javax.inject.Inject;

import io.vertigo.core.lang.Generated;
import io.vertigo.core.node.Node;
import io.vertigo.datamodel.task.definitions.TaskDefinition;
import io.vertigo.datamodel.task.model.Task;
import io.vertigo.datamodel.task.model.TaskBuilder;
import io.vertigo.datastore.entitystore.EntityStoreManager;
import io.vertigo.datastore.impl.dao.DAO;
import io.vertigo.datastore.impl.dao.StoreServices;
import io.vertigo.datamodel.smarttype.SmartTypeManager;
import io.vertigo.datamodel.task.TaskManager;
import io.vertigo.samples.dao.domain.Role;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class RoleDAO extends DAO<Role, java.lang.Long> implements StoreServices {

	/**
	 * Contructeur.
	 * @param entityStoreManager Manager de persistance
	 * @param taskManager Manager de Task
	 * @param smartTypeManager SmartTypeManager
	 */
	@Inject
	public RoleDAO(final EntityStoreManager entityStoreManager, final TaskManager taskManager, final SmartTypeManager smartTypeManager) {
		super(Role.class, entityStoreManager, taskManager, smartTypeManager);
	}


	/**
	 * Creates a taskBuilder.
	 * @param name  the name of the task
	 * @return the builder 
	 */
	private static TaskBuilder createTaskBuilder(final String name) {
		final TaskDefinition taskDefinition = Node.getNode().getDefinitionSpace().resolve(name, TaskDefinition.class);
		return Task.builder(taskDefinition);
	}

	/**
	 * Execute la tache TkInsertRolesBatch.
	 * @param rolesList DtList de Role
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			dataSpace = "mine",
			name = "TkInsertRolesBatch",
			request = "INSERT INTO MY_ROLE (ROL_ID, MOV_ID, ACT_ID, AS_CHARACTER) values (#rolesList.rolId#, #rolesList.movId#, #rolesList.actId#, #rolesList.asCharacter#)",
			taskEngineClass = io.vertigo.basics.task.TaskEngineProcBatch.class)
	public void insertRolesBatch(@io.vertigo.datamodel.task.proxy.TaskInput(name = "rolesList", smartType = "STyDtRole") final io.vertigo.datamodel.structure.model.DtList<io.vertigo.samples.dao.domain.Role> rolesList) {
		final Task task = createTaskBuilder("TkInsertRolesBatch")
				.addValue("rolesList", rolesList)
				.addContextProperty("connectionName", io.vertigo.datastore.impl.dao.StoreUtil.getConnectionName("mine"))
				.build();
		getTaskManager().execute(task);
	}

	/**
	 * Execute la tache TkLoadRolesByChunk.
	 * @param limit Long
	 * @param offset Long
	 * @return DtList de Role moviesList
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkLoadRolesByChunk",
			request = "select rol.* from role rol" + 
 "        	where ROL_ID > #offset#" + 
 "        	order by rol.ROL_ID asc" + 
 "        	limit #limit#",
			taskEngineClass = io.vertigo.basics.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyDtRole")
	public io.vertigo.datamodel.structure.model.DtList<io.vertigo.samples.dao.domain.Role> loadRolesByChunk(@io.vertigo.datamodel.task.proxy.TaskInput(name = "limit", smartType = "STyId") final Long limit, @io.vertigo.datamodel.task.proxy.TaskInput(name = "offset", smartType = "STyId") final Long offset) {
		final Task task = createTaskBuilder("TkLoadRolesByChunk")
				.addValue("limit", limit)
				.addValue("offset", offset)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

}