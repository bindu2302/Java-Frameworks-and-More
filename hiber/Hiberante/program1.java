package Hiberante;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class program1 {

	public static void main(String[] args) throws Exception {
		
		Student st = new Student(1001,"Anil","Btm",2023);
		regStudent(st);
	}
	
	
	public static void regStudent(Student st) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/j2ee";
		String uname = "root";
		String pass = "root1234";
		
		// extracting values from obj
		int kodId = st.kodId;
		String name = st.name;
		String address = st.address;
		int yop = st.yop;
		
		
		Connection con = DriverManager.getConnection(url,uname,pass);

		String sql = "INSERT INTO student VALUES(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, kodId);
		ps.setString(2, name);
		ps.setString(3, address);
		ps.setInt(4, yop);
		
		ps.executeUpdate();
	}
}

class Student {
	int kodId;
	String name;
	String address;
	int yop;
	
	public Student(int kodId, String name, String address,int yop) {
		this.kodId = kodId;
		this.name = name;
		this.address = address;
		this.yop = yop;
	}
}
