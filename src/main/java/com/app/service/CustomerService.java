package com.app.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.model.Customer;

public interface CustomerService {
	List<Customer> getAll();
	Customer getById(@PathVariable Long id);
	Customer getByFirstName(@PathVariable String firstName);
	void addCustomer(@RequestBody Customer customer);
	void updateCustomer(@RequestBody Customer customer);
	void deleteCustomer(@PathVariable Long id);
}
