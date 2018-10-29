package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Customer;
import com.app.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> getAll(){
		
		return customerService.getAll();
	}
	
	@GetMapping("/customers/{id}")
	public Customer getById(@PathVariable Long id){
		
		return customerService.getById(id);
	}
	
	@GetMapping("/customers/firstName/{firstName}")
	public Customer getByFirstName(@PathVariable String firstName){
		
		return customerService.getByFirstName(firstName);
	}
	
	@PostMapping("/customers")
	public void addCustomer(@RequestBody Customer customer) {
		
		customerService.addCustomer(customer);
	}
	
	@PutMapping("/customers")
	public void updateCustomer(@RequestBody Customer customer) {
		
		customerService.updateCustomer(customer);
	}
	
	@DeleteMapping("/customers/{id}")
	public void deleteCustomer(@PathVariable Long id) {
		
		customerService.deleteCustomer(id);
	}
}
