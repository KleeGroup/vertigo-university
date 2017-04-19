package io.vertigo.pandora.domain.movies;

import io.vertigo.dynamo.domain.model.Fragment;
import io.vertigo.dynamo.domain.model.URI;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;

/**
 * Attention cette classe est générée automatiquement !
 * Objet de données MovieLink
 */
@io.vertigo.dynamo.domain.stereotype.Fragment(fragmentOf = "DT_MOVIE")
public final class MovieLink implements Fragment<Movie> {

	/** SerialVersionUID. */
	private static final long serialVersionUID = 1L;

	private String title;
	private String poster;
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
