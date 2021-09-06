package com.java.inkathon.dao;
import java.util.List;

import javax.persistence.Query;

import com.java.inkathon.model.IncidentDo;
import com.sap.db.jdbc.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class IncidentDao {
	
	@Autowired(required=true)
	private SessionFactory factory;
	
	public String saveIncident(IncidentDo incident){
		if(incident!=null){
			factory.getCurrentSession().save(incident);
			return "Succesfully inserted into DB";
		}
		return "object not found";
	}
	
	@SuppressWarnings("unchecked")
	public List<IncidentDo> getAllincidents() {
		try{
		Session session = this.factory.getCurrentSession();
		List<IncidentDo> incidentList = session.createQuery("from IncidentDo").list();
		return incidentList;
		}
		catch(Exception e){
		System.err.println("ERROR:---"+ e);
		}
		return null;
	}
	
	public String updateRisk(IncidentDo incident){
		if(incident!=null){
			Session session = this.factory.getCurrentSession();
			Query query = session.createQuery("update IncidentDo set RISK_LEVEL=:RISK_LEVEL where INCIDENT_ID=:INCIDENT_ID");
	        query.setParameter("RISK_LEVEL",incident.getRiskLevel());
	        query.setParameter("INCIDENT_ID",incident.getId());
	        int result = query.executeUpdate();
	        // Commit the transaction and close the session
	        System.err.println("No of rows updated: "+result);
			return "Succesfully updated";
		}
		return "object not found";
	}
	
	  

}