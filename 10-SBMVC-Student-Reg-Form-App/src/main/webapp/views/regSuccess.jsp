<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2><font color="green">Registration Completed Successfully with Below Details</font></h2>
<hr/>
<table>
<tr>
<td>Name :</td>
<td>${student.name}</td>
</tr>
<tr>
<td>Email :</td>
<td>${student.email}</td>
</tr>
<tr>
<td>Phone Number :</td>
<td>${student.phno}</td>
</tr>
<tr>

<td>Course :</td>
<td>${student.course}</td>
</tr>
<tr>

<td>Gender :</td>
<td>${student.gender}</td>
</tr>
<tr>

<td>Preferred Timings : </td>
        	<td>${student.preferedTime[0]} ${student.preferedTime[1]}</td>
        	</tr>
</table>
</body>
</html>