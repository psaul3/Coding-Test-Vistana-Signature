<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
    <form class="callout text-center" action="/signup-questions" method="post" data-equalizer data-equalize-by-row="true">
        <h2>Account Registration</h2>
        <div class="floated-label-wrapper" data-equalizer-watch>
            <div class="input-group">
                <span class="input-group-label">Username</span>
                <input class="input-group-field" placeholder="username" name="username">
            </div>
        </div>
        <div class="floated-label-wrapper" data-equalizer-watch>
            <div class="input-group">
                <span class="input-group-label">Birthdate</span>
                <input class="input-group-field" type="number" placeholder="Month" name="month">
                <input class="input-group-field" type="number" placeholder="Day" name="day">
                <input class="input-group-field" type="number" placeholder="Year" name="year">
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
            if(this.value !== '') {
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
