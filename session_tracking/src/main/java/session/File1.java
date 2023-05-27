package session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/file1")
public class File1 extends HttpServlet{
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	  
	 String f1name= req.getParameter("username");
	 String f1pwd= req.getParameter("pass");
	 
	 System.out.println(f1name+" "+f1pwd);
	 
//	  RequestDispatcher rd=req.getRequestDispatcher("xyz");
//	  rd.forward(req, resp);
	 
//	 resp.sendRedirect("xyz");
	 
//	 HttpSession session=req.getSession();
//	 session.setAttribute("user",f1name);
//	 session.setAttribute("pwd",f1pwd);
//	 
	// resp.sendRedirect("xyz");
	 
	 Cookie coo1=new Cookie("name",f1name);
	 Cookie coo2=new Cookie("pwd",f1pwd);
	 resp.addCookie(coo1);
	 resp.addCookie(coo2);
	 
} 
}
