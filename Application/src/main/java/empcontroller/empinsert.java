package empcontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import empdao.empDao;
import empdto.empDto;
@WebServlet("/insert")
public class empinsert extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		String s =req.getParameter("eid");
		int eid =Integer.parseInt(s);
		String ename =req.getParameter("ename");
		String email =req.getParameter("mail");
		String pwd =req.getParameter("pass");
		String cpwd =req.getParameter("cpass");
		String dob =req.getParameter("dob");
		String country =req.getParameter("con");
		String gender =req.getParameter("gen");
		
		empDto dto=new empDto();
		dto.setEid(eid);
		dto.setEname(ename);
		dto.setMail(email);
		dto.setPassword(s);
		dto.setConfirmpassword(s);
		dto.setCountry(country);
		dto.setDob(dob);
		dto.setGender(gender);
		
		empDao dao=new empDao();
	String s1=	dao.insert(dto);
	resp.getWriter().print(s1);		
	}

}
