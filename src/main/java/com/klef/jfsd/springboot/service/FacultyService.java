package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Faculty;


public interface FacultyService 
{

	
	  public Faculty addfaculty(Faculty faculty);
	  public Faculty checkfacultytlogin(String uname,String pwd);
	  public Faculty viewfaculty(String uname);
	  public int changefacultypassword(String eoldpwd, String enewpwd,String empuname );
	  
	
}
