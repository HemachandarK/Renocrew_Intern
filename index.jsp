<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="i" value="333" scope="application"></c:set>
<h1><c:out value="${i}"></c:out></h1>
<!--<c:remove var="i "></c:remove> -->
<c:if test="${i==23">
<h1>yes i is 23 and condition is true</h1>
</c:if>
</body>
</html>