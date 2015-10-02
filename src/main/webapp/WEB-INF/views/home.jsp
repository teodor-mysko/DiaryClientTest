<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
 <tiles:insertDefinition name="defaultTemplate"> 
  <tiles:putAttribute name="body">

    <div class="body">
    
<script src="http://yui.yahooapis.com/3.18.1/build/yui/yui-min.js"></script>
<script src="http://code.jquery.com/jquery-latest.js"></script>

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

        </div>
    </tiles:putAttribute>

</tiles:insertDefinition>