<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ include file="dbconnect.jsp" %>
<%

	
	String sql = "UPDATE saram SET NAME='exam21' WHERE id='test2'";
	PreparedStatement pstmt = conn.prepareStatement(sql);

	
	pstmt.executeUpdate();

%>





</body>
</html>