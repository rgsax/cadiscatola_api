package com.cadiscatola.utils.exceptions;

import com.cadiscatola.wrapper.exceptions.RepositoryDoesNotExistException;

public class SharedSpaceDoesNotExistException extends RepositoryDoesNotExistException {
	private static final long serialVersionUID = 1L;

	public SharedSpaceDoesNotExistException(String sharedSpace) {
		super(sharedSpace);
	}
	
	@Override
	public String getMessage() {
		return "shared space " + repositoryName + " does not exists";
	}
}
