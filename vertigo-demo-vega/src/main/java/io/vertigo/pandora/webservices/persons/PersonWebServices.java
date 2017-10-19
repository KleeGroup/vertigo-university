package io.vertigo.pandora.webservices.persons;

import java.util.Optional;

import javax.inject.Inject;

import io.vertigo.dynamo.collections.model.FacetedQueryResult;
import io.vertigo.dynamo.search.model.SearchQuery;
import io.vertigo.pandora.domain.persons.Person;
import io.vertigo.pandora.domain.persons.PersonIndex;
import io.vertigo.pandora.services.persons.PersonServices;
import io.vertigo.vega.engines.webservice.json.UiSelectedFacets;
import io.vertigo.vega.webservice.WebServices;
import io.vertigo.vega.webservice.model.UiListState;
import io.vertigo.vega.webservice.stereotype.AnonymousAccessAllowed;
import io.vertigo.vega.webservice.stereotype.GET;
import io.vertigo.vega.webservice.stereotype.InnerBodyParam;
import io.vertigo.vega.webservice.stereotype.POST;
import io.vertigo.vega.webservice.stereotype.PUT;
import io.vertigo.vega.webservice.stereotype.PathParam;
import io.vertigo.vega.webservice.stereotype.PathPrefix;
import io.vertigo.vega.webservice.stereotype.QueryParam;

@PathPrefix("/persons")
public class PersonWebServices implements WebServices {
	@Inject
	private PersonServices personServices;

	@AnonymousAccessAllowed
	@GET("/search")
	public FacetedQueryResult<PersonIndex, SearchQuery> searchPersons(@QueryParam("q") final String criteria,
			@QueryParam("group") final Optional<String> clusteringFacetName, final UiListState uiListState) {
		return search(criteria, new UiSelectedFacets(), clusteringFacetName, uiListState);
	}

	@AnonymousAccessAllowed
	@POST("/search")
	public FacetedQueryResult search(@InnerBodyParam("criteria") final String criteria,
			@InnerBodyParam("facets") final UiSelectedFacets uiSelectedFacets,
			@InnerBodyParam("group") final Optional<String> clusteringFacetName, final UiListState uiListState) {
		return personServices.searchPersons(criteria, uiSelectedFacets.toSelectedFacetValues(), uiListState.toDtListState(),
				clusteringFacetName);
	}

	@AnonymousAccessAllowed
	@GET("/{id}")
	public Person getPerson(final @PathParam("id") long id) {
		return personServices.getPerson(id);
	}

	@AnonymousAccessAllowed
	@PUT("/{id}")
	public Person updatePerson(final @PathParam("id") long id, final Person person) {
		person.setPerId(id);
		personServices.save(person);
		return getPerson(id);
	}

	@AnonymousAccessAllowed
	@POST("/")
	public void createPerson(final Person person) {
		throw new RuntimeException("Not supported yet !");
	}

}