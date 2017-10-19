package io.vertigo.pandora.domain.persons;

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
public final class ActorRole implements Entity {
	private static final long serialVersionUID = 1L;

	private Long aroId;

	private String role;

	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "A_MRO_PER",
			fkFieldName = "PER_ID",
			primaryDtDefinitionName = "DT_PERSON",
			primaryIsNavigable = true,
			primaryRole = "Actor",
			primaryLabel = "Actor",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DT_ACTOR_ROLE",
			foreignIsNavigable = true,
			foreignRole = "Roles",
			foreignLabel = "Roles",
			foreignMultiplicity = "0..*")
	private final VAccessor<io.vertigo.pandora.domain.persons.Person> perIdAccessor = new VAccessor<>(io.vertigo.pandora.domain.persons.Person.class, "actor");

	@io.vertigo.dynamo.domain.stereotype.Association(
			name = "A_MOV_MRO",
			fkFieldName = "MOV_ID",
			primaryDtDefinitionName = "DT_MOVIE",
			primaryIsNavigable = false,
			primaryRole = "Movie",
			primaryLabel = "Movie",
			primaryMultiplicity = "0..1",
			foreignDtDefinitionName = "DT_ACTOR_ROLE",
			foreignIsNavigable = true,
			foreignRole = "Roles",
			foreignLabel = "Roles",
			foreignMultiplicity = "0..*")
	private final VAccessor<io.vertigo.pandora.domain.movies.Movie> movIdAccessor = new VAccessor<>(io.vertigo.pandora.domain.movies.Movie.class, "movie");


	/** {@inheritDoc} */
	@Override
	public URI<ActorRole> getURI() {
		return DtObjectUtil.createURI(this);
	}

	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'ARO ID'.
	 * @return Long aroId <b>Obligatoire</b>
	 */
	@Field(domain = "DO_IDENTITY", type = "ID", required = true, label = "ARO ID")
	public Long getAroId() {
		return aroId;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'ARO ID'.
	 * @param aroId Long <b>Obligatoire</b>
	 */
	public void setAroId(final Long aroId) {
		this.aroId = aroId;
	}
	
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'ROLE'.
	 * @return String role
	 */
	@Field(domain = "DO_LABEL", label = "ROLE")
	public String getRole() {
		return role;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'ROLE'.
	 * @param role String
	 */
	public void setRole(final String role) {
		this.role = role;
	}
	
	
	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Actor'.
	 * @return Long perId
	 */
	@Field(domain = "DO_IDENTITY", type = "FOREIGN_KEY", label = "Actor")
	public Long getPerId() {
		return (Long)  perIdAccessor.getId();
	}

	/**
	 * Champ : FOREIGN_KEY.
	 * Définit la valeur de la propriété 'Actor'.
	 * @param perId Long
	 */
	public void setPerId(final Long perId) {
		perIdAccessor.setId(perId);
	}
	
	
	/**
	 * Champ : FOREIGN_KEY.
	 * Récupère la valeur de la propriété 'Movie'.
	 * @return Long movId
	 */
	@Field(domain = "DO_IDENTITY", type = "FOREIGN_KEY", label = "Movie")
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
	 * Association : Actor.
	 * @return io.vertigo.pandora.domain.persons.Person
	 */
				
	public io.vertigo.pandora.domain.persons.Person getActor() {
		return perIdAccessor.get();
	}

	/**
	 * Retourne l'URI: Actor.
	 * @return URI de l'association
	 */
	public io.vertigo.dynamo.domain.model.URI<io.vertigo.pandora.domain.persons.Person> getActorURI() {
		return perIdAccessor.getURI();
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}