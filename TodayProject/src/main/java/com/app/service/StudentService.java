package com.app.service;

import java.util.List;

import com.app.dto.APIResponse;
import com.app.dto.StudentDTO;
import com.app.entities.Student;

public interface StudentService {

	List<Student> getStudent();
	
   StudentDTO addStudent(StudentDTO stu);
}
