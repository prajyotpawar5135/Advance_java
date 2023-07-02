package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dto.RequestDTO;
import com.app.dto.RespDTO;
import com.app.entities.Employee;
import com.app.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements  EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	
	@Override
	public List<Employee> getEmployeeDetails() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}


	@Override
	public Employee addEmployeeDetails(Employee transientEmp) {
		// TODO Auto-generated method stub
		return empRepo.save(transientEmp);
	}


	@Override
	public String deleteEmployee(Long empid) {
		String mesg=" ";
		if(empRepo.existsById(empid))
		{
			empRepo.deleteById(empid);
			mesg="employe deleted ";
		}
		return mesg;
	}


	@Override
	public Employee getEmpDetailsById(Long empid) {
		return empRepo.findById(empid).orElseThrow(() -> new ResourceNotFoundException("invalid email id"));
	}


	@Override
	public Employee updateEmployee(Employee detachedemp) {
		// TODO Auto-generated method stub
		return empRepo.save(detachedemp);
	}


//	@Override
//	public RespDTO RespauthenticateEmployee(RequestDTO request) {
//		Employee emp=empRepo.findByEmailAndPassword(request.getEmail(),request.getPassword())
//					.orElseThrow
//		return null;
//	}


	
	
	

	
	
}
