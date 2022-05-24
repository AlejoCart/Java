package loginCookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginVerification extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String user="";
		String password="";
		String sufijo="";
		Cookie cookies[]=req.getCookies();
		PrintWriter out=resp.getWriter();
		
		//ServletContext ctx= req.getServletContext();
		//sufijo=ctx.getInitParameter("sufijo");
		ServletConfig cg= getServletConfig();
		sufijo=cg.getInitParameter("sufijo");
		
		
		for(Cookie c:cookies ) {
			if(c.getName().equals("user")) user=c.getValue();
			else if(c.getName().equals("password")) password=c.getValue();
		}
		//out.println("user:"+ user);
		//out.println("password:"+ password);
		if(user.equals("pepe") && password.equals("1235")) out.print("Bienvenido "+sufijo+" "+ user);
		
		else if(user.equals("") || password.equals("")) out.print("algo salio mal :$");
		else out.print("Usuario y/o contraseña incorrectos :) \nintente de nuevo todo desde el inicio");
		
		
	}

}
