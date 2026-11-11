package org.example;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RemoveToDoAppServlet extends HttpServlet {
	 @Override 
	 protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		 res.setContentType("text/html");
		 res.getWriter().write("<h1> Remove Task</h1><form action='/remove' method = 'POST' ><p> Are you want to remove task :

