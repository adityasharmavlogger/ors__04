package in.co.rays.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SecondServletForward")
public class SecondServletForward extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fname = req.getParameter("firstName");
		String lname = req.getParameter("lastname");
		
		
		System.out.println("SecondServletForward Get");
		System.out.println(fname);
		System.out.println(lname);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String fname = req.getParameter("firstName");
		String lname = req.getParameter("lastname");
		
		System.out.println("SecondServletForward post");
		System.out.println(fname);
		System.out.println(lname);
	}

}
