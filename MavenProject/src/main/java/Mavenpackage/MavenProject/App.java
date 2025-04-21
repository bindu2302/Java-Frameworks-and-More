package Mavenpackage.MavenProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	static String url = "jdbc:mysql://localhost:3306/j2ee";
	static String uname = "root";
	static String pass = "root1234";

	public static void main(String[] args) throws Exception {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Please choose operation- ");
		  System.out.println("1 - Insert data");
		  System.out.println("2 - Fetch data");
		  System.out.println("3 - Update data");
		  System.out.println("4 - Delete data");
		  int choice = sc.nextInt(); 
		  switch(choice) {
		   case 1: insertData();
		     break;
		   case 2: fetchData();
		     break;
		   case 3: updateData();
		     break;
		   case 4: deleteData();
		     break;
		   default: System.out.println("Invalid choice");
		  }
		 }
	
	public static void insertData() throws Exception 
	 {
	  Scanner sc = new Scanner(System.in);
	  Connection con = DriverManager
	    .getConnection(url, uname, pass);


	  System.out.println("Please enter roll : ");
	  int roll = sc.nextInt();
	  sc.nextLine();
	  System.out.println("Please enter name : ");
	  String name = sc.nextLine();


	  String sql = "INSERT INTO student VALUES(?, ?)";


	  PreparedStatement ps = con.prepareStatement(sql);
	  ps.setInt(1, roll);
	  ps.setString(2, name);


	  int r = ps.executeUpdate();
	  System.out.println(r + " row(s) Updated");
	 }
	
	
	public static void fetchData() throws Exception{
	
		Connection con = DriverManager.getConnection(url,uname,pass);
		String sql = "SELECT * FROM student";
				
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			int roll = rs.getInt(1);
			String name = rs.getString(2);
			System.out.println("Roll: " + roll + ", Name: " + name);
		}
		rs.close();
		con.close();
	}
	
	public static void updateData() throws Exception{
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		System.out.println("Enter roll number to update:");		
		int roll = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter new name: ");
		String name = sc.nextLine();
		
		String sql = "UPDATE student SET name = ? WHERE roll = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setInt(2, roll);
		
		int r = ps.executeUpdate();
		System.out.println(r + " row(s) updated");
		
		con.close();
	}
	
	public static void deleteData() throws Exception{
		Scanner sc = new Scanner(System.in);
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		System.out.println("Enter roll number to delete: ");
		int roll = sc.nextInt();
		
		String sql = "DELETE FROM student WHERE roll = ?";
				
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, roll);
		
		int r = ps.executeUpdate();
		System.out.println(r + " row(s) deleted");
		con.close();
	}
}