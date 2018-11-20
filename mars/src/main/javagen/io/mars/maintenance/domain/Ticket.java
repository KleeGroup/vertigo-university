package io.mars.maintenance.domain;

import io.vertigo.dynamo.domain.model.Entity;
import io.vertigo.dynamo.domain.model.UID;
import io.vertigo.dynamo.domain.model.VAccessor;
import io.vertigo.dynamo.domain.model.EnumVAccessor;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class Ticket implements Entity {
	private static final long serialVersionUID = 1L;

	private Long ticketId;
	private String code;
	private String title;
	private String description;
	private java.time.LocalDate dateCreated;

	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "A_TICKET_TICKET_STATUS",
			fkFieldName = "WORK_ORDER_STATUS_ID",
			primaryDtDefinitionName = "DT_TICKET_STATUS",
			primaryIsNavigable = true,
			primaryRole = "TicketStatus",
			primaryLabel = "Ticket Status",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DT_TICKET",
			foreignIsNavigable = false,
			foreignRole = "Ticketr",
			foreignLabel = "Ticket",
			foreignMultiplicity = "0..*")
	private final EnumVAccessor<io.mars.maintenance.domain.TicketStatus, io.mars.maintenance.domain.TicketStatusEnum> workOrderStatusIdAccessor = new EnumVAccessor<>(io.mars.maintenance.domain.TicketStatus.class, "TicketStatus", io.mars.maintenance.domain.TicketStatusEnum.class);

	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "A_EQUIPMENT_TICKET",
			fkFieldName = "EQUIPMENT_ID",
			primaryDtDefinitionName = "DT_EQUIPMENT",
			primaryIsNavigable = true,
			primaryRole = "Equipment",
			primaryLabel = "Equipment",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DT_TICKET",
			foreignIsNavigable = false,
			foreignRole = "EquipmentTickets",
			foreignLabel = "Equipment tickets",
			foreignMultiplicity = "0..*")
	private final VAccessor<io.mars.basemanagement.domain.Equipment> equipmentIdAccessor = new VAccessor<>(io.mars.basemanagement.domain.Equipment.class, "Equipment");

	/** {@inheritDoc} */
	@Override
	public UID<Ticket> getUID() {
		return UID.of(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long ticketId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_ID", type = "ID", required = true, label = "Id")
	public Long getTicketId() {
		return ticketId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Id'.
	 * @param ticketId Long <b>Obligatoire</b>
	 */
	public void setTicketId(final Long ticketId) {
		this.ticketId = ticketId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Ticket Number'.
	 * @return String code
	 */
	@Field(domain = "DO_LABEL", label = "Ticket Number")
	public String getCode() {
		return code;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Ticket Number'.
	 * @param code String
	 */
	public void setCode(final String code) {
		this.code = code;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Ticket title'.
	 * @return String title
	 */
	@Field(domain = "DO_LABEL", label = "Ticket title")
	public String getTitle() {
		return title;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Ticket title'.
	 * @param title String
	 */
	public void setTitle(final String title) {
		this.title = title;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Ticket Descrption'.
	 * @return String description
	 */
	@Field(domain = "DO_DESCRIPTION", label = "Ticket Descrption")
	public String getDescription() {
		return description;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Ticket Descrption'.
	 * @param description String
	 */
	public void setDescription(final String description) {
		this.description = description;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Ticket Creation Date'.
	 * @return LocalDate dateCreated
	 */
	@Field(domain = "DO_LOCALDATE", label = "Ticket Creation Date")
	public java.time.LocalDate getDateCreated() {
		return dateCreated;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Ticket Creation Date'.
	 * @param dateCreated LocalDate
	 */
	public void setDateCreated(final java.time.LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Ticket Status'.
	 * @return String workOrderStatusId
	 */
	@Field(domain = "DO_CODE", type = "FOREIGN_KEY", label = "Ticket Status")
	public String getWorkOrderStatusId() {
		return (String)  workOrderStatusIdAccessor.getId();
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Ticket Status'.
	 * @param workOrderStatusId String
	 */
	public void setWorkOrderStatusId(final String workOrderStatusId) {
		workOrderStatusIdAccessor.setId(workOrderStatusId);
	}
	
	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Equipment'.
	 * @return Long equipmentId
	 */
	@Field(domain = "DO_ID", type = "FOREIGN_KEY", label = "Equipment")
	public Long getEquipmentId() {
		return (Long)  equipmentIdAccessor.getId();
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Equipment'.
	 * @param equipmentId Long
	 */
	public void setEquipmentId(final Long equipmentId) {
		equipmentIdAccessor.setId(equipmentId);
	}

 	/**
	 * Association : Equipment.
	 * @return l'accesseur vers la propriété 'Equipment'
	 */
	public VAccessor<io.mars.basemanagement.domain.Equipment> equipment() {
		return equipmentIdAccessor;
	}
	
	@Deprecated
	public io.mars.basemanagement.domain.Equipment getEquipment() {
		// we keep the lazyness
		if (!equipmentIdAccessor.isLoaded()) {
			equipmentIdAccessor.load();
		}
		return equipmentIdAccessor.get();
	}

	/**
	 * Retourne l'UID: Equipment.
	 * @return UID de l'association
	 */
	@Deprecated
	public io.vertigo.dynamo.domain.model.UID<io.mars.basemanagement.domain.Equipment> getEquipmentUID() {
		return equipmentIdAccessor.getUID();
	}

 	/**
	 * Association : Ticket Status.
	 * @return l'accesseur vers la propriété 'Ticket Status'
	 */
	public EnumVAccessor<io.mars.maintenance.domain.TicketStatus, io.mars.maintenance.domain.TicketStatusEnum> ticketStatus() {
		return workOrderStatusIdAccessor;
	}
	
	@Deprecated
	public io.mars.maintenance.domain.TicketStatus getTicketStatus() {
		// we keep the lazyness
		if (!workOrderStatusIdAccessor.isLoaded()) {
			workOrderStatusIdAccessor.load();
		}
		return workOrderStatusIdAccessor.get();
	}

	/**
	 * Retourne l'UID: Ticket Status.
	 * @return UID de l'association
	 */
	@Deprecated
	public io.vertigo.dynamo.domain.model.UID<io.mars.maintenance.domain.TicketStatus> getTicketStatusUID() {
		return workOrderStatusIdAccessor.getUID();
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
