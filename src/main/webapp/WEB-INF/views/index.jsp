<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Diary</title>
</head>
<body>
	<jsp:include page="header.jsp"/>
	<ul>
		<li><a href="users">Users</a></li>
		<li><a href="systemStatistic">SystemStatistic</a></li>
		<li><a href="usersList">Users Statistic</a></li>
		<li><a href="mystatistic?nickName=${pageContext.request.userPrincipal.name}" >My Statistic</a></li>
	</ul>
	<br>
	<a href="publicRecords">publicRecords</a>
	<br>
	<a href="home">home</a>
</body>
</html>

