package io.vertigo.samples.dao.dao;

import javax.inject.Inject;

import io.vertigo.core.lang.Generated;
import io.vertigo.datastore.entitystore.EntityStoreManager;
import io.vertigo.datastore.impl.dao.DAO;
import io.vertigo.datastore.impl.dao.StoreServices;
import io.vertigo.dynamo.task.TaskManager;
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
	 */
	@Inject
	public RoleDAO(final EntityStoreManager entityStoreManager, final TaskManager taskManager) {
		super(Role.class, entityStoreManager, taskManager);
	}

}
