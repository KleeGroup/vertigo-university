package io.vertigo.samples.dao.domain;

import io.vertigo.core.lang.Generated;
import io.vertigo.dynamo.domain.model.Entity;
import io.vertigo.dynamo.domain.model.UID;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
@io.vertigo.dynamo.domain.stereotype.DataSpace("mine")
@io.vertigo.dynamo.ngdomain.annotations.Mapper(clazz = io.vertigo.dynamo.domain.util.JsonMapper.class, dataType = io.vertigo.dynamo.domain.metamodel.DataType.String)
public final class MyActor implements Entity {
	private static final long serialVersionUID = 1L;

	private Long actId;
	private String name;
	private String sexe;

	/** {@inheritDoc} */
	@Override
	public UID<MyActor> getUID() {
		return UID.of(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long actId <b>Obligatoire</b>
	 */
	@Field(domain = "STyId", type = "ID", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "Id")
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
	@Field(domain = "STyLabelLong", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "Nom")
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
	@Field(domain = "STyCode", label = "Sexe")
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
