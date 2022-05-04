package com.AleCart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{

	public void /*service*/doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		int suma=num1+num2;
		
		PrintWriter out= response.getWriter();
		
		out.print("La suma da: "+suma);
		
		
		request.setAttribute("suma", suma);
		RequestDispatcher RD= request.getRequestDispatcher("SquareServlet");
		RD.forward(request, response);
		
	}
}
