package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.APIResponse;
import com.app.dto.StudentDTO;
import com.app.entities.Student;
import com.app.service.StudentService;

@RestController
@RequestMapping("/students")

public class StudentController {

	@Autowired
	private StudentService studentSer;
	
	@GetMapping
	List <Student> getAllStudents()
	{
		return studentSer.getStudent();
	}
	
	@PostMapping
	public ResponseEntity<?> insertStudent(@RequestBody StudentDTO s )
	{
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(studentSer.addStudent(s));
	}
	
	}
