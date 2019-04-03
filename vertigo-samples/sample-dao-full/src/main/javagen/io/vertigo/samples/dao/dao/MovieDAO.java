package io.vertigo.samples.dao.dao;

import javax.inject.Inject;

import java.util.Optional;
import io.vertigo.app.Home;
import io.vertigo.dynamo.task.metamodel.TaskDefinition;
import io.vertigo.dynamo.task.model.Task;
import io.vertigo.dynamo.task.model.TaskBuilder;
import io.vertigo.dynamo.impl.store.util.DAO;
import io.vertigo.dynamo.store.StoreManager;
import io.vertigo.dynamo.store.StoreServices;
import io.vertigo.dynamo.task.TaskManager;
import io.vertigo.samples.dao.domain.Movie;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class MovieDAO extends DAO<Movie, java.lang.Long> implements StoreServices {

	/**
	 * Contructeur.
	 * @param storeManager Manager de persistance
	 * @param taskManager Manager de Task
	 */
	@Inject
	public MovieDAO(final StoreManager storeManager, final TaskManager taskManager) {
		super(Movie.class, storeManager, taskManager);
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
	 * Execute la tache TkGetMoviesByCriteria.
	 * @param title String 
	 * @param year Integer 
	 * @return io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.Movie> movies
	*/
	public io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.Movie> getMoviesByCriteria(final String title, final Integer year) {
		final Task task = createTaskBuilder("TkGetMoviesByCriteria")
				.addValue("title", title)
				.addValue("year", year)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TkGetMoviesByCriteriaWithCountry.
	 * @param title String 
	 * @param year Integer (peut être null)
	 * @param countries io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.Country> 
	 * @return io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.Movie> movies
	*/
	public io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.Movie> getMoviesByCriteriaWithCountry(final String title, final Optional<Integer> year, final io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.Country> countries) {
		final Task task = createTaskBuilder("TkGetMoviesByCriteriaWithCountry")
				.addValue("title", title)
				.addValue("year", year.orElse(null))
				.addValue("countries", countries)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TkGetMoviesWith100Actors.
	 * @return io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.Movie> movies
	*/
	public io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.Movie> getMoviesWith100Actors() {
		final Task task = createTaskBuilder("TkGetMoviesWith100Actors")
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

	/**
	 * Execute la tache TkInsertMoviesBatch.
	 * @param moviesList io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.Movie> 
	*/
	public void insertMoviesBatch(final io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.Movie> moviesList) {
		final Task task = createTaskBuilder("TkInsertMoviesBatch")
				.addValue("moviesList", moviesList)
				.build();
		getTaskManager().execute(task);
	}

	/**
	 * Execute la tache TkLoadMoviesByChunk.
	 * @param limit Long 
	 * @param offset Long 
	 * @return io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.Movie> moviesList
	*/
	public io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.Movie> loadMoviesByChunk(final Long limit, final Long offset) {
		final Task task = createTaskBuilder("TkLoadMoviesByChunk")
				.addValue("limit", limit)
				.addValue("offset", offset)
				.build();
		return getTaskManager()
				.execute(task)
				.getResult();
	}

}
