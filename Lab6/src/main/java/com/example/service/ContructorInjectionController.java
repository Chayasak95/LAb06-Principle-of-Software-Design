package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;

@RestController
@RequestMapping("/constructor")
public class ContructorInjectionController {
	private CustomerService customerService;
	@Autowired
	public ContructorInjectionController(CustomerService customerService) {
		this.customerService=customerService;
	}
	@GetMapping("/{id}") //Get http://localhost:8080/constructor/15
	public String getCustomerById(@PathVariable Long id) {
		Customer cust = customerService.getCustomerById(id);
		return "Controller Injection Customer ID:"+cust.getId()+", Name:"+cust.getName();
	}
	@GetMapping("/customer/{id}/{name}")// Get http://localhost:8080/constructor/customer/25/Chayasak
	public String getCustomerByIdName(@PathVariable Long id,@PathVariable String name) {
		Customer cust = customerService.getCustomerByIdName(id,name);
		return "Controller Injection Customer ID:"+cust.getId()+", Name:"+cust.getName();
	}
}
