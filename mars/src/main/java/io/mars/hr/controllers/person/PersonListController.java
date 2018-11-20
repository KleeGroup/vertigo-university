package io.mars.hr.controllers.person;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.mars.hr.domain.Person;
import io.mars.hr.services.person.PersonServices;
import io.vertigo.dynamo.domain.model.DtListState;
import io.vertigo.ui.core.ViewContext;
import io.vertigo.ui.core.ViewContextKey;
import io.vertigo.ui.impl.springmvc.controller.AbstractVSpringMvcController;

@Controller
@RequestMapping("/hr/persons")
public class PersonListController extends AbstractVSpringMvcController {

	private static final ViewContextKey<Person> persons = ViewContextKey.of("persons");
	private static final ViewContextKey<String> listRenderer = ViewContextKey.of("listRenderer");

	@Inject
	private PersonServices personServices;

	@GetMapping("/")
	public void initContext(final ViewContext viewContext) {
		viewContext.publishRef(listRenderer, "table");
		final DtListState dtListState = new DtListState(200, 0, null, null);
		viewContext.publishDtList(persons, personServices.getPersons(dtListState));
	}

	@PostMapping("/_sort")
	public ViewContext sort(final ViewContext viewContext, final DtListState dtListState) {
		viewContext.publishDtList(persons, personServices.getPersons(dtListState));
		return viewContext;
	}

	@PostMapping("/_changeRenderer")
	public void changeRenderer(final ViewContext viewContext, @RequestParam("renderer") final String renderer) {
		viewContext.publishRef(listRenderer, renderer);
	}

}