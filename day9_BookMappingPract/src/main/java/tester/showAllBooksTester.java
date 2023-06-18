package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.BookDaoImpl;
import pojos.Book;

public class showAllBooksTester {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) 
		{
			BookDaoImpl books=new BookDaoImpl();
			
			System.out.println(books.getAllBookDetails());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
