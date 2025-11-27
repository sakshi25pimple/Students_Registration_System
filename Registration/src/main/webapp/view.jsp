<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="project.Object"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
 body{
 display:flex;
 align-items:center;
 justify-content:center;
 }
 div{
  background:linear-gradient(to bottom,grey,pink);
  border-radius:10px;
  padding:30px;
  width:300px;
  margin:30px;
  box-shadow:0px 10px 10px black;
 }
 h1{
 color:white;
 }
 h3{
 color:black;
 }

</style>
</head>
<body>
 <%
 /*String id = (String) request.getAttribute("id");
 String name = (String) request.getAttribute("n");
 String email = (String) request.getAttribute("m");
 String age = (String) request.getAttribute("a");*/
 
 Object obj = (Object) request.getAttribute("stu");
 
 %>
 <div>
 <h1>Student Registration Form</h1>
 <h3>your id is <%=obj.getId() %></h3>
 <h3>name of student is <%=obj.getName() %></h3>
 <h3>and the email is <%=obj.getEmail() %></h3>e
 </div>
</body>
</html>