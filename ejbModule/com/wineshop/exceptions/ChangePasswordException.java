package com.wineshop.exceptions;

import javax.ejb.EJBException;

public class ChangePasswordException extends EJBException {

	private static final long serialVersionUID = 6314305942338659575L;

	private String message;

	public ChangePasswordException(String message) {
		super(message);
		this.message = message;
	}

	public String message() {
		return this.message;
	}
}
