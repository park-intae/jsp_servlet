package org.galapagos.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.galapagos.vo.User;

public class DetailCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("Detail작업 수행");
		String userid = request.getParameter("userid");
		
		//userid로 db검색
		User user = new User(userid, "1234", userid + "@naver.com");
		
		//userid라는 이름으로 request에 저장
		request.setAttribute("user", user);
		
		return "detail";
	}

}
