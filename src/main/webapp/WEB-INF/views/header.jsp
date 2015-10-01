<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<header>
<div class="block1">
<a href='/DiaryClient/'><img src="http://diary.cc.ua/images/logo.png" height="100" alt="image"/>></a>
</div>
<div class="block2">
The Diary
</div>
<div class="block3">
<sec:authorize access="hasRole('ROLE_USER')">
        <c:url value="/j_spring_security_logout" var="logoutUrl" />
        <form action="${logoutUrl}" method="post" id="logoutForm">
            <input type="hidden" name="${_csrf.parameterName}"
                value="${_csrf.token}" />
        </form>
        <script>
            function formSubmit() {
                document.getElementById("logoutForm").submit();
            }
        </script>
        <c:if test="${pageContext.request.userPrincipal.name != null}">
            <h2>
                Hello, <a href='#'>${pageContext.request.userPrincipal.name}</a> <button onclick="javascript:formSubmit()"> Logout</button>
            </h2>
        </c:if>
        <c:if test="${pageContext.request.userPrincipal.name == null}">
            <h2>
                <button onclick="location.href='/DiaryClient/login'">Log in</button>
            </h2>
        </c:if>
    </sec:authorize>
</div>
<div  class="block4">
</div>
</header>


<link rel="stylesheet" type="text/css" href="http://diary.cc.ua/css/header.css">
