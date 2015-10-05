<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Diary</title>
</head>
<body>
	<jsp:include page="/WEB-INF/tiles/header.jsp" />
	<ul>
		<li><a href="users">Users</a></li>
		<li><a href="systemStatistic">SystemStatistic</a></li>
		<li><a href="users-statistic">Users Statistic</a></li>
		<li><a href="home">Home</a></li>
		<li><a href="addRecord">Add record</a></li>
		<li><a href="publicRecords">Public Records</a></li>
	</ul>
	<br>

	<br>

</body>
</html>

