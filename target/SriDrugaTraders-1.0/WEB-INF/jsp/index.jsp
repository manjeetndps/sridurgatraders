<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<html lang="en">
<head>
  <meta charset="utf-16">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Durga traders login</title>
	<c:url value="/css/main.css" var="jstlCss" />
	<link href="${jstlCss}" rel="stylesheet" />
</head>
<body>
 <section class="container">
    <div class="login">
      <h1>Login to Web App</h1>      
        <div class="container">
        <h2>M/s Durga Traders Login Portal</h2>
        <form action="/loginValidation" method="post" commandName = "User">
        <p><input type="text" name="userName" id="userName" value="" placeholder="Username or Email"/></p>
        <p><input type="password" name="password" id="password" value="" placeholder="Password"/></p>
        <p class="remember_me">
          <label>
            <input type="checkbox" name="remember" id="remember"/>
            Remember me on this computer
          </label>
        </p>
        <p class="submit"><input type="submit" name="commit" value="Login"></p>
      </form>
    </div>

    <div class="login-help">
      <p>New User? <a href="signUpPage">Click here</a>to create your Account.</p>
    </div>
  </section>

</body>
</html>
