package io.mars.opendata.controllers;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.mars.opendata.domain.OpendataSet;
import io.mars.opendata.services.OpendataSetServices;
import io.vertigo.dynamo.domain.model.DtListState;
import io.vertigo.ui.core.ViewContext;
import io.vertigo.ui.core.ViewContextKey;
import io.vertigo.ui.impl.springmvc.controller.AbstractVSpringMvcController;

@Controller
@RequestMapping("/opendata/opendatasets")
public class OpendataSetListController extends AbstractVSpringMvcController {

	private static final ViewContextKey<OpendataSet> opendataSets = ViewContextKey.of("opendataSets");

	@Inject
	private OpendataSetServices opendataSetServices;

	@GetMapping("/")
	public void initContext(final ViewContext viewContext) {
		final DtListState dtListState = DtListState.of(200, 0, null, null);
		viewContext.publishDtList(opendataSets, opendataSetServices.getOpendataSets(dtListState));
	}

	@PostMapping("/_sort")
	public ViewContext sort(final ViewContext viewContext, final DtListState dtListState) {
		viewContext.publishDtList(opendataSets, opendataSetServices.getOpendataSets(dtListState));
		return viewContext;
	}
}