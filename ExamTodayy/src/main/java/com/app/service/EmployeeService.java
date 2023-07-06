package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Employee;


public interface EmployeeService {

	
	List<Employee> getEmp();
	
	
	
	
}
