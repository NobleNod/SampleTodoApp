package org.example;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;

public class ToDoApp extends HttpServlet {
	public static ArrayList<String> task = new ArrayList<>();
	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		StringBuilder html = new StringBuilder();
		html.append("<h1>Task List</h1>");
		if (task.isEmpty()==false) {
			for( String t : task) {
				html.append("<ol><li>");
				html.append(t);
				html.append("</li></ol>");
				html.append("<button onClick = \"window.location.href = '/remove' \"> -task </button>");
			}
		}
		html.append("<br><button onClick = \"window.location.href = '/add'\"> + task</button>");
		res.getWriter().write(html.toString());
	}
}	
