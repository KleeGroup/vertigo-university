package io.mars.base.domain;

import io.vertigo.dynamo.domain.model.DtStaticMasterData;
import io.vertigo.dynamo.domain.model.URI;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class JobStatus implements DtStaticMasterData {
	private static final long serialVersionUID = 1L;

	private String jobStatusId;
	private String label;

	/** {@inheritDoc} */
	@Override
	public URI<JobStatus> getURI() {
		return URI.of(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return String jobStatusId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_CODE", type = "ID", required = true, label = "Id")
	public String getJobStatusId() {
		return jobStatusId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Id'.
	 * @param jobStatusId String <b>Obligatoire</b>
	 */
	public void setJobStatusId(final String jobStatusId) {
		this.jobStatusId = jobStatusId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Status Label'.
	 * @return String label
	 */
	@Field(domain = "DO_LABEL", label = "Status Label")
	public String getLabel() {
		return label;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Status Label'.
	 * @param label String
	 */
	public void setLabel(final String label) {
		this.label = label;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
