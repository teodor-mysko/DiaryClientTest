<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>The Diary - Login</title>
<link href="<c:url value="http://diary.cc.ua/css/login.css" />" rel="stylesheet">
</head>
<body onload='document.loginForm.username.focus();'>
    <div id="login">
       <c:if test="${not empty error}">
        <div class="error">${error}</div>
    </c:if>
    <c:if test="${not empty msg}">
        <div class="msg">${msg}</div>
    </c:if>
    
        <h1>${title}</h1>
        <form name='loginForm' action="<c:url value='/j_spring_security_check' />" method='POST'>
            <input type='text' name='username' placeholder='username' />
            <input type='password' name='password' placeholder="password" />
            <input name='submit' type='submit' value='Log in' /><br>
            
            <a href="/register">Register here</a>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        </form>
    </div>
</body>
</html>