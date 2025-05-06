package com.register;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		
		String uname = req.getParameter("username");
		String pass= req.getParameter("password");
		
		
		String dbPass = DataHandler.fetchPassword(uname);
		if(pass.equals(dbPass))
			System.out.println("Login success");
		else
			System.out.println("Login fail!");
	}
}
