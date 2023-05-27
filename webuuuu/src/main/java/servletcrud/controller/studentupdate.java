package servletcrud.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servletcrud.dao.StudentDao;

@WebServlet("/update")
public class studentupdate extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String sid=req.getParameter("s_id");
		int id=Integer.parseInt(sid);
		String snum=req.getParameter("s_num");
		long num=Long.parseLong(snum);
		
		StudentDao studentdao=new StudentDao();
		studentdao.update(id,num);
		
		
	}
}
