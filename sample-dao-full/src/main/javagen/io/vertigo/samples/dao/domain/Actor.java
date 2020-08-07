package io.vertigo.samples.dao.domain;

import io.vertigo.core.lang.Generated;
import io.vertigo.datamodel.structure.model.Entity;
import io.vertigo.datamodel.structure.model.UID;
import io.vertigo.datamodel.structure.stereotype.Field;
import io.vertigo.datamodel.structure.util.DtObjectUtil;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class Actor implements Entity {
	private static final long serialVersionUID = 1L;

	private Long actId;
	private String name;
	private String sexe;

	/** {@inheritDoc} */
	@Override
	public UID<Actor> getUID() {
		return UID.of(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long actId <b>Obligatoire</b>
	 */
	@Field(smartType = "STyId", type = "ID", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "Id")
	public Long getActId() {
		return actId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Id'.
	 * @param actId Long <b>Obligatoire</b>
	 */
	public void setActId(final Long actId) {
		this.actId = actId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Nom'.
	 * @return String name <b>Obligatoire</b>
	 */
	@Field(smartType = "STyLabelLong", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "Nom")
	public String getName() {
		return name;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Nom'.
	 * @param name String <b>Obligatoire</b>
	 */
	public void setName(final String name) {
		this.name = name;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Sexe'.
	 * @return String sexe
	 */
	@Field(smartType = "STyCode", label = "Sexe")
	public String getSexe() {
		return sexe;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Sexe'.
	 * @param sexe String
	 */
	public void setSexe(final String sexe) {
		this.sexe = sexe;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
