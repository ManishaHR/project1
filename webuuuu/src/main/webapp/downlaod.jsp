<%@page import="servletcrud.dto.StudentDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<StudentDto>l1=(List<StudentDto>)request.getAttribute("studentlist");  %>
<table border>
<tr>
<th>ID</th>
<th>NAME</th>
<th>NUMBER</th>
</tr>
<%for(StudentDto a:l1){ %>

<tr>
<td><%= a.getStd_id() %></td>
<td><%= a.getStd_name() %></td>
<td><%=a.getNumber() %></td>


</tr>




<%} %>
</table>
</body>
</html>