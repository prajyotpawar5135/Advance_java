package tester;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;

import static utils.HibernateUtils.*;

import java.util.Scanner;
public class LoginTester {

	public static void main(String[] args) {

		try(SessionFactory sf=getFactory();Scanner sc=new Scanner(System.in);)
		{
			StudentDaoImpl stud=new StudentDaoImpl();
			System.out.println("Enter student email,password");
			System.out.println(stud.studentLogin(sc.next(),sc.next()));
		}catch(RuntimeException e)
		{
			e.printStackTrace();
		}
	}

}
