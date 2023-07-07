package com.app.service;

import java.util.List;

import com.app.dto.CourseDTO;
import com.app.entities.Course;
import com.app.exception.StudentNotFoundException;

public interface CourseService {

	List<Course> getAllCourses();
	
	String courseInsert(CourseDTO c)throws StudentNotFoundException;
}
