package com.uniSideLearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.uniSideLearn.entity.Course;
import com.uniSideLearn.entity.Lesson;
import com.uniSideLearn.services.TrainerService;

@Controller
public class TrainerController 
{
	
	@Autowired
	TrainerService tService;
	
	@PostMapping("/addCourse")
	public String addCourse(@RequestParam("courseId") int courseId,
			@RequestParam("coursename") String coursename,
			@RequestParam("courseprice") int courseprice, RedirectAttributes res ) {
	        
		    	   Course course = new  Course();
				   course.setCourseId(courseId);
				   course.setCoursename(coursename);
				   course.setCourseprice(courseprice);
				
				   tService.addCourse(course);
				   res.addFlashAttribute("success", "Course added Successfully!");
			       return "redirect:/createCourse";
		    }

	@PostMapping("/addLesson")
	public String addLesson(@RequestParam("courseId") int courseId,
			@RequestParam("lessonId") int lessonId,
			@RequestParam("lessonname") String lessonname,
			@RequestParam("lessontopics") String lessontopics,
			@RequestParam("lessonlink") String lessonlink){
		    
		    Course course = tService.getCourse(courseId);
		    Lesson lesson = new Lesson(lessonId,lessonname,lessontopics,lessonlink,course);
		    tService.addLesson(lesson);
		    
		    course.getLessons().add(lesson);
		 
	           return "redirect:/addLesson";
	}
	
	@GetMapping("/showCourses")
	public String showCourses(Model model)
	{
		List<Course> courseList= tService.courseList();
		model.addAttribute("courseList", courseList);
		//System.out.println(courseList);
		return "courses";
	}
	
	
}
