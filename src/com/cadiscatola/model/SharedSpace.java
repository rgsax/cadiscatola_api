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
	
	public Map<String, Boolean> getCollaborators() throws SharedSpaceDoesNotExistException, InternalException {
		return null;
	}
	
	public void addCollaborator(User user, Boolean canWrite) throws SharedSpaceDoesNotExistException, InternalException {	}
	
	public void removeCollaborator(User user) throws SharedSpaceDoesNotExistException, InternalException { }
}
