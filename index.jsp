<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Random" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isErrorpage="true" %>
<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Random r=new Random();
int x=r.nextInt(10);
%>
<%@include file="header.jsp" %>
<h1>Random Number:<%= x %></h1>
<c:set var="name" value="tech"></c:set>
<c:out value="${name}"></c:out>
<%
int s=10/0;
%>
<h3>div:<%=s %></h3>
</body>
</html>