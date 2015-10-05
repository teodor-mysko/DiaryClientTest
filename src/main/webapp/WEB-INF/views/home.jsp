<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">

		<div class="body">

			<script src="http://yui.yahooapis.com/3.18.1/build/yui/yui-min.js"></script>
			<script src="resources/js/jquery-1.9.1.min.js"></script>

			<div id="demo" class="yui3-skin-sam yui3-g">
				<div id="leftcolumn" class="yui3-u">
					<div id="mycalendar"></div>
				</div>
				<div id="rightcolumn" class="yui3-u">
					<div id="links" style="padding-left: 20px;">
						Selected date: <span id="selecteddate"></span>
					</div>
				</div>
			</div>
			<script type="text/javascript">
				YUI().use(
						'calendar',
						'datatype-date',
						'cssbutton',
						function(Y) {
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
								Y.one("#selecteddate").setHTML(
										dtdate.format(newDate));

								var inputDate = $("#selecteddate").text();
								$.ajax({
									url : 'getRecordsByDay',
									type : 'GET',
									dataType : 'json',
									data : ({
										selected : inputDate
									}),
									success : function(data) {
										$("#result").text(data);
									}
								});
							});
						});
			</script>
			<h2 style="color: blue; text-align: center">Records</h2>
			<div id="result"></div>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>