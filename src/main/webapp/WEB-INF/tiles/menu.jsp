<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<div>
	<c:if test="${pageContext.request.userPrincipal.name != null}">
	Menu
	<ul>
			<li><a href="home">Home </a></li>
				
			<li><a href="users_profile">My Profile</a></li>
					
			<li><a href="addRecord?nickName='${pageContext.request.userPrincipal.name}'">Add record</a></li>
			
			<li><a href="my-statistic?nickName=${pageContext.request.userPrincipal.name}">My Statistic</a></li>
					
			<li><a href="settings">Settings</a></li>
			
			<li><a href="publicRecords">Public records</a></li>
				
		</ul>
	</c:if>
	<c:if test="${pageContext.request.userPrincipal.name == null}">
		<p></p>
	</c:if>
</div>