package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.BookDaoImpl;
import pojos.Book;

public class AdBookTester {

	public static void main(String[] args) {

		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) 
		{
			BookDaoImpl books=new BookDaoImpl();
			System.out.println("enter Title|price");
			Book book=new Book(sc.next(),sc.nextDouble());
			System.out.println("enter Author id");
			System.out.println(books.addNewBook(book, sc.nextInt()));
			
		}catch (Exception e) {
			e.printStackTrace();
		}

}
	}


