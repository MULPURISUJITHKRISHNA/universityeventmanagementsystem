package com.klef.jfsd.springboot.controller;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Event;
import com.klef.jfsd.springboot.model.Faculty;
import com.klef.jfsd.springboot.model.Participant;
import com.klef.jfsd.springboot.model.TechnicalEventRegistration;
import com.klef.jfsd.springboot.service.AdminService;
import com.klef.jfsd.springboot.service.EventService;
import com.klef.jfsd.springboot.service.FacultyService;
import com.klef.jfsd.springboot.service.ParticipantService;
import com.klef.jfsd.springboot.service.TechService;

@Controller


public class ClientController 
{
   @Autowired
   private JavaMailSender sender;
	
   @Autowired
   private AdminService adminService;
   
   @Autowired
   private ParticipantService participantService;
   
   @Autowired
   private TechService techService;
   
   
   @Autowired 
   private EventService eventService;
   
   
   @Autowired
   private FacultyService facultyService;
   
   @GetMapping("/")
   public String mainhomedemo()
   {
     return "index";
   }
   
   @RequestMapping("technontech")
   public String technontech()
   {
	   return "technontech";
   }
   

   @RequestMapping("techcards")
   public String techcards()
   {
	   return "techcards";
   }
   

   @RequestMapping("nontechcards")
   public String nontechcards()
   {
	   return "nontechcards";
   }
   
   
   @GetMapping("/adminlogin")
   public  ModelAndView   adminlogindemo()
   {
     ModelAndView mv = new ModelAndView("adminlogin");
     
     return mv;
   }
   
   
   @GetMapping("/participantlogin")
   public  ModelAndView   studentlogindemo()
   {
     ModelAndView mv = new ModelAndView("participantlogin");
     
     return mv;
   }
   
   
   @GetMapping("/facultylogin")
   public  ModelAndView   facultylogindemo()
   {
     ModelAndView mv = new ModelAndView("facultylogin");
     
     return mv;
   }
   
   
  
   
 @GetMapping("/participantreg")
   public  ModelAndView   employeeregdemo()
   {
     ModelAndView mv = new ModelAndView("participantregistration", "stud", new Participant());
     //Mail
     MimeMessage message = sender.createMimeMessage();
     MimeMessageHelper helper = new MimeMessageHelper(message);
      
     try 
     {
         helper.setTo("cmprashanth2002@gmail.com");
         helper.setText("Thanks for Registering.....");
         helper.setSubject("Success Registration");
     }
     catch (MessagingException e) 
     {
         e.printStackTrace();
     }
     sender.send(message);
     
     return mv;
   }
 @GetMapping("/techevent")
 public  ModelAndView   techeventregdemo()
 {
   ModelAndView mv = new ModelAndView("techevent", "stud", new TechnicalEventRegistration());
   return mv;
 }
 
 
 @GetMapping("/adminhome")
   public  ModelAndView   adminhomedemo()
   {
     ModelAndView mv = new ModelAndView("adminlogin");
     
     return mv;
   }
 
 @GetMapping("/facultyregistration")
 public  ModelAndView   facultyregdemo()
 {
   ModelAndView mv = new ModelAndView("facultyregistration", "fact", new Faculty());
   return mv;
 }
 
  
 @GetMapping("/event")
 public  ModelAndView   eventregister()
 {
   ModelAndView mv = new ModelAndView("event", "e", new Event());
   return mv;
 }
 
	  @GetMapping("/participanthome")
	  public  ModelAndView  employeehomedemo(HttpServletRequest request)
	  {
	    ModelAndView mv = new ModelAndView("participanthome");
	    
	    HttpSession session = request.getSession();
   	
	    String euname = (String) session.getAttribute("euname");
	    	
	    mv.addObject("euname",euname);
	    
	    return mv;
	  }
   
	  
	  @GetMapping("/facultyhome")
	  public  ModelAndView  facultyhomedemo(HttpServletRequest request)
	  {
	    ModelAndView mv = new ModelAndView("facultyhome");
	    
	    HttpSession session = request.getSession();
   	
	    String euname = (String) session.getAttribute("euname");
	    	
	    mv.addObject("euname",euname);
	    
	    return mv;
	  }
	  
	  
 
 
	  @GetMapping("/viewallparticipants")
	  public ModelAndView viewallempsdemo()
	  {
	  	
		  ModelAndView mv = new ModelAndView("viewallparticipants");
		  
		List<Participant> participantlist= adminService.viewallparticipants();
		
		mv.addObject("participantlist",participantlist);
		  return mv;
	  }
	  
	  
	  @GetMapping("/viewallfaculty")
	  public ModelAndView viewallfacultydemo()
	  {
	  	
		  ModelAndView mv = new ModelAndView("viewallfaculty");
		  
		List<Faculty> facultylist= adminService.viewallfaculty();
		
		mv.addObject("facultylist",facultylist);
		  return mv;
	  }
	  
	  
 
