package com.app.dto;

public class StudentDTO {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String course;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public StudentDTO(String firstName, String lastName, String email, String password, String course) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.course = course;
	}
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentDTO [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", course=" + course + "]";
	}

	
}
