package com.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.StudentBoxCricketBean;
@Controller
public class StudentController 
{

	@GetMapping("/boxcricketregistration")
	public String boxRegistration() {
		return "BoxCricketReg";
	}
	@PostMapping("/savereg")
	public String saveRegistration(StudentBoxCricketBean studentBox , Model model) 
	{
		
		boolean isError = false;
		String alphaRegEx ="[a-zA-Z]+";
		
		
		if (studentBox.getStudentName() == null || studentBox.getStudentName().trim().length() == 0)
		{
			isError = true;
			model.addAttribute("studentNameError", "Please Enter Student Name");
		}
		else if(studentBox.getStudentName().matches(alphaRegEx)==false)
		{
			isError=true;
			model.addAttribute("studentNameError", "please enter valid student name");
		}
		else 
		{
			model.addAttribute("studentNameValue", studentBox.getStudentName());
		}
		
		
		
		if (studentBox.getPlayerType() == null)
		{
			isError = true;
			model.addAttribute("playerTypeError", "Please Select PlayerType");
		}
		else 
		{
			model.addAttribute("playerTypeValue",studentBox.getPlayerType() );
		}
		
		
		
		if (studentBox.getFoodPreference().equals("-1") == true) {
			isError = true;
			model.addAttribute("foodPreferenceError", "Please Select FoodPreference");
		}
		else
		{
			model.addAttribute("foodPreferenceValue", studentBox.getFoodPreference());
		}
		
		
		
		if (studentBox.getDrink() == null) 
		{
			isError = true;
			model.addAttribute("drinkError", "Please Select Atleast one Drink");

		}
		 else 
		 {
				model.addAttribute("drinkValue", studentBox.getDrink());
			
		 }
		
		
		model.addAttribute("reg",studentBox);
		
		
		
		if (isError == true) {
			return "BoxCricketReg";
		} else {
		//sending data to jsp from controller 
		//model.addAttribute("reg",studentBox);
		
		return "RegDetail";
		}
	}
}
 