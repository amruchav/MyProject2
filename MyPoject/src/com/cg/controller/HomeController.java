package com.cg.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView; 
import org.springframework.beans.factory.annotation.Autowired;

import com.cg.dto.UserBean;
import com.cg.service.UserServiceImpl;

@Controller  
public class HomeController {
	
	
	@Autowired
	public UserServiceImpl service;
	
	
	    @RequestMapping("/request")  
	    public ModelAndView showform() {  
			UserBean user = new UserBean();
			System.out.println("hii");
	        return new ModelAndView("formpage", "user", user);  
	    }  
	    
	    @RequestMapping("/insertUserDetails")
		public String insertNewUser(@ModelAttribute("user") @Valid UserBean user,BindingResult result,Model m){
			//System.out.println("Before Inserting"+user);
	    	if (result.hasErrors()) {
	    		
	    		return "formpage";
	    	
	    		} else {
	    		
	    		user = service.insertNewUser(user);
				m.addAttribute("key", user);			
				return "viewpage";
	    		}
			
	    }	

	
}

