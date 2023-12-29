package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("uname");
		String city = request.getParameter("city");
		String phNumber = request.getParameter("number");
		
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head> <title> Registration App </title> </head>");
		writer.println("<body>");
		writer.println("<table>  "); 
		writer.println("<tr> <th>Name</th> <th>City</th> <th>Number</th> </tr>");
		writer.println("<tr> <td>"+name+"</td> <td>"+city+"</td> <td>"+phNumber+"</td> </tr>");
		writer.println("</table>");
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close();
	}

}
