<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <jsp:include page="includes/header.jsp"/>
</head>
<body>
<jsp:include page="navigation/navbar.jsp"/>
<div class="grid-container">
    <div class="grid-x medium-4 align-center">
        <form action="login-complete" method="post">
            <label>
                <c:out value="${user._lastQuestionAsked._question}"/>
                <input type="text" name="answer"/>
            </label>
            <input type="submit" value="Login"/>
        </form>
    </div>
</div>

<jsp:include page="includes/footer.jsp"/>
</body>
</html>
