<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Registration Process</title>
        <script language="javascript">
        function f2()
        {
        var a1=f1.username.value.length;
        var a2=f1.phone.value.length;
        var a3=f1.email.value.length;
        var a4=f1.password.value.length;
        var a5=f1.cpassword.value.length;
        if(a1==0)
        {
        alert("Please enter the User Name");
        return false;
        }
        if(a2==0)
        {
        alert("Please enter the Contact Number");
        return false;
        }
        if(a3==0)
        {
        alert("Please enter the Email Address");
        return false;
        }
        if(a4==0)
        {
        alert("Please enter the Password");
        return false;
        }
        if(a5==0)
        {
        alert("Please enter the Confirm Password");
        return false;
        }
        
        if(a4!=a5){
        	
        	alert("your password and confirm password shoud be same!")
        }
        
        
var ccc=f1.phone.value;
if(isNaN(ccc))
{
alert("In Contact NUmber only numericals no alphabets entertained"); return false; }
        return true;
        }
        </script>
    </head >
    <body>
        <form:form name="f1" action="/registerUser"  onsubmit="return f2()" method="post" commandName = "User">
        
        <br> <br> <br>
            <center><h1><font color="blue">Fill up the below Information to create your Account</h1>
            
            <table >
            <h5><font color="red">${msg}</h5>
                <tr><th><font color="blue">UserName</th><td><input type="text" name="userName" required></td></tr>
               
                            
                <tr><th><font color="blue">Email</th><td><input type="text" name="email" required></td></tr>
         
           <tr>
                    <th><font color="blue">Phone </th><td><input type="text" name="phone" required></td>
                </tr>
                    <tr>
                    <th><font color="blue">Password </th><td><input type="password" name="password" required></td>
                </tr>
                 <tr>
                    <th><font color="blue">Confirm Password </th><td><input type="password" name="cpassword" required></td>
                </tr>
   
               <tr><th></th><td><input type="submit" value="Create"><input type="reset" value="Reset"></td><td><a href="login">Back</a></td></tr>
                
            </table>
            </center>
        </form:form>
    </body>
</html>
