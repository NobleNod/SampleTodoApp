package org.example;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RemoveToDoAppServlet extends HttpServlet {
	 @Override 
	 protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		 String t = req.getParameter("t");
		 res.setContentType("text/html");
		 res.getWriter().write("<h1> Remove Task</h1><h2> Are you want to remove task ( "+ t+" ) ?</h2><form action='/remove' method='POST' ><input type='hidden' name = 'task' value = '"+t+"'>"+"<button type='submit'>Submit</button></form><button onClick = \"window.location.href='/app'\">Go Back</button>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String ta = req.getParameter("task");
		ToDoAppServlet.task.remove(ta);
		res.sendRedirect("/app");
	}
}


