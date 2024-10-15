package namo.dhiraj;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Krish")
public class UserRegister extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String city = req.getParameter("city");
		String gender = req.getParameter("gender");

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head><title>Form Data</title>");
		out.println("<link rel='stylesheet' href='style.css'></head>");
		out.println("<body>");
		out.println("<div class='result-container'>");
		out.println("<h2>Submitted Form Data</h2>");
		out.println("<div class='output-group'><label>Name:</label><p>" + name + "</p></div>");
		out.println("<div class='output-group'><label>Email:</label><p>" + email + "</p></div>");
		out.println("<div class='output-group'><label>City:</label><p>" + city + "</p></div>");
		out.println("<div class='output-group'><label>Gender:</label><p>" + gender + "</p></div>");

		out.println("</body></html>");
	}
}
