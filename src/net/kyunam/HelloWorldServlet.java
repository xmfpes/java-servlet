package net.kyunam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String value = req.getParameter("name");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 "
                + "Transitional//EN\">" 
                + "<html>"
                + "<head><title>Hello WWW</title></head>" + "<body>"
                + "<h1>Hello 1234</h1>" 
                + "<h1>" + value + "</h1"
                + "</body></html>");
	}
}
