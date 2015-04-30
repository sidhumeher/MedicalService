<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link style="text/css" rel="stylesheet" href="style.css">
<title>Issue Booking</title>
</head>
<body>
<center> 
<h2> Issue Book</h2>
</center>
<s:form action="issueBookAction" method="post">
<h4>Write to Us: </h4>
<s:textarea value="Enter text here..." cols="100" rows="20" required="true" name="issueText"/>
<s:submit type="button" value="submit" align="left">Submit</s:submit>
</s:form>
</body>
</html>