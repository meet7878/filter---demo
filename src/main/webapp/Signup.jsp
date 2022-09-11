<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Signup </title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>

<div class="container">
<div class ="row">
<form action="SignupController"  method="post" >

FirstName<input type="text" name="FirstName" class="form-control">${FirstNameError}<br>
Email<input type="text" name="email" class="form-control"><br>
password<input type="password" name="password" class="form-control" ><br>
 <input type="submit" value="signup" class="form-control"><br>
  
 </form>
 </div>
</div>
</body>
</html>