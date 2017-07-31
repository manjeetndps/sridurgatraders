<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ page import="com.sridurgatraders.main.dto.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/main.css" type="text/css" />
<script>
function myFunction() {
    alert("Selected item details will be deleted!");
}
</script>
<style>

a{
color:green;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="container">
<h2>Employee's working in SriDurgaTraders.</h2>

<table border="1px" bordercolor="black" width=80% align="left">

<tr>
			<td>USERNAME</td>
			<td>EMAIL</td>
			<td>PHONE</td>
			<td>EDIT</td>
			<td>DELETE</td>

		</tr>           
           <c:forEach items="${userlist}" var="user" varStatus="status">
                       
    <tr>
    
        <td><c:out value="${user.userName}"/></td>
                  <td> <c:out value="${user.email}"/></td>
        
        <td> <c:out value="${user.phone}"/></td> 
        
       
        <td><a href="<c:url value='/upDateAnUser/${userlist[status.index].userName}' />" >Edit</a></td>
        <td><a href="<c:url value='/deleteAnUser/${userlist[status.index].userName}' />" onclick="myFunction()">Delete</a></td>
        
       
    </tr>
</c:forEach>
       </table>

</body>
</html>
