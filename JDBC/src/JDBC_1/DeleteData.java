package JDBC_1;

import java.sql.*;

public class DeleteData {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/j2ee";
		String uname = "root";
		String pass = "root1234";
		Connection con = DriverManager.getConnection(url,uname,pass);
		String sql = "DELETE FROM student WHERE roll = 3";
				
		Statement st = con.createStatement();
		int r = st.executeUpdate(sql);
		System.out.println(r + "rows deleted");
	}

}
