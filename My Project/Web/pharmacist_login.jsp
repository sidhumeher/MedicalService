<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="anoceanofsky_sid.css" media="screen"/>
<link rel="stylesheet" type="text/css" href="style_sid.css" media="print"/>
<title>Login page for Pharmacist</title>
</head>
<body>
<center>
<div id="page">
<div class="topNaviagationLink"><a href="index.html"></a></div>
<div class="topNaviagationLink"><a href="index.html"></a></div>
<div class="topNaviagationLink"><a href="index.html"></a></div>
</div>

<div class="contentBox" style="width: 523px">
<div class="innerBox" style="width: 489px">
<img src="Image\\pharmacist_2.bmp" style="width: 502px; height: 230px"/>
<s:form action="pharmacistAction">
<s:textfield label="Login Id" name="userId" />
<s:password label="Password" name="password" />
<s:submit value="Submit"/>
</s:form>
</div>
</div>

</center>

</body>
</html>