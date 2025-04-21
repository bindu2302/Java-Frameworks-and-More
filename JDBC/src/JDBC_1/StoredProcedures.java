package JDBC_1;

import java.sql.*;
import java.util.Scanner;

public class StoredProcedures {

	public static void main(String[] args) throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter account number: ");
		int acc_num = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter account holder name: ");
		String acc_name = scanner.nextLine();
		System.out.println("Enter account balance: ");
		int acc_balance = scanner.nextInt();
		
		
		String url = "jdbc:mysql://localhost:3306/j2ee";
		String uname = "root";
		String pass = "root1234";
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		String sql = "{CALL insert_data(?,?,?)}";
		
		CallableStatement cs = con.prepareCall(sql);
		cs.setInt(1, acc_num);
		cs.setString(2, acc_name);
		cs.setInt(3, acc_balance);
		
		cs.execute();
		
	}

}
