package com.AleCart;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		int suma=Integer.parseInt(request.getParameter("suma"));
		//int suma= (int)request.getAttribute("suma");
		/*int mult=(int)request.getAttribute("mult");*/
		suma*=suma;
		
		
		out.println("La raiz cuadrada de la suma de los valores es: "+suma);
		//out.println("mult:" + mult);
		
		/*int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		int suma=num1+num2;
		
		//PrintWriter out= response.getWriter();
		
		out.print("La suma da: "+suma);(Esto tambien funciona)*/
		
	}

}
