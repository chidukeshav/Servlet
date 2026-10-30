package com.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/l")
public class login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		if(username.equals("admin")&&password.equals("admin123")) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Home.html");
			requestDispatcher.forward(req,resp);
		}
		else {
			PrintWriter writer = resp.getWriter();
				writer.print("<h1>Please enter valid user name and password");
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("Home.html");
				requestDispatcher.include(req,resp);
		}
	}

}
