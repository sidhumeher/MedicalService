<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link style="text/css" rel="stylesheet" href="anoceanofsky_sid.css">

<title>Lab Report Details</title>
</head>
<body>
<font color="white" size="6"> Lab Report Viewer </font>
<div class="contentBox" style="width: 523px">
<s:form action="reportDisplayAction" method="post">
<table> 
<tr> 
<td> <s:textfield name="patientId" label="Enter Patient Id:"/>
<s:submit value="submit" type="button" align="center">Get Report</s:submit>
</td> 
</tr>
</table>
<br>
</s:form>
</div>
<br>
<div id="footer"> Right click on the image and then click on "Save Picture As..." to download the Report</div>
<div id="page">
<img src="<s:property value="reportFile"/>" />
 </div>
</body>
</html>