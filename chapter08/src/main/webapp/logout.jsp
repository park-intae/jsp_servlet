<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ include file = "header.jsp" %>
  <c:remove var="userid" scope="session"/>
    <div class="container">
   		<h1>로그아웃 됨</h1>
   		<a href="visit.jsp">visit</a>
    </div>
  </body>
<%@ include file = "footer.jsp" %>