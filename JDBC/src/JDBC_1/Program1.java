package JDBC_1;

//1. Importing sql package
import java.sql.*;
public class Program1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 2. loading driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//3.establishing connection
		String url = "jdbc:mysql://localhost:3306/j2ee";
		String uname = "root";
		String pass = "root1234";
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		System.out.println("Connection established: " + con);
	}
}
