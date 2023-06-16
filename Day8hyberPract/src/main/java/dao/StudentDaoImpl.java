package dao;

import static utils.HibernateUtils.getFactory;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.CourseType;
import pojos.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	public String addStudentDetails(Student sts) {
		String msg = "inserting student details failed";
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();

		try {
			session.save(sts);
			tx.commit();
			msg = "inserting student details successfull";

		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
			}

		} finally {
			if (session != null) {
				session.close();
			}
		}

		return null;

	}// addstudent

	@Override
	public Student getStudent(int studId) {
		Session session1 = getFactory().getCurrentSession();
		Transaction tx = session1.beginTransaction();
		Student stu = null;
		try {
			stu = session1.get(Student.class, studId);
			tx.commit();

			System.out.println("retrieved student data of name=" + stu.getFirstName());

		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
			}
		}

		return stu;
	}

	@Override
	public List<Student> getStudentDetailsByCourse(CourseType courseType) {
		String jpql = "select s from Student s where s.courses=:cour";
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		// Student s=null;
		List<Student> student = null;
		try {
			student = session.createQuery(jpql, Student.class).setParameter("cour", courseType).getResultList();
			tx.commit();
			System.out.println("student details associated with course are");
		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
			}
		}
		return student;
	}

	@Override
	public Student studentLogin(String email, String passw) {
		String jpql = "select s from Student where s.email=:em and s.password=:pass";
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		Student student = new Student();
		try {
			System.out.println("Inside try");
			student = session.createQuery(jpql, Student.class).setParameter("em", email).setParameter("pass", passw)
					.getSingleResult();
			tx.commit();
			System.out.println("login successfull");
		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
			}

		}
		return student;
	}

	@Override
	public Student changeCourse(Integer id, CourseType course) {
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		Student student = new Student();

		try {
			student = session.get(Student.class, id);
			student.setCourses(course);
			tx.commit();
			System.out.println("course updated successfully");

		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
			}
		}
		return student;
	}

}
