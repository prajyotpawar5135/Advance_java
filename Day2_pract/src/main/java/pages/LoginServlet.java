package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDaoImpl;
import pojos.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDaoImpl userdao;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		try {
			userdao = new UserDaoImpl();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ServletException("error in init of " + getClass() + e);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {

		try {
			userdao.cleanUP();
		} catch (Exception e) {
			System.out.println("error in destroy of" + getClass() + e);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		try (PrintWriter pw = response.getWriter()) {
			String email = request.getParameter("nm");
			String pass = request.getParameter("passwd");

			User user = userdao.authenticateUser(email, pass);
			if (user == null) {
				pw.print("<h4> Invalid Email or Password , Please <a href='login.html'>Retry</a></h4>");

			} else {
				// pw.print(user.toString());
				Cookie c = new Cookie("user_details", user.toString());

				response.addCookie(c);
				if (user.getRole().equals("voter")) {
					response.sendRedirect("voter");
				}

			}
			if (user.isVottingStatus()) {
				response.sendRedirect("logout");
			}

		} catch (Exception e) {
			throw new ServletException("err in do-get " + getClass(), e);

		}

	}

}
