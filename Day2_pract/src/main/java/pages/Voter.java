package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Voter
 */
@WebServlet("/voter")
public class Voter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		try (PrintWriter pw = response.getWriter()) {
			pw.print("<h5>in voters dopost</h5>");

			Cookie[] cookies = request.getCookies();

			if (cookies != null) {
				for (Cookie c : cookies) {
					if (c.getName().equals("user_details"))
						pw.print("<h5> Validated user details " + c.getValue() + "</h5>");
					break;
				}
			} else {
				pw.print("<h5>Session Tracking failed,no cookies!!!!!!</h5>");
			}
		}
	}

}
