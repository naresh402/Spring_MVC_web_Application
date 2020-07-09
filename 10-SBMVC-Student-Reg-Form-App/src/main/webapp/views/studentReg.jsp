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
<h1>Student Registration Form</h1>
<h3><font color="green">${succMsg}</font></h3>
<form:form action="registers" modelAttribute="student" method="POST">
<table>
<tr>
<td>Name :</td>
<td><form:input path="name"/></td>
</tr>

<tr>
<td>Password :</td>
<td><form:password path="pwd"/></td>
</tr>

<tr>
<td>Email :</td>
<td><form:input path="email"/></td>
</tr>

<tr>
<td>Phone Number :</td>
<td><form:input path="phno"/></td>
</tr>
<tr>
<td>Gender :</td>
<td><form:radiobutton path="gender" value="M"/>MAle 
<form:radiobutton path="gender" value="F"/>Female</td>
</tr>

<tr>
<td>Course :</td>
<td><form:select path="course">
<form:option value="">-select-</form:option>
<form:option value="java">Java</form:option>
<form:option value="python">Python</form:option>
<form:option value="spring boot">Spring Boot</form:option>
</form:select></td>
</tr>
<tr>
<td>PreferedTiming :</td>
<td><form:checkbox path="preferedTime" value="Mrng"/>Morning
<form:checkbox path="preferedTime" value="Evng"/>Evening</td>
</tr>
<tr>
<td><input type="reset" value="Reset"/></td>
<td><input type="submit" value="Register"/></td>
</tr>
</table>
</form:form>

</body>
</html>