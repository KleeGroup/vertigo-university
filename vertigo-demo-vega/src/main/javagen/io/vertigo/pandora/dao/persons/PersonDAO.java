package io.vertigo.pandora.dao.persons;

import javax.inject.Inject;
import java.util.List;
import io.vertigo.app.Home;
import io.vertigo.core.component.di.injector.DIInjector;
import io.vertigo.dynamo.search.SearchManager;
import io.vertigo.dynamo.search.metamodel.SearchIndexDefinition;
import io.vertigo.dynamo.search.model.SearchQuery;
import io.vertigo.dynamo.search.model.SearchQueryBuilder;
import io.vertigo.dynamo.domain.model.DtListState;
import io.vertigo.dynamo.collections.ListFilter;
import io.vertigo.dynamo.collections.metamodel.FacetedQueryDefinition;
import io.vertigo.dynamo.collections.metamodel.ListFilterBuilder;
import io.vertigo.dynamo.collections.model.FacetedQueryResult;
import io.vertigo.pandora.domain.persons.PersonIndex;
import io.vertigo.dynamo.domain.model.URI;
import io.vertigo.dynamo.impl.store.util.DAO;
import io.vertigo.dynamo.store.StoreManager;
import io.vertigo.dynamo.store.StoreServices;
import io.vertigo.dynamo.task.TaskManager;
import io.vertigo.pandora.domain.persons.Person;

/**
 * DAO : Accès à un object (DTO, DTC). 
 * PersonDAO
 */
public final class PersonDAO extends DAO<Person, java.lang.Long> implements StoreServices {
	private final SearchManager searchManager;

	/**
	 * Contructeur.
	 * @param storeManager Manager de persistance
	 * @param taskManager Manager de Task
	 * @param searchManager Manager de Search
	 */
	@Inject
	public PersonDAO(final StoreManager storeManager, final TaskManager taskManager, final SearchManager searchManager) {
		super(Person.class, storeManager, taskManager);
		this.searchManager = searchManager;
	}

	/**
	 * Indique que le keyConcept associé à cette uri va être modifié.
	 * Techniquement cela interdit les opérations d'ecriture en concurrence 
	 * et envoie un évenement de modification du keyConcept (à la fin de transaction eventuellement) 
	 * @param uri URI du keyConcept modifié
	 * @return KeyConcept à modifier
	 */
	 public Person readOneForUpdate(final URI<Person> uri) {
		return dataStore.readOneForUpdate(uri);
	}

	/**
	 * Indique que le keyConcept associé à cet id va être modifié.
	 * Techniquement cela interdit les opérations d'ecriture en concurrence 
	 * et envoie un évenement de modification du keyConcept (à la fin de transaction eventuellement) 
	 * @param id Clé du keyConcept modifié
	 * @return KeyConcept à modifier
	 */
	 public Person readOneForUpdate(final java.lang.Long id) {
		return readOneForUpdate(createDtObjectURI(id));
	}

	/**
	 * Création d'une SearchQuery de type : Person.
	 * @param criteria Critères de recherche
	 * @param listFilters Liste des filtres à appliquer (notament les facettes sélectionnées)
	 * @return SearchQueryBuilder pour ce type de recherche
	 */
	public SearchQueryBuilder createSearchQueryBuilderPerson(final String criteria, final List<ListFilter> listFilters) {
		final FacetedQueryDefinition facetedQueryDefinition = Home.getApp().getDefinitionSpace().resolve("QRY_PERSON", FacetedQueryDefinition.class);
		final ListFilterBuilder<String> listFilterBuilder = DIInjector.newInstance(facetedQueryDefinition.getListFilterBuilderClass(), Home.getApp().getComponentSpace());
		final ListFilter criteriaListFilter = listFilterBuilder.withBuildQuery(facetedQueryDefinition.getListFilterBuilderQuery()).withCriteria(criteria).build();
		return new SearchQueryBuilder(criteriaListFilter).withFacetStrategy(facetedQueryDefinition, listFilters);
	}

	/**
	 * Récupération du résultat issu d'une requête.
	 * @param searchQuery critères initiaux
	 * @param listState Etat de la liste (tri et pagination)
	 * @return Résultat correspondant à la requête (de type PersonIndex) 
	 */
	public FacetedQueryResult<PersonIndex, SearchQuery> loadList(final SearchQuery searchQuery, final DtListState listState) {
		final SearchIndexDefinition indexDefinition = searchManager.findIndexDefinitionByKeyConcept(Person.class);
		return searchManager.loadList(indexDefinition, searchQuery, listState);
	}
}
