package org.galapagos.ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CartBasketServlet
 */
@WebServlet("/cartbasket")
public class CartBasketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartBasketServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("장바구니 리스트");
		//세션객체 얻기
		HttpSession session = request.getSession(false);
		session.setMaxInactiveInterval(200);

		if( session != null ){
			ArrayList<String> list = 
			(ArrayList<String>)session.getAttribute("product");
			out.print("상품: " + list +"<br>");
			}else{
			out.print("세션 없음" + "<br>");
			}
			
		out.print("<a href='product.jsp'>상품 선택 페이지</a><br>");
		out.print("<a href='cartdelete'>장바구니 비우기</a><br>");
		out.print("</body></html>");

		
	}

}
