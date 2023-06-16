package tester;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.CourseType;

import static utils.HibernateUtils.*;

import java.util.Scanner;
public class SudentByCourseTester {

	public static void main(String[] args) {
		
		try(SessionFactory sf=getFactory();Scanner sc=new Scanner(System.in);)
		{
			StudentDaoImpl stud=new StudentDaoImpl();
			
			System.out.println("Enter student course name :");
			System.out.println(stud.getStudentDetailsByCourse((CourseType.valueOf(sc.next().toUpperCase()))));
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		
		
	}

}
