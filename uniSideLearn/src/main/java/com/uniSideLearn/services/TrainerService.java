package com.uniSideLearn.services;

import java.util.List;

import com.uniSideLearn.entity.Course;
import com.uniSideLearn.entity.Lesson;

public interface TrainerService 
{
	public String addCourse(Course course);
	
	public String addLesson(Lesson lesson);

	public Course getCourse(int courseId);

	 public List<Course> courseList();

	 
	 


	

}
