package JDBC_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedSt {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/j2ee";
		String uname = "root";
		String pass = "root1234";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a roll number: ");
		int roll = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a name: ");
		String name = sc.nextLine();
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		String sql = "INSERT INTO student (roll,name) VALUES (?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, roll);
		ps.setString(2, name);
		
		int r = ps.executeUpdate();
        System.out.println(r + " row(s) inserted");

		ps.close();
		con.close();
	}
		
}
