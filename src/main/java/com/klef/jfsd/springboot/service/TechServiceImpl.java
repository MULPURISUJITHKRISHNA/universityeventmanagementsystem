package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.TechnicalEventRegistration;
import com.klef.jfsd.springboot.repository.Techrepository;

@Service


public class TechServiceImpl implements TechService
{

	@Autowired
    private Techrepository techrepository;
	
	
	@Override
	public TechnicalEventRegistration addtechevent(TechnicalEventRegistration registration) {
		
		return techrepository.save(registration);
	}

}
