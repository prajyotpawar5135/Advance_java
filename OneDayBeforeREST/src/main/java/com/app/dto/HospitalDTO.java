package com.app.dto;


public class HospitalDTO {

	private String name;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public HospitalDTO(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	public HospitalDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HospitalDTO [name=" + name + ", location=" + location + "]";
	}

	
}
