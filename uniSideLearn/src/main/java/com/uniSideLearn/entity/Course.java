package com.uniSideLearn.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Course 
{
	@Id
	int courseId;
	String coursename;
	int courseprice;
	@OneToMany
	List<Lesson> lessons;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseId, String coursename, int courseprice, List<Lesson> lessons) {
		super();
		this.courseId = courseId;
		this.coursename = coursename;
		this.courseprice = courseprice;
		this.lessons = lessons;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getCourseprice() {
		return courseprice;
	}
	public void setCourseprice(int courseprice) {
		this.courseprice = courseprice;
	}
	public List<Lesson> getLessons() {
		return lessons;
	}
	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", coursename=" + coursename + ", courseprice=" + courseprice
				+ ", lessons=" + lessons + "]";
	}
	
	

}
