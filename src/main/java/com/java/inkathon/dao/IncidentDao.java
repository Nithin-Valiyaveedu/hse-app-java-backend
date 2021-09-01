package com.java.inkathon.dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.inkathon.model.IncidentDo;

@Repository
@Transactional
public class IncidentDao {
	
	@Autowired(required=true)
	private SessionFactory factory;
	
	public String saveIncident(IncidentDo incident){
		if(incident!=null){
			factory.getCurrentSession().save(incident);
			return "success inserted into DB";
		}
		return "object not found";
	}
	
	public List<IncidentDo> getAllincidents() {
		try{
			Session session = factory.getCurrentSession();
			List<IncidentDo> incidents = new ArrayList<IncidentDo>();
			incidents = session.createQuery("from incident", IncidentDo.class).list();
			//incidents.add(session.get(IncidentDo.class, 99));
			return incidents;
		}catch(Exception e)
		{
			System.err.println("Execep:---"+ e);
		}
		
		return null;
	}

  
 
}