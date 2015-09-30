<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="menu">
Menu
    <ul>
        <li>
            <spring:url value="/users" var="usersUrl" htmlEscape="true"/>
            <a href="${usersUrl}">Users</a>
        </li>
    </ul>
</div>