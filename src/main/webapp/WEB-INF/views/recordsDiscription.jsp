<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Record discription</title>
</head>
<body>
	<h2>discription</h2>
	<ul>

		<li><b>Record created time:   </b>${record.created_time}</li>
		<li><b>Record title:   </b>${record.title}</li>
		<li><b>Record text:   </b>${record.text}</li>
		<li><img src=${record.supplement}></li>
	</ul>

	<button onclick="location.href='records'">Back</button>

</body>
</html>