package io.vertigo.samples;

import javax.inject.Inject;

import io.vertigo.core.node.Node;
import io.vertigo.core.lang.Assertion;
import io.vertigo.core.lang.Generated;
import io.vertigo.datamodel.task.TaskManager;
import io.vertigo.datamodel.task.definitions.TaskDefinition;
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
	 * Execute la tache TkGetMovieByYear.
	 * @return DtList de MovieByYear movies
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkGetMovieByYear",
			request = "select YEAR, count(*) as MOVIES_COUNT from movie where YEAR is not null group by year order by YEAR asc",
			taskEngineClass = io.vertigo.basics.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyDtMovieByYear")
	public io.vertigo.datamodel.structure.model.DtList<io.vertigo.samples.dao.domain.MovieByYear> getMovieByYear() {
		final Task task = createTaskBuilder("TkGetMovieByYear")
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TkGetMovieDisplay.
	 * @return DtList de MovieDisplay movies
	*/
	@io.vertigo.datamodel.task.proxy.TaskAnnotation(
			name = "TkGetMovieDisplay",
			request = "select mov.NAME,mov.YEAR, cou.NAME as COUNTRY, hv.CNT as ACTORS_COUNT" + 
 "		from movie mov" + 
 "		join country cou on cou.COU_ID = mov.COU_ID" + 
 "		join (select MOV_ID, count(*) cnt from role group by mov_id ) hv on hv.MOV_ID = mov.MOV_ID" + 
 "		where mov.YEAR > 2010" + 
 "		limit 500",
			taskEngineClass = io.vertigo.basics.task.TaskEngineSelect.class)
	@io.vertigo.datamodel.task.proxy.TaskOutput(smartType = "STyDtMovieDisplay")
	public io.vertigo.datamodel.structure.model.DtList<io.vertigo.samples.dao.domain.MovieDisplay> getMovieDisplay() {
		final Task task = createTaskBuilder("TkGetMovieDisplay")
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	private TaskManager getTaskManager() {
		return taskManager;
	}
}