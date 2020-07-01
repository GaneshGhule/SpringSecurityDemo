package com.gg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gg.model.Customer;
import com.gg.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public Customer saveCustomer(Customer customer) {
		
		return null;
	}
	
	public Customer findByEmail(String email) {
		return null;
	}
	
	public Customer findByMobileNumber(String mobileNumber) {
		return null;
	}
	
}
