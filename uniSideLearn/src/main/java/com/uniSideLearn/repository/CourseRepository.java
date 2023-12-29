package com.uniSideLearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uniSideLearn.entity.Course;

public interface CourseRepository  extends JpaRepository<Course, Integer>
{
	
}
