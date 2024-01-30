package com.uniSideLearn.controller;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.uniSideLearn.entity.UserInfo;
import com.uniSideLearn.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class NavController 
{
	@GetMapping("/")
	public String index() {
		return "index";
	}


	@GetMapping("/register")
	public String register()
	{

		return "register";
	}


	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	
	@GetMapping("/createCourse")
	public String createCourse()
	{
		return "createCourse";
	}
	
	@GetMapping("/addLesson")
	public String addLesson()
	{
		return "addLesson";
	}
	
	@GetMapping("/studentHome")
	public String studentHome()
	{
		return "studentHome";
	}
	
	@GetMapping("/trainerHome")
	public String trainerHome()
	{
		return "trainerHome";
	}

	@GetMapping("/courses")
	public String courses()
	{
		return "courses";
	}

	@GetMapping("/myCourses")
	public String myCourses()
	{
		return "myCourses";
	}
	
	
	@GetMapping("/purchase")
	public String purchase()
	{
		return "purchase";
	}
	
	@GetMapping("/demoLesson")
	public String demoLesson()
	{
		return "demoLesson";
	}
	
	
	

}



