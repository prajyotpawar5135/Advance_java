package com.app.services;

import java.util.List;

import com.app.dto.CustomerDTO;
import com.app.entities.Customer;

public interface CustomerService {

    public List<Customer> getCustomer();
	
     String addCustomer(CustomerDTO cust);
	
     Customer updateCustomer (Customer c);
     
     String deleteCustomer(Long id);
     
     Customer getByAccount(String nm);
     
}
