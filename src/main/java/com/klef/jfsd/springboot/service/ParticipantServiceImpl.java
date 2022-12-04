package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Participant;
import com.klef.jfsd.springboot.model.TechnicalEventRegistration;
import com.klef.jfsd.springboot.repository.ParticipantRepository;
import com.klef.jfsd.springboot.repository.Techrepository;

@Service


public class ParticipantServiceImpl  implements ParticipantService
{
	@Autowired
	private ParticipantRepository participantRepository;
    
	
	
	@Override
	public Participant addparticipant(Participant participant) {
		return participantRepository.save(participant);
		
	}

	@Override
	public Participant checkparticipantlogin(String uname, String pwd) {
	
		return participantRepository.checkparticipantlogin(uname,pwd);
		
	}

	@Override
	public Participant viewparticipant(String uname) {
		
		return participantRepository.viewparticipant(uname);
	}

	@Override
	public int changeparticipantpassword(String eoldpwd, String enewpwd, String empuname) {
		
		return participantRepository.updateparticipantpassword(enewpwd, eoldpwd, empuname);
	}


	

}
