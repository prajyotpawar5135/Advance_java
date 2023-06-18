package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.BookDaoImpl;
public class DeleteBookById {

	public static void main(String[] args) {
			try(SessionFactory sf=getFactory();Scanner sc=new Scanner (System.in);)
			{
					BookDaoImpl book=new BookDaoImpl();
					System.out.println("ENTER BOOK ID YOU WANT TO REMOVE");
					System.out.println(book.deleteBookById(sc.nextInt()));
			}catch(RuntimeException e) 
			{
				e.printStackTrace();
			}
	}

}
