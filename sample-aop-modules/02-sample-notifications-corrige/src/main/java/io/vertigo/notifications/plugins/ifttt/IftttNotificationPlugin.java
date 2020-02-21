package io.vertigo.notifications.plugins.ifttt;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.vertigo.core.component.Activeable;
import io.vertigo.core.param.ParamValue;
import io.vertigo.lang.Assertion;
import io.vertigo.lang.VSystemException;
import io.vertigo.lang.WrappedException;
import io.vertigo.notifications.impl.NotificationPlugin;

/**
 *
 * @author dt
 *
 */
public class IftttNotificationPlugin implements NotificationPlugin, Activeable {
	private static final Logger LOGGER = LogManager.getLogger(IftttNotificationPlugin.class);
	private static final String IFTTT = "ifttt.properties";

	private Client client;
	private WebTarget resource;
	private String url;

	@Inject
	public IftttNotificationPlugin(@ParamValue("proxyHost") final Optional<String> proxyHost,
			@ParamValue("proxyPort") final Optional<String> proxyPort) {
		Assertion.checkNotNull(proxyHost);
		Assertion.checkNotNull(proxyPort);
		Assertion.checkArgument(
				(proxyHost.isPresent() && proxyPort.isPresent()) || (!proxyHost.isPresent() && proxyPort.isPresent()),
				"les deux paramètres host et port doivent être tous les deux remplis ou vides");
		// ----
		if (proxyHost.isPresent()) {
			System.setProperty("https.proxyHost", proxyHost.get()); // "172.20.0.9"
			System.setProperty("https.proxyPort", proxyPort.get()); // "3128"
		}

		final Properties prop = new Properties();

		try (InputStream input = this.getClass().getClassLoader().getResourceAsStream(IFTTT)) {
			prop.load(input);
			url = prop.getProperty("url");
		} catch (final IOException e) {
			LOGGER.error("Error while loading " + IFTTT, e);
			throw WrappedException.wrap(e);
		}

	}

	@Override
	public void start() {
		client = ClientBuilder.newClient();
		resource = client.target(url);
	}

	@Override
	public void stop() {
		client.close();
	}

	@Override
	public void sendMessage(final String message) {

		final MakerEvent postMessage = new MakerEvent();
		postMessage.setValue1("Message from IftttNotificationPlugin :");
		postMessage.setValue2(message);

		final Builder request = resource.request().accept(MediaType.APPLICATION_JSON);

		final Response response = request.post(Entity.<MakerEvent> entity(postMessage, MediaType.APPLICATION_JSON));

		if (response.getStatusInfo().getFamily() == Family.SUCCESSFUL) {
			LOGGER.info("Success! " + response.getStatus());
		} else {
			LOGGER.error("Error! " + response.getStatus());
			throw new VSystemException(
					"Error while sending Ifttt Notification:" + (response != null ? response.getStatus() : ""));
		}

		final List<String> list = new ArrayList<>();
		Collections.sort(list, String::compareToIgnoreCase);
		Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2));

	}

	@Override
	public String getChannel() {
		return "ifttt";
	}

}
