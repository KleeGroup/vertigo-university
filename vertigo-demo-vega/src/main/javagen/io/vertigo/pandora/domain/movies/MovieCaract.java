package io.vertigo.pandora.domain.movies;

import io.vertigo.dynamo.domain.model.Fragment;
import io.vertigo.dynamo.domain.model.URI;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;

/**
 * Attention cette classe est générée automatiquement !
 * Objet de données MovieCaract
 */
@io.vertigo.dynamo.domain.stereotype.Fragment(fragmentOf = "DT_MOVIE")
public final class MovieCaract implements Fragment<Movie> {

	/** SerialVersionUID. */
	private static final long serialVersionUID = 1L;

	private String title;
	private String originalTitle;
	private String keywords;
	private Integer runtime;
	private String movieType;
	private Integer productionYear;
	private Long movId;

	/** {@inheritDoc} */
	@Override
	public URI<Movie> getEntityURI() {
		return DtObjectUtil.createEntityURI(this); 
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
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'MOV ID'.
	 * @return Long movId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_IDENTITY", type = "FOREIGN_KEY", required = true, label = "MOV ID")
	public Long getMovId() {
		return movId;
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'MOV ID'.
	 * @param movId Long <b>Obligatoire</b>
	 */
	public void setMovId(final Long movId) {
		this.movId = movId;
	}

	//Aucune Association déclarée

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
