<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!------ Include the above in your HEAD tag ---------->

<%@page session="true"%>



<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

.error {
	color: red;
}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 10px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

.container {
  padding: 16px;
  width: 50%;
}

span.psw {
  float: right;
  padding-top: 16px;
}

.main{
	width: 60%;
    margin-left: 320px;
}

.loginTitle{
	margin-left: 227px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
}
</style>
</head>
<body>
<div class="main">
<h2 class="loginTitle">Login Form</h2>

<c:url value="/validateUser" var="createUrl" />
<form:form action="${createUrl}" method="POST" modelAttribute="loginDetails" 
data-toggle="validator" role="form"
					autocomplete="off">

  <div class="container">
    <label for="uname"><b>Username</b></label>
    <form:input type="text" placeholder="Enter Username" path="userName" name="uname" required="true" />
	<form:errors path="userName" cssClass="error"/></br>


    <label for="psw"><b>Password</b></label>
    <form:input type="password" placeholder="Enter Password" path="password" name="pwd" required="true" />
    <form:errors path="password" cssClass="error"/>
     
    <button type="submit">Login</button>
    
  </div>
 
</form:form>
</div>
</body>
</html>
