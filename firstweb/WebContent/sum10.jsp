<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<%
	StringBuffer url = request.getRequestURL();		
	out.print("url : " + url.toString());
%>

</body>
</html>