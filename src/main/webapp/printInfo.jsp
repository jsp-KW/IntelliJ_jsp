<%--
  Created by IntelliJ IDEA.
  User: jungs
  Date: 2023-07-24
  Time: 오전 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>입력된 사용자 정보</h1>
    <%-- UserInfoServlet에서 전달된 사용자 정보 받기 --%>
    <% String name = (String) request.getAttribute("name"); %>
    <% String email = (String) request.getAttribute("email"); %>

    <%-- 입력된 정보 화면에 표시 --%>
    <p><strong>이름:</strong> <%= name %></p>
    <p><strong>이메일:</strong> <%= email %></p>
    <p>위의 정보가 정확한지 확인하세요.</p>
</body>
</html>
