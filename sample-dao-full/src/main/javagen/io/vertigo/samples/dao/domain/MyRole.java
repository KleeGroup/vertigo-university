package io.vertigo.samples.dao.domain;

import io.vertigo.core.lang.Generated;
import io.vertigo.dynamo.domain.model.Entity;
import io.vertigo.dynamo.domain.model.UID;
import io.vertigo.dynamo.domain.model.VAccessor;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
@io.vertigo.dynamo.domain.stereotype.DataSpace("mine")
public final class MyRole implements Entity {
	private static final long serialVersionUID = 1L;

	private Long rolId;
	private String asCharacter;

	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "AMrolMmov",
			fkFieldName = "movId",
			primaryDtDefinitionName = "DtMyMovie",
			primaryIsNavigable = false,
			primaryRole = "Movie",
			primaryLabel = "Movie",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DtMyRole",
			foreignIsNavigable = true,
			foreignRole = "Role",
			foreignLabel = "Role",
			foreignMultiplicity = "0..*")
	private final VAccessor<io.vertigo.samples.dao.domain.MyMovie> movIdAccessor = new VAccessor<>(io.vertigo.samples.dao.domain.MyMovie.class, "Movie");

	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "AMrolMact",
			fkFieldName = "actId",
			primaryDtDefinitionName = "DtMyActor",
			primaryIsNavigable = true,
			primaryRole = "Actor",
			primaryLabel = "Actor",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DtMyRole",
			foreignIsNavigable = false,
			foreignRole = "Role",
			foreignLabel = "Role",
			foreignMultiplicity = "0..*")
	private final VAccessor<io.vertigo.samples.dao.domain.MyActor> actIdAccessor = new VAccessor<>(io.vertigo.samples.dao.domain.MyActor.class, "Actor");

	/** {@inheritDoc} */
	@Override
	public UID<MyRole> getUID() {
		return UID.of(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long rolId <b>Obligatoire</b>
	 */
	@Field(domain = "DoId", type = "ID", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "Id")
	public Long getRolId() {
		return rolId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Id'.
	 * @param rolId Long <b>Obligatoire</b>
	 */
	public void setRolId(final Long rolId) {
		this.rolId = rolId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Dans le role de'.
	 * @return String asCharacter <b>Obligatoire</b>
	 */
	@Field(domain = "DoLabelVeryLong", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "Dans le role de")
	public String getAsCharacter() {
		return asCharacter;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Dans le role de'.
	 * @param asCharacter String <b>Obligatoire</b>
	 */
	public void setAsCharacter(final String asCharacter) {
		this.asCharacter = asCharacter;
	}
	
	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Movie'.
	 * @return Long movId
	 */
	@Field(domain = "DoId", type = "FOREIGN_KEY", cardinality = io.vertigo.core.lang.Cardinality.OPTIONAL_OR_NULLABLE, label = "Movie")
	public Long getMovId() {
		return (Long) movIdAccessor.getId();
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Movie'.
	 * @param movId Long
	 */
	public void setMovId(final Long movId) {
		movIdAccessor.setId(movId);
	}
	
	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Actor'.
	 * @return Long actId
	 */
	@Field(domain = "DoId", type = "FOREIGN_KEY", cardinality = io.vertigo.core.lang.Cardinality.OPTIONAL_OR_NULLABLE, label = "Actor")
	public Long getActId() {
		return (Long) actIdAccessor.getId();
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Actor'.
	 * @param actId Long
	 */
	public void setActId(final Long actId) {
		actIdAccessor.setId(actId);
	}

 	/**
	 * Association : Actor.
	 * @return l'accesseur vers la propriété 'Actor'
	 */
	public VAccessor<io.vertigo.samples.dao.domain.MyActor> actor() {
		return actIdAccessor;
	}

 	/**
	 * Association : Movie.
	 * @return l'accesseur vers la propriété 'Movie'
	 */
	public VAccessor<io.vertigo.samples.dao.domain.MyMovie> movie() {
		return movIdAccessor;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
