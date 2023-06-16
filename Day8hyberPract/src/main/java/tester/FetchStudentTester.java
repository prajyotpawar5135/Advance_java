package tester;
import static utils.HibernateUtils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.Student;

public class FetchStudentTester {

	public static void main(String[] args) {
		try(SessionFactory sf =getFactory();Scanner sc =new Scanner(System.in);)
		{
			StudentDaoImpl student=new StudentDaoImpl();
			System.out.println("enter Student id:");
			
			System.out.println(student.getStudent(sc.nextInt()));

		}
		
	}

}
