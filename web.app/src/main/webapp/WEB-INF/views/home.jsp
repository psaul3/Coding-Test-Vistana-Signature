<%--
  Created by IntelliJ IDEA.
  User: Tito
  Date: 8/11/2017
  Time: 8:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <jsp:include page="includes/header.jsp"/>
    <link href="<c:url value="/css/header.scss"/>" rel="stylesheet"/>
    <link href="<c:url value="/css/main.scss"/>" rel="stylesheet"/>

</head>
<body>
    <jsp:include page="navigation/navbar.jsp"/>
    <div class="wrapper">
        <section class="application">
            <aside class="sidebar">
                <p>Sidebar</p>
            </aside>
            <main class="mainpane">
                <section class="wrapper">
                <p>Main Pane</p>
                </section>
            </main>
        </section>
    </div>

    <script src="<c:url value="/js/kickstart.min.js"/>" type="application/javascript"></script>
</body>
</html>
