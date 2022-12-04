package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Faculty;
import com.klef.jfsd.springboot.model.Participant;
import com.klef.jfsd.springboot.repository.AdminRepository;
import com.klef.jfsd.springboot.repository.FacultyRepository;
import com.klef.jfsd.springboot.repository.ParticipantRepository;

@Service

public class AdminServiceImpl  implements AdminService
{
    
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private ParticipantRepository participantRepository;
	
	@Autowired
	private FacultyRepository facultyRepository;
	
	
	
	@Override
	public Admin checkadminlogin(String uname, String pwd) 
	{
		
		return adminRepository.checkadminlogin(uname, pwd);
	}

	@Override
	public List<Participant> viewallparticipants() 
	{
		
		return (List<Participant>) participantRepository.findAll();
	}

	@Override
	public void deleteparticipant(int id) 
	{
		participantRepository.deleteById(id);
		
	}

	@Override
	public Participant viewparticipantbyid(int id) 
	{

   return participantRepository.findById(id).get();
		
	}
	
	
	@Override
	public List<Faculty> viewallfaculty() 
	{
		
		return (List<Faculty>) facultyRepository.findAll();
	}

	@Override
	public void deletefaculty(int id) 
	{
		facultyRepository.deleteById(id);
		
	}

	@Override
	public Faculty viewfacultybyid(int id) 
	{

   return facultyRepository.findById(id).get();
		
	}


}
