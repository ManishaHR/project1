package servletcrud.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servletcrud.dao.StudentDao;
import servletcrud.dto.StudentDto;

@WebServlet("/insert")


public class Studentcontroller extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String std_id=req.getParameter("s_id");
		int a=Integer.parseInt(std_id);
		String std_name=req.getParameter("s_name");
		String num=req.getParameter("s_num");
		long b=Long.parseLong(num);
		String gen=req.getParameter("s_gender");
		
		
		
		StudentDto dto=new StudentDto();
		dto.setStd_id(a);
		dto.setStd_name(std_name);
		dto.setNumber(b);
		dto.setGender(gen);
		
		StudentDao dao=new StudentDao();
		dao.insert(dto);
		

	}

	
}
