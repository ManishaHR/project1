package empController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import empDao.EmpDao;
import empDto.EmpDto;

@WebServlet("/loginpg")
public class Login extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
       //		super.doGet(req, resp);
		
		String mail=req.getParameter("emailid");
		String pass=req.getParameter("pass1");
		int pwd=Integer.parseInt(pass); 
		
		EmpDao dao=new EmpDao();
		EmpDto dto=dao.login(mail);
		
		if(dto!=null)
		{
			if(dto.getPassword()==pwd)
			{
				resp.getWriter().print("WELCOME TO HOME PAGE");
//				resp.sendRedirect("http://www.facebook.com");
				
			}
			else {
				resp.getWriter().print("enter proper password");
				RequestDispatcher dispatcher=req.getRequestDispatcher("Login.html");
				dispatcher.include(req, resp);
			}
		}
		else
		{
			resp.getWriter().print("<h1>Acoount not found ,please signup<h1><a href='signUp.html'>click</a>");
		}
	}

}
