<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Student data page</h3>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Gender</th>
			<th>Course</th>
			<th>Address</th>
			<th>Languages</th>
			<th>Operations</th>
		</tr>
		<c:forEach items="${list}" var="ob">
			<tr>
			<td>${ob.hid}</td>
			<td>${ob.hname}</td>
			<td>${ob.gender}</td>
			<td>${ob.course}</td>
			<td>${ob.addr}</td>
			<td>${ob.lang}</td>
			<td>
				<a href="delete?id=${ob.hid}">Delete</a>
				<a href="edit?id=${ob.hid}">Edit</a>
			</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>