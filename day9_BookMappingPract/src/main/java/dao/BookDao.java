package dao;

import java.util.List;

import pojos.Book;

public interface BookDao {

	public String addNewBook(Book book,int id);
	
	public String deleteBookById(int id);
	
	public List<Book> getAllBookDetails();
}
