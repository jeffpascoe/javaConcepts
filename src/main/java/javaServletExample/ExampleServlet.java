package javaServletExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonObject;

public class ExampleServlet extends HttpServlet {
	
	public void init(ServletConfig servletConfig) {
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		JsonWrapper jsonWrapper = new JsonWrapper();
		JsonObject jsonObjectResponse = jsonWrapper.createValidJsonResponse(request.getAttribute("name").toString());
		
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		out.print(jsonObjectResponse);
		out.flush();
	}

}
