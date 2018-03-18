package com.k5r.springboot.rest.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.k5r.springboot.web.model.Customer;

@RestController
public class CustomerController {
	
	@RequestMapping(value="/customer",method=RequestMethod.POST)
	public boolean addCustomer(@RequestBody Customer customer) {
		System.out.println(customer.getName());
		return true;
	}

}
