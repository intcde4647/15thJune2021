package com.demo.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping("/")
	public String login()
	{
      return "login";		
	}
	
	@PostMapping("/validate")
	public String validate(@RequestParam String username, @RequestParam String password)
	{
		   if(username.equals("admin") && password.equals("admin"))
		   {
			   return "success";
		   }
		   
		   return "error";
	}
	
	
	
	
}
