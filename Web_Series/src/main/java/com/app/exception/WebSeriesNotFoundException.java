package com.app.exception;

@SuppressWarnings("serial")
public class WebSeriesNotFoundException extends RuntimeException {

	public WebSeriesNotFoundException(String msg)
	{
		super(msg);
	}
}
