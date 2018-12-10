package io.mars.domain;

import java.util.Arrays;
import java.util.Iterator;

import io.vertigo.dynamo.domain.metamodel.DtFieldName;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class DtDefinitions implements Iterable<Class<?>> {

	/**
	 * Enumération des DtDefinitions.
	 */
	public enum Definitions {
		/** Objet de données Base. */
		Base(io.mars.basemanagement.domain.Base.class),
		/** Objet de données BaseIndex. */
		BaseIndex(io.mars.basemanagement.search.BaseIndex.class),
		/** Objet de données BaseType. */
		BaseType(io.mars.basemanagement.domain.BaseType.class),
		/** Objet de données Business. */
		Business(io.mars.basemanagement.domain.Business.class),
		/** Objet de données Equipment. */
		Equipment(io.mars.basemanagement.domain.Equipment.class),
		/** Objet de données EquipmentCategory. */
		EquipmentCategory(io.mars.catalog.domain.EquipmentCategory.class),
		/** Objet de données EquipmentFeature. */
		EquipmentFeature(io.mars.basemanagement.domain.EquipmentFeature.class),
		/** Objet de données EquipmentIndex. */
		EquipmentIndex(io.mars.basemanagement.search.EquipmentIndex.class),
		/** Objet de données EquipmentOverview. */
		EquipmentOverview(io.mars.basemanagement.domain.EquipmentOverview.class),
		/** Objet de données EquipmentType. */
		EquipmentType(io.mars.catalog.domain.EquipmentType.class),
		/** Objet de données Geosector. */
		Geosector(io.mars.basemanagement.domain.Geosector.class),
		/** Objet de données Job. */
		Job(io.mars.basemanagement.domain.Job.class),
		/** Objet de données JobStatus. */
		JobStatus(io.mars.basemanagement.domain.JobStatus.class),
		/** Objet de données MediaFileInfo. */
		MediaFileInfo(io.mars.common.domain.tools.file.MediaFileInfo.class),
		/** Objet de données Mission. */
		Mission(io.mars.hr.domain.Mission.class),
		/** Objet de données Person. */
		Person(io.mars.hr.domain.Person.class),
		/** Objet de données Picture. */
		Picture(io.mars.basemanagement.domain.Picture.class),
		/** Objet de données Tag. */
		Tag(io.mars.basemanagement.domain.Tag.class),
		/** Objet de données Ticket. */
		Ticket(io.mars.maintenance.domain.Ticket.class),
		/** Objet de données TicketStatus. */
		TicketStatus(io.mars.maintenance.domain.TicketStatus.class),
		/** Objet de données WorkOrder. */
		WorkOrder(io.mars.maintenance.domain.WorkOrder.class),
		/** Objet de données WorkOrderStatus. */
		WorkOrderStatus(io.mars.maintenance.domain.WorkOrderStatus.class)		;

		private final Class<?> clazz;

		private Definitions(final Class<?> clazz) {
			this.clazz = clazz;
		}

		/** 
		 * Classe associée.
		 * @return Class d'implémentation de l'objet 
		 */
		public Class<?> getDtClass() {
			return clazz;
		}
	}

	/**
	 * Enumération des champs de Base.
	 */
	public enum BaseFields implements DtFieldName<io.mars.basemanagement.domain.Base> {
		/** Propriété 'Id'. */
		BASE_ID,
		/** Propriété 'Base Code'. */
		CODE,
		/** Propriété 'Name'. */
		NAME,
		/** Propriété 'Health Level'. */
		HEALTH_LEVEL,
		/** Propriété 'Base Creation Date'. */
		CREATION_DATE,
		/** Propriété 'Description'. */
		DESCRIPTION,
		/** Propriété 'Geographic Location'. */
		GEO_LOCATION,
		/** Propriété 'Current base assets value'. */
		ASSETS_VALUE,
		/** Propriété 'Renting Fee'. */
		RENTING_FEE,
		/** Propriété 'Tags'. */
		TAGS,
		/** Propriété 'Base Type'. */
		BASE_TYPE_ID,
		/** Propriété 'Base Geosector'. */
		GEOSECTOR_ID	}

	/**
	 * Enumération des champs de BaseIndex.
	 */
	public enum BaseIndexFields implements DtFieldName<io.mars.basemanagement.search.BaseIndex> {
		/** Propriété 'id'. */
		BASE_ID,
		/** Propriété 'Name'. */
		NAME,
		/** Propriété 'Base Code'. */
		CODE,
		/** Propriété 'Base Creation Date'. */
		CREATION_DATE,
		/** Propriété 'Tags'. */
		TAGS,
		/** Propriété 'Base Type'. */
		BASE_TYPE_LABEL	}

	/**
	 * Enumération des champs de BaseType.
	 */
	public enum BaseTypeFields implements DtFieldName<io.mars.basemanagement.domain.BaseType> {
		/** Propriété 'Id'. */
		BASE_TYPE_ID,
		/** Propriété 'Base Type Label'. */
		LABEL	}

	/**
	 * Enumération des champs de Business.
	 */
	public enum BusinessFields implements DtFieldName<io.mars.basemanagement.domain.Business> {
		/** Propriété 'Id'. */
		BUSINESS_ID,
		/** Propriété 'Name'. */
		NAME	}

	/**
	 * Enumération des champs de Equipment.
	 */
	public enum EquipmentFields implements DtFieldName<io.mars.basemanagement.domain.Equipment> {
		/** Propriété 'Id'. */
		EQUIPMENT_ID,
		/** Propriété 'Name'. */
		NAME,
		/** Propriété 'Base Code'. */
		CODE,
		/** Propriété 'Health Level'. */
		HEALTH_LEVEL,
		/** Propriété 'Date of purchase'. */
		PURCHASE_DATE,
		/** Propriété 'Description'. */
		DESCRIPTION,
		/** Propriété 'Tags'. */
		TAGS,
		/** Propriété 'Geographic Location'. */
		GEO_LOCATION,
		/** Propriété 'Renting Fee'. */
		RENTING_FEE,
		/** Propriété 'Current equipment value'. */
		EQUIPMENT_VALUE,
		/** Propriété 'Base'. */
		BASE_ID,
		/** Propriété 'Equipment Geosector'. */
		GEOSECTOR_ID,
		/** Propriété 'Business'. */
		BUSINESS_ID,
		/** Propriété 'Equipment Type'. */
		EQUIPMENT_TYPE_ID	}

	/**
	 * Enumération des champs de EquipmentCategory.
	 */
	public enum EquipmentCategoryFields implements DtFieldName<io.mars.catalog.domain.EquipmentCategory> {
		/** Propriété 'Id'. */
		EQUIPMENT_CATEGORY_ID,
		/** Propriété 'Equipment Category Label'. */
		LABEL,
		/** Propriété 'Equipment category is active'. */
		ACTIVE	}

	/**
	 * Enumération des champs de EquipmentFeature.
	 */
	public enum EquipmentFeatureFields implements DtFieldName<io.mars.basemanagement.domain.EquipmentFeature> {
		/** Propriété 'Id'. */
		EQUIPMENT_FEATURE_ID,
		/** Propriété 'Name'. */
		NAME,
		/** Propriété 'Equipment'. */
		EQUIPMENT_ID	}

	/**
	 * Enumération des champs de EquipmentIndex.
	 */
	public enum EquipmentIndexFields implements DtFieldName<io.mars.basemanagement.search.EquipmentIndex> {
		/** Propriété 'Id'. */
		EQUIPMENT_ID,
		/** Propriété 'Name'. */
		NAME,
		/** Propriété 'Base Code'. */
		CODE,
		/** Propriété 'Date of purchase'. */
		PURCHASE_DATE,
		/** Propriété 'Description'. */
		DESCRIPTION,
		/** Propriété 'Tags'. */
		TAGS,
		/** Propriété 'Equipment Type'. */
		EQUIPMENT_TYPE_NAME,
		/** Propriété 'Equipment Category'. */
		EQUIPMENT_CATEGORY_NAME	}

	/**
	 * Enumération des champs de EquipmentOverview.
	 */
	public enum EquipmentOverviewFields implements DtFieldName<io.mars.basemanagement.domain.EquipmentOverview> {
		/** Propriété 'Business Id'. */
		BUSINESS_ID,
		/** Propriété 'Count by business'. */
		COUNT,
		/** Propriété 'Business'. */
		BUSINESS_NAME,
		/** Propriété 'Ok count'. */
		OK_COUNT,
		/** Propriété 'Down count'. */
		DOWN_COUNT	}

	/**
	 * Enumération des champs de EquipmentType.
	 */
	public enum EquipmentTypeFields implements DtFieldName<io.mars.catalog.domain.EquipmentType> {
		/** Propriété 'Id'. */
		EQUIPMENT_TYPE_ID,
		/** Propriété 'Equipment Type Label'. */
		LABEL,
		/** Propriété 'Equipment type is active'. */
		ACTIVE,
		/** Propriété 'Equipment Category'. */
		EQUIPMENT_CATEGORY_ID	}

	/**
	 * Enumération des champs de Geosector.
	 */
	public enum GeosectorFields implements DtFieldName<io.mars.basemanagement.domain.Geosector> {
		/** Propriété 'Id'. */
		GEOSECTOR_ID,
		/** Propriété 'Sector Label'. */
		SECTOR_LABEL	}

	/**
	 * Enumération des champs de Job.
	 */
	public enum JobFields implements DtFieldName<io.mars.basemanagement.domain.Job> {
		/** Propriété 'Id'. */
		JOB_ID,
		/** Propriété 'CODE'. */
		CODE,
		/** Propriété 'Job Name'. */
		NAME,
		/** Propriété 'Job Description'. */
		DESCRIPTION,
		/** Propriété 'Due Date'. */
		DUE_DATE	}

	/**
	 * Enumération des champs de JobStatus.
	 */
	public enum JobStatusFields implements DtFieldName<io.mars.basemanagement.domain.JobStatus> {
		/** Propriété 'Id'. */
		JOB_STATUS_ID,
		/** Propriété 'Status Label'. */
		LABEL	}

	/**
	 * Enumération des champs de MediaFileInfo.
	 */
	public enum MediaFileInfoFields implements DtFieldName<io.mars.common.domain.tools.file.MediaFileInfo> {
		/** Propriété 'Id'. */
		FIL_ID,
		/** Propriété 'Name'. */
		FILE_NAME,
		/** Propriété 'MimeType'. */
		MIME_TYPE,
		/** Propriété 'Size'. */
		LENGTH,
		/** Propriété 'Modification Date'. */
		LAST_MODIFIED,
		/** Propriété 'path'. */
		FILE_PATH	}

	/**
	 * Enumération des champs de Mission.
	 */
	public enum MissionFields implements DtFieldName<io.mars.hr.domain.Mission> {
		/** Propriété 'Id'. */
		MISSION_ID,
		/** Propriété 'Role'. */
		ROLE,
		/** Propriété 'Person'. */
		PERSON_ID,
		/** Propriété 'Base'. */
		BASE_ID,
		/** Propriété 'Business'. */
		BUSINESS_ID	}

	/**
	 * Enumération des champs de Person.
	 */
	public enum PersonFields implements DtFieldName<io.mars.hr.domain.Person> {
		/** Propriété 'Id'. */
		PERSON_ID,
		/** Propriété 'First Name'. */
		FIRST_NAME,
		/** Propriété 'Last Name'. */
		LAST_NAME,
		/** Propriété 'E-mail'. */
		EMAIL,
		/** Propriété 'Picture'. */
		PICTUREFILE_ID,
		/** Propriété 'Picture'. */
		PICTUREFILE_ID_TMP,
		/** Propriété 'Tags'. */
		TAGS,
		/** Propriété 'Date hired'. */
		DATE_HIRED	}

	/**
	 * Enumération des champs de Picture.
	 */
	public enum PictureFields implements DtFieldName<io.mars.basemanagement.domain.Picture> {
		/** Propriété 'Id'. */
		PICTURE_ID,
		/** Propriété 'Id'. */
		PICTUREFILE_ID,
		/** Propriété 'Base'. */
		BASE_ID	}

	/**
	 * Enumération des champs de Tag.
	 */
	public enum TagFields implements DtFieldName<io.mars.basemanagement.domain.Tag> {
		/** Propriété 'Id'. */
		TAG_ID,
		/** Propriété 'Label'. */
		LABEL	}

	/**
	 * Enumération des champs de Ticket.
	 */
	public enum TicketFields implements DtFieldName<io.mars.maintenance.domain.Ticket> {
		/** Propriété 'Id'. */
		TICKET_ID,
		/** Propriété 'Ticket Number'. */
		CODE,
		/** Propriété 'Ticket title'. */
		TITLE,
		/** Propriété 'Ticket Descrption'. */
		DESCRIPTION,
		/** Propriété 'Ticket Creation Date'. */
		DATE_CREATED,
		/** Propriété 'Ticket Status'. */
		WORK_ORDER_STATUS_ID,
		/** Propriété 'Equipment'. */
		EQUIPMENT_ID	}

	/**
	 * Enumération des champs de TicketStatus.
	 */
	public enum TicketStatusFields implements DtFieldName<io.mars.maintenance.domain.TicketStatus> {
		/** Propriété 'Id'. */
		TICKET_STATUS_ID,
		/** Propriété 'Status Label'. */
		LABEL	}

	/**
	 * Enumération des champs de WorkOrder.
	 */
	public enum WorkOrderFields implements DtFieldName<io.mars.maintenance.domain.WorkOrder> {
		/** Propriété 'Id'. */
		MO_ID,
		/** Propriété 'Ticket Number'. */
		TICKET_CODE,
		/** Propriété 'Mainenance Operation'. */
		NAME,
		/** Propriété 'Maintenance Operation Descrption'. */
		DESCRIPTION,
		/** Propriété 'Due Date'. */
		DUE_DATE,
		/** Propriété 'Ticket'. */
		TICKET_ID,
		/** Propriété 'Work Order Status'. */
		WORK_ORDER_STATUS_ID	}

	/**
	 * Enumération des champs de WorkOrderStatus.
	 */
	public enum WorkOrderStatusFields implements DtFieldName<io.mars.maintenance.domain.WorkOrderStatus> {
		/** Propriété 'Id'. */
		WORK_ORDER_STATUS_ID,
		/** Propriété 'Status Label'. */
		LABEL	}

	/** {@inheritDoc} */
	@Override
	public Iterator<Class<?>> iterator() {
		return new Iterator<Class<?>>() {
			private Iterator<Definitions> it = Arrays.asList(Definitions.values()).iterator();

			/** {@inheritDoc} */
			@Override
			public boolean hasNext() {
				return it.hasNext();
			}

			/** {@inheritDoc} */
			@Override
			public Class<?> next() {
				return it.next().getDtClass();
			}
		};
	}
}
