<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List,project.Object"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>All Students Data</h1><br>
<style>
 body{
 display:flex;
 flex-direction:column;
  align-items:center;
  justify-content:center;
  
 }
 table{
   box-shadow:0 8px 18px black;
   align-items:center;
   border-collapse:collapse;
   border-radius:10px;
   margin:30px;
   width:700px;
 }
 th{
 background:radial-gradient(circle,beige,grey);
 text-decoration: blink;
  width:300px;
 padding:10px;
 color:Green;
 }
 td,tr{
 width:300px;
 padding:10px;
 
 }



</style>
	<%
  List<Object> objlist = (List<Object>) request.getAttribute("listcall");
  if(objlist != null && !objlist.isEmpty()){
	  
%>
	<table border="1">
		<thead>
			<tr>
				<th>id</th>
				<th>name</th>
				<th>mail</th>
				<th>age</th>
			</tr>
		</thead>
		<%
  for(project.Object s : objlist){
%>
		<tr>
			<td><%= s.getId() %> </td>
			<td><%= s.getName() %> </td>
			<td><%= s.getEmail() %> </td>
			<td><%= s.getAge() %> </td>
		</tr>
		<% } %>
	</table>
	<% } %>
</body>
</html>