<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <jsp:include page="includes/header.jsp"/>

</head>
<body>
<jsp:include page="navigation/navbar.jsp">
    <jsp:param name="title" value="${title}"/>
</jsp:include>
<div class="grid-container">
    <div class="grid-x medium-4 align-center">
        <p>Welcome ${user._userName}, you have successfully logged in.</p>

    </div>
</div>
<jsp:include page="includes/footer.jsp"/>
</body>
</html>