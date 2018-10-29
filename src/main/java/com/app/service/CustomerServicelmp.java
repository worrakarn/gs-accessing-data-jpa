package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CustomerRepository;
import com.app.model.Customer;

@Service
public class CustomerServicelmp implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAll() {
		
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public Customer getById(Long id) {
		
		return customerRepository.findById(id).get();
	}
	
	@Override
	public Customer getByFirstName(String firstName) {
		
		return customerRepository.findByFirstName(firstName)
				.stream().filter(n->n.getFirstName().equals(firstName)).findFirst().get();
	}

	@Override
	public void addCustomer(Customer customer) {
		
		customerRepository.save(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		
		customerRepository.save(customer);
		
	}

	@Override
	public void deleteCustomer(Long id) {
		
		customerRepository.deleteById(id);
		
	}

}
