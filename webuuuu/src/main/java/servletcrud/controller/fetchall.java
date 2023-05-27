package servletcrud.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servletcrud.dao.StudentDao;
import servletcrud.dto.StudentDto;

@WebServlet("/fetchall")
public class fetchall extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		StudentDao d6=new StudentDao();
		List<StudentDto>l1=d6.fetchall();
		 req.setAttribute("studentlist", l1);
		 
		 RequestDispatcher rd=req.getRequestDispatcher("downlaod.jsp");
		 rd.forward(req, resp);
		 
//		for(StudentDto d:l1) {
//			resp.getWriter().print(d.getStd_id());
//		}
//		
	}
	

}
