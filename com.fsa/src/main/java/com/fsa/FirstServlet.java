package com.fsa;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
		
		@Override
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
			
			String name = req.getParameter("name");
			String gen = req.getParameter("gen");
			String country = req.getParameter("country");
			String message = req.getParameter("message");
			String newsletter = req.getParameter("newsletter");

			
			 PrintWriter writer = res.getWriter();
			 
			 writer.println("Name : " + name);
			 writer.println("Gender : " + gen);
			 writer.println("Country : " + country);
			 writer.println("Message : " + message);
			 writer.println("Newsletter : "+ newsletter);
			
		}
}
