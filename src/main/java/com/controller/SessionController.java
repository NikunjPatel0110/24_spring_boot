package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;

@Controller
public class SessionController 
{
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	@GetMapping("/fp")
	public String forgetpassword()
	{
		return "forgetpassword";
	}
	@PostMapping("/saveuser")
	public String saveuser(UserBean userbean,Model model) {
		
		System.out.println("firstName => "+userbean.getFirstName());
		System.out.println("email => "+userbean.getEmail());
		System.out.println("password => "+userbean.getPassword());
		 
		model.addAttribute("user",userbean);//dataname,datavalue
		
		return "Home";
	}
}
