<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>The Diary - Register</title>
<link href="resources/css/login.css" rel="stylesheet">
<script src="resources/js/jquery-1.9.1.min.js"></script>
<script src="resources/js/jquery.validate.js"></script>
<script src="resources/js/register.js"></script>
<script src="resources/js/passwordStrength.js"></script>
</head>
<body onload='document.registerForm.username.focus();'>
    <div id="login">
       <c:if test="${not empty error}">
        <div class="error">${error}</div>
    </c:if>
        <h1><a href="/DiaryClient/">The Diary Registration</a></h1>
        <form id="registerForm" name='registerForm' method='POST' role="form">
            <input id="username" type='text' name='username' placeholder='username' />
            <input id="email" type='text' name='email' placeholder='email' />
            <input id="password" type='password' name='password' placeholder="password" />
            <input id="confirmPassword" type='password' name='confirmPassword' placeholder="confirm password" />
            <div class="" id="passwordStrength"></div>
            <input name='submit' type='submit' value='Register' />
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            <div class="register">Already registered? <a href="/DiaryClient/login">Login here</a></div>
        </form>
    </div>
</body>
</html>