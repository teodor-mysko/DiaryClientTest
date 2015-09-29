<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div class="body">
		<h1>Public Records: </h1>
			<c:forEach items="${recordsList}" var="records">
				<dl>
					<dt>
						<a href='recordsDiscription?id_rec=${records.id_rec}'>${records.title}</a>
					</dt>
					<dd>${records.text}</dd>
				</dl>
			</c:forEach>
		</div>



	</tiles:putAttribute>
</tiles:insertDefinition>

