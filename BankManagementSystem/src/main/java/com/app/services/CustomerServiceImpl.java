package com.app.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.CustomerDTO;
import com.app.entities.AccountType;
import com.app.entities.Customer;
import com.app.repositories.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository custRepo;
	@Autowired
	private ModelMapper mp;

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return custRepo.findAll();
	}

	@Override
	public String addCustomer(CustomerDTO cust) {
		Customer c = mp.map(cust, Customer.class);
		custRepo.save(c);
		return "inserted successfully";
	}

	@Override
	public Customer updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		return custRepo.saveAndFlush(c);
	}

	@Override
	public String deleteCustomer(Long id) {
		// TODO Auto-generated method stub
		custRepo.deleteById(id);

		return "deleted Successfully";
	}

	@Override
	public Customer getByAccount(String nm) {
		
		return custRepo.findByAccType(AccountType.valueOf(nm)).orElseThrow();
		
	}

}
