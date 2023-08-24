package ph.edu.iacademy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ph.edu.iacademy.model.StudentBean;

public class ComputeAverageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//perform form data extraction from request
   		String name = request.getParameter("name");
   		int quiz1 = Integer.parseInt(request.getParameter("quiz1"));
   		int quiz2 = Integer.parseInt(request.getParameter("quiz2"));
   		
   		StudentBean student = new StudentBean(name, quiz1, quiz2);
   		student.computeAverage();
   		student.determineMessage();
   		
   		//perform data object binding
   		request.setAttribute("estudyante", student);
   		
   		//perform request dispatching to view (second servlet)
   		RequestDispatcher dispatcher = request.getRequestDispatcher("display.html"); //creating a dispatcher object
   		dispatcher.forward(request, response);
	}

}
