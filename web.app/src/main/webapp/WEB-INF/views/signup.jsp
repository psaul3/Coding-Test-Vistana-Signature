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
    <form action="/signup-questions" method="post">
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
                    <input type="text" id="username" name="username"
                           value="<c:out value="${user != null ? user._userName : ''}"/> ">
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
    $(function () {
        var showClass = 'show';

        $('input').on('checkval', function () {
            var label = $(this).prev('label');
            if (this.value !== '') {
                label.addClass(showClass);
            } else {
                label.removeClass(showClass);
            }
        }).on('keyup', function () {
            $(this).trigger('checkval');
        });
    });
</script>
</body>
</html>
