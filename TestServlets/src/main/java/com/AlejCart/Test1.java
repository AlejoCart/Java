package com.AlejCart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test1 extends HttpServlet {
	
	/*public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num1=Integer.parseInt(req.getParameter("val1"));
//		
		PrintWriter out= resp.getWriter();
//		
	out.print("El numero ingresado es: " + num1);
//		//super.doPost(req, resp);
		
		
	}*/
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num1=Integer.parseInt(req.getParameter("val1"));
		
		
		PrintWriter out= resp.getWriter();
		
		out.print("El numero ingresado es: " + num1);
		
		//resp.sendRedirect("Test2?num1="+num1);
		
		req.getRequestDispatcher("Test2").forward(req, resp);
		/*RequestDispatcher rd=req.getRequestDispatcher("Test2");
		rd.forward(req, resp);*/
		//super.doGet(req, resp);
	}
}
