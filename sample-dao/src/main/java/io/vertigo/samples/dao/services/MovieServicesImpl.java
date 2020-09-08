package io.vertigo.samples.dao.services;

import javax.inject.Inject;

import io.vertigo.commons.transaction.Transactional;
import io.vertigo.core.lang.Assertion;
import io.vertigo.samples.dao.aspect.Supervision;
import io.vertigo.samples.dao.dao.MovieDAO;
import io.vertigo.samples.dao.domain.Movie;

@Transactional
@Supervision
public class MovieServicesImpl implements MovieServices {

	@Inject
	private MovieDAO movieDAO;

	@Override
	public Movie getMovieById(final Long movId) {
		Assertion.check().isNotNull(movId);
		// ---
		return movieDAO.get(movId);
	}

}
