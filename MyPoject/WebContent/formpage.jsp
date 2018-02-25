<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2 align="center">FILL USER DETAILS</h2>
	<form:form action="insertUserDetails.mp" modelAttribute="user" commandName="user">
		<table>
			<tr>
				<td> First Name :</td>
				<td>
					<form:input path="firstName"/>
					<form:errors path="firstName"/>
				</td>
			</tr>
			<tr>
				<td> Last Name :</td>
				<td>
					<form:input path="lastName" />
					<form:errors path="lastName"/>
				</td>
			</tr>
			
			<tr>
				<td> City :</td>
				<td>
					<form:input path="city" />
					<form:errors path="city"/>
				</td>
			</tr>
			</table>
			</form:form>
</body>
</html>