package io.vertigo.samples.dao.domain;

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
@io.vertigo.dynamo.domain.stereotype.DataSpace("mine")
public final class MyMovie implements Entity {
	private static final long serialVersionUID = 1L;

	private Long movId;
	private String name;
	private Integer year;
	private String imdbid;
	private final VAccessor<io.vertigo.samples.dao.domain.MyCountry> couIdAccessor = new VAccessor<>(io.vertigo.samples.dao.domain.MyCountry.class, "country");
	private io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.MyRole> role;

	/** {@inheritDoc} */
	@Override
	public URI<MyMovie> getURI() {
		return DtObjectUtil.createURI(this);
	}

	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long movId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_ID", type = "ID", required = true, label = "Id")
	public Long getMovId() {
		return movId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Id'.
	 * @param movId Long <b>Obligatoire</b>
	 */
	public void setMovId(final Long movId) {
		this.movId = movId;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Code du pays'.
	 * @return String name <b>Obligatoire</b>
	 */
	@Field(domain = "DO_LABEL_LONG", required = true, label = "Code du pays")
	public String getName() {
		return name;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Code du pays'.
	 * @param name String <b>Obligatoire</b>
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'AnnÃ©e'.
	 * @return Integer year
	 */
	@Field(domain = "DO_YEAR", label = "AnnÃ©e")
	public Integer getYear() {
		return year;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'AnnÃ©e'.
	 * @param year Integer
	 */
	public void setYear(final Integer year) {
		this.year = year;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Id Imdb'.
	 * @return String imdbid
	 */
	@Field(domain = "DO_LABEL", label = "Id Imdb")
	public String getImdbid() {
		return imdbid;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Id Imdb'.
	 * @param imdbid String
	 */
	public void setImdbid(final String imdbid) {
		this.imdbid = imdbid;
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Country'.
	 * @return Long couId
	 */
	@Field(domain = "DO_ID", type = "FOREIGN_KEY", label = "Country")
	public Long getCouId() {
		return (Long)  couIdAccessor.getId();
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Country'.
	 * @param couId Long
	 */
	public void setCouId(final Long couId) {
		couIdAccessor.setId(couId);
	}

	/**
	 * Association : Country.
	 * @return io.vertigo.samples.dao.domain.MyCountry
	 */
	public io.vertigo.samples.dao.domain.MyCountry getCountry() {
		return couIdAccessor.get();
	}

	/**
	 * Retourne l'URI: Country.
	 * @return URI de l'association
	 */
	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "A_MMOV_MCOU",
			fkFieldName = "COU_ID",
			primaryDtDefinitionName = "DT_MY_COUNTRY",
			primaryIsNavigable = true,
			primaryRole = "Country",
			primaryLabel = "Country",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DT_MY_MOVIE",
			foreignIsNavigable = false,
			foreignRole = "Movie",
			foreignLabel = "Movie",
			foreignMultiplicity = "0..*")
	public io.vertigo.dynamo.domain.model.URI<io.vertigo.samples.dao.domain.MyCountry> getCountryURI() {
		return couIdAccessor.getURI();
	}

	/**
	 * Association : Role.
	 * @return io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.MyRole>
	 */
	public io.vertigo.dynamo.domain.model.DtList<io.vertigo.samples.dao.domain.MyRole> getRoleList() {
		// On doit avoir une clé primaire renseignée. Si ce n'est pas le cas, on renvoie une liste vide
		if (io.vertigo.dynamo.domain.util.DtObjectUtil.getId(this) == null) {
			return new io.vertigo.dynamo.domain.model.DtList<>(io.vertigo.samples.dao.domain.MyRole.class);
		}
		final io.vertigo.dynamo.domain.model.DtListURI fkDtListURI = getRoleDtListURI();
		io.vertigo.lang.Assertion.checkNotNull(fkDtListURI);
		//---------------------------------------------------------------------
		//On est toujours dans un mode lazy.
		if (role == null) {
			role = io.vertigo.app.Home.getApp().getComponentSpace().resolve(io.vertigo.dynamo.store.StoreManager.class).getDataStore().findAll(fkDtListURI);
		}
		return role;
	}

	/**
	 * Association URI: Role.
	 * @return URI de l'association
	 */
	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "A_MROL_MMOV",
			fkFieldName = "MOV_ID",
			primaryDtDefinitionName = "DT_MY_MOVIE",
			primaryIsNavigable = false,
			primaryRole = "Movie",
			primaryLabel = "Movie",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DT_MY_ROLE",
			foreignIsNavigable = true,
			foreignRole = "Role",
			foreignLabel = "Role",
			foreignMultiplicity = "0..*")
	public io.vertigo.dynamo.domain.metamodel.association.DtListURIForSimpleAssociation getRoleDtListURI() {
		return io.vertigo.dynamo.domain.util.DtObjectUtil.createDtListURIForSimpleAssociation(this, "A_MROL_MMOV", "Role");
	}


	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}