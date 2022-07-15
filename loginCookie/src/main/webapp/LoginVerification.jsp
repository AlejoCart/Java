<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" errorPage="error.jsp"%>
    
    
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
	out.println();
	/*try{
		int error=9/0;
	}catch(Exception e){
		out.print("Error: "+e);
	}*/
	
	int error_2=9/0;
	
	%>
	</h1>
	<%! String pref="Sr/Sra";
	int num=(int)(Math.random()*100);%>  
	<p> pref: <%=user %> su nu4mero es:<%= num%> </p>
	<%@ include file="footer.jsp" %>
</body>
</html>