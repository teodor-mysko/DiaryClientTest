<div>
  Menu
  <ul>
    <li>
    <spring:url value="/users" var="usersUrl" htmlEscape="true" />
      <a href="${usersUrl}">Users</a></li>
      <li>
      <spring:url value="/systemStatistic" var="systemStatisticUrl" htmlEscape="true" />
      <a href="${systemStatisticUrl}">SystemStatistic</a></li>
  </ul>
</div>