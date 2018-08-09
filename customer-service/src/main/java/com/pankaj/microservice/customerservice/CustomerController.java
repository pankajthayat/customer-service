package com.pankaj.microservice.customerservice;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository repository;
	
	@PostMapping("/customer")
	public Integer createCustomer(@RequestBody CustomerBean customer)
	{
		CustomerBean obj=repository.save(customer);
		return obj.getId();
	 
	}
	@PutMapping("/customer/{id}")
	public void updateCustomerDetails(@RequestBody CustomerBean customer)
	{
	repository.save(customer);
	}
	@DeleteMapping("/customer/{id}")// the mapping for delete and update is same... how will./....
	public void deleteCustomerDetails(@PathVariable Integer id)
	{
	repository.deleteById(id);;
	}
	@GetMapping("/customer/{id}")
	public Optional<CustomerBean> findById(@PathVariable Integer id)
	{
	return repository.findById(id);
	}

}
