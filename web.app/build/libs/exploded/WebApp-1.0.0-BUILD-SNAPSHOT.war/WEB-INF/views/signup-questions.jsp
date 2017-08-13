<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

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
    <form action="/signup-complete" method="post">
        <c:if test="${not empty error}">
            <div data-closable class="callout alert-callout-subtle alert">
                <strong>${error}</strong>
            </div>
        </c:if>
            <h2>Security Questions</h2>
            <h4 class="subheader">Thank you ${user._userName}, now please select security questions and provide an
                answer for each.</h4>
            <c:forTokens items="1,2,3" delims="," var="i">
                <div class="small-12 cell">
                    <label for="question${i}">Question #${i}
                        <select id="question${i}" name="question${i}">
                            <option>Choose...</option>
                            <c:forEach items="${questionsList}" var="question" varStatus="iter">
                                <option value="${question}">${question}</option>
                            </c:forEach>
                        </select>
                    </label>
                </div>
                <div class="small-12 cell">
                    <label for="answer${i}">Answer #${i}</label>
                    <input type="text" id="answer${i}" name="answer${i}" placeholder="Answer #${i}">
                </div>
            </c:forTokens>
            <input class="button expanded" type="submit" value="Finish">
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