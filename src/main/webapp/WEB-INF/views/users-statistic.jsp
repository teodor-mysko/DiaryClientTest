
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Statistic Page</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script type="text/javascript"
	src="http://underscorejs.org/underscore-min.js"></script>
<script type="text/javascript" src="https://www.google.com/jsapi"></script>

<script type="text/javascript">
	google.setOnLoadCallback(drawChart);
	function getDataForLogins() {
		var json = $
		{
			usersList
		}
		;
		for (var i = 0; i < json.length; i++) {
			delete json[i].uuid;
			delete json[i].numberOfRecords;
			delete json[i].lastLogin;
			delete json[i].lastRecords;
		}

		var header = [];
		for ( var key in json[0]) {
			header.push(key);
		}
		//console.log(header);

		var rows = [];
		for (var i = 0; i < json.length; i++) {
			rows.push([ json[i].nickName, json[i].numberOfLogins ]);
		}
		//console.log(rows);
		var jsonData = [ header ].concat(rows);
		return jsonData;
	}
	function getDataForRecords() {
		var json = $
		{
			usersList
		}
		;
		for (var i = 0; i < json.length; i++) {
			delete json[i].uuid;
			delete json[i].numberOfLogins;
			delete json[i].lastLogin;
			delete json[i].lastRecords;
		}

		var header = [];
		for ( var key in json[0]) {
			header.push(key);
		}
		//console.log(header);

		var rows = [];
		for (var i = 0; i < json.length; i++) {
			rows.push([ json[i].nickName, json[i].numberOfRecords ]);
		}
		//console.log(rows);
		var jsonData = [ header ].concat(rows);
		return jsonData;
	}
	google.load("visualization", "1", {
		packages : [ "corechart" ],
		callback : drawChart
	});

	function drawChart() {
		var dataForLogins = getDataForLogins();
		var dataForLogins = google.visualization
				.arrayToDataTable(dataForLogins);
		var optionsForLogins = {
			isStacked : false,
			title : 'Statistic by number of Logins',
			height : 500,
			width : 700,
			colors : [ 'blue' ]
		};
		var dataForRecords = getDataForRecords();
		var dataForRecords = google.visualization
				.arrayToDataTable(dataForRecords);
		var optionsForRecords = {
			isStacked : false,
			title : 'Statistic by number of Records',
			height : 500,
			width : 700,
			colors : [ 'red' ]
		};

		var chartForLogins = new google.visualization.ColumnChart(document
				.getElementById('chartForLogins'));
		chartForLogins.draw(dataForLogins, optionsForLogins);
		var chartForRecords = new google.visualization.ColumnChart(document
				.getElementById('chartForRecords'));
		chartForRecords.draw(dataForRecords, optionsForRecords);

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
				<div class="contentblock" id="chart">
					<div>The most active user: ${mostActiveUser.nickName}
						-${mostActiveUser.firstName} ${mostActiveUser.secondName} with
						${usersAmountOfRecords} records.</div>
					<div>The most popular tag(one by record) : ${mostPopularTag.tag}</div>
					<div id="chartForLogins"></div>
					<div id="chartForRecords"></div>
				</div>
			</div>
		</div>
		<div id="header"></div>
	</div>
	<button onclick="location.href='/DiaryClient'">Back</button>
</body>

</html>