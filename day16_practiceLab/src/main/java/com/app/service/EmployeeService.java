package com.app.service;

import java.util.List;

import com.app.entities.Employee;

public interface EmployeeService {

	List<Employee> getEmployeeDetails();
	
	Employee addEmployeeDetails(Employee transientEmp);
     
	String deleteEmployee(Long empid);

	Employee getEmpDetailsById(Long empid);
	
	Employee updateEmployee(Employee emp);
	
	 //RespDTO RespauthenticateEmployee( RequestDTO request);
	
	
	
	
	
	
}

