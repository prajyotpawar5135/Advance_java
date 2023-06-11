package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.Servlet;
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
 * Servlet implementation class PlayerServlet
 */
@WebServlet("/login")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PlayerDaoImpl player;
	Player pl;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		try {
			player = new PlayerDaoImpl();
			
		} catch (SQLException e) {

			throw new ServletException("failed in init player");
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			player.cleanUp();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("pname");
		String date = request.getParameter("dob");
		Date d = Date.valueOf(date);
		double av = Double.parseDouble(request.getParameter("avg"));
		int wick = Integer.parseInt(request.getParameter("wick"));
		int tid =Integer.parseInt(request.getParameter("team"));
		pl=new Player(id,name,d,av,wick,tid);
		HttpSession hp= request.getSession();
		hp.setAttribute("abc", pl);
		hp.setAttribute("p", player);
		if(Integer.parseInt(request.getParameter("team"))==100)
		{
			response.sendRedirect("mi");
		}
		//	player.registerPlayer(id, name, d, av, wick);
		
		

	}

}
