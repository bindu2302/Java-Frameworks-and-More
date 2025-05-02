package com.login;


import java.io.IOException;
import java.time.LocalDate;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



//@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//	    String dbUname = "virat";
//	    String dbPass = "1818";
		
	    String webUname = request.getParameter("username");
	    String webPass = request.getParameter("password");
	    
	    LocalDate time = LocalDate.now();
	    request.setAttribute("time", time);
	    request.setAttribute("username", webUname);
	    RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
	    rd.forward(request, response);
	    
	    
//	    if(dbUname.equals(webUname) && dbPass.equals(webPass)) {
////	    	RequestDispatcher rd = request.getRequestDispatcher("/success.html");
////	    	rd.forward(request, response);
	    // or
//	    	response.sendRedirect("success.html");
//	    } else {
////	    	RequestDispatcher rd = request.getRequestDispatcher("/fail.html");
////	    	rd.forward(request, response);
	    // or
//	    	response.sendRedirect("fail.html");
//	    	}
	}

}
