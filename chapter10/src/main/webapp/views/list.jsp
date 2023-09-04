<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

    <div class="container">
   		<h1>
   			목록 보기 페이지
   		</h1>  
   		
   		<table>
   			<thead>
   				<tr>
   					<th>userid</th>
   					<th>passwd</th>
   					<th>email</th>
   				</tr>
   			</thead>
   			<tbody>
				<c:forEach var="user" items="${users}">
					<tr>
						<td>
							<a href="detail.do?userid=${user.userid }">${user.userid }</a>
									<!-- primary key -->							
						</td>
						<td>${user.passwd }</td>
						<td>${user.email }</td>
					</tr>
				</c:forEach>
			</tbody>
   		</table>
   		
    </div>
