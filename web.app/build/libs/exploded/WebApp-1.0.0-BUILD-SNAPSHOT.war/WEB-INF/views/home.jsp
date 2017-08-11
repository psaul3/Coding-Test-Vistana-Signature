<%--
  Created by IntelliJ IDEA.
  User: Tito
  Date: 8/11/2017
  Time: 8:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Home</title>
    <jsp:include page="header.jsp"/>

</head>
<body>
<jsp:include page="navbar.jsp"/>

<main class="content">
    <jsp:include page="sidebar.jsp"/>
    <main class="content-articles">
        <h3>${title}</h3>
        <table>
            <thead>
            <tr>Username</tr>
            <tr>Birthdate</tr>
            </thead>
            <tbody>
            <c:forEach items="${userList.records}" var="item">
                <tr>
                    <td><c:out value="${item.fields.username.toString()}" /></td>
                    <td><c:out value="${item.fields.birthdate.toString()}" /></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </main>
</main>
<jsp:include page="footer.jsp"/>
</body>
</html>
