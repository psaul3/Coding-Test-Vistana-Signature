<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <jsp:include page="includes/header.jsp"/>
</head>
<body>
<jsp:include page="navigation/navbar.jsp">
    <jsp:param name="title" value="${title}"/>
    <jsp:param name="showSignUp" value="false"/>
</jsp:include>

<div class="grid-x medium-6 align-center">
    <form action="/signup-questions" method="post" onSubmit="return validate(this);" name="form">
        <c:if test="${fn:length(error) > 0}">
            <div data-closable class="callout alert-callout-subtle alert">
                <c:if test="${fn:contains(error, 'Username')}">
                    Please enter a <strong>Username</strong>.
                </c:if>
                <c:if test="${fn:contains(error, 'Birthdate')}">
                    Please enter a <strong>Birthdate</strong>.
                </c:if>
            </div>
        </c:if>
        <div class="grid-x">
            <div class="small-12 cell">
                <label for="username">Username
                    <input type="text" id="username" name="username">
                </label>
            </div>
            <div class="small-12 cell">
                <label for="birthdate">Birthdate
                    <input type="date" id="birthdate" name="birthdate">
                </label>
            </div>
        </div>
        <input class="button expanded" type="submit" value="Sign up">
    </form>
</div>

<jsp:include page="includes/footer.jsp"/>
<script type="application/javascript">
    var ck_username = /^[A-Za-z0-9]{5,12}$/;

    function validate(form) {
        var username = form.username.value;
        var errors = [];

        if (!ck_username.test(username)) {
            errors[errors.length] = "UserName is invalid.";
        }
        if (errors.length > 0) {
            reportErrors(errors);
            return false;
        }
        return true;
    }

    function reportErrors(errors) {
        var msg = "Username must be alphanumeric between 5-12 characters\n";
        for (var i = 0; i < errors.length; i++) {
            var numError = i + 1;
            msg += "\n" + numError + ". " + errors[i];
        }
        alert(msg);
    }
</script>
</body>
</html>
