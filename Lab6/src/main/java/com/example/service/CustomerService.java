package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Customer;

@Service
public class CustomerService {
	public Customer getCustomerById(Long id) {
		return new Customer(id,"Alice");
	}
	public Customer getCustomerByIdName(Long id,String name) {
		return new Customer(id,name);
	}
	public List<Customer> getCustomes(){
		List<Customer> customers = new ArrayList<>();
		customers.add(getCustomerByIdName(Long.valueOf(1),"Joht"));
		customers.add(getCustomerByIdName(Long.valueOf(2),"JoJo"));
		customers.add(getCustomerByIdName(Long.valueOf(3),"Jotaro"));
		customers.add(getCustomerByIdName(Long.valueOf(4),"Jonatanta"));
		return customers;
	}
	
}
