package com.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ExtendSessionController  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int time = Integer.parseInt(request.getParameter("Time"));
	    HttpSession session  = request.getSession();
	    session.setMaxInactiveInterval(time * 60);
	    response.sendRedirect("Home.jsp");
	}
	
}
