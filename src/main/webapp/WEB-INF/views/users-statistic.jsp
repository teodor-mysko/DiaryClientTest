
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Statistic Page Test</title>
<link href="${pageContext.request.contextPath}/user-statistic.css" type="text/css" rel="stylesheet">
<script type="text/javascript"
	src="http://underscorejs.org/underscore-min.js"></script>
<script type="text/javascript" src="https://www.google.com/jsapi"></script>

<script type="text/javascript">
	google.setOnLoadCallback(drawChart);

	var json = ${usersList};
	for(var i = 0; i < json.length; i++) {
	    delete json[i].uuid;
	    delete json[i].numberOfRecords;
	    delete json[i].lastLogin;
	    delete json[i].lastRecords;
	}
	

	var header=[];
	for (var key in json[0]) {
		   header.push(key);
	}
	console.log(header);
	
	var rows=[];
	for (var i = 0; i<json.length;i++) {
		   rows.push([json[i].nickName,json[i].numberOfLogins]);
	}
	console.log(rows);
	
	var jsonData = [header].concat(rows);
	google.load("visualization", "1", {
		packages : [ "corechart" ],
		callback : drawChart
	});
	function drawChart() {
		var data = google.visualization.arrayToDataTable(jsonData);
		var options = {
			isStacked : false,
			title : 'Statistic by number of logins'
		};

		var chart = new google.visualization.ColumnChart(document
				.getElementById('chart'));
		chart.draw(data, options);
	}
</script>
</head>
<body>
<body>
	<div id="container">
		<div id="content" class="clearfix">
			<div id="nav">
				<div class="navblock">
					Chart menu
					<ul>
						<li>Online time per day</li>
						<li>First login</li>
						<li>Amount of records</li>
						<li>Hashtags</li>
					</ul>
				</div>
			</div>
			<div id="maincontent">
				<div class="contentblock" id="chart"
					style="width: 700px; height: 500px"></div>
			</div>
		</div>
		<div id="header"></div>
	</div>
	<button onclick="location.href='/DiaryClient'">Back</button>
</body>

</html>