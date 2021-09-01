package com.java.inkathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.inkathon.dao.IncidentDao;
import com.java.inkathon.model.Incident;
@Service
public class IncidentServiceImpl implements IncidentService {
	
	@Autowired
	IncidentDao incidentDao;
	
	public String saveIncident(Incident incident) {
		return incidentDao.savePerson(incident);
	}

	@Override
	public List<Incident> getallincident() {
		return incidentDao.getAllincidents();
	}


	
}