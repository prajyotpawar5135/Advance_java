package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CustomerDTO;
import com.app.entities.Customer;
import com.app.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService custSer;
	
	@GetMapping
	public List<Customer> getAllCustomerDetails()
	{
		return custSer.getCustomer();
	}
	
	@PostMapping
	public ResponseEntity<?> insertCustomer(@RequestBody CustomerDTO c)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(custSer.addCustomer(c));
	}
	@PutMapping("/update")
	public ResponseEntity<?> updateCustomer(@RequestBody Customer cu)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(custSer.updateCustomer(cu));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteCustomer(@PathVariable Long id)
	{
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(custSer.deleteCustomer(id));
	}
	
	@GetMapping("/{nm}")
	public ResponseEntity<?> getByEnum(@PathVariable String nm)
	{
		return ResponseEntity.status(HttpStatus.OK).body(custSer.getByAccount(nm));
	}
	
	
	
	
}
