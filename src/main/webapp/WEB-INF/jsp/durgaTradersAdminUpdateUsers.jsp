<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<link rel="stylesheet" href="css/main.css" type="text/css" />
<script language="javascript">
	function check() {

		var a2 = login.icode.value.length;

		if (a2 == 0) {
			alert("Produt Code is must!!")
			return false;
		}

		return ture;
	}
</script>
</head>
<section class="container">
 <div class="login">
	<form name="login" action="/updatedAndDisplayUserList" method="post"
		onsubmit="return check()">


		<br>
		<h1>Updating the User Details.</h1>
		<br>
		<table>




			<tr>
				<th></th>
				<th>User Name</th>
				<td><input readonly="readonly" type="text" name="userName"
					value="${uname}"></td>
				<td></td>

			</tr>

			<tr>
				<th></th>
				<th>Email</th>
				<td><input type="text" name="email" value="${email}"></td>

			</tr>

		<tr>
				<th></th>
				<th>Phone</th>
				<td><input type="text" name="phone" value="${phone}"></td>

			</tr>
			
			<tr>
				<th></th>
				<th>Role</th>
				<td><input type="text" name="role" value="${role}"></td>

			</tr>




			<tr></tr>

		</table>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
			type="submit" value="update user" align="right">&nbsp;&nbsp;<input
			type="RESET" value="Reset" align="left"> <br> <br>
		<p>Note: After updating the details! check the item list for
			confirmation.</p>
		<br>
	</form>
</div>
</section>
  </html>
