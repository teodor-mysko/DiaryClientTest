<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Diary</title>
</head>
<body>
	<jsp:include page="/WEB-INF/tiles/header.jsp"/>
	<ul>
		<li><a href="users">Users</a></li>
		<li><a href="systemStatistic">SystemStatistic</a></li>
	</ul>
	<br>
	<a href="publicRecords">publicRecords</a>
	<br>
	<a href="home">home</a>
	<a href="addRecord">addRecord</a>
</body>
</html>

