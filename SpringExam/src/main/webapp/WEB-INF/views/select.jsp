<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>전체 목록 보기</h3>
<c:forEach items="${Sarams}" var="each">
	${each.id} / ${each.name} / ${each.age}  <br>
</c:forEach>


</body>
</html>