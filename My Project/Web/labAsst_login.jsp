
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="anoceanofsky_sid.css" media="screen"/>
<link rel="stylesheet" type="text/css" href="style_sid.css" media="print"/>
<title>Login Page</title>
</head>

<body>
<center>
<div id="page">
<div class="topNaviagationLink"><a href="index.html"></a></div>
</div>

<div class="contentBox" style="width: 523px">
<div class="innerBox" style="width: 489px">

<s:form action="labAsstAction">
	<img src="Image\\labasst_1.bmp" style="width: 500px; height: 308px"/>
<s:textfield label="Login Id" name="userId" />
<s:password label="Password" name="password" />
<s:select name="labName" label="Lab" list="{'Lab1','Lab2','Lab3'}" emptyOption="true" />
<s:submit value="Submit" />
</s:form>
</div>
</div>
</center>
</body>
</html>
