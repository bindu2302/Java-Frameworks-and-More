package JDBC_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Transaction_program {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/j2ee";
		String uname = "root";
		String pass = "root1234";
		Connection con = DriverManager.
				getConnection(url,uname,pass);
		
		con.setAutoCommit(false);
		
		String sql1 = "UPDATE bank SET balance = 20000 WHERE acc_num = 20002";
		String sql2 = "UPDATE bank SET balance = 35000 WHERE acc_num = 10001";

		Statement st = con.createStatement();
		
		try {
			st.executeUpdate(sql1);
			st.executeUpdate(sql2);
		}
		catch (Exception ex) {
			con.rollback();
			ex.printStackTrace();
		}
		con.commit();
	}

}
