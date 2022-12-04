package com.klef.jfsd.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="technicalevent")

public class TechnicalEventRegistration 
{
	@Id
	@GeneratedValue
    private int id;
	private  int participantid;
	private String name;
	private String eventtype;
	private String eventname;
	private String phoneno;
	public int getParticipantid() {
		return participantid;
	}
	public void setParticipantid(int participantid) {
		this.participantid = participantid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEventtype() {
		return eventtype;
	}
	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	
	
	
}
