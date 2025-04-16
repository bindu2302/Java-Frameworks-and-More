package JDBC_1;

import java.sql.*;

public class UpdateData {

	public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/j2ee";
        String uname = "root";
        String pass = "root1234";

        Connection con = DriverManager.getConnection(url, uname, pass);
        
        // Use correct column name - assuming it's rollno
        String sql = "UPDATE student SET name = 'Devanshu' WHERE roll = 1";

        Statement st = con.createStatement();
        int r = st.executeUpdate(sql);
        System.out.println(r + " row(s) updated");

        con.close();
	}

}
