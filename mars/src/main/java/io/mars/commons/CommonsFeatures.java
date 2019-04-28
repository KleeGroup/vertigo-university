/**
 * vertigo - simple java starter
 *
 * Copyright (C) 2013-2018, KleeGroup, direction.technique@kleegroup.com (http://www.kleegroup.com)
 * KleeGroup, Centre d'affaire la Boursidiere - BP 159 - 92357 Le Plessis Robinson Cedex - France
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mars.commons;

import io.mars.boot.MarsMasterDataDefinitionProvider;
import io.mars.jobs.services.JobServices;
import io.vertigo.app.config.DefinitionProviderConfig;
import io.vertigo.app.config.discovery.ModuleDiscoveryFeatures;
import io.vertigo.dynamo.plugins.environment.DynamoDefinitionProvider;

public class CommonsFeatures extends ModuleDiscoveryFeatures {

	public CommonsFeatures() {
		super("Commons");
	}

	@Override
	protected void buildFeatures() {
		super.buildFeatures();
		getModuleConfigBuilder()
				.addComponent(JobServices.class)
				.addDefinitionProvider(DefinitionProviderConfig.builder(DynamoDefinitionProvider.class)
						.addDefinitionResource("kpr", "io/mars/run.kpr")
						.addDefinitionResource("classes", "io.mars.domain.DtDefinitions")
						.build())
				.addDefinitionProvider(MarsMasterDataDefinitionProvider.class);

	}

	@Override
	protected String getPackageRoot() {
		return this.getClass().getPackage().getName();
	}

}
