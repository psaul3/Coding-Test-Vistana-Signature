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
        <div class="small-6 cell align-center-middle">
            <button href="#" class="button expanded" data-open="login-modal"><i class="fa fa-cogs"></i> Login</button>
            <a href="/signup" class="button expanded"><i class="fa fa-cogs"></i> Sign Up</a>
        </div>
    </div>

    <div class="reveal mobile-ios-modal" id="login-modal" data-reveal>
        <form action="/login" method="post">
            <div class="mobile-ios-modal-inner">
                <p>Username</p>
                <input type="text" name="username">
            </div>
            <div class="mobile-ios-modal-options">
                <button class="button">Login</button>
            </div>
        </form>
    </div>
</div>

<jsp:include page="includes/footer.jsp"/>
</body>
</html>
