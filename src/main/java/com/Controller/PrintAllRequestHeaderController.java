package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrintAllRequestHeaderController")
public class PrintAllRequestHeaderController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	Enumeration<String>headers = request.getHeaderNames();
	response.setContentType("text/html");
	
	PrintWriter out = response.getWriter(); 
	
	out.print("<html><body>");
	
	while(headers.hasMoreElements()) {
	String name = headers.nextElement();
		out.print(name +"  =>  " + request.getHeader(name)  +"<br>");
	}
	
	
	out.print("</body></html>");


	
	}
	
	
	
	

}
