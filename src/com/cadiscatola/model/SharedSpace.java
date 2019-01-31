package com.cadiscatola.model;

import java.util.Map;

import com.cadiscatola.utils.exceptions.SharedSpaceDoesNotExistException;
import com.cadiscatola.wrapper.exceptions.InternalException;

public class SharedSpace {
	private String name = null;
	private User owner = null;
	
	public SharedSpace() { }
	public SharedSpace(String name, User owner) {
		this.name = name;
		this.owner = owner;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public User getOwner() {
		return owner;
	}
	
	public void setOwner(User owner) {
		this.owner = owner;
	}
	
	/** Restituisce una mappa M<S, K> tale che:
	 * 		- M.get(S) è True se l'utente dal nickname S ha permessi di scrittura sul repository, False altrimenti
	 * 
	 * 
	 * @return
	 * @throws SharedSpaceDoesNotExistException
	 * @throws InternalException
	 */
	public Map<String, Boolean> getCollaborators() throws SharedSpaceDoesNotExistException, InternalException {
		return null;
	}
	
	/** Aggiunge un collaboratore allo Sharespace
	 * 
	 * @param user
	 * @param canWrite True se l'utente ha permessi di scrittura, False altrimenti 
	 * @throws SharedSpaceDoesNotExistException
	 * @throws InternalException
	 */
	public void addCollaborator(User user, Boolean canWrite) throws SharedSpaceDoesNotExistException, InternalException {	}
	
	/** Rimuove un collaboratore dallo Sharespace.
	 * NON RIMUOVE LA COPIA LOCALE DELL'UTENTE.
	 * 
	 * @param user
	 * @throws SharedSpaceDoesNotExistException
	 * @throws InternalException
	 */
	public void removeCollaborator(User user) throws SharedSpaceDoesNotExistException, InternalException { }

	@Override
	public String toString() {
		return name;
	}
}
