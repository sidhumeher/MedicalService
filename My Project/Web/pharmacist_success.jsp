<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="anoceanofsky_sid.css" media="screen"/>
<link rel="stylesheet" type="text/css" href="style_sid.css" media="print"/>
<title>Pharmacist menu</title>
</head>
<body>
<font color="white" size="6">Welcome to Infy Medical Services</font>

<div id="page">
<div class="topNaviagationLink"><a href=""></a></div>

</div>
<div id="mainPicture" style="width: 291px; height: 310px"> 
<div id="picture"> 
<img  src="Image\\pharmacist_1.bmp" style="width: 290px; height: 200px"/>
<br>
<s:a href="prescriptionDetails.jsp"  >View Prescriptions</s:a><br><br>
<s:a href="medsAvailable.jsp">Medicines Availability</s:a><br><br>
<s:a href="medsDelivery.jsp">MedicinesDelivery</s:a>
</div>
</div>
<br>
<div id="footer">
<s:form  action="logout"><s:submit value="Logout"/></s:form>
</div>
</body>
</html>