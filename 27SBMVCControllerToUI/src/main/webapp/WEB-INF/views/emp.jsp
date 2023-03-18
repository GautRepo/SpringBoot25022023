<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

${eid} , ${ename }<br>
${Namelist }<br>

<c:forEach items="${Namelist}" var="ob">
	${ob }<br>
</c:forEach>

