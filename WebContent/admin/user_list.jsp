<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
 
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
		<h3><a href="">Create new user</a></h3>
	</div>
	
	
	<div align="center">
		<table border = "1">
			<tr>
				<th>Index</th>
				<th>ID....</th>
				<th>Email</th>
				<th>FullName</th>
				<th>Action</th>
			</tr>
			<!-- var	代表当前条目的变量名称;varStatus	代表循环状态的变量名称 -->
			<c:forEach var = "user" items = "${listusers}" varStatus = "status">
				<tr>
					<td>${status.index + 1}</td>
					<td>${user.userId}</td>
					<td>${user.email}</td>
					<td>${user.fullName}</td>
					<td>
						<a href="">Edit</a>|
						<a href="">Delete</a>
					</td>
				</tr>  
			</c:forEach>		
		</table>
		
	</div>
	
	
	
	
	<hr width=60%/>
	<jsp:directive.include file="footer.jsp"/> 

</body>
</html>