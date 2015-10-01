<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
 
<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">


	<div class="body">
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
	<div>
    </tiles:putAttribute>
</tiles:insertDefinition>