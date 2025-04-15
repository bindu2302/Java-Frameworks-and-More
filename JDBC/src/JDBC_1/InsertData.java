package JDBC_1;

import java.sql.*;

public class InsertData {

	public static void main(String[] args) throws Exception {

		
		String url = "jdbc:mysql://localhost:3306/j2ee";
		String uname = "root";
		String pass = "root1234";
		String sql = "SELECT * FROM student";
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		System.out.println("Connection to DBMS");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		System.out.println("Data received: ");
		
		while(rs.next()) {
			System.out.println("Roll no: " + rs.getInt(1));
			System.out.println("Name : " + rs.getString(2));
		}

	}

}
