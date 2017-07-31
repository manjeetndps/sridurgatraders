<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ page import="com.sridurgatraders.main.dto.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<body bgcolor="PeachPuff">

<h2>Items Available in SriDurgaTraders.</h2>

<table border="1px" bordercolor="black" width=80% align="left">

           
            <c:forEach items="${itemlist}" var="item" varStatus="status">
            	 <tr>
    
       	 <td><c:out value="${item.itemCode}"/></td>
         <td> <c:out value="${item.itemName}"/></td>
         <td> <c:out value="${item.itemCategory}"/></td>
        <td> <c:out value="${item.itemPrice}"/></td> 
        <td> <c:out value="${item.itemBrand}"/></td> 
        <td> <c:out value="${item.itemQuantity}"/></td> 
        <td> <c:out value="${item.itemWarranty}"/></td> 
           
       
        <td><a href="<c:url value='/updateAnItem/${item.itemCode}' />" >Update</a></td>
        
        
       
    </tr>
            
			</c:forEach>
</table>

</body>
</html>
