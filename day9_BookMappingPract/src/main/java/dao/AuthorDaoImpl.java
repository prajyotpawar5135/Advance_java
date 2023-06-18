package dao;

import static utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Author;

public class AuthorDaoImpl implements AuthorDao {

	public String  addAuthorDetails(Author auth) {
		String mesg="author adding failed";
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();

		try {
			session.persist(auth);
			tx.commit();
			mesg="Author added successfully with id:"+auth.getId();
		} catch (RuntimeException e) {
			
			if(tx!=null)
			{
				tx.rollback();
			}
			throw e ;
		}
		return mesg;
	}
	}


