package io.mars.base.domain;

import io.vertigo.dynamo.domain.model.Entity;
import io.vertigo.dynamo.domain.model.URI;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class MaintenanceOpStatus implements Entity {
	private static final long serialVersionUID = 1L;

	private String moStatusId;
	private String label;

	/** {@inheritDoc} */
	@Override
	public URI<MaintenanceOpStatus> getURI() {
		return URI.of(this);
	}

	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return String moStatusId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_CODE", type = "ID", required = true, label = "Id")
	public String getMoStatusId() {
		return moStatusId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Id'.
	 * @param moStatusId String <b>Obligatoire</b>
	 */
	public void setMoStatusId(final String moStatusId) {
		this.moStatusId = moStatusId;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Status Label'.
	 * @return String label
	 */
	@Field(domain = "DO_LABEL", label = "Status Label")
	public String getLabel() {
		return label;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Status Label'.
	 * @param label String
	 */
	public void setLabel(final String label) {
		this.label = label;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
