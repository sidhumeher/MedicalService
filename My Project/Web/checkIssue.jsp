<%@taglib uri="/struts-tags" prefix="s"%><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<Center> 
<h3>Check Issues </h3>
<s:form action="checkIssueAction" method="post">
<s:submit type="button" value="Submit">Issues</s:submit>
<s:iterator value="" >
<table> 
<tr>
<td> Issue Id </td>
<td> Issue</td>
<td> Status</td>
</tr>
<tr> 
<td><s:property default="--" value="issueId"/> </td>
<td><s:property default="--" value="issueText"/> </td>
<td><s:property default="--" value="status"/> </td> 
</tr>
</table>
</s:iterator>
</s:form>
</Center>
</body>
</html>