package io.vertigo.demo.boot.initializer;

import java.time.ZonedDateTime;

import javax.inject.Inject;

import io.vertigo.core.component.ComponentInitializer;
import io.vertigo.orchestra.domain.model.OJobModel;
import io.vertigo.orchestra.plugins.store.OParams;
import io.vertigo.orchestra.plugins.store.OrchestraStore;
import io.vertigo.orchestra.services.execution.engine.SleepJobEngine;

/**
 * Initialisation du manager des jobs.
 * @author pchretien
 * @version $Id: JobManagerInitializer.java,v 1.7 2014/08/04 16:57:50 npiedeloup Exp $
 */
public final class JobManagerInitializer implements ComponentInitializer {

	@Inject
	private OrchestraStore orchestraStore;

	/** {@inheritDoc} */
	@Override
	public void init() {

		final OJobModel model = new OJobModel();
		model.setActive(Boolean.TRUE);
		model.setClassEngine(SleepJobEngine.class.getCanonicalName());
		model.setCreationDate(ZonedDateTime.now());
		model.setDesc("Reload masterData cache");
		model.setJobname("RELOAD_MD_CACHE");
		model.setMaxDelay(15);
		model.setMaxRetry(0);
		model.setTimeout(30);
		orchestraStore.createJobModel(model);

		final OParams params = new OParams();
		orchestraStore.scheduleAt(model.getJmoId(), params, ZonedDateTime.now().plusSeconds(15));
		//orchestraStore.scheduleCron(model.getJmoId(), params, "0 */2 * * * ?");
	}
}