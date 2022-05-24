package loginCookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestProcesing extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userName=(String) req.getParameter("user");
		String userPassword=(String) req.getParameter("password");
		PrintWriter out= resp.getWriter();
		
		/*out.println("user: "+ userName);
		out.println("password: "+ userPassword);*/
		
		
		Cookie user= new Cookie("user",userName+"");
		Cookie password= new Cookie("password",userPassword+"");
		
		
		resp.addCookie(password);
		resp.addCookie(user);
		resp.sendRedirect("LoginVerification");
	}

}
