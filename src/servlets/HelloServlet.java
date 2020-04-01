package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
//This annotation means that this servlet handles requests with "/helloServlet" tag
//For example, index.jsp has a form with action = "helloServlet" which means when that form is submitted
//This servlet processes it
@WebServlet("/helloServlet") 
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    //doPost processes post requests
    //Takes in a request and a response
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("yourName");
		PrintWriter pw = response.getWriter();
		pw.write("<h1>Input name was: "+name+"</h1>");
		pw.close();
	}

}
