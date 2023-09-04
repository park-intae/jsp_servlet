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
 * Servlet implementation class CartSaveServlet
 */
@WebServlet("/cartsave")
public class CartSaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartSaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		// 입력 파라미터 얻기
		String product = request.getParameter("product");
		System.out.println(product);
		//세션객체 얻기
		HttpSession session = request.getSession();
		ArrayList<String> list = 
		(ArrayList<String>)session.getAttribute("product");
		
		if( list == null ){
			list = new ArrayList<String>();
			list.add(product);
			session.setAttribute("product", list);
			
			}else{
			list.add(product);
			}
			
			out.print("<html><body>");
			out.print("Product 추가"+"<br>");
			out.print("<a href='cartbasket'>장바구니 보기</a>");
			out.print("</body></html>");
			}

	}
