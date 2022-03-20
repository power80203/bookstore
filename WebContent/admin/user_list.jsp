<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Manage Users - Bookstore Administration</title>
</head>
<body>

	<jsp:directive.include file="header.jsp"/>
	
	<div align = "center">
		<h2>User Magt.</h2>
		<h2><a href="">Create new user</a></h2>
	</div>
	
	
	<div align="center">
		<table border = "1">
			<tr>
				<th>Index</th>
				<th>ID</th>
				<th>Email</th>
				<th>FullName</th>
				<th>Action</th>
			</tr>
		
		</table>
		
	</div>
	
	
	
	
	<hr width=60%/>
	<jsp:directive.include file="footer.jsp"/> 

</body>
</html>