package io.vertigo.samples.dao.domain;

import io.vertigo.core.lang.Generated;
import io.vertigo.dynamo.domain.model.DtObject;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
@io.vertigo.dynamo.ngdomain.annotations.Mapper(clazz = io.vertigo.dynamo.domain.util.JsonMapper.class, dataType = io.vertigo.dynamo.domain.metamodel.DataType.String)
public final class MovieDisplay implements DtObject {
	private static final long serialVersionUID = 1L;

	private String name;
	private Integer year;
	private String country;
	private Long actorsCount;
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Titre'.
	 * @return String name <b>Obligatoire</b>
	 */
	@Field(domain = "STyLabelLong", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "Titre")
	public String getName() {
		return name;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Titre'.
	 * @param name String <b>Obligatoire</b>
	 */
	public void setName(final String name) {
		this.name = name;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Année'.
	 * @return Integer year
	 */
	@Field(domain = "STyYear", label = "Année")
	public Integer getYear() {
		return year;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Année'.
	 * @param year Integer
	 */
	public void setYear(final Integer year) {
		this.year = year;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Pays'.
	 * @return String country
	 */
	@Field(domain = "STyLabel", label = "Pays")
	public String getCountry() {
		return country;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Pays'.
	 * @param country String
	 */
	public void setCountry(final String country) {
		this.country = country;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Nombre d'acteur'.
	 * @return Long actorsCount
	 */
	@Field(domain = "STyId", label = "Nombre d'acteur")
	public Long getActorsCount() {
		return actorsCount;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Nombre d'acteur'.
	 * @param actorsCount Long
	 */
	public void setActorsCount(final Long actorsCount) {
		this.actorsCount = actorsCount;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
