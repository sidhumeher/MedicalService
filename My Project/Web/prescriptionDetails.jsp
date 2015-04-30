<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="anoceanofsky_sid.css" media="screen"/>
<link rel="stylesheet" type="text/css" href="style_sid.css" media="print"/>
<title>Prescription Report</title>
</head>
<body>
 
<font color="white" size="6"> Infy Medical Services</font>
<s:form action="prescriptionDetailsAction" method="post">
<br>
<div id="page"></div>
<table>
<tr>
<td><s:textfield name="patientName" label="Enter Patient Name"/></td>
<td> <s:submit value="submit" align="center" type="button">Get Details</s:submit></td>
</tr> 
</table>
<br>
<div id="footer">
<b>--:Prescription Details:--</b>
<br> <br>
<table>
<tr>
<td>Patient Name:</td>
<td><s:property value="patientName"/> </td>
 </tr>
 <tr> 
 <td> Consulted Doctor:</td>
 <td><s:property value="doctorName"/></td>
 </tr>
</table>
<table>
<tr> <td>Medicine Name: </td>
<td>No of times per day:</td>
<td> Dosage:</td>
</tr>
<tr> 
<td> <s:property value="medicineName"/></td>
<td> <s:property value="timesPerDay"/></td> 
<td> <s:property value="dose"/></td>
</tr>
</table>
</div>
</s:form>

</body>
</html>