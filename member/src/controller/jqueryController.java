package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class jqueryController
 */
@WebServlet({"/jquery/example01_01.do"})
public class jqueryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath().substring(+1);
		String url = "";
		System.out.println("i");
		switch (path) {
		
		case "jquery/example01_01.do": url= "example01_01"; 
			
			break;

		default:
			break;
		}
		
	if(path.substring(0, 5).equals("jquer")){
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jQuery/ch01/"+url+".html");
		dispatcher.forward(request, response);
	}else{
		RequestDispatcher dispatcher
		= request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	
	}
}
