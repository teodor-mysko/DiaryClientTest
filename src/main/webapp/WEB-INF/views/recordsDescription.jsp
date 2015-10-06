<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="body" scroll="yes">
		<c:if test="${record != null}">
			<h1> Record successfully added</h1>
		</c:if>
			<c:if test="${record == null}">
		<h1> Adding of record failed</h1>
		</c:if>
			<center>
		<h2>Record Description</h2>
			</center>
			<ul type="square">
				<li>Title: ${record.title}</li>
				<li>${record.supplement} </li>
				<li>Created: ${record.createdTime} </li>
				<li><button onclick="location.href='publicRecords'">Back</button> </li>
				<li>Test: ${record.text}</li>
			</ul>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>

