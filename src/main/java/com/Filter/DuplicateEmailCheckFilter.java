package com.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.Bean.UserBean;
import com.Dao.UserDao;

public class DuplicateEmailCheckFilter implements Filter {
	
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		String email  = request.getParameter("email");
		UserDao userDao = new UserDao();
		UserBean user =  userDao.getUserByEmail(email);
		
		if(user == null) {
			chain.doFilter(request, response);
		}
		else {
			request.setAttribute("emailError", "Email Already Taken");
			request.getRequestDispatcher("Signup.jsp").forward(request, response);
		}
		
		
		
	}
	
	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	

}
