 package com.java.inkathon.dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
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
	
	public List<Incident> getAllincidents() {
		try{
			
			Session session = factory.getCurrentSession();
			List<Incident> incidents = new ArrayList<Incident>();
			incidents = session.createQuery("from Student", Incident.class).list();
			return incidents;
		}catch(Exception e)
		{
			System.out.println("Execep:---"+ e);
		}
		
		return null;
	}

  
 
}