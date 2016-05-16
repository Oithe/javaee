// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class FormServlet extends HttpServlet {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
                    throws ServletException, IOException
  {
      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
	  String title = "Serve the form to the client/web browser";
      String docType =
      "<!doctype html>\n";
      out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body>\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "<form action=''method='POST'>"+
                "  <li><b>First Name</b>: "+
                "<input type='text' name='first_name'>"+"\n"+
                "  <li><b>Last Name</b>: "+
                "<input type='text' name='last_name'>"+"\n"+
                "  <li><b>Date of birth</b>: "+
                "<input type='date' name='date_of_birth'>"+"\n"+
                "  <li><b>Phone Number</b>: "+
                "<input type='text' name='phone_number'>"+"\n"+
                "  <li><b>Email</b>: "+
                "<input type='email' name='email'>"+"\n"+
                "  <li><b></b>"+
                "<input type='radio' name='gender' value='female'>Female"+"\n"+
                "  <li><b></b>"+
                "<input type='radio' name='gender' value='male'>Male"+"\n"+
                "  <li><b>Password</b>: "+
                "<input type='password' name='psw'>"+"\n"+
                "  <li><b>Confirm Password</b>: "+
                "<input type='password' name='cnf_psw'>"+"\n"+
                "  <li><b></b>"+
                "<input type='checkbox' name='bat'value='true'>Bat"+"\n"+
                "  <li><b></b>"+
                "<input type='checkbox' name='ball'value='true'>Ball"+"\n"+
                "  <li><b></b>"+
                "<input type='checkbox' name='car'value='true'>Car"+"\n"+
                "<input type='submit' name='submit' value='submit'>"+"\n"+
                "</form>" +
                "</ul>\n" +
                "</body></html>");
  }

  public void doPost(HttpServletRequest request,
                    HttpServletResponse response)
                    throws ServletException, IOException
  {
      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
    String title = "Using doPost Method to retrive Data from client and send response to client";
      String docType =
      "<!doctype html>\n";
      out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body>\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>First Name</b>: "+
                request.getParameter("first_name") + "\n" +
                "  <li><b>Last Name</b>: "+
                request.getParameter("last_name") + "\n" +
                "  <li><b>Date of birth</b>: "+
                request.getParameter("date_of_birth") + "\n" +
                "  <li><b>Phone</b>: "+
                request.getParameter("phone_number") + "\n" +
                "  <li><b>Email</b>: "+
                request.getParameter("email") + "\n" +
                "  <li><b>Gender</b>: "+
                request.getParameter("gender") + "\n" +
                "  <li><b>Password</b>: "+
                request.getParameter("psw") + "\n" +
                "  <li><b>Confirm Password</b>: "+
                request.getParameter("cnf_psw") + "\n" +
                "  <li><b>Bat</b>: "+
                request.getParameter("bat") + "\n" +
                "  <li><b>Ball</b>: "+
                request.getParameter("ball") + "\n" +
                "  <li><b>Car</b>: "+
                request.getParameter("car") + "\n" +
                "</ul>\n" +
                "</body></html>");
  }

}
