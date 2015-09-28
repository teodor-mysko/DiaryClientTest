<html>
<head>
<title>User profile</title>
</head>
<body>
	<h2>profile</h2>
	<ul>
		<li><b>Nick Name:   </b>${user.nick_name}</li>
		<li><b>Full name:   </b>${user.first_name}  ${user.second_name}</li>
		<li><b>Sex:    </b>${user.sex}</li>
		<li><b>Address:   </b>${user.address}</li>
		<li><b>E-mail:   </b>${user.e_mail}</li>
		<li><b>Date of birth:   </b>${user.date_of_birth}</li>
	</ul>

	<button onclick="location.href='users'">Back</button>
</body>
</html>
