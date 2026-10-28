package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/t")
public class Test  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String clg=req.getParameter("clg");
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html><body>");
		writer.print("<h1> Name:"+name+"</h1>");
		writer.print("<h1> Email:"+email+"</h1>");
		writer.print("<h1> Clg:"+clg+"</h1>");
		writer.print("</html></body>");
	}
	

}
