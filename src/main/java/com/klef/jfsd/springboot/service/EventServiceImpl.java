package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Event;
import com.klef.jfsd.springboot.model.Faculty;
import com.klef.jfsd.springboot.repository.EventRepository;


@Service

public class EventServiceImpl  implements EventService
{

	
	@Autowired
	private EventRepository eventRepository;
	
	@Override
	public Event addevent(Event event) {
		return eventRepository.save(event);
			
	}

	@Override
	public Event viewevent(String uname) {
		
		return eventRepository.viewevent(uname);
	}
	

}
