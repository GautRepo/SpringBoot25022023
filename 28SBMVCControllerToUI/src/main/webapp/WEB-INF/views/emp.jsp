<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %>
<html>
<head></head>
<body>
	
	<table>	
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Salary</th>
		</tr>
		
				<c:forEach items= "${listEmp}" var="emp1" >
				<tr>
					<td>${emp1.eid}</td>
					<td>${emp1.ename}</td>
					<td>${emp1.esal}</td>
				</tr>
				</c:forEach>
			
		</table>
	
	

</body>
</html>