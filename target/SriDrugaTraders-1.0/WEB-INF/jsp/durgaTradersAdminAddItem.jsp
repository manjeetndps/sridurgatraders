<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>

<script language="javascript">
	function check() {

		var a1 = login.iname.value.length;

		var a2 = login.icode.value.length;

		var a3 = login.icolor.value.length;

		var a4 = login.iquantity.value.length;

		var a5 = login.iwarenty.value.length;

		var a6 = login.idelevery.value.length;

		var a7 = login.ibrand.value.length;

		if (a1 == 0) {
			alert("Please Enter the item name");
			return false;
		}

		if (a2 == 0) {
			alert("Please Enter the product code");
			return false;
		}

		if (a3 == 0) {
			alert("Please Enter the color");
			return false;
		}

		if (a4 == 0) {
			alert("Please Enter the number of item");
			return false;
		}

		if (a5 == 0) {
			alert("Please Enter the warenty");
			return false;
		}

		if (a6 == 0) {
			alert("Please Enter the delivery time");
			return false;
		}

		if (a7 == 0) {
			alert("Please Enter the brand name");
			return false;
		}

		return ture;
	}
</script>
</head>
<body bgcolor="PeachPuff">
	<form name="login" action="/storingAnItem" method="post"
		onsubmit="return check()">
		<h1>Fill up the below Information to add an Item</h1>

		<table>


			<tr>
				<th></th>
				<th>Product Name</th>
				<td><input type="text" name="itemName"></td>

			</tr>

			<tr>
				<th></th>
				<th>Product code</th>
				<td><input type="text" name="itemCode"></td>
				<td>${msg1}</td>

			</tr>

			<tr>
				<th></th>
				<th>Category</th>
				<td><select name="itemCategory">
						<option value="mobile's">Mobile's</option>
						<option value="electronic's">Electronic's</option>
						<option value="mens's">Men's</option>
						<option value="women's">Women's</option>
						<option value="sport's">Sport's</option>
						<option value="library">Library</option>
						<option value="other">Other</option>


				</select></td>
			</tr>

			<tr>
				<th></th>
				<th>Price</th>
				<td><input type="text" name="itemPrice"></td>

			</tr>

			<tr>
				<th></th>
				<th>BrandName</th>
				<td><input type="text" name="itemBrand"></td>

			</tr>

			<!-- 	<tr>
				<th></th>
				<th>Quantity</th>
				<td><input type="text" name="iquantity"></td>

			</tr> -->

			<tr>
				<th></th>
				<th>ProductWarenty</th>
				<td><input type="text" name="itemQuantity"></td>

			</tr>

			<tr>
				<th></th>
				<th>Delivery In</th>
				<td><input type="text" name="itemWarranty"></td>

			</tr>


			<tr>
				<th></th>
				<th>MoreDeatails</th>
				<td><textarea name="moreDetails"></textarea></td>

			</tr>

			<tr></tr>

		</table>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
			type="submit" value="Add an item" align="right">&nbsp;&nbsp;<input
			type="RESET" value="Reset" align="left"> <br> <br>
		<h5>Note: After submitting the details check the item list for
			confirmation.</h5>
		<br>
	</form>
</body>
</html>
