package com.java.inkathon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.inkathon.service.CustomerService;
import com.java.inkathon.dao.CustomerDao;
import com.java.inkathon.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao dao;

	public String savePerson(Customer customer) {
		return dao.savePerson(customer);
	}
 
}
