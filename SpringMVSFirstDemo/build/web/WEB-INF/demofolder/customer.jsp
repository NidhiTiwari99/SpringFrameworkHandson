
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to Customer View</h1>
        <h2>Customer Id=${Customer_id}</h2>
        <h2>Customer Name=${Customer_name}</h2>
        <ul>
            <c:forEach var="c" items="${cities}">
                <li>${c}</li>
            </c:forEach>
        </ul>
    </body>
</html>
