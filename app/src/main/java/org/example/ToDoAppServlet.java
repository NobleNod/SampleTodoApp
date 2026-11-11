package org.example;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;

public class ToDoAppServlet extends HttpServlet {
	public static ArrayList<String> task = new ArrayList<>();
	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		StringBuilder html = new StringBuilder();
		html.append("<h1>Task List</h1>");
		if (task.isEmpty()==false) {
			for(int i=0;i<task.size();i++) {
				html.append(i+1);
				html.append(". ");
				html.append(task.get(i));
				html.append("          ");
				html.append("<button onClick = \"window.location.href = '/remove?t=");
				html.append(task.get(i));
				html.append("'\"> - task </button>");
				html.append("<br>");
			}
		}
		html.append("<br><button onClick = \"window.location.href = '/add'\"> + task </button>");
		res.getWriter().write(html.toString());
	}
}	
