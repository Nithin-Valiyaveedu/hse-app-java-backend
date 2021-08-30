 package com.java.inkathon.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.inkathon.model.Incident;

@Repository
@Transactional
public class IncidentDao {
	
	@Autowired(required=true)
	private SessionFactory factory;
	
	public String savePerson(Incident incident){
		if(incident!=null){
			factory.getCurrentSession().save(incident);
			return "success inserted into DB";
		}
		return "object not found";
	}
	
	
  
 
}