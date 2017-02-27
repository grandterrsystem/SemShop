<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome!</title>
    <link rel="stylesheet" href="<c:url value="/css/main.css"/>">
</head>
<body>
<div class="header">
    <div class="mainText"><h2>BGLand shop</h2></div>
    <div class="signInSignUp">
        <a class="signIn" href="/login">Sign in</a>
        <a class="signIn" href="/registration">Sign up</a>
    </div>
</div>
<div class="products">
    <c:forEach items="${products}" var="item">
        <p>Product: ${item.getName()}<br>
            Cost: ${item.getCost()}$<br>
            Description: ${item.getDescription()}</p>
        <hr>
    </c:forEach>
</div>
</body>
</html>
