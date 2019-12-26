package io.vertigo.samples.crystal.domain;

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
public final class Country implements Entity {
	private static final long serialVersionUID = 1L;

	private Long couId;
	private String name;

	/** {@inheritDoc} */
	@Override
	public UID<Country> getUID() {
		return UID.of(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long couId <b>Obligatoire</b>
	 */
	@Field(domain = "DoId", type = "ID", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "Id")
	public Long getCouId() {
		return couId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Id'.
	 * @param couId Long <b>Obligatoire</b>
	 */
	public void setCouId(final Long couId) {
		this.couId = couId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Nom du pays'.
	 * @return String name
	 */
	@Field(domain = "DoLabel", cardinality = io.vertigo.core.lang.Cardinality.OPTIONAL_OR_NULLABLE, label = "Nom du pays")
	public String getName() {
		return name;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Nom du pays'.
	 * @param name String
	 */
	public void setName(final String name) {
		this.name = name;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
