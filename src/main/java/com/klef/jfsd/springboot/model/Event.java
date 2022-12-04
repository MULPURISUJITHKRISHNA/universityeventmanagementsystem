package com.klef.jfsd.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="event_table")


public class Event 
{

	@Id
	@GeneratedValue
	private int id;
	private String evname;
	private String evtype;
	private String evdate;
	private String evvenue;
	private String studentcodname;
	private String studentcodemailid;
	private String studentcontact;
	private String studentcodusername;
	@Override
	public String toString() {
		return "Event [id=" + id + ", evname=" + evname + ", evtype=" + evtype + ", evdate=" + evdate + ", evvenue="
				+ evvenue + ", studentcodname=" + studentcodname + ", studentcodemailid=" + studentcodemailid
				+ ", studentcontact=" + studentcontact + ", studentcodusername=" + studentcodusername + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEvname() {
		return evname;
	}
	public void setEvname(String evname) {
		this.evname = evname;
	}
	public String getEvtype() {
		return evtype;
	}
	public void setEvtype(String evtype) {
		this.evtype = evtype;
	}
	public String getEvdate() {
		return evdate;
	}
	public void setEvdate(String evdate) {
		this.evdate = evdate;
	}
	public String getEvvenue() {
		return evvenue;
	}
	public void setEvvenue(String evvenue) {
		this.evvenue = evvenue;
	}
	public String getStudentcodname() {
		return studentcodname;
	}
	public void setStudentcodname(String studentcodname) {
		this.studentcodname = studentcodname;
	}
	public String getStudentcodemailid() {
		return studentcodemailid;
	}
	public void setStudentcodemailid(String studentcodemailid) {
		this.studentcodemailid = studentcodemailid;
	}
	public String getStudentcontact() {
		return studentcontact;
	}
	public void setStudentcontact(String studentcontact) {
		this.studentcontact = studentcontact;
	}
	public String getStudentcodusername() {
		return studentcodusername;
	}
	public void setStudentcodusername(String studentcodusername) {
		this.studentcodusername = studentcodusername;
	}
	
	
	
}
