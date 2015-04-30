<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s"  uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link style="text/css" rel="stylesheet" href="style.css">
<title>Upload Lab Reports</title>
</head>
<body>
<h3>Welcome <b><s:property value="userId"/> </b>from<s:property value="labName"/></h3>
<br>
<center> 
<b>--:Upload  Lab report:--</b>
<s:form action="reportDetailsdemoAction" method="post">
<table>
<tr>
<td align="center"> <s:textfield name="patientId" label="Patient Id" /></td>
</tr>
<tr>
<td><s:file name="reportFile" label="UploadFile"/></td>
<td> <s:submit value="Submit" align="center"></s:submit></td>
</tr>
</table>
</s:form>
<s:a href="labReport_demo.jsp">View Lab Reports</s:a>
<br>
<s:a href="labAsst_login.jsp">Logout</s:a>
</center>
</body>
</html> 