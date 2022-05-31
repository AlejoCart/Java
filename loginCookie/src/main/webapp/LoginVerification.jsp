<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h1>Hola,Bienvenido 
	<%
	
	String user=request.getParameter("user");
	String password=request.getParameter("password");
	if(user.equals("pepe") && password.equals("1235")) out.print(user);
	
	else if(user.equals("") || password.equals("")) out.print("algo salio mal :$");
	else out.print("Usuario y/o contraseña incorrectos :) \nintente de nuevo todo desde el inicio");
	
	%>
	</h1>
	<%! String pref="Sr/Sra";
	int num=(int)(Math.random()*100);%>  
	<p> pref: <%=user %> su numero es:<%= num%> </p>
	
</body>
</html>