package com.java.inkathon.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.inkathon.dao.IncidentDao;
import com.java.inkathon.model.IncidentDo;
import com.java.inkathon.service.IncidentService;
@Service
public class IncidentServiceImpl implements IncidentService {
	
	@Autowired
	IncidentDao incidentDao;
	
	public String saveIncident(IncidentDo incident) {
		return incidentDao.saveIncident(incident);
	}

	@Override
	public List<IncidentDo> listIncidents() {
		return incidentDao.getAllincidents();
	}
	
	
	public String updateRisk(IncidentDo incident){
		return incidentDao.updateRisk(incident);
	}
	
	public String updateStatus(IncidentDo incident){
		return incidentDao.updateStatus(incident);
	}
	
	public String rejectStatus(IncidentDo incident){
		return incidentDao.rejectStatus(incident);
	}
	
	public String deleteById(int id){
		return incidentDao.deleteIncident(id);
	}


	
}