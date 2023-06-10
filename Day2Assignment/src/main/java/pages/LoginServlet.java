package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dao.UserDaoImpl;
import pojo.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDaoImpl us;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {

		try {

			us = new UserDaoImpl();

		} catch (SQLException e) {
			throw new ServletException("err in init of " + getClass(), e);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			us.cleanUp();
		} catch (SQLException e) {
			System.out.println("cleaned up");
		}

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		try (PrintWriter pw = response.getWriter()) {

			String em = request.getParameter("email");
			String pass = request.getParameter("pass");
			User user = us.validateUser(em, pass);

			if (user == null) {
				System.out.println("<h4" + "invalid email or password" + "</h4>");
			} else {
				System.out.println("<h4>"+"login successfull :"+"</h4>");
//				System.out.println(user.toString());
				pw.write(user.toString());
			}

		} catch (SQLException e) {
			throw new ServletException("err in do-get " + getClass(), e);

		}

	}

}
