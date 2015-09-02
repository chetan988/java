package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class try1 {
	public static void main(String args[]) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chetan","chetan","chetan");
		
		Statement smt = con.createStatement();
		
		ResultSet rs = smt.executeQuery("Select sysdate() from dual");
		
		while(rs.next()) {
			System.out.println(rs.getDate(1));
		}
		 con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
