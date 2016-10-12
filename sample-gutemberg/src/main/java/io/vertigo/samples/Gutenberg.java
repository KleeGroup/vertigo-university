package io.vertigo.samples;

import java.nio.file.Path;
import java.nio.file.Paths;

import io.vertigo.app.AutoCloseableApp;
import io.vertigo.samples.components.a_basics.TextProcessorManager;
import io.vertigo.samples.config.SampleConfigBuilder;

/***
 *
 * @author dt
 */
public class Gutenberg {
	public static void main(final String[] args) {
		try (final AutoCloseableApp app = new AutoCloseableApp(new SampleConfigBuilder().build())) {

			final TextProcessorManager textProcessor = app.getComponentSpace().resolve(TextProcessorManager.class);

			final Path path = Paths.get(ClassLoader.getSystemResource("maupassant.txt").toURI());

			final long resultNbLignes = textProcessor.process(path);
			System.out.println("Nombre de lignes = " + resultNbLignes);

		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}