package jettyExample;

import java.io.IOException;
import java.io.PrintWriter;

import javaServletExample.JsonWrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import com.google.gson.JsonObject;

public class JettyHandler extends AbstractHandler{


	
	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Here I go again on my own");
		System.out.println(response.toString());
		JsonWrapper jsonWrapper = new JsonWrapper();
		
		JsonObject jsonOutPut = jsonWrapper.createValidJsonResponse(request.getAttribute("name").toString());
		 	
		PrintWriter writer = response.getWriter();
		response.setContentType("application/json");
		writer.print(jsonOutPut);
		writer.flush();
		
	}

}
