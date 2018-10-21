package io.vertigo.samples.crystal.domain;

import io.vertigo.dynamo.domain.model.Entity;
import io.vertigo.dynamo.domain.model.URI;
import io.vertigo.dynamo.domain.model.VAccessor;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;
import io.vertigo.lang.Generated;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
public final class Role implements Entity {
	private static final long serialVersionUID = 1L;

	private Long rolId;
	private String asCharacter;

	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "A_ROL_MOV",
			fkFieldName = "MOV_ID",
			primaryDtDefinitionName = "DT_MOVIE",
			primaryIsNavigable = false,
			primaryRole = "Movie",
			primaryLabel = "Movie",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DT_ROLE",
			foreignIsNavigable = true,
			foreignRole = "Role",
			foreignLabel = "Role",
			foreignMultiplicity = "0..*")
	private final VAccessor<io.vertigo.samples.crystal.domain.Movie> movIdAccessor = new VAccessor<>(io.vertigo.samples.crystal.domain.Movie.class, "Movie");

	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "A_ROL_ACT",
			fkFieldName = "ACT_ID",
			primaryDtDefinitionName = "DT_ACTOR",
			primaryIsNavigable = true,
			primaryRole = "Actor",
			primaryLabel = "Actor",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DT_ROLE",
			foreignIsNavigable = false,
			foreignRole = "Role",
			foreignLabel = "Role",
			foreignMultiplicity = "0..*")
	private final VAccessor<io.vertigo.samples.crystal.domain.Actor> actIdAccessor = new VAccessor<>(io.vertigo.samples.crystal.domain.Actor.class, "Actor");

	/** {@inheritDoc} */
	@Override
	public URI<Role> getURI() {
		return URI.of(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Id'.
	 * @return Long rolId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_ID", type = "ID", required = true, label = "Id")
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
	@Field(domain = "DO_LABEL_VERY_LONG", required = true, label = "Dans le role de")
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
	@Field(domain = "DO_ID", type = "FOREIGN_KEY", label = "Movie")
	public Long getMovId() {
		return (Long)  movIdAccessor.getId();
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
	@Field(domain = "DO_ID", type = "FOREIGN_KEY", label = "Actor")
	public Long getActId() {
		return (Long)  actIdAccessor.getId();
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
	public VAccessor<io.vertigo.samples.crystal.domain.Actor> actor() {
		return actIdAccessor;
	}
	
	@Deprecated
	public io.vertigo.samples.crystal.domain.Actor getActor() {
		// we keep the lazyness
		if (!actIdAccessor.isLoaded()) {
			actIdAccessor.load();
		}
		return actIdAccessor.get();
	}

	/**
	 * Retourne l'URI: Actor.
	 * @return URI de l'association
	 */
	@Deprecated
	public io.vertigo.dynamo.domain.model.URI<io.vertigo.samples.crystal.domain.Actor> getActorURI() {
		return actIdAccessor.getURI();
	}

 	/**
	 * Association : Movie.
	 * @return l'accesseur vers la propriété 'Movie'
	 */
	public VAccessor<io.vertigo.samples.crystal.domain.Movie> movie() {
		return movIdAccessor;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
