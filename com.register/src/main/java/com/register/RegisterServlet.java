package com.register;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String uname = req.getParameter("username");
		String pass = req.getParameter("password");
		
		System.out.println(uname + " " + pass);
		
		DataHandler.insertData(uname, pass);
		
		RequestDispatcher rd= req.
				getRequestDispatcher("/login.html");
		rd.forward(req, resp);
	}
}