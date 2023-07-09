package com.app.exceptions;

@SuppressWarnings("serial")
public class CustomerNotFoundException extends RuntimeException{

	public CustomerNotFoundException(String mesg)
	{
		super(mesg);
	}
}
