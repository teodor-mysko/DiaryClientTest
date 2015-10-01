<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User profile</title>
</head>
<body>
	<h2>Profile</h2>
	<ul>
		<li><b>Nick Name: </b>${user.nickName}</li>
		<li><b>Last records: </b>${user.lastRecords}</li>
		<li><b>Last login: </b>${user.lastLogin}</li>
		<li><b>Number of logins: </b>${user.numberOfLogins}</li>
		<li><b>Number of records: </b>${user.numberOfRecords}</li>
		<li><b>Hello  </b>${numOfRecords}</li>
	</ul>

	<button onclick="location.href='usersList'">Back</button>
</body>
</html>