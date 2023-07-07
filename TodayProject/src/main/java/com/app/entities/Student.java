package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="stud")
public class Student extends BaseEntity{

	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="course")
	private Course Assignedcourse;

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

	public Course getAssignedcourse() {
		return Assignedcourse;
	}

	public void setAssignedcourse(Course assignedcourse) {
		Assignedcourse = assignedcourse;
	}

	public Student(String firstName, String lastName, String email, String password, Course assignedcourse) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		Assignedcourse = assignedcourse;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", Assignedcourse=" + Assignedcourse + "]";
	}

	
	
	

	
}
