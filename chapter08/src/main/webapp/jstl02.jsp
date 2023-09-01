<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<%@ include file = "header.jsp" %>
  <body>
    <div class="container">
   		<h1>c:if연습</h1>
   		<hr>
   		글씨 왜 안뜸?
   		<c:set var="myColor" value="파랑"/>
   		<c:if test="${myColor == '빨강'} ">
   		빨간색임
   		</c:if>
   		<c:if test="${myColor != '빨강'} ">
   		빨간색아님
   		</c:if>
 
   		<h1>c:when연습</h1>
   		<c:set var="grade" value="70"/>
   		<c:when test="${grade >= 90 }">
   		A학점
   		</c:when>
   		<c:when test="${grade >= 80 }">
   		B학점
   		</c:when>
   		<c:when test="${grade >= 70 }">
   		C학점
   		</c:when>
   		<c:otherwise>
   		F학점
   		</c:otherwise>
   		
    </div>
  </body>
<%@ include file = "footer.jsp" %>