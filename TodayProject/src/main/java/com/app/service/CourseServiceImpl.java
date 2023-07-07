package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.CourseDTO;
import com.app.entities.Course;
import com.app.exception.StudentNotFoundException;
import com.app.repository.CourseRepository;
import com.app.repository.StudentRepository;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {
       @Autowired
	private CourseRepository courseRepo;
       @Autowired
    private StudentRepository studRepo;
       @Autowired
       private ModelMapper mp;

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return courseRepo.findAll();
	}

	@Override
	public String courseInsert(CourseDTO c) throws StudentNotFoundException {

		Course course=mp.map(c, Course.class);
		Course course1=courseRepo.save(course);
		if(course1==null)
		   throw new StudentNotFoundException("course insertion unsuccessfull");
		return "course added successfully";
	}

	
}
