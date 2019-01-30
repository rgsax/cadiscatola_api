package com.cadiscatola.utils.exceptions;

public class SharedSpaceAlreadyExistsException
		extends com.cadiscatola.wrapper.exceptions.RepositoryAlreadyExistsException {
	private static final long serialVersionUID = 1L;

	public SharedSpaceAlreadyExistsException(String sharedSpace, String owner) {
		super(sharedSpace, owner);
	}
	
	@Override
	public String getMessage() {
		return owner + " could not create shared space " + repositoryName;
	}
}
