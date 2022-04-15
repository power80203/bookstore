<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create New User</title>
</head>
<body>

	<jsp:directive.include file="header.jsp"/> 
	
	<!-- header end  -->
	<div align = "center">
		
		<h2>Create User</h2>
		
	</div>
	
	
	
	<div align = "center">
		<form action="create_user" method="post">
		<table>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" size="20" /></td>
			</tr>
			<tr>
				<td>fullName:</td>
				<td><input type="text" name="fullName" size="20" /></td>
			</tr>
		
		</table>
		</form>
	</div>
	
	
	
	<!-- footer start  -->
	<jsp:directive.include file="footer.jsp"/> 

</body>
</html>