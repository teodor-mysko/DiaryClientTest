<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HTTP Status 403 - Access is denied</title>
<link href="<c:url value="http://diary.cc.ua/css/login.css" />" rel="stylesheet">
</head>
<body>
    <div id="login">
        <h1>Access denied!</h1>
        <c:choose>
        <c:when test="${empty username}">
            <h2 class="form">You do not have permission to access this page! Go away!</h2>
        </c:when>
        <c:otherwise>
            <h2 class="form">Hey, ${username} <br/>You do not have permission to access this page! Go away!</h2>
        </c:otherwise>
    </c:choose>
    </div>
</body>
</html>