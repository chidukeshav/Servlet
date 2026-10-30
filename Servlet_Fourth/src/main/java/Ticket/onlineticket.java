package Ticket;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/o")
public class onlineticket extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("passname");
		String sourse = req.getParameter("sourse");
		String destination = req.getParameter("destination");
		int noftick = Integer.parseInt(req.getParameter("numberofticket"));
		String tickettype = req.getParameter("tickettype");
		
		
		PrintWriter writer = resp.getWriter();
		writer.print("<h1>Name"+name+"</h1>");
		writer.print("<h1>Sourse"+sourse+"</h1>");
		writer.print("<h1>Destination"+destination+"</h1>");
		writer.print("<h1>Noticket"+noftick+"</h1>");
		writer.print("<h1>ticketType"+tickettype+"</h1>");
		
		if(tickettype.equals("Ac")) {
			writer.print("<h1>Total:"+900*noftick+"</h1>");
		}else if(tickettype.equals("NONAC")){
			writer.print("<h1>Total:"+500*noftick+"</h1>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("passenger.html");
			requestDispatcher.include(req,resp);
			
		}
		
		
		
		
	}

}
