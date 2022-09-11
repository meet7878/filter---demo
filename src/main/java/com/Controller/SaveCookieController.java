package com.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveCookieController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cName = request.getParameter("cName");
		String cValue = request.getParameter("cValue");
		
		Cookie c = new Cookie(cName,cValue);
		c.setMaxAge(60*60);
		
		response.addCookie(c);
		response.sendRedirect("Login.jsp");
		
		
	}

}
