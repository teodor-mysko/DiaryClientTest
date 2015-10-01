<html>
<head>
<title>User profile</title>
</head>
<body>
	<h2>profile</h2>
	<ul>
		<li><b>Nick Name:   </b>${user.nickName}</li>
		<li><b>Full name:   </b>${user.firstName}  ${user.secondName}</li>
		<li><b>Sex:    </b>${user.sex}</li>
		<li><b>Address:   </b>${user.address}</li>
		<li><b>E-mail:   </b>${user.eMail}</li>
		<li><b>Date of birth:   </b>${user.dateOfBirth}</li>
	</ul>

	<button onclick="location.href='users'">Back</button>
</body>
</html>
