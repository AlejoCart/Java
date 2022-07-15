<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

 <p> aakka </p>
	<% 
	
 	String url= "jdbc:mysql://localhost:3306/4-3";
 	String user="root";
 	String password="";
	String sql= "Select * from clientes";
	Class.forName("com.mysql.jdbc.Driver");
	
 	Connection con = DriverManager.getConnection(url, user, password);
 	Statement st= con.createStatement();
	
	
 	ResultSet rs= st.executeQuery(sql);
 	rs.next();
	
	
	%> 
	id: <%= rs.getString(1) %> <br>
	nombre: <%= rs.getString(2) %> <br>
	domicilio: <%= rs.getString(3) %> <br>
	
</body>
</html>