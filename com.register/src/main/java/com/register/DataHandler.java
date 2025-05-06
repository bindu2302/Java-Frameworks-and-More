package com.register;

import java.sql.*;
public class DataHandler {

	public static void insertData(String uname, String pass) {
		
		// DB Configuration
		String username="root";
		String password ="root1234";
		String url = "jdbc:mysql://localhost:3306/servlet";
		
		String sql = "INSERT INTO customer VALUES(?,?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =
					DriverManager.getConnection(url,username,password);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,uname);
			ps.setString(2, pass);
			ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static String fetchPassword(String uname) {
		// DB Configuration
				String username="root";
				String password ="root1234";
				String url = "jdbc:mysql://localhost:3306/servlet";
				
				String sql = "SELECT password from customer WHERE username= ?";
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =
							DriverManager.getConnection(url,username,password);
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1,uname);
					ResultSet rs = ps.executeQuery();
					rs.next();
					String dbPass = rs.getString(1);
					
					return dbPass;
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				return "";
	}
}
