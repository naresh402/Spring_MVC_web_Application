<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>${msg}</p>
<h2>Add Book</h2>
<form:form action="addBook" modelAttribute="book" method="POST">
<table>
<tr>
<td>Book Name:</td>
<td><form:input path="bookName"/>
</tr>

<tr>
<td>Author Name:</td>
<td><form:input path="bookAuthor"/></td>
</tr>

<tr>
<td>Book Price:</td>
<td><form:input path="bookPrice"/></td>
</tr>
<tr>
<td><input type="reset" value="Reset"></td>
<td><input type="submit" value="Add Book">
</tr>
</table>
</form:form>
<a href="viewBooks">View All Book</a>
</body>
</html>