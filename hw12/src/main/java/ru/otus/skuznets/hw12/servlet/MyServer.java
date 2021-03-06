package ru.otus.skuznets.hw12.servlet;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;


public class MyServer {
	
	private static String PUBLIC_HTML = "html";
	
	public static void startServer() throws Exception {
		ResourceHandler handler = new ResourceHandler();
		handler.setResourceBase(PUBLIC_HTML);
		
		ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);

		context.addServlet(LoginServlet.class, "/login");
		context.addServlet(CacheServlet.class, "/dataFromCache");
		
		Server server = new Server(8090);
		server.setHandler(new HandlerList(handler, context));
		
		server.start();
		server.join();
		
	}

}
