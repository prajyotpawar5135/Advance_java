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
import javax.servlet.http.HttpSession;

import dao.PlayerDaoImpl;
import pojos.Player;

/**
 * Servlet implementation class MiServlet
 */
@WebServlet("/mi")
public class MiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MiServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text.html");
		try (PrintWriter pw = response.getWriter()) {
			pw.print("<h4>In mi team page...</h4>");

			HttpSession hs=request.getSession();

			Player attribute = (Player)hs.getAttribute("abc");
			PlayerDaoImpl p=(PlayerDaoImpl)hs.getAttribute("p");
			System.out.println(attribute.getpAverage());
			if (attribute.getpAverage() > 50) {

				if (attribute.getWickets_taken() > 20) {
						try {
							p.registerPlayer(attribute);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					pw.print("<h3> Welcome to Blue army:" + attribute.getpName() + " added to MI team</h3>");
				}
			}
			 else {
				pw.print("<h3>Unable to add in MI bcoz of lower avg</h3>");
			}

		}

		// if(request.getAttribute(""))
		}
	

}
