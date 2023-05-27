package servletcrud.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servletcrud.dao.StudentDao;
import servletcrud.dto.StudentDto;


@WebServlet("/fetch")
public class StudentFetch extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		       String sid=req.getParameter("sid");
		      int id= Integer.parseInt(sid);
		      
		      StudentDao dao=new StudentDao();
		    StudentDto s=dao.fetch(id);
		    
		    res.getWriter().print(s);
		
	}

}
