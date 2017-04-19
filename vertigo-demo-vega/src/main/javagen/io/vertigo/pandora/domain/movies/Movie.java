package io.vertigo.pandora.domain.movies;

import io.vertigo.dynamo.domain.model.KeyConcept;
import io.vertigo.dynamo.domain.model.URI;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;

/**
 * Attention cette classe est générée automatiquement !
 * Objet de données Movie
 */
public final class Movie implements KeyConcept {

	/** SerialVersionUID. */
	private static final long serialVersionUID = 1L;

	private Long movId;
	private String title;
	private String originalTitle;
	private String synopsis;
	private String shortSynopsis;
	private String keywords;
	private String poster;
	private String trailerName;
	private String trailerHref;
	private Integer runtime;
	private String movieType;
	private Integer productionYear;
	private Integer userRating;
	private Integer pressRating;
	private io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.ActorRole> roles;
	private io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.Person> camera;
	private io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.Person> directors;
	private io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.Person> producers;
	private io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.Person> writers;

	/** {@inheritDoc} */
	@Override
	public URI<Movie> getURI() {
		return DtObjectUtil.createURI(this);
	}

	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'MOV ID'.
	 * @return Long movId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_IDENTITY", type = "ID", required = true, label = "MOV ID")
	public Long getMovId() {
		return movId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'MOV ID'.
	 * @param movId Long <b>Obligatoire</b>
	 */
	public void setMovId(final Long movId) {
		this.movId = movId;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'TITLE'.
	 * @return String title
	 */
	@Field(domain = "DO_LABEL", label = "TITLE")
	public String getTitle() {
		return title;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'TITLE'.
	 * @param title String
	 */
	public void setTitle(final String title) {
		this.title = title;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'ORIGINAL TITLE'.
	 * @return String originalTitle
	 */
	@Field(domain = "DO_LABEL", label = "ORIGINAL TITLE")
	public String getOriginalTitle() {
		return originalTitle;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'ORIGINAL TITLE'.
	 * @param originalTitle String
	 */
	public void setOriginalTitle(final String originalTitle) {
		this.originalTitle = originalTitle;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'SYNOPSIS'.
	 * @return String synopsis
	 */
	@Field(domain = "DO_TEXT", label = "SYNOPSIS")
	public String getSynopsis() {
		return synopsis;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'SYNOPSIS'.
	 * @param synopsis String
	 */
	public void setSynopsis(final String synopsis) {
		this.synopsis = synopsis;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'SHORT SYNOPSIS'.
	 * @return String shortSynopsis
	 */
	@Field(domain = "DO_TEXT", label = "SHORT SYNOPSIS")
	public String getShortSynopsis() {
		return shortSynopsis;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'SHORT SYNOPSIS'.
	 * @param shortSynopsis String
	 */
	public void setShortSynopsis(final String shortSynopsis) {
		this.shortSynopsis = shortSynopsis;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'KEYWORDS'.
	 * @return String keywords
	 */
	@Field(domain = "DO_LABEL", label = "KEYWORDS")
	public String getKeywords() {
		return keywords;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'KEYWORDS'.
	 * @param keywords String
	 */
	public void setKeywords(final String keywords) {
		this.keywords = keywords;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'POSTER'.
	 * @return String poster
	 */
	@Field(domain = "DO_HREF", label = "POSTER")
	public String getPoster() {
		return poster;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'POSTER'.
	 * @param poster String
	 */
	public void setPoster(final String poster) {
		this.poster = poster;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'TRAILER NAME'.
	 * @return String trailerName
	 */
	@Field(domain = "DO_LABEL", label = "TRAILER NAME")
	public String getTrailerName() {
		return trailerName;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'TRAILER NAME'.
	 * @param trailerName String
	 */
	public void setTrailerName(final String trailerName) {
		this.trailerName = trailerName;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'TRAILER HREF'.
	 * @return String trailerHref
	 */
	@Field(domain = "DO_HREF", label = "TRAILER HREF")
	public String getTrailerHref() {
		return trailerHref;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'TRAILER HREF'.
	 * @param trailerHref String
	 */
	public void setTrailerHref(final String trailerHref) {
		this.trailerHref = trailerHref;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'RUNTIME'.
	 * @return Integer runtime
	 */
	@Field(domain = "DO_RUNTIME", label = "RUNTIME")
	public Integer getRuntime() {
		return runtime;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'RUNTIME'.
	 * @param runtime Integer
	 */
	public void setRuntime(final Integer runtime) {
		this.runtime = runtime;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'MOVIE TYPE'.
	 * @return String movieType
	 */
	@Field(domain = "DO_LABEL_SHORT", label = "MOVIE TYPE")
	public String getMovieType() {
		return movieType;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'MOVIE TYPE'.
	 * @param movieType String
	 */
	public void setMovieType(final String movieType) {
		this.movieType = movieType;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'PRODUCTION YEAR'.
	 * @return Integer productionYear
	 */
	@Field(domain = "DO_YEAR", label = "PRODUCTION YEAR")
	public Integer getProductionYear() {
		return productionYear;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'PRODUCTION YEAR'.
	 * @param productionYear Integer
	 */
	public void setProductionYear(final Integer productionYear) {
		this.productionYear = productionYear;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'USER RATING'.
	 * @return Integer userRating
	 */
	@Field(domain = "DO_RATING", label = "USER RATING")
	public Integer getUserRating() {
		return userRating;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'USER RATING'.
	 * @param userRating Integer
	 */
	public void setUserRating(final Integer userRating) {
		this.userRating = userRating;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'PRESS RATING'.
	 * @return Integer pressRating
	 */
	@Field(domain = "DO_RATING", label = "PRESS RATING")
	public Integer getPressRating() {
		return pressRating;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'PRESS RATING'.
	 * @param pressRating Integer
	 */
	public void setPressRating(final Integer pressRating) {
		this.pressRating = pressRating;
	}

	/**
	 * Association : Roles.
	 * @return io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.ActorRole>
	 */
	public io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.ActorRole> getRolesList() {
//		return this.<io.vertigo.pandora.domain.persons.ActorRole> getList(getRolesListURI());
		// On doit avoir une clé primaire renseignée. Si ce n'est pas le cas, on renvoie une liste vide
		if (io.vertigo.dynamo.domain.util.DtObjectUtil.getId(this) == null) {
			return new io.vertigo.dynamo.domain.model.DtList<>(io.vertigo.pandora.domain.persons.ActorRole.class);
		}
		final io.vertigo.dynamo.domain.model.DtListURI fkDtListURI = getRolesDtListURI();
		io.vertigo.lang.Assertion.checkNotNull(fkDtListURI);
		//---------------------------------------------------------------------
		//On est toujours dans un mode lazy.
		if (roles == null) {
			roles = io.vertigo.app.Home.getApp().getComponentSpace().resolve(io.vertigo.dynamo.store.StoreManager.class).getDataStore().findAll(fkDtListURI);
		}
		return roles;
	}

	/**
	 * Association URI: Roles.
	 * @return URI de l'association
	 */
	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "A_MOV_MRO",
			fkFieldName = "MOV_ID",
			primaryDtDefinitionName = "DT_MOVIE",
			primaryIsNavigable = false,
			primaryRole = "Movie",
			primaryLabel = "Movie",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DT_ACTOR_ROLE",
			foreignIsNavigable = true,
			foreignRole = "Roles",
			foreignLabel = "Roles",
			foreignMultiplicity = "0..*")
	public io.vertigo.dynamo.domain.metamodel.association.DtListURIForSimpleAssociation getRolesDtListURI() {
		return io.vertigo.dynamo.domain.util.DtObjectUtil.createDtListURIForSimpleAssociation(this, "A_MOV_MRO", "Roles");
	}

	/**
	 * Association : Camera.
	 * @return io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.Person>
	 */
	public io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.Person> getCameraList() {
//		return this.<io.vertigo.pandora.domain.persons.Person> getList(getCameraListURI());
		// On doit avoir une clé primaire renseignée. Si ce n'est pas le cas, on renvoie une liste vide
		if (io.vertigo.dynamo.domain.util.DtObjectUtil.getId(this) == null) {
			return new io.vertigo.dynamo.domain.model.DtList<>(io.vertigo.pandora.domain.persons.Person.class);
		}
		final io.vertigo.dynamo.domain.model.DtListURI fkDtListURI = getCameraDtListURI();
		io.vertigo.lang.Assertion.checkNotNull(fkDtListURI);
		//---------------------------------------------------------------------
		//On est toujours dans un mode lazy.
		if (camera == null) {
			camera = io.vertigo.app.Home.getApp().getComponentSpace().resolve(io.vertigo.dynamo.store.StoreManager.class).getDataStore().findAll(fkDtListURI);
		}
		return camera;
	}

	/**
	 * Association URI: Camera.
	 * @return URI de l'association
	 */
	@io.vertigo.dynamo.domain.stereotype.AssociationNN(
			name = "ANN_CAMERA",
			tableName = "CAMERA",
			dtDefinitionA = "DT_MOVIE",
			dtDefinitionB = "DT_PERSON",
			navigabilityA = false,
			navigabilityB = true,
			roleA = "Movie",
			roleB = "Camera",
			labelA = "Movie",
			labelB = "Camera"
	)
	public io.vertigo.dynamo.domain.metamodel.association.DtListURIForNNAssociation getCameraDtListURI() {
		return io.vertigo.dynamo.domain.util.DtObjectUtil.createDtListURIForNNAssociation(this, "ANN_CAMERA", "Camera");
	}

	/**
	 * Association : Directors.
	 * @return io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.Person>
	 */
	public io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.Person> getDirectorsList() {
//		return this.<io.vertigo.pandora.domain.persons.Person> getList(getDirectorsListURI());
		// On doit avoir une clé primaire renseignée. Si ce n'est pas le cas, on renvoie une liste vide
		if (io.vertigo.dynamo.domain.util.DtObjectUtil.getId(this) == null) {
			return new io.vertigo.dynamo.domain.model.DtList<>(io.vertigo.pandora.domain.persons.Person.class);
		}
		final io.vertigo.dynamo.domain.model.DtListURI fkDtListURI = getDirectorsDtListURI();
		io.vertigo.lang.Assertion.checkNotNull(fkDtListURI);
		//---------------------------------------------------------------------
		//On est toujours dans un mode lazy.
		if (directors == null) {
			directors = io.vertigo.app.Home.getApp().getComponentSpace().resolve(io.vertigo.dynamo.store.StoreManager.class).getDataStore().findAll(fkDtListURI);
		}
		return directors;
	}

	/**
	 * Association URI: Directors.
	 * @return URI de l'association
	 */
	@io.vertigo.dynamo.domain.stereotype.AssociationNN(
			name = "ANN_DIRECTORS",
			tableName = "DIRECTORS",
			dtDefinitionA = "DT_MOVIE",
			dtDefinitionB = "DT_PERSON",
			navigabilityA = false,
			navigabilityB = true,
			roleA = "Movie",
			roleB = "Directors",
			labelA = "Movie",
			labelB = "Directors"
	)
	public io.vertigo.dynamo.domain.metamodel.association.DtListURIForNNAssociation getDirectorsDtListURI() {
		return io.vertigo.dynamo.domain.util.DtObjectUtil.createDtListURIForNNAssociation(this, "ANN_DIRECTORS", "Directors");
	}

	/**
	 * Association : Producers.
	 * @return io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.Person>
	 */
	public io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.Person> getProducersList() {
//		return this.<io.vertigo.pandora.domain.persons.Person> getList(getProducersListURI());
		// On doit avoir une clé primaire renseignée. Si ce n'est pas le cas, on renvoie une liste vide
		if (io.vertigo.dynamo.domain.util.DtObjectUtil.getId(this) == null) {
			return new io.vertigo.dynamo.domain.model.DtList<>(io.vertigo.pandora.domain.persons.Person.class);
		}
		final io.vertigo.dynamo.domain.model.DtListURI fkDtListURI = getProducersDtListURI();
		io.vertigo.lang.Assertion.checkNotNull(fkDtListURI);
		//---------------------------------------------------------------------
		//On est toujours dans un mode lazy.
		if (producers == null) {
			producers = io.vertigo.app.Home.getApp().getComponentSpace().resolve(io.vertigo.dynamo.store.StoreManager.class).getDataStore().findAll(fkDtListURI);
		}
		return producers;
	}

	/**
	 * Association URI: Producers.
	 * @return URI de l'association
	 */
	@io.vertigo.dynamo.domain.stereotype.AssociationNN(
			name = "ANN_PRODUCERS",
			tableName = "PRODUCERS",
			dtDefinitionA = "DT_MOVIE",
			dtDefinitionB = "DT_PERSON",
			navigabilityA = false,
			navigabilityB = true,
			roleA = "Movie",
			roleB = "Producers",
			labelA = "Movie",
			labelB = "Producers"
	)
	public io.vertigo.dynamo.domain.metamodel.association.DtListURIForNNAssociation getProducersDtListURI() {
		return io.vertigo.dynamo.domain.util.DtObjectUtil.createDtListURIForNNAssociation(this, "ANN_PRODUCERS", "Producers");
	}

	/**
	 * Association : Writers.
	 * @return io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.Person>
	 */
	public io.vertigo.dynamo.domain.model.DtList<io.vertigo.pandora.domain.persons.Person> getWritersList() {
//		return this.<io.vertigo.pandora.domain.persons.Person> getList(getWritersListURI());
		// On doit avoir une clé primaire renseignée. Si ce n'est pas le cas, on renvoie une liste vide
		if (io.vertigo.dynamo.domain.util.DtObjectUtil.getId(this) == null) {
			return new io.vertigo.dynamo.domain.model.DtList<>(io.vertigo.pandora.domain.persons.Person.class);
		}
		final io.vertigo.dynamo.domain.model.DtListURI fkDtListURI = getWritersDtListURI();
		io.vertigo.lang.Assertion.checkNotNull(fkDtListURI);
		//---------------------------------------------------------------------
		//On est toujours dans un mode lazy.
		if (writers == null) {
			writers = io.vertigo.app.Home.getApp().getComponentSpace().resolve(io.vertigo.dynamo.store.StoreManager.class).getDataStore().findAll(fkDtListURI);
		}
		return writers;
	}

	/**
	 * Association URI: Writers.
	 * @return URI de l'association
	 */
	@io.vertigo.dynamo.domain.stereotype.AssociationNN(
			name = "ANN_WRITERS",
			tableName = "WRITERS",
			dtDefinitionA = "DT_MOVIE",
			dtDefinitionB = "DT_PERSON",
			navigabilityA = false,
			navigabilityB = true,
			roleA = "Movie",
			roleB = "Writers",
			labelA = "Movie",
			labelB = "Writers"
	)
	public io.vertigo.dynamo.domain.metamodel.association.DtListURIForNNAssociation getWritersDtListURI() {
		return io.vertigo.dynamo.domain.util.DtObjectUtil.createDtListURIForNNAssociation(this, "ANN_WRITERS", "Writers");
	}


	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
