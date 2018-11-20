package io.mars.catalog.domain;

import io.vertigo.dynamo.domain.model.Entity;
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
public final class EquipmentType implements Entity {
	private static final long serialVersionUID = 1L;

	private Long equipmentTypeId;
	private String label;
	private Boolean active;

	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "A_EQUIPMENT_TYPE_EQUIPMENT_CATEGORY",
			fkFieldName = "EQUIPMENT_CATEGORY_ID",
			primaryDtDefinitionName = "DT_EQUIPMENT_CATEGORY",
			primaryIsNavigable = true,
			primaryRole = "EquipmentCategory",
			primaryLabel = "Equipment Category",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DT_EQUIPMENT_TYPE",
			foreignIsNavigable = false,
			foreignRole = "EquipmentType",
			foreignLabel = "Equipment Type",
			foreignMultiplicity = "0..*")
	private final VAccessor<io.mars.catalog.domain.EquipmentCategory> equipmentCategoryIdAccessor = new VAccessor<>(io.mars.catalog.domain.EquipmentCategory.class, "EquipmentCategory");

	/** {@inheritDoc} */
	@Override
	public UID<EquipmentType> getUID() {
		return UID.of(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long equipmentTypeId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_ID", type = "ID", required = true, label = "Id")
	public Long getEquipmentTypeId() {
		return equipmentTypeId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Id'.
	 * @param equipmentTypeId Long <b>Obligatoire</b>
	 */
	public void setEquipmentTypeId(final Long equipmentTypeId) {
		this.equipmentTypeId = equipmentTypeId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Equipment Type Label'.
	 * @return String label
	 */
	@Field(domain = "DO_LABEL", label = "Equipment Type Label")
	public String getLabel() {
		return label;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Equipment Type Label'.
	 * @param label String
	 */
	public void setLabel(final String label) {
		this.label = label;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Equipment type is active'.
	 * @return Boolean active
	 */
	@Field(domain = "DO_YES_NO", label = "Equipment type is active")
	public Boolean getActive() {
		return active;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Equipment type is active'.
	 * @param active Boolean
	 */
	public void setActive(final Boolean active) {
		this.active = active;
	}
	
	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Equipment Category'.
	 * @return Long equipmentCategoryId
	 */
	@Field(domain = "DO_ID", type = "FOREIGN_KEY", label = "Equipment Category")
	public Long getEquipmentCategoryId() {
		return (Long)  equipmentCategoryIdAccessor.getId();
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Equipment Category'.
	 * @param equipmentCategoryId Long
	 */
	public void setEquipmentCategoryId(final Long equipmentCategoryId) {
		equipmentCategoryIdAccessor.setId(equipmentCategoryId);
	}

 	/**
	 * Association : Equipment Category.
	 * @return l'accesseur vers la propriété 'Equipment Category'
	 */
	public VAccessor<io.mars.catalog.domain.EquipmentCategory> equipmentCategory() {
		return equipmentCategoryIdAccessor;
	}
	
	@Deprecated
	public io.mars.catalog.domain.EquipmentCategory getEquipmentCategory() {
		// we keep the lazyness
		if (!equipmentCategoryIdAccessor.isLoaded()) {
			equipmentCategoryIdAccessor.load();
		}
		return equipmentCategoryIdAccessor.get();
	}

	/**
	 * Retourne l'UID: Equipment Category.
	 * @return UID de l'association
	 */
	@Deprecated
	public io.vertigo.dynamo.domain.model.UID<io.mars.catalog.domain.EquipmentCategory> getEquipmentCategoryUID() {
		return equipmentCategoryIdAccessor.getUID();
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
