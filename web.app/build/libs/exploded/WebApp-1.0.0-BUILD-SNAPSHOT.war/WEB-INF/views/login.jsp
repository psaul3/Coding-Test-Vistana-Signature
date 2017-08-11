<%--
  Created by IntelliJ IDEA.
  User: Tito
  Date: 8/11/2017
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title></title>
    <jsp:include page="header.jsp"/>

    <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/login.js" />"></script>
</head>
<body>
<form id="example-form" action="#">
    <div>
        <h3>Account</h3>
        <section>
            <label for="userName">UserName</label>
            <input id="userName" name="userName" class="required">
            <label for="birthdate">Birthdate</label>
            <input id="birthdate" name="birthdate" type="date" class="required">
        </section>
        <button></button>
    </div>
</form>

<jsp:include page="footer.jsp"/>
</body>
</html>
