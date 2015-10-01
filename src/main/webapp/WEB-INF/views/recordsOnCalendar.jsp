<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="http://yui.yahooapis.com/3.18.1/build/yui/yui-min.js"></script>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<title>Main</title>
</head>
<BODY>
	<div id="demo" class="yui3-skin-sam yui3-g">
		<!-- You need this skin class -->

		<div id="leftcolumn" class="yui3-u">
			<!-- Container for the calendar -->
			<div id="mycalendar"></div>
		</div>
		<div id="rightcolumn" class="yui3-u">
			<div id="links" style="padding-left: 20px;">
				<!-- The buttons are created simply by assigning the correct CSS class -->
				Selected date: <span id="selecteddate"></span>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		YUI().use('calendar', 'datatype-date', 'cssbutton', function(Y) {

			var calendar = new Y.Calendar({
				contentBox : "#mycalendar",
				width : '340px',
				showPrevMonth : true,
				showNextMonth : true,
				date : new Date()
			}).render();
			;
			
			var dtdate = Y.DataType.Date;

			calendar.on("selectionChange", function(ev) {
				var newDate = ev.newSelection[0];
				Y.one("#selecteddate").setHTML(dtdate.format(newDate));
				$.get('ActionServlet', {
					selected : newDate
				}, function(responseText) {
					$('#welcometext').text(responseText);
				});
			});
		});
	</script>
	<div id="welcometext"></div>
<!-- <a>${selected}</a> -->	
		<h2 style="color: blue; text-align: center">
			<b>Records</b>
		</h2>
		<div id="records">
			<c:forEach items="${recordsList}" var="record">
				<a>Title: ${record.title}</a>
				<a>Text: ${record.text}</a>
				<a>Supplement: ${record.supplement}</a>
				</br>
			</c:forEach>
		</div>
</BODY>
</HTML>