<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>간단한 JSP 예제</title>
</head>
<body>
<h1>사용자 정보 입력</h1>
<form method="post" action="memberServlet">
  <label for="name">이름:</label>
  <input type="text" name="name" id="name" required>
  <br>
  <label for="email">이메일:</label>
  <input type="email" name="email" id="email" required>
  <br>
  <button type="submit">입력 완료</button>
</form>
</body>
</html>
