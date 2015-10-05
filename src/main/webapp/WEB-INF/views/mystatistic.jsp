<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My statistic</title>
</head>
<body>
<h2>profile</h2>
			<ul>
				<li><b>Nick Name: </b>${user.nickName}</li>
				<li><b>Full name: </b>${user.firstName} ${user.secondName}</li>
				<li><b>Password: </b>${user.password}</li>
				<li><b>Number Of records: </b>${numberOfRecords}</li>
				<li><b>Number Of logins: </b>${userStatistic.numberOfLogins}</li>
				<li><b>Last records: </b>${userStatistic.lastRecords}</li>
			</ul>
</body>
</html>