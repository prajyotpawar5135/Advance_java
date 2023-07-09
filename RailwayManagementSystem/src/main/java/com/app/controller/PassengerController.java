package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.APIResponse;
import com.app.dto.PassengerDTO;
import com.app.entities.Passenger;
import com.app.service.PassengerService;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

	@Autowired
	private PassengerService passSer;
	
	@GetMapping
	public List<Passenger> getPassengerDetails()
	{
		return passSer.getAllPass();
	}
	
	@PostMapping
	public APIResponse insertPassenger(  @RequestBody  PassengerDTO p)
	{
		return new APIResponse(passSer.addPassenger(p));
	}
}
