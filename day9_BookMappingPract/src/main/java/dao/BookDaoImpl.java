package dao;

import static utils.HibernateUtils.getFactory;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Author;
import pojos.Book;

public class BookDaoImpl implements BookDao {

	@Override
	public String addNewBook(Book book, int id) {
		String mesg = "Book adding failed";
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		Author auth = new Author();
		try {
			auth = session.get(Author.class, id);

			if (auth != null) {
				auth.addBookToList(book);
				session.persist(book);// save book data
			}

			tx.commit();
			mesg = "book added with author name =" + auth.getFirstName() + "and bookname=" + book.getTitle();
		} catch (RuntimeException e) {

			if (tx != null) {
				tx.rollback();
			}
			throw e;
		}
		return mesg;
	}

	@Override
	public String deleteBookById(int id) {
		String mesg = "Book deletion  failed";
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		Book book = new Book();
		try {

			book = session.get(Book.class, id);
			session.remove(book);

			tx.commit();
			mesg = "book deletion successfull with book title=" + book.getTitle();
		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
			}

		}

		return mesg;
	}

	@Override
	public List<Book> getAllBookDetails() {
		String jpql = "select b from Book b";
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		List<Book> bookss =new ArrayList<>();

		try {
			bookss = session.createQuery(jpql, Book.class).getResultList();
			tx.commit();
			
		} catch (RuntimeException e) {

			if (tx != null) {
				tx.rollback();
			}
			throw e;
		}

		return bookss;
	}

}
