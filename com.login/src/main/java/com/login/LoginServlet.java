package com.login;


import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



//@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	    String dbUname = "virat";
	    String dbPass = "1818";
	    
	    String webUname = request.getParameter("username");
	    String webPass = request.getParameter("password");
	    
	    if(dbUname.equals(webUname) && dbPass.equals(webPass)) {
	        response.getWriter().println("Login success");
	    } else {
	        response.getWriter().println("Login fail");
	    }
	}

}
