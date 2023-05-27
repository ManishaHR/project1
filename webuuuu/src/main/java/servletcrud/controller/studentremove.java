package servletcrud.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import servletcrud.dao.StudentDao;

@WebServlet("/remove")
public class studentremove extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str=req.getParameter("std_id");
		int sid=Integer.parseInt(str);
		
		
		StudentDao dao=new StudentDao();
		String s=dao.delete(sid);
		
		
		res.getWriter().print(s);
	}

}
