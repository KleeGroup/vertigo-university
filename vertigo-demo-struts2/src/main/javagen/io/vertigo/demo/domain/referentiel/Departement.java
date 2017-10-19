package io.vertigo.demo.domain.referentiel;

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
public final class Departement implements Entity {
	private static final long serialVersionUID = 1L;

	private Long depId;
	private String libelle;
	private final VAccessor<io.vertigo.demo.domain.referentiel.Region> regIdAccessor = new VAccessor<>(io.vertigo.demo.domain.referentiel.Region.class, "region");
	private io.vertigo.dynamo.domain.model.DtList<io.vertigo.demo.domain.referentiel.Ville> ville;

	/** {@inheritDoc} */
	@Override
	public URI<Departement> getURI() {
		return DtObjectUtil.createURI(this);
	}

	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'DEP_ID'.
	 * @return Long depId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_IDENTIFIANT", type = "ID", required = true, label = "DEP_ID")
	public Long getDepId() {
		return depId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'DEP_ID'.
	 * @param depId Long <b>Obligatoire</b>
	 */
	public void setDepId(final Long depId) {
		this.depId = depId;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'LIBELLE'.
	 * @return String libelle <b>Obligatoire</b>
	 */
	@Field(domain = "DO_LIBELLE", required = true, label = "LIBELLE")
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'LIBELLE'.
	 * @param libelle String <b>Obligatoire</b>
	 */
	public void setLibelle(final String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Region'.
	 * @return Long regId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_IDENTIFIANT", type = "FOREIGN_KEY", required = true, label = "Region")
	public Long getRegId() {
		return (Long)  regIdAccessor.getId();
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Region'.
	 * @param regId Long <b>Obligatoire</b>
	 */
	public void setRegId(final Long regId) {
		regIdAccessor.setId(regId);
	}

	/**
	 * Association : Ville.
	 * @return io.vertigo.dynamo.domain.model.DtList<io.vertigo.demo.domain.referentiel.Ville>
	 */
	public io.vertigo.dynamo.domain.model.DtList<io.vertigo.demo.domain.referentiel.Ville> getVilleList() {
		// On doit avoir une clé primaire renseignée. Si ce n'est pas le cas, on renvoie une liste vide
		if (io.vertigo.dynamo.domain.util.DtObjectUtil.getId(this) == null) {
			return new io.vertigo.dynamo.domain.model.DtList<>(io.vertigo.demo.domain.referentiel.Ville.class);
		}
		final io.vertigo.dynamo.domain.model.DtListURI fkDtListURI = getVilleDtListURI();
		io.vertigo.lang.Assertion.checkNotNull(fkDtListURI);
		//---------------------------------------------------------------------
		//On est toujours dans un mode lazy.
		if (ville == null) {
			ville = io.vertigo.app.Home.getApp().getComponentSpace().resolve(io.vertigo.dynamo.store.StoreManager.class).getDataStore().findAll(fkDtListURI);
		}
		return ville;
	}

	/**
	 * Association URI: Ville.
	 * @return URI de l'association
	 */
	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "A_DEP_VIL",
			fkFieldName = "DEP_ID",
			primaryDtDefinitionName = "DT_DEPARTEMENT",
			primaryIsNavigable = true,
			primaryRole = "Departement",
			primaryLabel = "Departement",
			primaryMultiplicity = "1..1",
			foreignDtDefinitionName = "DT_VILLE",
			foreignIsNavigable = true,
			foreignRole = "Ville",
			foreignLabel = "Ville",
			foreignMultiplicity = "0..*")
	public io.vertigo.dynamo.domain.metamodel.association.DtListURIForSimpleAssociation getVilleDtListURI() {
		return io.vertigo.dynamo.domain.util.DtObjectUtil.createDtListURIForSimpleAssociation(this, "A_DEP_VIL", "Ville");
	}

	/**
	 * Association : Region.
	 * @return io.vertigo.demo.domain.referentiel.Region
	 */
	public io.vertigo.demo.domain.referentiel.Region getRegion() {
		return regIdAccessor.get();
	}

	/**
	 * Retourne l'URI: Region.
	 * @return URI de l'association
	 */
	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "A_REG_DEP",
			fkFieldName = "REG_ID",
			primaryDtDefinitionName = "DT_REGION",
			primaryIsNavigable = true,
			primaryRole = "Region",
			primaryLabel = "Region",
			primaryMultiplicity = "1..1",
			foreignDtDefinitionName = "DT_DEPARTEMENT",
			foreignIsNavigable = true,
			foreignRole = "Departement",
			foreignLabel = "Departement",
			foreignMultiplicity = "0..*")
	public io.vertigo.dynamo.domain.model.URI<io.vertigo.demo.domain.referentiel.Region> getRegionURI() {
		return regIdAccessor.getURI();
	}


	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}