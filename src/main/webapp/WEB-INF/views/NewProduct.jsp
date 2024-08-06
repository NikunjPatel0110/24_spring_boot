<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>New Product</h2>

	<form action="saveproduct" method="post" enctype="multipart/form-data">
<!-- When we pass the image from the form we need to change the enctype attribute value and also we should to make method="post" -->
		ProductName: <input type="text" name="productName" /><br>
		<br> Category: <input type="text" name="category" /><br>
		<br> Price: <input type="text" name="price" /><Br>
		<br> Qty:<input type="Text" name="qty" /><BR>
		Master Image : <input type="file" name="masterImage"/> <br/> <br/> 
		<Br> <input type="submit" value="Add Product" />
		 
<!-- image we can get using 2 ways : 1) using the bean and 2) using RequestParam -->
	</form>	
</body>
</html>