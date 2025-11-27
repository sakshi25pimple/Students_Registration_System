package project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AccessAll extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		StudentDao sd = new StudentDao();
		
		List<Object> slist = null;
		
		
		try {
			slist=sd.accessAll();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		req.setAttribute("listcall", slist);
		
		RequestDispatcher rd = req.getRequestDispatcher("access.jsp");
		rd.forward(req, res);
		
		
		
		
		
	}

}
