package org.galapaogs.ex1;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jdbc.pool.DataSource;

/**
 * Servlet implementation class ConnectionTestServlet
 */
@WebServlet("/connectiontest")
public class ConnectionTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConnectionTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Resource(name="jdbc/mysql")
	DataSource dataFactory;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try(Conncetion conn = dataFactory.getConnection()){
			System.out.println("연결획득 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
