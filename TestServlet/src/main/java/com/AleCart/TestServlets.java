package com.AleCart;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlets extends HttpServlet {

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			int num1=Integer.parseInt(req.getParameter("val1"));
			
			System.out.println("El numero ingresado es: " + num1);
			//super.doPost(req, resp);
		}
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			int num1=Integer.parseInt(req.getParameter("val1"));
			
			System.out.println("El numero ingresado es: " + num1);
			//super.doGet(req, resp);
		}
	
}
