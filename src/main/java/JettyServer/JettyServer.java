package JettyServer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;

public class JettyServer {

	public static void main(String[] args) throws Exception {
		Server server = new Server(8080);
		server.start();
		server.join();
		server.setHandler(new JettyHandler());
	}
}
