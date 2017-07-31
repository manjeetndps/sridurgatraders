<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
      
        <script language="javascript">
            function check()
            {

 var a2=login.icode.value.length;
            



     
            
  if(a2 ==0)
            {
                    alert("Produt Code is must!!")
                    return false;
            }

  


            
            return ture;
            }
        </script>
         <link rel="stylesheet" href="css/main.css" type="text/css"/>
    </head>
    <section class="container">
        <form name="login" action="/updatingAnItem" method="post" onsubmit="return check()">
        

<br>
           <h1>Product Code Not Editable...</h1>
            
           
            <br>
            <table>



<tr>
                    <th></th> <th>Product Code</th><td><input readonly="readonly" type="text" name="itemCode" value="${icode}"></td><td></td>
                   
                </tr>
                
                  <tr>
                  <th></th><th>ProductName</th><td><input type="text" name="itemName" value="${iname}"></td>
                   
                </tr>

<tr>
                     <th></th><th>Price</th><td><input type="text" name="itemPrice" value="${iprice}"></td>
                   
                </tr>

<tr>
                     <th></th><th>BrandName</th><td><input type="text" name="itemBrand" value="${ibrand}"></td>
                   
                </tr>

<tr>
                     <th></th><th>Quantity</th><td><input type="text" name="itemQuantity" value="${iquantity}"></td>
                   
                </tr>

<tr>
                   <th></th>  <th>ProductWarenty</th><td><input type="text" name="itemWarranty" value="${iwarranty}"></td>
                   
                </tr>

<tr>
                    <th></th> <th>More Details</th><td><input type="text" name="moreDetails" value="${imore}"></td>
                   
                </tr>

               
                <tr></tr>
                
            </table>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="update an item" align="right">&nbsp;&nbsp;<input type="RESET" value="Reset" align="left">
            <br>
            <br>
        <p>  Note: After updating the details! check the item list for confirmation.</p>  <br>
        </form>
    </section>
</html>
