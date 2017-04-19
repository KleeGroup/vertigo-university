package io.vertigo.demo.domain.produit;

import io.vertigo.dynamo.domain.model.DtObject;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;

/**
 * Attention cette classe est générée automatiquement !
 * Objet de données ProduitCritere
 */
public final class ProduitCritere implements DtObject {

	/** SerialVersionUID. */
	private static final long serialVersionUID = 1L;

	private String code;
	private String libelle;
	private java.math.BigDecimal prixMin;
	private java.math.BigDecimal prixMax;
	private java.math.BigDecimal poidsMin;
	private java.math.BigDecimal poidsMax;
	private String description;
	private String commentaire;
	private Boolean siStock;
	private Long famId;
	private io.vertigo.demo.domain.referentiel.Famille famille;

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Code'.
	 * @return String code
	 */
	@Field(domain = "DO_CODE", label = "Code")
	public String getCode() {
		return code;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Code'.
	 * @param code String
	 */
	public void setCode(final String code) {
		this.code = code;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Libelle'.
	 * @return String libelle
	 */
	@Field(domain = "DO_LIBELLE_COURT", label = "Libelle")
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Libelle'.
	 * @param libelle String
	 */
	public void setLibelle(final String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Prix min'.
	 * @return java.math.BigDecimal prixMin
	 */
	@Field(domain = "DO_MONTANT", label = "Prix min")
	public java.math.BigDecimal getPrixMin() {
		return prixMin;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Prix min'.
	 * @param prixMin java.math.BigDecimal
	 */
	public void setPrixMin(final java.math.BigDecimal prixMin) {
		this.prixMin = prixMin;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Prix max'.
	 * @return java.math.BigDecimal prixMax
	 */
	@Field(domain = "DO_MONTANT", label = "Prix max")
	public java.math.BigDecimal getPrixMax() {
		return prixMax;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Prix max'.
	 * @param prixMax java.math.BigDecimal
	 */
	public void setPrixMax(final java.math.BigDecimal prixMax) {
		this.prixMax = prixMax;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Poids min'.
	 * @return java.math.BigDecimal poidsMin
	 */
	@Field(domain = "DO_POIDS", label = "Poids min")
	public java.math.BigDecimal getPoidsMin() {
		return poidsMin;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Poids min'.
	 * @param poidsMin java.math.BigDecimal
	 */
	public void setPoidsMin(final java.math.BigDecimal poidsMin) {
		this.poidsMin = poidsMin;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Poids max'.
	 * @return java.math.BigDecimal poidsMax
	 */
	@Field(domain = "DO_POIDS", label = "Poids max")
	public java.math.BigDecimal getPoidsMax() {
		return poidsMax;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Poids max'.
	 * @param poidsMax java.math.BigDecimal
	 */
	public void setPoidsMax(final java.math.BigDecimal poidsMax) {
		this.poidsMax = poidsMax;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Description'.
	 * @return String description
	 */
	@Field(domain = "DO_TEXTE", label = "Description")
	public String getDescription() {
		return description;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Description'.
	 * @param description String
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Commentaire'.
	 * @return String commentaire
	 */
	@Field(domain = "DO_TEXTE", label = "Commentaire")
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Commentaire'.
	 * @param commentaire String
	 */
	public void setCommentaire(final String commentaire) {
		this.commentaire = commentaire;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'En stock'.
	 * @return Boolean siStock
	 */
	@Field(domain = "DO_OUI_NON", label = "En stock")
	public Boolean getSiStock() {
		return siStock;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'En stock'.
	 * @param siStock Boolean
	 */
	public void setSiStock(final Boolean siStock) {
		this.siStock = siStock;
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Famille'.
	 * @return Long famId
	 */
	@Field(domain = "DO_IDENTIFIANT", type = "FOREIGN_KEY", label = "Famille")
	public Long getFamId() {
		return famId;
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Famille'.
	 * @param famId Long
	 */
	public void setFamId(final Long famId) {
		this.famId = famId;
	}

	/**
	 * Association : Famille.
	 * @return io.vertigo.demo.domain.referentiel.Famille
	 */
	public io.vertigo.demo.domain.referentiel.Famille getFamille() {
		final io.vertigo.dynamo.domain.model.URI<io.vertigo.demo.domain.referentiel.Famille> fkURI = getFamilleURI();
		if (fkURI == null) {
			return null;
		}
		//On est toujours dans un mode lazy. On s'assure cependant que l'objet associé n'a pas changé
		if (famille == null || !fkURI.equals(famille.getURI())) {
			famille = io.vertigo.app.Home.getApp().getComponentSpace().resolve(io.vertigo.dynamo.store.StoreManager.class).getDataStore().readOne(fkURI);
		}
		return famille;
	}

	/**
	 * Retourne l'URI: Famille.
	 * @return URI de l'association
	 */
	@io.vertigo.dynamo.domain.stereotype.Association (
			name = "A_PRDC_FAM",
			fkFieldName = "FAM_ID",
			primaryDtDefinitionName = "DT_FAMILLE",
			primaryIsNavigable = true,
			primaryRole = "Famille",
			primaryLabel = "Famille",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DT_PRODUIT_CRITERE",
			foreignIsNavigable = false,
			foreignRole = "ProduitCritere",
			foreignLabel = "Crit�res produit",
			foreignMultiplicity = "0..*")
	public io.vertigo.dynamo.domain.model.URI<io.vertigo.demo.domain.referentiel.Famille> getFamilleURI() {
		return io.vertigo.dynamo.domain.util.DtObjectUtil.createURI(this, "A_PRDC_FAM", io.vertigo.demo.domain.referentiel.Famille.class);
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
