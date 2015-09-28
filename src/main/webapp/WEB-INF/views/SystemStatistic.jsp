<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SystemStatistic</title>
</head>
<body>
	<h1>System statistic per last month:</h1>

	<c:forEach items="${systemStatisticList}" var="sysstatistic">
	
		<ul>
			<li><b>General number of records per month: </b>${sysstatistic.genNumOfRecordsPerMonth}</li>
			<li><b>General number of users per month: </b>${sysstatistic.genNumOfUsersPerMonth}</li>
			<li><b>Most active user per month: </b>${sysstatistic.mostActiveUserPerMonth}</li>
			<li><b>Most popular record: </b>${sysstatistic.mostPopRecord}</li>
			<li><b>Most popular user per month: </b>${sysstatistic.mostPpopularUserPerMonth}</li>
			<li><b>Number of new users per month: </b>${sysstatistic.numOfNewUsersPerMonth}</li>
			<li><b>The biggest record: </b>${sysstatistic.theBiggestRecord}</li>
			<li><b>The longest time online: </b>${sysstatistic.theLongestTimeOnline}</li>
		</ul>

	</c:forEach>

	<button onclick="location.href=''">Back</button>
</body>
</html>