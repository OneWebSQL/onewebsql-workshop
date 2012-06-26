package com.onewebsql.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = resp.getWriter();
		writePageHeader(writer);
		
		writer.println("<div class='stacktrace'>");
		writer.println("<pre>");
		Object object = req.getAttribute("javax.servlet.error.exception");
		if (object instanceof Throwable) {
			Throwable throwable = (Throwable) object;
			throwable.printStackTrace(writer);
		}
		writer.println("</pre>");
		writer.println("</div>");
		
		writer.println("<a href='/onewebsql/onewebsql/'>Home</a>");
		
		writePageFooter(writer);
		writer.close();
	}
	

	private void writePageHeader(PrintWriter writer) {
		writer.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		writer.println("<html>");
		writer.println("<link rel=\"icon\" type=\"image/png\" href=\"/onewebsql/favicon.png\" />");
		writer.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"/onewebsql/reset.css\" />");
		writer.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"/onewebsql/demo.css\" />");
		writer.println("<head><title>OneWeb SQL Demo</title></html>");
		writer.println("<body>");
		writer.println("<h1><a href=\"/onewebsql/onewebsql/\"><img alt=\"OneWeb SQL\" src=\"/onewebsql/onewebsql_logo.png\" width=\"40%\"></a></h1>");
		writer.println("<h2 class=\"gray\">Demo application</h2>");
	}
	
	private void writePageFooter(PrintWriter writer) {
		writer.println("</body>");
		writer.println("</html>");
	}

}
