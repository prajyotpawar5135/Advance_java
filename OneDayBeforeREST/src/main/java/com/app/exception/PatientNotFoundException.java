package com.app.exception;

@SuppressWarnings("serial")
public class PatientNotFoundException extends RuntimeException {
	
	public PatientNotFoundException(String msg)
	{
		super(msg);
	}

}
