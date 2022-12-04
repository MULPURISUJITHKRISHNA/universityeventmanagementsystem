package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.klef.jfsd.springboot.model.Participant;
import com.klef.jfsd.springboot.model.TechnicalEventRegistration;

@Repository

public interface ParticipantRepository  extends CrudRepository<Participant, Integer>
{
	@Query("select s from Participant s where  username=?1 and password=?2 ")
	public Participant checkparticipantlogin(String uname,String pwd);
	
	@Query("select s from Participant s where username=?1")
	public Participant viewparticipant(String uname);
	
	@Transactional
	@Modifying
	@Query("update Participant s  set s.password=?1 where s.password=?2 and s.username=?3")
	public int updateparticipantpassword(String empnewpwd,String empoldpwd,String empuname);

	
	
}
