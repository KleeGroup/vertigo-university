package io.vertigo.samples.components.b_plugins;

import io.vertigo.core.node.component.Plugin;

public interface OperationPlugin extends Plugin {
	int calc(int[] values);

	String getOperator();
}
