<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.cg.rpa.model.RpaPipelineMaster"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC -HelloWorld</title>
</head>
<body>
	<center>
		<h2>Congratulations!! You added a new project deal in system</h2>
		<h2>
			${businessUnit} 
			<%=session.getAttribute("UserName") %>
			<% RpaPipelineMaster rpa = (RpaPipelineMaster)session.getAttribute("registeredDeal"); %>
			<%= rpa%>
		</h2>
	</center>
</body>
