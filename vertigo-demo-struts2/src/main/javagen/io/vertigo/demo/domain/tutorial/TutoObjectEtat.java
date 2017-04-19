package io.vertigo.demo.domain.tutorial;

import io.vertigo.dynamo.domain.model.Entity;
import io.vertigo.dynamo.domain.model.URI;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;

/**
 * Attention cette classe est générée automatiquement !
 * Objet de données TutoObjectEtat
 */
@io.vertigo.dynamo.domain.stereotype.DataSpace("static")
public final class TutoObjectEtat implements Entity {

	/** SerialVersionUID. */
	private static final long serialVersionUID = 1L;

	private Long etaId;
	private String etat;
	private String libelle;

	/** {@inheritDoc} */
	@Override
	public URI<TutoObjectEtat> getURI() {
		return DtObjectUtil.createURI(this);
	}

	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'ID etat'.
	 * @return Long etaId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_IDENTIFIANT", type = "ID", required = true, label = "ID etat")
	public Long getEtaId() {
		return etaId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'ID etat'.
	 * @param etaId Long <b>Obligatoire</b>
	 */
	public void setEtaId(final Long etaId) {
		this.etaId = etaId;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Code Etat'.
	 * @return String etat <b>Obligatoire</b>
	 */
	@Field(domain = "DO_CODE", required = true, label = "Code Etat")
	public String getEtat() {
		return etat;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Code Etat'.
	 * @param etat String <b>Obligatoire</b>
	 */
	public void setEtat(final String etat) {
		this.etat = etat;
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


	// Association : objet non navigable

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