   @PostMapping("/checkadminlogin")
   public ModelAndView checkadminlogindemo(HttpServletRequest request)
   {
     ModelAndView mv = new ModelAndView();
     String auname=request.getParameter("auname");
     String apwd = request.getParameter("apwd");
     
     Admin admin= adminService.checkadminlogin(auname, apwd);
    if(admin!=null)
    {
   	 
   	 HttpSession session = request.getSession();
   	 session.setAttribute("auname",auname);
   	 
   	 
      mv.setViewName("adminhome");
      
    }
    else
    {
      mv.setViewName("adminlogin");
      mv.addObject("msg","Login Failed");
    }
     return mv;
   }
   

   
   @PostMapping("/checkparticipantlogin")
   public ModelAndView checkstudentlogindemo(HttpServletRequest request)
   {
     ModelAndView mv = new ModelAndView();
     String euname = request.getParameter("euname");
     String epwd = request.getParameter("epwd");
     
     

     
     
     Participant stud = participantService.checkparticipantlogin(euname, epwd);
     
     
    if(stud!=null)
    {
   	 HttpSession session = request.getSession();
   	 session.setAttribute("euname",euname);
   	 
      mv.setViewName("participanthome");
      
    }
    else
    {
      mv.setViewName("participantlogin");
      mv.addObject("msg","Login Failed");
    }
     return mv;
   }
   
   
   @PostMapping("/checkfacultylogin")
   public ModelAndView checkfacultylogindemo(HttpServletRequest request)
   {
     ModelAndView mv = new ModelAndView();
     String euname = request.getParameter("euname");
     String epwd = request.getParameter("epwd");
     
     Faculty fact = facultyService.checkfacultytlogin(euname, epwd);
     
     
    if(fact!=null)
    {
   	 HttpSession session = request.getSession();
   	 session.setAttribute("euname",euname);
   	 
      mv.setViewName("facultyhome");
      
    }
    else
    {
      mv.setViewName("facultylogin");
      mv.addObject("msg","Login Failed");
    }
     return mv;
   }
   
   
   
   
   
   
   @PostMapping("/addparticipant")
   public String addparticipantdemo(@ModelAttribute("emp") Participant participant)
   {
	   participantService.addparticipant(participant);
     


     return "redirect:participantlogin";
   }
   
   @PostMapping("/addevent")
   public String addeventdemo(@ModelAttribute("e") Event event)
   {
	   eventService.addevent(event);
     


     return "redirect:facultyhome";
   
   }
   
   
   @PostMapping("/addfaculty")
   public String addfacultydemo(@ModelAttribute("fact") Faculty faculty)
   {
     facultyService.addfaculty(faculty);
     


     return "redirect:facultylogin";
   }
   @PostMapping("/addtechevent")
   public String addtecheventdemo(@ModelAttribute("stud") TechnicalEventRegistration registration)
   {
     techService.addtechevent(registration);
     


     return "redirect:participantlogin";
   }
   
   
   @GetMapping("/deleteparticipant")
   public String deleteparticipantdemo(@RequestParam("id") int eid)
   {
   
   	adminService.deleteparticipant(eid);
   	return "redirect:viewallparticipants";
   	
   }
   
