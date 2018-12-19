package io.mars.basemanagement.webservices;

import javax.inject.Inject;

import io.mars.basemanagement.domain.Base;
import io.mars.basemanagement.domain.Equipment;
import io.mars.basemanagement.services.base.BaseServices;
import io.mars.basemanagement.services.equipment.EquipmentServices;
import io.mars.catalog.domain.EquipmentType;
import io.mars.catalog.services.equipment.EquipmentTypeServices;
import io.vertigo.dynamo.domain.model.DtList;
import io.vertigo.dynamo.domain.model.DtListState;
import io.vertigo.vega.webservice.WebServices;
import io.vertigo.vega.webservice.stereotype.AnonymousAccessAllowed;
import io.vertigo.vega.webservice.stereotype.GET;
import io.vertigo.vega.webservice.stereotype.PathParam;

public class BaseManagementWebServices implements WebServices {

	@Inject
	private BaseServices baseServices;

	@Inject
	private EquipmentServices equipmentServices;

	@Inject
	private EquipmentTypeServices equipmentTypeServices;

	@AnonymousAccessAllowed
	@GET("/bases")
	public DtList<Base> bases() {
		final DtListState dtListState = DtListState.of(null, 0);
		return baseServices.getBases(dtListState);
	}

	@AnonymousAccessAllowed
	@GET("/base/{code}/equipments")
	public DtList<Equipment> equimentsForBase(@PathParam("code") final String code) {
		return equipmentServices.getEquipmentByBase(code);
	}

	@AnonymousAccessAllowed
	@GET("/equipmentTypes")
	public DtList<EquipmentType> equimentTypes() {
		final DtListState dtListState = DtListState.of(null, 0);
		return equipmentTypeServices.getEquipmentTypes(dtListState);
	}

}