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

    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <script type="text/javascript" src="<c:url value="/resources/js/jquery-3.2.1.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/jquery-ui.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/jquery.steps.min.js"/>"></script>

</head>
<body>
    <header class="main-nav">
        <nav>
            <ul>
                <li> <a href="/">Home</a> </li>
            </ul>

            <ul>
                <li> <a href="/login">Login</a> </li>
                <li> <a href="/signup">Sign Up</a> </li>
            </ul>
        </nav>
    </header>

    <main class="content">
        <aside class="content-news">
            <h1>News</h1>
            <button id="all-news">All News</button>
        </aside>
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
</body>
</html>
