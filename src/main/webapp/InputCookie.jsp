<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input Cookie</title>
</head>
<body>

<form action="SaveCookieController" method="post">
	Input Cookie : <input type="text" name="cName"/><br><br>
	Input Value : <input type="text" name="cValue"/><br><br>
	<input type="submit" value="Save Cookie"/>
</form>

</body>
</html>