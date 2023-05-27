package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/xyz")
public class File2 extends HttpServlet{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
//	   String f2name= req.getParameter("username");
//	   String f2pwd= req.getParameter("pass");
//	   
//	   System.out.println(f2name+" "+f2pwd);
	   
//	String s1=(String) req.getSession().getAttribute("user");
//	String s2=(String) req.getSession().getAttribute("pwd");
//	
//	System.out.println(s1+" "+s2);
//		 
	   
	  Cookie[] c1= req.getCookies();
	  for(Cookie o:c1)
	  {
		  System.out.println(o.getValue());
	  }
	   
}
}
