<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="s"  uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="anoceanofsky_sid.css" media="screen"/>
<link rel="stylesheet" type="text/css" href="style_sid.css" media="print"/>
<title>Lab</title>
</head>
<body>
<font color="white" size="6"> 
Welcome <b><s:property value="userId"/> </b>from<s:property value="labName"/>
</font>
<br>

<s:form action="uploadReportAction" method="post" >
<table>
<tr>
<td align="center"> <s:textfield name="patientId" label="Patient Id"/></td>
</tr>
<tr><td><s:select name="reportType" label="Report Type" list="{'Cholestrol','Platelet Count','Blood','Urine'}" emptyOption="true" /></td> </tr>
<tr>
<td><s:file name="reportFile" label="UploadFile"/></td><br>
<td> <s:submit value="Submit" align="center"></s:submit></td>
</tr>
</table>
</s:form>
<br>
<div id="footer">
<br>
<s:a href="labReport.jsp">View Lab Reports</s:a>
<br>
<s:a href="labAsst_login.jsp">Logout</s:a>
</div>
</body>
</html> 