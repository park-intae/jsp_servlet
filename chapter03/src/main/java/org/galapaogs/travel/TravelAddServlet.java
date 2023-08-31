package org.galapaogs.travel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.galapaogs.travel.vo.Travel;

/**
 * Servlet implementation class TravelAddServlet
 */
@WebServlet("/travel_add")
public class TravelAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String title = request.getParameter("title");
		String region = request.getParameter("region");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String description = request.getParameter("description");
		
		//vo로 변환
		Travel travel =  Travel.builder()
							.title(title)
							.region(region)
							.address(address)
							.phone(phone)
							.description(description)
							.build();
							
		//dao로 db에 저장
							
		//--------------
		//결과를 사용자에게 출력
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println(travel);
	}

}
