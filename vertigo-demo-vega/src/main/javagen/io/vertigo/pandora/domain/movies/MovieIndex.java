package io.vertigo.pandora.domain.movies;

import io.vertigo.dynamo.domain.model.DtObject;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;

/**
 * Attention cette classe est générée automatiquement !
 * Objet de données MovieIndex
 */
public final class MovieIndex implements DtObject {

	/** SerialVersionUID. */
	private static final long serialVersionUID = 1L;

	private Long movId;
	private String title;
	private String titleSortOnly;
	private String originalTitle;
	private String synopsis;
	private String shortSynopsis;
	private String keywords;
	private String poster;
	private Integer runtime;
	private String movieType;
	private Integer productionYear;
	private Integer userRating;
	private Integer pressRating;
	private String actorRoles;
	private String writers;
	private String camera;
	private String producers;
	private String directors;

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'id'.
	 * @return Long movId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_IDENTITY", required = true, label = "id")
	public Long getMovId() {
		return movId;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'id'.
	 * @param movId Long <b>Obligatoire</b>
	 */
	public void setMovId(final Long movId) {
		this.movId = movId;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Title'.
	 * @return String title
	 */
	@Field(domain = "DO_LABEL", label = "Title")
	public String getTitle() {
		return title;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Title'.
	 * @param title String
	 */
	public void setTitle(final String title) {
		this.title = title;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Title'.
	 * @return String titleSortOnly
	 */
	@Field(domain = "DO_TEXT_NOT_TOKENIZED", persistent = false, label = "Title")
	public String getTitleSortOnly() {
		return titleSortOnly;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Title'.
	 * @param titleSortOnly String
	 */
	public void setTitleSortOnly(final String titleSortOnly) {
		this.titleSortOnly = titleSortOnly;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Original Title'.
	 * @return String originalTitle
	 */
	@Field(domain = "DO_LABEL", label = "Original Title")
	public String getOriginalTitle() {
		return originalTitle;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Original Title'.
	 * @param originalTitle String
	 */
	public void setOriginalTitle(final String originalTitle) {
		this.originalTitle = originalTitle;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Synopsis'.
	 * @return String synopsis
	 */
	@Field(domain = "DO_TEXT", label = "Synopsis")
	public String getSynopsis() {
		return synopsis;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Synopsis'.
	 * @param synopsis String
	 */
	public void setSynopsis(final String synopsis) {
		this.synopsis = synopsis;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'shortSynopsis'.
	 * @return String shortSynopsis
	 */
	@Field(domain = "DO_TEXT", label = "shortSynopsis")
	public String getShortSynopsis() {
		return shortSynopsis;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'shortSynopsis'.
	 * @param shortSynopsis String
	 */
	public void setShortSynopsis(final String shortSynopsis) {
		this.shortSynopsis = shortSynopsis;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'keywords'.
	 * @return String keywords
	 */
	@Field(domain = "DO_LABEL", label = "keywords")
	public String getKeywords() {
		return keywords;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'keywords'.
	 * @param keywords String
	 */
	public void setKeywords(final String keywords) {
		this.keywords = keywords;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'poster'.
	 * @return String poster
	 */
	@Field(domain = "DO_TEXT_NOT_TOKENIZED", label = "poster")
	public String getPoster() {
		return poster;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'poster'.
	 * @param poster String
	 */
	public void setPoster(final String poster) {
		this.poster = poster;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'runtime'.
	 * @return Integer runtime
	 */
	@Field(domain = "DO_RUNTIME", label = "runtime")
	public Integer getRuntime() {
		return runtime;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'runtime'.
	 * @param runtime Integer
	 */
	public void setRuntime(final Integer runtime) {
		this.runtime = runtime;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Movie type'.
	 * @return String movieType
	 */
	@Field(domain = "DO_LABEL_SHORT", label = "Movie type")
	public String getMovieType() {
		return movieType;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Movie type'.
	 * @param movieType String
	 */
	public void setMovieType(final String movieType) {
		this.movieType = movieType;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'productionYear'.
	 * @return Integer productionYear
	 */
	@Field(domain = "DO_YEAR", label = "productionYear")
	public Integer getProductionYear() {
		return productionYear;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'productionYear'.
	 * @param productionYear Integer
	 */
	public void setProductionYear(final Integer productionYear) {
		this.productionYear = productionYear;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'userRating'.
	 * @return Integer userRating
	 */
	@Field(domain = "DO_RATING", label = "userRating")
	public Integer getUserRating() {
		return userRating;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'userRating'.
	 * @param userRating Integer
	 */
	public void setUserRating(final Integer userRating) {
		this.userRating = userRating;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'presRating'.
	 * @return Integer pressRating
	 */
	@Field(domain = "DO_RATING", label = "presRating")
	public Integer getPressRating() {
		return pressRating;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'presRating'.
	 * @param pressRating Integer
	 */
	public void setPressRating(final Integer pressRating) {
		this.pressRating = pressRating;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Roles'.
	 * @return String actorRoles
	 */
	@Field(domain = "DO_MULTI_VALUES", label = "Roles")
	public String getActorRoles() {
		return actorRoles;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Roles'.
	 * @param actorRoles String
	 */
	public void setActorRoles(final String actorRoles) {
		this.actorRoles = actorRoles;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Writers'.
	 * @return String writers
	 */
	@Field(domain = "DO_MULTI_VALUES", label = "Writers")
	public String getWriters() {
		return writers;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Writers'.
	 * @param writers String
	 */
	public void setWriters(final String writers) {
		this.writers = writers;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Camera'.
	 * @return String camera
	 */
	@Field(domain = "DO_MULTI_VALUES", label = "Camera")
	public String getCamera() {
		return camera;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Camera'.
	 * @param camera String
	 */
	public void setCamera(final String camera) {
		this.camera = camera;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Producers'.
	 * @return String producers
	 */
	@Field(domain = "DO_MULTI_VALUES", label = "Producers")
	public String getProducers() {
		return producers;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Producers'.
	 * @param producers String
	 */
	public void setProducers(final String producers) {
		this.producers = producers;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Directors'.
	 * @return String directors
	 */
	@Field(domain = "DO_MULTI_VALUES", label = "Directors")
	public String getDirectors() {
		return directors;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Directors'.
	 * @param directors String
	 */
	public void setDirectors(final String directors) {
		this.directors = directors;
	}

	//Aucune Association déclarée

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
