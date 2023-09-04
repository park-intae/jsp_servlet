package org.galapagos.ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CartDeleteCookieServlet
 */
@WebServlet("/cartdeletecookie")
public class CartDeleteCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("장바구니 비웠음!!<br>");
		// 기존 쿠키 얻기
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				c.setMaxAge(1); //모든 쿠키 삭제 >> 특정 쿠키만 삭제하기 위해서는 if문으로 확인 후 삭제
				response.addCookie(c);
			}
		} else {
			out.print(">>>>장바구니 비었음<br>");
		}
		out.print("<a href='product.jsp'>상품 선택 페이지</a><br>");
		out.print("</body></html>");
	}

}
