<html>
<head>
<title>User profile</title>
</head>
<body>
	<h2>profile</h2>
	<ul>
		<li><b>Nick Name:   </b>${user.nickName}</li>
		<li><b>Last records:   </b>${user.lastRecords}</li>
		<li><b>Last login:   </b>${user.lastLogin}</li>
		<li><b>Number of logins:   </b>${user.numberOfLogins}</li>
		<li><b>Number of records:   </b>${user.numberOfRecords}</li>
	</ul>

	<button onclick="location.href='users'">Back</button>
</body>
</html>
