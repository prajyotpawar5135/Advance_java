package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Passenger;

public interface PassengerRepository  extends JpaRepository<Passenger, Long>{

}
