package ph.edu.iacademy.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ph.edu.iacademy.model.StudentBean;

public class DisplayDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//retrieve data from request sent by the servlet controller
		StudentBean student = (StudentBean)request.getAttribute("estudyante");
		
		//send the response back to user
		//setting the MIME type
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("	<head><title>Quiz Average</title></head>");
		out.print("	<body>");
		out.print("		<h2>Quiz Average Calculator</h2>");
		out.print("		<p>Student Name: <b>" + student.getName() + "</b></p>");
		out.print("		<p>Quiz 1:<b> " + student.getQuiz1() + "</b>.</p>");
		out.print("		<p>Quiz 2:<b> " + student.getQuiz2() + "</b>.</p>");
		out.print("		<p>Quiz Average:<b> " + student.getAverage() + "</b>.</p>");
		out.print("		<p>Message:<b> " + student.getMessage() + "</b>.</p>");
		out.print("		<hr/>");
		out.print("		<p>&copy; <i>iAcademy Game Changers 2022</i></p>");
		out.print("		<form action='index.html'>");
		out.print("			<p><input type='submit' value='<< GO BACK >>'/></p>");
		out.print("		</form>");
		out.print("	</body>");
		out.print("</html>");
		
		//close the out resource object
		out.close(); 
		 
	}

}
