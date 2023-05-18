<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Stock Price</title>
</head>
<body>
<h2>Get Stock Price</h2>
<br>
	<h3>  ${msg }</h3>
	
	<br>
	<form method="get" action="getTotalCost">
		<table>
			<tr>
				<td>Company Name</td>
				<td><input type="text" name ="companyName" required="required"></td>
			</tr>
			<tr>
				<td>Quantity</td>
				<td><input type="text" name ="quantity" required="required"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value ="GetCost"></td>
			</tr>
		
		</table>
	</form>

</body>
</html>