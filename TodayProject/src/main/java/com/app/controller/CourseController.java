package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.APIResponse;
import com.app.dto.CourseDTO;
import com.app.entities.Course;
import com.app.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	private CourseService courseServ;
	@GetMapping
	List<Course> getAllCourseDetails()
	{
		return courseServ.getAllCourses();
	}
	
	@PostMapping
	public APIResponse addNewCourse(@RequestBody CourseDTO courseD)
	{
		return new APIResponse(courseServ.courseInsert(courseD));
	}
	
	
}
