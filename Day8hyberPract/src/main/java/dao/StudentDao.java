package dao;

import java.util.List;

import pojos.CourseType;
import pojos.Student;

public interface StudentDao {
	
	public String addStudentDetails(Student sts);
	
	public Student studentLogin(String email,String password);
	
	public Student getStudent(int id);

	public List<Student> getStudentDetailsByCourse(CourseType courseType);

	Student changeCourse(Integer id, CourseType course);
	
	}