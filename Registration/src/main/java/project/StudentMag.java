package project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentMag extends HttpServlet {
   public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	   res.setContentType("text/html");
	   PrintWriter out = res.getWriter();
	   
	   String id = req.getParameter("id");
	   String name = req.getParameter("name");
	   String email = req.getParameter("mail");
	   String age = req.getParameter("age");
	   
	   Object s = new Object(id,name,email,age);
	   StudentDao sd = new StudentDao();
	   
	   boolean status = false;
	   try {
		 status = sd.saveStudent(s);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	 
	   if(status) {
		   out.println("is successfull!");
	   }else {
		   out.println("failed!");
	   }   
	 //  req.setAttribute("stu", s);
//	   req.setAttribute("n", name);
//	   req.setAttribute("m", email);
//	   req.setAttribute("a", age);
	   
//	   RequestDispatcher rd = req.getRequestDispatcher("view.jsp");
//	   rd.forward(req, res);
//	   
//	   out.println(id);
//	   out.println(name);
//	   out.println(email);
//	   out.println(age);
	   }
}
