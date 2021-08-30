package com.java.inkathon.controller;

import java.util.List;

import com.java.inkathon.model.Customer;

import com.java.inkathon.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping(value="/Inkathon", produces="application/json")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	@RequestMapping(value="/savePerson", method= RequestMethod.POST)
	@ResponseBody 
	public String save(@RequestBody Customer customer){
		return customerService.savePerson(customer);
	}
	
	
}
