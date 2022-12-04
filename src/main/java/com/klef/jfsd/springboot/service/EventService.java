package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Event;
import com.klef.jfsd.springboot.model.Faculty;

public interface EventService 
{
	 public Event addevent(Event event);
	 public Event viewevent(String uname);
}
