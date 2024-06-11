<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>signup</h2>

<form action="saveuser" method="post"> <!-- action indicates where will the info go , after the signup buttion is pressed. --> 
			FirstName : <input type="text"  name="firstName"/>
			<br><br> 
			Email : <input type="text" name="email"/><br><Br>
			
			Password: 	<input type="password" name="password"/><br><Br> 
			
			<input type="submit" value="Signup"/>
	
	
	</form>

</body>
</html>