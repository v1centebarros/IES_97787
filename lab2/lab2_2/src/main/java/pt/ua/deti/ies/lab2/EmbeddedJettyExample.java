package pt.ua.deti.ies.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;

public class EmbeddedJettyExample {

	public static void main(String[] args) throws Exception {

		Server server = new Server(8680);

		ServletHandler servletHandler = new ServletHandler();
		server.setHandler(servletHandler);

		servletHandler.addServletWithMapping(HelloServlet.class, "/");
		servletHandler.addServletWithMapping(GreetingsServlet.class, "/greetings");

		server.start();
		server.join();

	}

	public static class HelloServlet extends HttpServlet
	{
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			response.setContentType("text/html");
			response.setStatus(HttpServletResponse.SC_OK);
			response.getWriter().println("<h1>New Hello Simple Servlet</h1>");
		}
	}

	public static class GreetingsServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			response.setContentType("text/html");
			response.setStatus(HttpServletResponse.SC_OK);

			PrintWriter out = response.getWriter();
			String name = request.getParameter("name");
			if (name != null) {
				out.println("<h1>Welcome " + name + " nice to see you!");
			} else {
				out.println("<h1>No name provided</h1>");

		}
	}

}
}