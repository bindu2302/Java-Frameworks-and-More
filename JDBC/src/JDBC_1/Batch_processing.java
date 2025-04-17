package JDBC_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Batch_processing {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/j2ee";
		String uname = "root";
		String pass = "root1234";
		Connection con = DriverManager.
				getConnection(url,uname,pass);
		
		String sql = "INSERT INTO student VALUES(?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Please enter roll: ");
			int roll = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter a name: ");
			String name = sc.nextLine();
			
			ps.setInt(1,roll);
			ps.setString(2, name);
			ps.addBatch();
			
			System.out.println("Enter 'exit' to quit, anything else to continue");
			String status = sc.next();
			if(status.equals("exit"))
				break;
		}
		

		ps.executeBatch();

	}

}
