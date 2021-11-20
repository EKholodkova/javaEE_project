<%@ page import="java.util.List" %>
<%@ page import="ru.gb.entity.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Products</title>
</head>
<body>
    <h2>Products</h2>
    <hr>
    <ul>
    <% for(Product val : (List<Product>)(request.getAttribute("products"))) { %>
        <li>id: <%=val.getId()%>; title: <%=val.getTitle()%>; <%=val.getCost()%></li>
    <% } %>
    </ul>
    <hr>
</body>
</html>