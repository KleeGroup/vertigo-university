package io.vertigo.pandora.boot;

import org.apache.logging.log4j.LogManager;

import io.vertigo.app.AutoCloseableApp;
import io.vertigo.studio.ui.Studio;

public final class PandoraStudio {

	public static void main(final String[] args) {
		try (AutoCloseableApp app = new AutoCloseableApp(PandoraConfigurator.config(true))) {
			new Studio(app, 9999).start();
			Thread.sleep(100000000000L);
		} catch (final Exception e) {
			e.printStackTrace();
			LogManager.getLogger(PandoraStudio.class).warn("an error occured when starting", e);
		}
	}
}