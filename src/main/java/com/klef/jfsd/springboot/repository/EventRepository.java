package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.klef.jfsd.springboot.model.Event;
import com.klef.jfsd.springboot.model.Faculty;

@Repository

public interface EventRepository extends CrudRepository<Event, Integer>
{

	@Query("select e from Event e where studentcodusername=?1")
	public Event viewevent(String uname);
	
	
}