   @GetMapping("/deletefaculty")
   public String deletefacultydemo(@RequestParam("id") int eid)
   {
   
   	adminService.deletefaculty(eid);
   	return "redirect:viewallfaculty";
   	
   }
   
   
   @GetMapping("/viewparticipant")
   public ModelAndView viewparticipantdemo(HttpServletRequest request)
   {
   	
      HttpSession session = request.getSession();
   	
      String euname = (String) session.getAttribute("euname");
   	
      Participant stud = participantService.viewparticipant(euname);
      
      participantService.viewparticipant(euname);
      
      ModelAndView mv = new ModelAndView();
      mv.setViewName("viewparticipant");
      mv.addObject("stud",stud);
      
      return mv;
      
   }
   
   
   @GetMapping("/viewfaculty")
   public ModelAndView viewfacultydemo(HttpServletRequest request)
   {
   	
      HttpSession session = request.getSession();
   	
      String euname = (String) session.getAttribute("euname");
   	
      Faculty fact = facultyService.viewfaculty(euname);
      
      facultyService.viewfaculty(euname);
      
      ModelAndView mv = new ModelAndView();
      mv.setViewName("viewfaculty");
      mv.addObject("fact",fact);
      
      return mv;
      
   }
   
   
   @GetMapping("/viewevent")
   public ModelAndView vieweventdemo(HttpServletRequest request)
   {
   	
      HttpSession session = request.getSession();
   	
      String euname = (String) session.getAttribute("euname");
   	
      Event event = eventService.viewevent(euname);
      
      facultyService.viewfaculty(euname);
      
      ModelAndView mv = new ModelAndView();
      mv.setViewName("viewevent");
      mv.addObject("event",event);
      
      return mv;
      
   }
   
   
   @GetMapping("/participantchangepwd")
   public ModelAndView studchangepwddemo(HttpServletRequest request)
   {
   	
   	HttpSession session = request.getSession();
   	
       String euname = (String) session.getAttribute("euname");
   	
       ModelAndView mv = new ModelAndView();
       mv.setViewName("participantchangepwd");
       mv.addObject("euname", euname);
       
       return mv;
   	
   }
   
   
   @GetMapping("/facultychangepwd")
   public ModelAndView facultychangepwddemo(HttpServletRequest request)
   {
   	
   	HttpSession session = request.getSession();
   	
       String euname = (String) session.getAttribute("euname");
   	
       ModelAndView mv = new ModelAndView();
       mv.setViewName("facultychangepwd");
       mv.addObject("euname", euname);
       
       return mv;
   	
   }
   
   
   
   @PostMapping("/updateparticipantpwd")
   public ModelAndView updateparticipantpwddemo(HttpServletRequest request)
   {
   	
   	ModelAndView mv = new ModelAndView();
   	mv.setViewName("participantchangepwd");
       HttpSession session = request.getSession();
   	
       String euname = (String) session.getAttribute("euname");	
   	
   	String eoldpwd = request.getParameter("eopwd");
   	String enewpwd = request.getParameter("enpwd");
   	
      int n = participantService.changeparticipantpassword(eoldpwd, enewpwd, euname);
   	
      
      if(n>0)
      {
   	   
   	   
   	   mv.addObject("msg","Password Updated Successfully");
      }
      else
      {
   	  mv.addObject("msg","Old Password is Incorrect"); 
      }
      
      return mv;
   	
   }
   
   
   @PostMapping("/updatefacultypwd")
   public ModelAndView updatefacultypwddemo(HttpServletRequest request)
   {
   	
   	ModelAndView mv = new ModelAndView();
   	mv.setViewName("facultychangepwd");
       HttpSession session = request.getSession();
   	
       String euname = (String) session.getAttribute("euname");	
   	
   	String eoldpwd = request.getParameter("eopwd");
   	String enewpwd = request.getParameter("enpwd");
   	
      int n = facultyService.changefacultypassword(eoldpwd, enewpwd, euname);
   	
      
      if(n>0)
      {
   	   
   	   
   	   mv.addObject("msg","Password Updated Successfully");
      }
      else
      {
   	  mv.addObject("msg","Old Password is Incorrect"); 
      }
      
      return mv;
   	
   }
   
   
   @GetMapping("/viewparticipantbyid")
   public ModelAndView viewparticipantbyiddemo(@RequestParam("id") int eid)
   {
   	
   	
	Participant stud =	adminService.viewparticipantbyid(eid);
   	ModelAndView mv = new ModelAndView();
   	mv.setViewName("viewparticipantbyid");
   	mv.addObject("stud",stud);
   	
   	return mv;
   }
   

   @GetMapping("/viewfacultybyid")
   public ModelAndView viewfacultybyiddemo(@RequestParam("id") int eid)
   {
   	
   	
    Faculty fact =	adminService.viewfacultybyid(eid);
   	ModelAndView mv = new ModelAndView();
   	mv.setViewName("viewfacultybyid");
   	mv.addObject("fact",fact);
   	
   	return mv;
   }
   
   
   
   
}
