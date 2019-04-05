package io.mars.basemanagement.domain;

import io.vertigo.dynamo.domain.model.KeyConcept;
import io.vertigo.dynamo.domain.model.EnumVAccessor;
import io.vertigo.dynamo.domain.model.UID;
import io.vertigo.dynamo.domain.model.VAccessor;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class Base implements KeyConcept {
	private static final long serialVersionUID = 1L;

	private Long baseId;
	private String code;
	private String name;
	private Integer healthLevel;
	private java.time.LocalDate creationDate;
	private String description;
	private String geoLocation;
	private java.math.BigDecimal assetsValue;
	private java.math.BigDecimal rentingFee;
	private String tags;

	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "ABaseBasetype",
			fkFieldName = "baseTypeId",
			primaryDtDefinitionName = "DtBaseType",
			primaryIsNavigable = true,
			primaryRole = "BaseType",
			primaryLabel = "Base Type",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DtBase",
			foreignIsNavigable = false,
			foreignRole = "Base",
			foreignLabel = "Base",
			foreignMultiplicity = "0..*")
	private final EnumVAccessor<io.mars.basemanagement.domain.BaseType, io.mars.basemanagement.domain.BaseTypeEnum> baseTypeIdAccessor = new EnumVAccessor<>(io.mars.basemanagement.domain.BaseType.class, "BaseType", io.mars.basemanagement.domain.BaseTypeEnum.class);

	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "ABaseGeosector",
			fkFieldName = "geosectorId",
			primaryDtDefinitionName = "DtGeosector",
			primaryIsNavigable = true,
			primaryRole = "Geosector",
			primaryLabel = "Base Geosector",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DtBase",
			foreignIsNavigable = false,
			foreignRole = "Base",
			foreignLabel = "Base",
			foreignMultiplicity = "0..*")
	private final VAccessor<io.mars.basemanagement.domain.Geosector> geosectorIdAccessor = new VAccessor<>(io.mars.basemanagement.domain.Geosector.class, "Geosector");

	/** {@inheritDoc} */
	@Override
	public UID<Base> getUID() {
		return UID.of(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long baseId <b>Obligatoire</b>
	 */
	@Field(domain = "DoId", type = "ID", required = true, label = "Id")
	public Long getBaseId() {
		return baseId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Id'.
	 * @param baseId Long <b>Obligatoire</b>
	 */
	public void setBaseId(final Long baseId) {
		this.baseId = baseId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Code'.
	 * @return String code
	 */
	@Field(domain = "DoCode", label = "Code")
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
	 * Récupère la valeur de la propriété 'Name'.
	 * @return String name
	 */
	@Field(domain = "DoLabel", label = "Name")
	public String getName() {
		return name;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Name'.
	 * @param name String
	 */
	public void setName(final String name) {
		this.name = name;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Health Level'.
	 * @return Integer healthLevel
	 */
	@Field(domain = "DoHealth", label = "Health Level")
	public Integer getHealthLevel() {
		return healthLevel;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Health Level'.
	 * @param healthLevel Integer
	 */
	public void setHealthLevel(final Integer healthLevel) {
		this.healthLevel = healthLevel;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Creation Date'.
	 * @return LocalDate creationDate
	 */
	@Field(domain = "DoLocaldate", label = "Creation Date")
	public java.time.LocalDate getCreationDate() {
		return creationDate;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Creation Date'.
	 * @param creationDate LocalDate
	 */
	public void setCreationDate(final java.time.LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Description'.
	 * @return String description
	 */
	@Field(domain = "DoDescription", label = "Description")
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
	 * Récupère la valeur de la propriété 'Geographic Location'.
	 * @return String geoLocation
	 */
	@Field(domain = "DoLabel", label = "Geographic Location")
	public String getGeoLocation() {
		return geoLocation;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Geographic Location'.
	 * @param geoLocation String
	 */
	public void setGeoLocation(final String geoLocation) {
		this.geoLocation = geoLocation;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Current base assets value'.
	 * @return BigDecimal assetsValue
	 */
	@Field(domain = "DoCurrency", label = "Current base assets value")
	public java.math.BigDecimal getAssetsValue() {
		return assetsValue;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Current base assets value'.
	 * @param assetsValue BigDecimal
	 */
	public void setAssetsValue(final java.math.BigDecimal assetsValue) {
		this.assetsValue = assetsValue;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Renting Fee'.
	 * @return BigDecimal rentingFee
	 */
	@Field(domain = "DoCurrency", label = "Renting Fee")
	public java.math.BigDecimal getRentingFee() {
		return rentingFee;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Renting Fee'.
	 * @param rentingFee BigDecimal
	 */
	public void setRentingFee(final java.math.BigDecimal rentingFee) {
		this.rentingFee = rentingFee;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Tags'.
	 * @return String tags
	 */
	@Field(domain = "DoMultipleIds", label = "Tags")
	public String getTags() {
		return tags;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Tags'.
	 * @param tags String
	 */
	public void setTags(final String tags) {
		this.tags = tags;
	}
	
	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Base Type'.
	 * @return String baseTypeId
	 */
	@Field(domain = "DoCode", type = "FOREIGN_KEY", label = "Base Type")
	public String getBaseTypeId() {
		return (String) baseTypeIdAccessor.getId();
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Base Type'.
	 * @param baseTypeId String
	 */
	public void setBaseTypeId(final String baseTypeId) {
		baseTypeIdAccessor.setId(baseTypeId);
	}
	
	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Base Geosector'.
	 * @return Long geosectorId
	 */
	@Field(domain = "DoId", type = "FOREIGN_KEY", label = "Base Geosector")
	public Long getGeosectorId() {
		return (Long) geosectorIdAccessor.getId();
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Base Geosector'.
	 * @param geosectorId Long
	 */
	public void setGeosectorId(final Long geosectorId) {
		geosectorIdAccessor.setId(geosectorId);
	}

 	/**
	 * Association : Base Type.
	 * @return l'accesseur vers la propriété 'Base Type'
	 */
	public EnumVAccessor<io.mars.basemanagement.domain.BaseType, io.mars.basemanagement.domain.BaseTypeEnum> baseType() {
		return baseTypeIdAccessor;
	}

 	/**
	 * Association : Base Geosector.
	 * @return l'accesseur vers la propriété 'Base Geosector'
	 */
	public VAccessor<io.mars.basemanagement.domain.Geosector> geosector() {
		return geosectorIdAccessor;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
