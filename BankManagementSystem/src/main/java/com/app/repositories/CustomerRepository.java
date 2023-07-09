package com.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.AccountType;
import com.app.entities.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Long>{

	Optional<Customer> findByAccType(AccountType acc);
}
