package tester;
import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.CourseType;
import pojos.Student;

public class CourseChangeTester {

	public static void main(String[] args) {
 
		
		try(SessionFactory sf=getFactory();Scanner sc=new Scanner(System.in))
		{
			StudentDaoImpl student=new StudentDaoImpl();
			System.out.println("Enter student id and course you want to modify");
			Student changeCourse = student.changeCourse(sc.nextInt(),CourseType.valueOf(sc.next().toUpperCase()));
			System.out.println(changeCourse);
		}
	}

}
