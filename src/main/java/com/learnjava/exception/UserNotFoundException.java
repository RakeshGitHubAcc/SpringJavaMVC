package com.learnjava.exception;

import org.springframework.stereotype.Component;

@Component
public class UserNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public UserNotFoundException() {
	}

	public UserNotFoundException(String message) {
		super(message);
	}
}
