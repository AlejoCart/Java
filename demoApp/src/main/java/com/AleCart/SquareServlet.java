package com.AleCart;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
		PrintWriter out= response.getWriter();
		
		out.println("Conexion con el servlet Square");
		int suma= (int)request.getAttribute("suma");
		int mult=(int)request.getAttribute("mult");
		suma*=suma;
		
		out.println("La raiz cuadrada de la suma de los valores es: "+suma);
		out.println("mult:" + mult);
		
		/*int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		int suma=num1+num2;
		
		//PrintWriter out= response.getWriter();
		
		out.print("La suma da: "+suma);(Esto tambien funciona)*/
		
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out= response.getWriter();
		
		out.println("Conexion con el servlet Square");
		int suma=0;
		//int suma=Integer.parseInt(request.getParameter("suma"));
		//int suma= (int)request.getAttribute("suma");
		/*int mult=(int)request.getAttribute("mult");*/
		//suma*=suma;
		
		//Session
		/*HttpSession sesion=request.getSession();
		int suma=(int)sesion.getAttribute("suma");*/
		//sesion.removeAttribute("suma"); elimina el valor de la sesion
		
		//Cookies
		
		Cookie cookies[]=request.getCookies();
		
		for(Cookie c: cookies) {
			if(c.getName().equals("suma")) suma=Integer.parseInt(c.getValue()); 
				
		}
		
		out.println("La raiz cuadrada de la suma de los valores es: "+suma*suma);
		//out.println("mult:" + mult);
		
		/*int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		int suma=num1+num2;
		
		//PrintWriter out= response.getWriter();
		
		out.print("La suma da: "+suma);(Esto tambien funciona)*/
		
	}

}
