package com.java.inkathon.controller;

import com.java.inkathon.dto.ResponseDto;
import com.java.inkathon.model.IncidentDo;
import com.java.inkathon.service.IncidentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Inkathon", produces = "application/json")
public class IncidentController {

	@Autowired
	private IncidentService incidentService;

	ResponseDto rdto = new ResponseDto();

	// Post request

	@RequestMapping(value = "/saveIncident", method = RequestMethod.POST)
	@ResponseBody
	public ResponseDto save(@RequestBody IncidentDo incident) {
		incidentService.saveIncident(incident);
		rdto.setCode("200");
		rdto.setMessage("OK");
		return rdto;
	}

	// Getting all incident

	@GetMapping("/test1")
	@ResponseBody
	public ResponseDto methodTest() {

		List<IncidentDo> rsE = incidentService.listIncidents();
		System.err.println("data " + rsE);
		rdto.setCode("200");
		rdto.setMessage("OK");
		rdto.setData(rsE);
		return rdto;
	}

	@GetMapping("/test2")
	@ResponseBody
	public Object methodTest1() {

		List<IncidentDo> rsE = incidentService.listIncidents();
		return rsE;
	}

	@RequestMapping(value = "/updateRisk", method = RequestMethod.POST)
	@ResponseBody
	public ResponseDto updaterisk(@RequestBody IncidentDo incident) {
		incidentService.updateRisk(incident);
		rdto.setCode("200");
		rdto.setMessage("OK");
		return rdto;
		
	}

	// Approving an incident

	@RequestMapping(value = "/approve", method = RequestMethod.POST)
	@ResponseBody
	public ResponseDto updatestatus(@RequestBody IncidentDo incident) {
		incidentService.updateStatus(incident);
		rdto.setCode("200");
		rdto.setMessage("OK");
		return rdto;
	}

	// Rejecting a status

	@RequestMapping(value = "/reject", method = RequestMethod.POST)
	@ResponseBody
	public ResponseDto rejectstatus(@RequestBody IncidentDo incident) {
		incidentService.rejectStatus(incident);
		rdto.setCode("200");
		rdto.setMessage("OK");
		return rdto;
	}

	// Deleting an incident
	@DeleteMapping("/incident/{id}")
	public String deleteUser(@PathVariable int id) throws Exception {
		return incidentService.deleteById(id);
	}

	// Setting comment from action team
	@RequestMapping(value = "/comments", method = RequestMethod.POST)
	@ResponseBody
	public ResponseDto saveComments(@RequestBody IncidentDo incident) {
		incidentService.saveComments(incident);
		rdto.setCode("200");
		rdto.setMessage("OK");
		return rdto;
	}

	// Sorting based on the risklevel
	@GetMapping("/sortrisklevel")
	@ResponseBody
	public ResponseDto sortrisklevel() {

		List<IncidentDo> rsE = incidentService.sortrisklevel();
		System.err.println("data " + rsE);
		rdto.setData(rsE);
		return rdto;
	}

	// Setting updates from audit team
	@RequestMapping(value = "/updateAll", method = RequestMethod.POST)
	@ResponseBody
	public ResponseDto updateall(@RequestBody IncidentDo incident) {
		incidentService.updateall(incident);
		rdto.setCode("200");
		rdto.setMessage("OK");
		return rdto;
	}

	// update action team status
	@RequestMapping(value = "/updateAction", method = RequestMethod.POST)
	@ResponseBody
	public ResponseDto updateaction(@RequestBody IncidentDo incident) {
		incidentService.updateaction(incident);
		rdto.setCode("200");
		rdto.setMessage("OK");
		return rdto;
	}

	// Displaying incidents which are done
	@GetMapping("/incidentDone")
	@ResponseBody
	public Object doneIncidents() {

		List<IncidentDo> rsE = incidentService.getDoneIncidents();
		return rsE;
	}

	// Displaying incidents which are approved
	@GetMapping("/incidentApproved")
	@ResponseBody
	public Object approvedIncidents() {
		List<IncidentDo> rsE = incidentService.getApprovedIncidents();
		return rsE;
	}

	// 0 - SET
	// 1 - UNSET
	@GetMapping("/showIncident")
	@ResponseBody
	public Object showIncident() {

		List<IncidentDo> rsE = incidentService.getNewIncidents();
		return rsE;
	}

	// for the graph
	@GetMapping("/graph")
	@ResponseBody
	public Object graphData() {

		List<IncidentDo> rsE = incidentService.getGraphData();
		return rsE;
	}

	// Displaying incidents which are processing or no action
	@GetMapping("/actionteamdisplay")
	@ResponseBody
	public Object processingIncidents() {

		List<IncidentDo> rsE = incidentService.getProcessingIncidents();
		return rsE;
	}

	// Audit team dashboard display 
	@GetMapping("/auditdashboard")
	@ResponseBody
	public ResponseDto auditdisplay() {

		List<IncidentDo> rsE = incidentService.auditdisplay();
		System.err.println("data " + rsE);
		rdto.setData(rsE);
		return rdto;
	}

	// //Adding photo
	// @RequestMapping(value="/addPhoto", method= RequestMethod.POST)
	// @ResponseBody
	// public String savePhoto(@RequestParam("file") MultipartFile
	// multipartImage, @RequestParam("id") int id) throws IOException{
	// return incidentService.savePhoto(multipartImage,id);
	// }
	//
	// Getting Photo
	// --code

}
