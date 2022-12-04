package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="faculty_table")

public class Faculty 
{
    @Id
	@GeneratedValue
	private int id;
    @Column(nullable = false,length = 200)
    private String name;
    @Column(nullable = false,length = 200)
    private String Gender;
    @Column(nullable = false,length = 200)
    private String Dept;
    @Column(nullable = false,length = 200)
    private String location;
    @Column(nullable = false,length = 200)
    private String emailid;
    @Column(nullable = false,length = 200)
    private String username;
    @Column(nullable = false,length = 200)
    private String password;
    @Column(nullable = false,length = 200)
    private String contactno;
	
	
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", Gender=" + Gender + ", Dept=" + Dept + ", location="
				+ location + ", emailid=" + emailid + ", username=" + username + ", password=" + password
				+ ", contactno=" + contactno + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
	
}
