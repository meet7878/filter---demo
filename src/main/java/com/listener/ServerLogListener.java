package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServerLogListener implements ServletContextListener {
	
	public void contextDestroyed(ServletContextEvent sc) {
		System.out.println("serverShutdown...");
		
	}
	
	public void contextInitialized(ServletContextEvent sc) {
		System.out.println("Server started..");
	}

}
