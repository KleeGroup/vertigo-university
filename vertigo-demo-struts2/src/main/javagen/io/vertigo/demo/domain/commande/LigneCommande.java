package io.vertigo.demo.domain.commande;

import io.vertigo.dynamo.domain.model.Entity;
import io.vertigo.dynamo.domain.model.URI;
import io.vertigo.dynamo.domain.model.VAccessor;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
 @Generated
public final class LigneCommande implements Entity {
	private static final long serialVersionUID = 1L;

	private Long lcoId;
	private Long quantite;
	private final VAccessor<io.vertigo.demo.domain.commande.Commande> comIdAccessor = new VAccessor<>(io.vertigo.demo.domain.commande.Commande.class, "commande");
	private final VAccessor<io.vertigo.demo.domain.produit.Produit> prdIdAccessor = new VAccessor<>(io.vertigo.demo.domain.produit.Produit.class, "produit");

	/** {@inheritDoc} */
	@Override
	public URI<LigneCommande> getURI() {
		return DtObjectUtil.createURI(this);
	}

	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'LCO ID'.
	 * @return Long lcoId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_IDENTIFIANT", type = "ID", required = true, label = "LCO ID")
	public Long getLcoId() {
		return lcoId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'LCO ID'.
	 * @param lcoId Long <b>Obligatoire</b>
	 */
	public void setLcoId(final Long lcoId) {
		this.lcoId = lcoId;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'QUANTITE'.
	 * @return Long quantite <b>Obligatoire</b>
	 */
	@Field(domain = "DO_QUANTITE", required = true, label = "QUANTITE")
	public Long getQuantite() {
		return quantite;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'QUANTITE'.
	 * @param quantite Long <b>Obligatoire</b>
	 */
	public void setQuantite(final Long quantite) {
		this.quantite = quantite;
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Commande'.
	 * @return Long comId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_IDENTIFIANT", type = "FOREIGN_KEY", required = true, label = "Commande")
	public Long getComId() {
		return (Long)  comIdAccessor.getId();
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Commande'.
	 * @param comId Long <b>Obligatoire</b>
	 */
	public void setComId(final Long comId) {
		comIdAccessor.setId(comId);
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Produit'.
	 * @return Long prdId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_IDENTIFIANT", type = "FOREIGN_KEY", required = true, label = "Produit")
	public Long getPrdId() {
		return (Long)  prdIdAccessor.getId();
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Produit'.
	 * @param prdId Long <b>Obligatoire</b>
	 */
	public void setPrdId(final Long prdId) {
		prdIdAccessor.setId(prdId);
	}

	/**
	 * Association : Commande.
	 * @return io.vertigo.demo.domain.commande.Commande
	 */
	public io.vertigo.demo.domain.commande.Commande getCommande() {
		return comIdAccessor.get();
	}

	/**
	 * Retourne l'URI: Commande.
	 * @return URI de l'association
	 */
	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "A_LCO_CMD",
			fkFieldName = "COM_ID",
			primaryDtDefinitionName = "DT_COMMANDE",
			primaryIsNavigable = true,
			primaryRole = "Commande",
			primaryLabel = "Commande",
			primaryMultiplicity = "1..1",
			foreignDtDefinitionName = "DT_LIGNE_COMMANDE",
			foreignIsNavigable = true,
			foreignRole = "LigneCommande",
			foreignLabel = "LigneCommande",
			foreignMultiplicity = "0..*")
	public io.vertigo.dynamo.domain.model.URI<io.vertigo.demo.domain.commande.Commande> getCommandeURI() {
		return comIdAccessor.getURI();
	}

	/**
	 * Association : Produit.
	 * @return io.vertigo.demo.domain.produit.Produit
	 */
	public io.vertigo.demo.domain.produit.Produit getProduit() {
		return prdIdAccessor.get();
	}

	/**
	 * Retourne l'URI: Produit.
	 * @return URI de l'association
	 */
	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "A_LCO_PRD",
			fkFieldName = "PRD_ID",
			primaryDtDefinitionName = "DT_PRODUIT",
			primaryIsNavigable = true,
			primaryRole = "Produit",
			primaryLabel = "Produit",
			primaryMultiplicity = "1..1",
			foreignDtDefinitionName = "DT_LIGNE_COMMANDE",
			foreignIsNavigable = false,
			foreignRole = "LigneCommande",
			foreignLabel = "LigneCommande",
			foreignMultiplicity = "0..*")
	public io.vertigo.dynamo.domain.model.URI<io.vertigo.demo.domain.produit.Produit> getProduitURI() {
		return prdIdAccessor.getURI();
	}


	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}