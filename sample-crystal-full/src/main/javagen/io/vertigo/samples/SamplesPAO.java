package io.vertigo.samples;

import javax.inject.Inject;

import io.vertigo.core.node.Node;
import io.vertigo.core.lang.Assertion;
import io.vertigo.core.lang.Generated;
import io.vertigo.datamodel.task.TaskManager;
import io.vertigo.datamodel.task.metamodel.TaskDefinition;
import io.vertigo.datamodel.task.model.Task;
import io.vertigo.datamodel.task.model.TaskBuilder;
import io.vertigo.datastore.impl.dao.StoreServices;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
 @Generated
public final class SamplesPAO implements StoreServices {
	private final TaskManager taskManager;

	/**
	 * Constructeur.
	 * @param taskManager Manager des Task
	 */
	@Inject
	public SamplesPAO(final TaskManager taskManager) {
		Assertion.check().isNotNull(taskManager);
		//-----
		this.taskManager = taskManager;
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
	 * Execute la tache TkGetActorsIdsByMovie.
	 * @param movId Long
	 * @return List de Long actors
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkGetActorsIdsByMovie",
			request = "select act.act_id " + 
 "			from role rol" + 
 "			join actor act on rol.act_id= act.act_id " + 
 "			join movie mov on rol.mov_id = mov.mov_id " + 
 "			where mov.mov_id = #movId#",
			taskEngineClass = io.vertigo.dynamox.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyId")
	public java.util.List<Long> getActorsIdsByMovie(@io.vertigo.datamodel.task.proxy.TaskInput(name = "movId", smartType = "STyId") final Long movId) {
		final Task task = createTaskBuilder("TkGetActorsIdsByMovie")
				.addValue("movId", movId)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	private TaskManager getTaskManager() {
		return taskManager;
	}
}
