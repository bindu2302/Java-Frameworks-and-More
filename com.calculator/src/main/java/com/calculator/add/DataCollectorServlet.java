package com.calculator.add;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/collect")
public class DataCollectorServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		String n1 = req.getParameter("num1");
		String n2 = req.getParameter("num2");
		
		req.setAttribute("num1",n1);
		req.setAttribute("num2", n2);
		
		
		RequestDispatcher rd = req.getRequestDispatcher("add");
		rd.forward(req, resp);
	}

}
