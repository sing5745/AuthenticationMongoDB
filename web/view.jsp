<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="ca.sheridancollege.beans.*"%>
<!DOCTYPE html>
<html>
    <title>W3.CSS</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <body>

        <div class="w3-container">
            <h2>Users Collection</h2>
            <table class="w3-table-all">
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Password</th>
                </tr>
                <c:forEach items='${Users}' var="user">
                    <tr>
                        <td>${user.getFirstname()}</td>
                        <td>${user.getLastname()}</td>
                        <td>${user.getEmail()}</td>
                        <td>${user.getPassword()}</td>
                    </tr>
                </c:forEach>



            </table>

        </div>

    </body>
</html>
