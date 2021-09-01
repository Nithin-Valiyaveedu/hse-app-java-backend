package com.java.inkathon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Action Team")
public class ActionTeamDao {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="status")
	private String status;
	
	
	
	
	public ActionTeamDao() {
		super();
	}
	
	public ActionTeamDao(String status) {
		super();
		this.status = status;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	

	@Override
	public String toString() {
		return "Action_Team [id=" + id + ", status=" + status +" ]";
	}
	
	

}


