package empController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import empDao.EmpDao;
import empDto.EmpDto;

@WebServlet("/signup")
public class Signup extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
       //  super.doPost(req, resp);
		
		String name=req.getParameter("name");
		String mail=req.getParameter("mail");
		String pass=req.getParameter("pass");
		  int pwd1=Integer.parseInt(pass);
		  
		 EmpDto dto=new EmpDto();
		 dto.setName(name);
		 dto.setEmailid(mail);
		 dto.setPassword(pwd1);
		 
		 EmpDao dao=new EmpDao();
		 String msg=dao.signUp(dto);
		 
		 resp.getWriter().print(msg);
		
	}
	

}
