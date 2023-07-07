package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.StudentDTO;
import com.app.entities.Course;
import com.app.entities.Student;
import com.app.exception.StudentNotFoundException;
import com.app.repository.CourseRepository;
import com.app.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studSer;
	
	@Autowired
	private CourseRepository courseRepo;
	@Autowired
	private ModelMapper mp;
	
	@Override
	public List<Student> getStudent() {
		
		return studSer.findAll() ;
	}

	@Override
	public StudentDTO addStudent(StudentDTO stu) {
		
		Course c = courseRepo.findBytitle(stu.getCourse()).orElseThrow(()->new StudentNotFoundException("student not found"));
		Student s1=mp.map(stu,	Student.class);
		
		c.addStudent(s1);
		Student s2=studSer.save(s1);
		StudentDTO sd=mp.map(s2, StudentDTO.class);
		sd.setCourse(c.getTitle());
		
		return sd;
	}
     
	

}
