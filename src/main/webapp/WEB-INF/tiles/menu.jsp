<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<div class="menu">
	<c:if test="${pageContext.request.userPrincipal.name != null}">
	Menu
	<ul>
			<li><a href="home">Home </a></li>
				
			<li><a href="users_profile">My Profile</a></li>
					
			<li><a href="publicRecords">public records</a></li>
					
			<li><a href="addRecord?nickName='${pageContext.request.userPrincipal.name}'">add record</a></li>
					
			<li><a href="settings">settings</a></li>
					
			<li><a href="users-statistic">Statistic</a></li>
				
		</ul>
	</c:if>
	<c:if test="${pageContext.request.userPrincipal.name == null}">
		<p></p>
	</c:if>
</div>