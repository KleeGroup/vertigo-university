package io.vertigo.demo.domain.referentiel;

import io.vertigo.dynamo.domain.model.DtObject;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
 @Generated
public final class OuiNonChoice implements DtObject {
	private static final long serialVersionUID = 1L;

	private Boolean key;
	private String libelle;

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Valeur'.
	 * @return Boolean key
	 */
	@Field(domain = "DO_OUI_NON", label = "Valeur")
	public Boolean getKey() {
		return key;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Valeur'.
	 * @param key Boolean
	 */
	public void setKey(final Boolean key) {
		this.key = key;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Libell�'.
	 * @return String libelle <b>Obligatoire</b>
	 */
	@Field(domain = "DO_LIBELLE", required = true, label = "Libell�")
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Libell�'.
	 * @param libelle String <b>Obligatoire</b>
	 */
	public void setLibelle(final String libelle) {
		this.libelle = libelle;
	}


	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}