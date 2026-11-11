package org.example;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddToDoAppServlet extends HttpServlet{
	@Override protected void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException{
		res.setContentType("text/html");
		res.getWriter().write("<h1> Enter a Task Name </h1> <form action = '/add' method='POST'><label> Task Name :</label><input type = 'text' name='task'> < button type = 'submit'>Submit</button><button onClick=\"window.location.href='/app'\">Go Back</button></form>");
	}

	@Override protected void doPost (HttpServletRequest req, HttpServletResponse res) throws IOException{
		String t = req.getParameter("task");
		ToDoApp.task.add(t);
		res.sendRedirect("/app");
	}
}
