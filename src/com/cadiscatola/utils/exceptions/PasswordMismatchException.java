package com.cadiscatola.utils.exceptions;

public class PasswordMismatchException extends com.cadiscatola.wrapper.exceptions.PasswordMismatchException {
	private static final long serialVersionUID = 1L;

	public PasswordMismatchException(String user) {
		super(user);
	}
	
	@Override
	public String getMessage() {
		return "password mismatch for user " + user;
	}
}
