<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

	<head>
		<title>Spring MVC Starter Application</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<link rel="stylesheet" type="text/css" href="<c:url value="/static/resources/css/screen.css"/>"/>
	</head>

	<body>
	<h2>WSP Utill</h2>
	<form>
		<table>
			<tbody>
				<tr>
					<td>DB URL String :-</td>
					<td><input type="text" /></td>
				</tr>
				<tr>
					<td>DB USERNAME :-</td>
					<td><input type="text" /></td>
				</tr>
				<tr>
					<td>DB PASSWORD :-</td>
					<td><input type="text" /></td>
				</tr>
				<tr>
					<td>WSP ID:-</td>
					<td><input type="text" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="SUBMIT"/></td>
				</tr>
				
			</tbody>
		</table>
	</form>
	
		<%-- <div id="container">
			<div id="content">


				<form:form commandName="newMember" id="reg">
					<h2>Member Registration</h2>
					<p>Enforces annotation-based constraints defined on the model class.</p>
					<table>
						<tbody>
							<tr>
								<td><form:label path="name">Name:</form:label></td>
								<td><form:input path="name"/></td>
								<td><form:errors class="invalid" path="name"/></td>
							</tr>
							<tr>
								<td><form:label path="email">Email:</form:label></td>
								<td><form:input path="email"/></td>
								<td><form:errors class="invalid" path="email"/></td>
							</tr>
							<tr>
								<td><form:label path="phoneNumber">Phone #:</form:label>
								<td><form:input path="phoneNumber"/></td>
								<td><form:errors class="invalid" path="phoneNumber"/></td>
							</tr>
	
						</tbody>
					</table>
					<table>
						<tr>
							<td>
								<input type="submit" value="Register" class="register"/>
							</td>
						</tr>
					</table>
				</form:form>
			</div> --%>
			<div id="footer">
			</div>
		</div>
	</body>
</html>
