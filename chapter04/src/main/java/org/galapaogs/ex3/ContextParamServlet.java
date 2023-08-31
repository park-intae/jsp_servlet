package org.galapaogs.ex3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextParamServlet
 */
@WebServlet("/contextparam")
public class ContextParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ContextParamServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String driver = getServletContext().getInitParameter("driver");
		String dburl = getServletContext().getInitParameter("dburl");
		String username = getServletContext().getInitParameter("username");
		String password = getServletContext().getInitParameter("password");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("드라이버명: " + driver + "<br>");
		out.print("저장 경로: " + dburl + "<br>");
		out.print("user이름: " + username + "<br>");
		out.print("password: " + password + "<br>");
		out.print("</body></html>");
	}

}
