package com.uniSideLearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uniSideLearn.entity.Lesson;
import com.uniSideLearn.services.StudentServices;

@Controller
public class StudentController 
{
	@Autowired
	StudentServices service;
	
	@PostMapping("/goToLesson")
	public String myLesson(@RequestParam("lessonId")int lessonId,
			       Model model)
	{ 
		Lesson lesson = service.getLesson(lessonId);
		model.addAttribute("lesson",lesson);
		return "myLesson";
		
		
	}

}
