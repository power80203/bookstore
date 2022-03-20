<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

	<jsp:directive.include file="header.jsp"/> 
	<h1>Welcome come !!</h1>


	
	<div align="center">
		<h3>please login</h3>
		<form action="">
			Email: <input type="text" size="10" />
			Password: <input type="password" size="10" />
			<input type="submit" value="login" />
			
		</form>
	</div>
	
	<jsp:directive.include file="footer.jsp"/> 

</body>
</html>