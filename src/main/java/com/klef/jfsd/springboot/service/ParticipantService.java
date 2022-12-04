package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Participant;
import com.klef.jfsd.springboot.model.TechnicalEventRegistration;

public interface ParticipantService 
{
	  public Participant addparticipant(Participant participant);
	  public Participant checkparticipantlogin(String uname,String pwd);
	  public Participant viewparticipant(String uname);
	  public int changeparticipantpassword(String eoldpwd, String enewpwd,String empuname );
	  
	  
}
