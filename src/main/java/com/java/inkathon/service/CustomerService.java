package com.java.inkathon.service;
 
import org.springframework.stereotype.Service;

import com.java.inkathon.model.Customer; 
@Service
public interface CustomerService {
	
	public String savePerson(Customer customer) ;

}
