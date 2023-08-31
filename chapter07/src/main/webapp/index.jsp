<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "header.jsp" %>
<%
	Date d = new Date();
%>
  <body>
    <div class="container">
   		<h1>Wellcome to Glory</h1>
   		<p>현재시간: <%=d.toLocaleString() %></p>
   		<a href="about.jsp">about</a>  
    </div>
  </body>
<%@ include file = "footer.jsp" %>