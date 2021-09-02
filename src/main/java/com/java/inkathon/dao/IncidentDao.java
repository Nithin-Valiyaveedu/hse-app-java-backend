package com.java.inkathon.dao;
import java.util.List;
import com.java.inkathon.model.IncidentDo;
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
		System.err.println("NEW ERROR:---"+ e);
		}
		return null;
}
	
//	public List<IncidentDo> getAllincidents() {
//		try{
//			Session session = factory.getCurrentSession();
//			List<IncidentDo> incidents = new ArrayList<IncidentDo>();
//			incidents.add(session.get(IncidentDo.class, 3));
//			return incidents;
//		}catch(Exception e)
//		{
//			System.err.println("Execep:---"+ e);
//		}
//		
//		return null;
//	}

  
 
}