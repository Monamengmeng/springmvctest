<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!-- 使用Jstl，一定要加入Jstl标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<html>
<head>
<title>Insert title here</title>
</head>
<body>

	<c:forEach items="${spittleList} var="spittle">
		<li id="spittle_<c:out value="spittle.id"/>">
			<div class="spittleMessage">
				<c:out value="${spittle.message}"/>
			</div>
			<div>
				<span class="spittleTime"><c:out value="${spittle.time }"/></span>
				<span class="spittleLocation">
					(<:c out value="${spittle.latitude}"/>,
					<c:out value="${spittle.longitude}"/>)</span>
			</div>
		</li>
	</c:forEach>


</body>
</html>