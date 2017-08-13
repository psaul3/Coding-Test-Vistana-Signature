<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <jsp:include page="includes/header.jsp"/>

    <style>

        .floated-label-wrapper {
            position: relative;
        }

        .floated-label-wrapper label {
            background: #fefefe;
            color: #1779ba;
            font-size: 0.75rem;
            font-weight: 600;
            left: 0.75rem;
            opacity: 0;
            padding: 0 0.25rem;
            position: absolute;
            top: 2rem;
            transition: all 0.15s ease-in;
            z-index: -1;
        }

        .floated-label-wrapper label input[type=text],
        .floated-label-wrapper label input[type=email],
        .floated-label-wrapper label input[type=password] {
            border-radius: 4px;
            font-size: 1.75em;
            padding: 0.5em;
        }

        .floated-label-wrapper label.show {
            opacity: 1;
            top: -0.85rem;
            z-index: 1;
            transition: all 0.15s ease-in;
        }


    </style>

</head>
<body>
<jsp:include page="navigation/navbar.jsp"/>

<div class="grid-x medium-6 align-center">
    <form class="callout text-center" action="/signup-complete" method="post" data-equalizer
          data-equalize-by-row="true">
        <h2>Security Questions</h2>
        <h3 class="subheader">Thank you ${username}, now please select security questions and provide an answer for each.</h3>
        <c:forTokens items="1,2,3" delims="," var="i">
            <div class="floated-label-wrapper">
                <label for="question${i}">Question #${i}</label>
                <select id="question${i}" name="question${i}">
                    <option>Choose...</option>
                    <c:forEach items="${questionsList.records}" var="question" varStatus="iter">
                        <option value="${question.id}">${question.fields.question.toString()}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="floated-label-wrapper">
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