package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Long>{
	
	Optional<Hospital> findById(Hospital hosp);

}
