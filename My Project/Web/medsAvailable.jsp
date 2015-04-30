<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="anoceanofsky_sid.css" media="screen"/>
<link rel="stylesheet" type="text/css" href="style_sid.css" media="print"/>
<title>Medicines Availability</title>
</head>
<body>

<font color="white" size="6"> Infy Medical Services</font>

<div class="innerBox" style="width: 489px">
<img src="Image\\pharmacy_3.jpg" style="height: 223px; width: 431px"/>
</div>
<div id="footer"> 
<br>
<s:form action="medsAvailabilityAction">
<table>
<tr>
<td> <s:textfield name="medicineName" label="Enter Medicine Name:"/><s:submit value="Submit" align="center"/></td>
</tr>
</table>
<br>
<table> 
<tr> 
<td>Medicine Id:</td>
<td> <s:property value="medicineId" default="--"/></td>
</tr>
<tr> 
<td> Medicine Name:</td>
 <td> <s:property value="medicineName" default="--"/></td>
 </tr>
<tr>
<td> Quantity Available:</td>
<td> <s:property value="quantity" default="--"/></td>
</tr>
<tr>
<td>Price:</td>
<td><s:property value="price" default="--"/> </td>
</tr>
</table>
</s:form>
 </div>
</body>
</html>