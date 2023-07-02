package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.Http2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.entities.Employee;
import com.app.service.EmployeeService;
import com.app.service.EmployeeServiceImpl;


@RestController
//@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl empService;
	
	@GetMapping
	public List<Employee> fetchEmployeeDetails()
	{
		return empService.getEmployeeDetails();
	}
	
	@PostMapping("/insert")
	public ResponseEntity<?> insertEmployee(@RequestBody Employee transientEmp)
	{
		System.out.println(transientEmp);
		return new ResponseEntity<>(empService.addEmployeeDetails(transientEmp),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{empid}")
	public ApiResponse deleteEmployeeDetails(@PathVariable Long empid)
	{
		return new ApiResponse(empService.deleteEmployee(empid));
	}
	
	@GetMapping("/{empid}")
	public Employee getEmpByID(@PathVariable Long empid)
	{
		return empService.getEmpDetailsById(empid);
	}
	
	@PutMapping
	public Employee updateDetachedEmployee(@RequestBody Employee detachedEmp)
	{
		return empService.updateEmployee(detachedEmp);
	}
	
	
	
	
}
