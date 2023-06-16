package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.CourseType;
import pojos.Student;

public class InsertStudentTester {

	public static void main(String[] args) {

		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			StudentDaoImpl student = new StudentDaoImpl();
			/*
			 * String firstName, String lastName, String email, String password, CourseType
			 * courses, LocalDate dob
			 */
			System.out.println("firstName,lastName,email,password,courses,dob");
			Student stud = new Student(sc.next(), sc.next(), sc.next(), sc.next(),
					CourseType.valueOf(sc.next().toUpperCase()), LocalDate.parse(sc.next()));
			
			 System.out.println(student.addStudentDetails(stud));
			 
			
			 
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
