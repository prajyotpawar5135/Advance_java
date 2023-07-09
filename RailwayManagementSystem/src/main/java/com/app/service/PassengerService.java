package com.app.service;

import java.util.List;

import com.app.dto.PassengerDTO;
import com.app.entities.Passenger;

public interface PassengerService {

	List<Passenger> getAllPass();
	
	String addPassenger(PassengerDTO p);

}
