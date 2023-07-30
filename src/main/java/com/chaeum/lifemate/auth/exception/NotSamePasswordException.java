package com.chaeum.lifemate.auth.exception;

public class NotSamePasswordException extends RuntimeException {
	private static final long serialVersionUID = 6966602510347595621L;

	public NotSamePasswordException(String message) {
		super(message);
	}
}
