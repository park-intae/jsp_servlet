<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="text-right mr-5">
	<c:if test="${not empty userid}">
   		${userid } log on /
		<a href="logout.jsp">log out</a>
	</c:if>
	
	<c:if test="${empty userid}">
   		log off /
		<a href="login.jsp">log in</a>
	</c:if>
</div>
