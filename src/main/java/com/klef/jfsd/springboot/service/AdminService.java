package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Faculty;
import com.klef.jfsd.springboot.model.Participant;



public interface AdminService 
{
	 public Admin checkadminlogin(String uname, String pwd);
	 public List<Participant> viewallparticipants();
	 public void deleteparticipant(int id);
	 public Participant viewparticipantbyid(int id);
	 public List<Faculty> viewallfaculty();
	 public void deletefaculty(int id);
	 public Faculty viewfacultybyid(int id);
}
