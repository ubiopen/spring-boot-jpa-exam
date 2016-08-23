package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@RequestMapping("/customers")
	public Iterable<Customer> findAll() {
		return customerRepository.findAll();
	}
}
