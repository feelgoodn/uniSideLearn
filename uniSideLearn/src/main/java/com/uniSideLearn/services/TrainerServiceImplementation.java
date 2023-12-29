package com.uniSideLearn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniSideLearn.entity.Course;
import com.uniSideLearn.entity.Lesson;
import com.uniSideLearn.entity.UserInfo;
import com.uniSideLearn.repository.CourseRepository;
import com.uniSideLearn.repository.LessonRepository;


@Service
public class TrainerServiceImplementation implements TrainerService
{
	
	@Autowired
	CourseRepository courseRepo;
	
	@Autowired
	LessonRepository lessonRepo;
	
	@Override
	public String addCourse(Course course) {
		courseRepo.save(course);
		return "Course added successfully!";
	}


	
	@Override
	public String addLesson(Lesson lesson) {
		lessonRepo.save(lesson);
		return "Lesson added successfully!";
	}
	
	
	
	
	@Override
	public Course getCourse(int courseId) {
		
		return courseRepo.findById(courseId).get();
		
	}
	@Override
	public List<Course> courseList(){
		return courseRepo.findAll();
	}
	
	
	
	
	

}
