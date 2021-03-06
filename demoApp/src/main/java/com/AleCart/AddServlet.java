package com.AleCart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{

	public void /*service*/doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		int suma=num1+num2;
		int mult=9;
		
		PrintWriter out= response.getWriter();
		
		out.print("La suma da: "+suma);
		
		
		request.setAttribute("suma", suma);
		request.setAttribute("mult", mult);
		RequestDispatcher RD= request.getRequestDispatcher("SquareServlet");
		RD.forward(request, response);
		
	}
	
	public void /*service*/doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		int suma=num1+num2;
		int mult=9;
		
		PrintWriter out= response.getWriter();
		
		out.print("La suma da: "+suma);
		
		/*request.setAttribute("suma", suma);
		request.setAttribute("mult", mult);
		RequestDispatcher RD= request.getRequestDispatcher("SquareServlet");
		RD.forward(request, response);*/
		
		//URL MODIFICATION
		//response.sendRedirect("SquareServlet?suma="+suma);
		
		
		//Session
//		HttpSession sesion=request.getSession();
//		sesion.setAttribute("suma", suma);
//		response.sendRedirect("SquareServlet");
		
		
		//Cookies
		Cookie cookie= new Cookie("suma",suma+"");
		response.addCookie(cookie);
		response.sendRedirect("SquareServlet");
		
	}
}
