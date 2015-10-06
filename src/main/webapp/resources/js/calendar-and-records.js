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
					success: function(data){ 
						if(data){
							var len = data.length;
							var txt = "";
							$("#table").empty().addClass("hidden");
							if(len > 0){
								txt += "<tr><th>ID</th><th>Title</th><th>Text" 
									+"</th><th>Visibility</th><th>Date</th></tr>";
								for(var i=0;i<len;i++){
									txt += "<tr><td>"+data[i].uuid+"</td><td>"
									+data[i].title+"</td></td>"
									+ "</td><td>"+data[i].text+"</td></td>"
									+"</td><td>"+data[i].visibility+"</td></td>"
									+ "<td><td>"+data[i].createdTime+"</td><tr>";
								}
								if(txt != ""){
									$("#table").append(txt).removeClass("hidden");
								}
							}
						}
					}
				});
			});
		});