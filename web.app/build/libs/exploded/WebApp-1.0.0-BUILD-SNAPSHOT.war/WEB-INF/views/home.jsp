<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <jsp:include page="includes/header.jsp"/>

</head>
<body>
    <jsp:include page="navigation/navbar.jsp"/>
<div class="row" data-equalizer>
    <table>
        <thead>
        <tr>
            <th width="200">User</th>
            <th>Birthdate</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${userList.records}" var="item">
            <tr>
                <td><c:out value="${item.fields.username}"/></td>
                <td><c:out value="${item.fields.birthdate}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>


    <jsp:include page="includes/footer.jsp"/>
</body>
</html>
