package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="emp_data")
public class Employee extends BaseEntity{
	//fname lastnamae  emeial pass join date salary location
	
	@Column(length=30)
	private String firstName;
	@Column(length=30)
	private String lastName;
	@Column(length=30,unique = true)
	private String email;
	@Column(length=30)
	private String password;
	@Column(length=30)
	private LocalDate joinDate;
	@Column(length=30)
	private double salary;

	@Column(length=30)
	private String location;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String firstName, String lastName, String email, String password, LocalDate joinDate, double salary,
			String location) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.joinDate = joinDate;
		this.salary = salary;
		this.location = location;
	}
	
	
	
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
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee ["+"id="+getEmpid()+"firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", joinDate=" + joinDate + ", salary=" + salary + ", location=" + location + "]";
	}
	
	


}
