package pages;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dao.UserDaoImpl;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDao userd;

	public void init() throws ServletException {

		try {

			userd = new UserDaoImpl();

		} catch (SQLException e) {
			throw new ServletException("err in init of " + getClass(), e);
		}
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */

	/**
	 * @see Servlet#destroy()
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");


		String fname = request.getParameter("fn");
		String lname = request.getParameter("ln");
		String email = request.getParameter("em");
		String password = request.getParameter("pass");
		String date = request.getParameter("dob");
		LocalDate d = LocalDate.parse(date);
		int g = Period.between(d, LocalDate.now()).getYears();
		String status = request.getParameter("st");
		String role = request.getParameter("rl");
		Date edate = Date.valueOf(date);

		// (int id, String firstName, String lastName, String email, String password,
		// Date dob,
		// String role
    System.out.println(fname+date+status);
		if (g > 21) {
			
			try {
				userd.registerUser( fname, lname, email, password, edate, role);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else {
			response.sendRedirect("loginUser.html");
		}


	}

}
