<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="anoceanofsky_sid.css" media="screen"/>
<link rel="stylesheet" type="text/css" href="style_sid.css" media="print"/>
<title>Medicines Delivery System</title>
</head>
<body>

<font color="white" size="6"> Infy Medical Services</font>

<div class="innerBox" style="width: 489px">
<img src="Image\\pharmacy_4.jpg" style="height: 223px; width: 431px"/>
</div>
<div id="footer">
<br> 
<s:form action="medsDeliveryAction" method="post">
<table> 
<tr> 
<td> <s:textfield name="patientId" label="Enter Patient Id:" />
<s:submit type="button" value="Submit" align="center">Get Details</s:submit></td>
</tr>
</table>
<br>
<table border="1">
<tr> 
<td> Delivery Id</td>
<td> Prescription Id</td>
<td> Patient Id</td>
<td> Delivery Location</td>
<td> Amount</td>
<td> Delivery Status</td>
</tr>
<tr> 
<td> <s:property value="deliveryId" default="--"/></td>
<td> <s:property value="prescriptionId" default="--"/></td>
<td> <s:property value="patientId" default="--"/></td>
<td> <s:property value="location" default="--"/></td>
<td> <s:property value="amount" default="--"/></td>
<td> <s:property value="deliveryStatus" default="--"/></td>
</tr>
</table>
</s:form>
</div>
</body>
</html>