package com.joaovictor.demo.services.exceptions;

public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DatabaseException (String messege) {
		super(messege);
	}
	
	
}
