package io.vertigo.samples.dao.services;

import io.vertigo.dynamo.store.StoreServices;
import io.vertigo.samples.dao.domain.Movie;

public interface MovieServices extends StoreServices {

	Movie getMovieById(Long movId);

}
