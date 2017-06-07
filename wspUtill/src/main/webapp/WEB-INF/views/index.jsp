<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>

<head>
<title>Spring MVC Starter Application</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/static/resources/css/screen.css"/>" />
</head>

<body>
	<h2 align="center">WSP Utill</h2>
	<form:form modelAttribute="wspModel" action="/search" method="POST">
		<table>
			<tbody>
				<tr><td align="center"><b>DB DETAIL</b></td></tr>
				<tr><td>DB:-</td><td><form:input path="url" /></td></tr>
				<tr><td>USRNAME:-</td><td><form:input path="userName" /></td></tr>
				<tr><td>PWD:-</td><td><form:input path="password" /></td></tr>
				<tr><td align="center"><b>WSP DETAIL</b></td></tr>
				<tr><td>WSP ID:-</td><td><form:input path="wspID" /></td></tr>
				<tr><td>
				PlanType:-</td><td><form:radiobuttons path="PlanType" items="${planTypes}" />
				</td></tr>
				<tr><td><input type="submit" value="SUBMIT" /></td></tr>
			</tbody>
		</table>
	</form:form>
	<div id="footer"></div>
</body>
</html>
