package io.vertigo.demo.domain;

import io.vertigo.dynamo.domain.model.Entity;
import io.vertigo.dynamo.domain.model.URI;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;

/**
 * Attention cette classe est générée automatiquement !
 * Objet de données KxFileInfo
 */
public final class KxFileInfo implements Entity {

	/** SerialVersionUID. */
	private static final long serialVersionUID = 1L;

	private Long filId;
	private String fileName;
	private String mimeType;
	private Long length;
	private java.util.Date lastModified;
	private String fileData;

	/** {@inheritDoc} */
	@Override
	public URI<KxFileInfo> getURI() {
		return DtObjectUtil.createURI(this);
	}

	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Identifiant'.
	 * @return Long filId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_GED_URI", type = "ID", required = true, label = "Identifiant")
	public Long getFilId() {
		return filId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Identifiant'.
	 * @param filId Long <b>Obligatoire</b>
	 */
	public void setFilId(final Long filId) {
		this.filId = filId;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Nom'.
	 * @return String fileName <b>Obligatoire</b>
	 */
	@Field(domain = "DO_GED_LABEL", required = true, label = "Nom")
	public String getFileName() {
		return fileName;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Nom'.
	 * @param fileName String <b>Obligatoire</b>
	 */
	public void setFileName(final String fileName) {
		this.fileName = fileName;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Type mime'.
	 * @return String mimeType <b>Obligatoire</b>
	 */
	@Field(domain = "DO_GED_LABEL", required = true, label = "Type mime")
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Type mime'.
	 * @param mimeType String <b>Obligatoire</b>
	 */
	public void setMimeType(final String mimeType) {
		this.mimeType = mimeType;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Taille'.
	 * @return Long length <b>Obligatoire</b>
	 */
	@Field(domain = "DO_GED_SIZE", required = true, label = "Taille")
	public Long getLength() {
		return length;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Taille'.
	 * @param length Long <b>Obligatoire</b>
	 */
	public void setLength(final Long length) {
		this.length = length;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Date de derni�re modification'.
	 * @return java.util.Date lastModified <b>Obligatoire</b>
	 */
	@Field(domain = "DO_GED_DATE", required = true, label = "Date de derni�re modification")
	public java.util.Date getLastModified() {
		return lastModified;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Date de derni�re modification'.
	 * @param lastModified java.util.Date <b>Obligatoire</b>
	 */
	public void setLastModified(final java.util.Date lastModified) {
		this.lastModified = lastModified;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'data'.
	 * @return String fileData
	 */
	@Field(domain = "DO_GED_LABEL", label = "data")
	public String getFileData() {
		return fileData;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'data'.
	 * @param fileData String
	 */
	public void setFileData(final String fileData) {
		this.fileData = fileData;
	}

	//Aucune Association déclarée

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
