<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="top-bar">
    <div class="top-bar-left">
        <h4>${param.title}</h4>
    </div>
    <div class="top-bar-right">
        <ul class="menu">
            <li><a href="/login">Login</a></li>
            <c:if test="${empty param.showSignUp}">
                <li><a href="/signup">Sign Up</a></li>
            </c:if>
        </ul>
    </div>
</div>