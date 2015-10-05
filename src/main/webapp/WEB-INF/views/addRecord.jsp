<%@page session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
 <tiles:insertDefinition name="defaultTemplate"> 
  <tiles:putAttribute name="body">

    <div class="body">
<h1>Record</h1>
<form action="addRecord?${_csrf.parameterName}=${_csrf.token}" name="record"  method="post">
        <div>
        Title:
        <input id="title" size=100 type="text" name="title" value="${record.title}"/>
         </div>
         
         
          <div>
         Choose visibility for record:
        <input id="status" type="radio" name="status" value="PRIVATE" checked>Private</input>
        <input id="status" type="radio" name="status" value="PUBLIC">Public</input>
        <input type="hidden" name="user_id" value="${pageContext.request.userPrincipal.name}"/>
        </div>
          <div>
          Message:
		<textarea id="text" type="text" name="text" cols="100" rows="30" wrap="hard" value="${record.text}">
        </textarea>
         </div>
         <center>
		<button> Submit</button>
        </center>
</form>

        </div>
    </tiles:putAttribute>

</tiles:insertDefinition>