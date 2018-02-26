/**
 * 
 */
package com.prashant21tube.sample.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashant21tube.sample.model.Customer;
import com.prashant21tube.sample.repository.CustomerRepository;

/**
 * @author lenovo
 *
 */
@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}
	
	@PostMapping("/customers")
	public Customer createNote(@Valid @RequestBody Customer customer) {
	    return customerRepository.save(customer);
	}
}
