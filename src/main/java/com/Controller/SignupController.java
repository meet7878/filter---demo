package com.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupController extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("init()");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do post()");
		response.sendRedirect("Login.jsp");
	}
	
	
	@Override
	public void destroy() {
		System.out.println("destroy()");
	}
	
}
