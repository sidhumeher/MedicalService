<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link style="text/css" rel="stylesheet" href="anoceanofsky.css">
<title>Lab Report Details</title>
</head>
<body>
<div class="contentBox" style="width: 523px">

<h3>Lab Report Viewer </h3>
<s:form action="reportDisplayAction_demo" method="post">
<table> 
<tr> 
<td> <s:textfield name="patientId" label="Enter Patient Id:"/></td> </tr>
</table>
<s:submit value="submit" type="button" align="center">Get Report</s:submit>
<s:url id="fileDownload" value="reportFile"></s:url>
<h4>Download file - <s:a href="%{fileDownload}">File</s:a>
</h4>
</s:form>
</div>

<div id="page">
<img src="<s:property value="reportFile"/>" />
 </div>
</body>
</html>