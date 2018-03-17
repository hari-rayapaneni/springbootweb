package com.k5r.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String showLoginPage() {
		System.out.println("dslkjgklds");
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String username, @RequestParam String password) {
		System.out.println(username);
		
		model.put("username", username);
		model.put("password", password);
		if(username.equals("user") && password.equals("pwd"))
			return "welcome";
		else {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
	}

}
