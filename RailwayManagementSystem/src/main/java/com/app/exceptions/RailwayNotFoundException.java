package com.app.exceptions;

@SuppressWarnings("serial")
public class RailwayNotFoundException extends RuntimeException{

	public RailwayNotFoundException (String msg)
	{
		super(msg);
	}
	
}
