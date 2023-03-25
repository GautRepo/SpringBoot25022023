<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome to Hostel Page</h3>
<form:form action="save" method="POST" modelAttribute="host">
<pre>
Name:     <form:input path="hname"/>
Gender:
	      <form:radiobutton path="gender" value="Male"/>Male
	      <form:radiobutton path="gender" value="Female"/>Female
Password: <form:input path="pwd"/>
<br>
Course:   <form:select path="course">
			<form:option value="">Select</form:option>
			<form:option value="java">Java</form:option>
			<form:option value="python">Python</form:option>
			<form:option value="php">PHP</form:option>
			<form:option value="angular">Angular</form:option>
		  </form:select>
		<br>
Address:  <form:textarea path="addr"/>
<br>	
Languages:
		  <form:checkbox path="lang" value="hin"/>Hindi
		  <form:checkbox path="lang" value="eng"/>English	
		  <form:checkbox path="lang" value="tamil"/>Tamil
		  <form:checkbox path="lang" value="telgu"/>Telgu

	<input type="submit" value="Add Student">
</pre>
</form:form>
${message}
</body>
</html>