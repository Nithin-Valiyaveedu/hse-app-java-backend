 
package com.java.inkathon.dao;
 

 
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.inkathon.model.Customer;

@Repository
@Transactional
public class CustomerDao {
	
	@Autowired(required=true)
	private SessionFactory factory;
	
	public String savePerson(Customer customer){
		if(customer!=null){
			factory.getCurrentSession().save(customer);
			return "success";
		}
		return "object not found";
	}
	
	
  
 
}
 