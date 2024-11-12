package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2 {
	static final String DB_URL = "jdbc:mysql://localhost/";
	static final String USER = "root";
	static final String PASSWORD = "";

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//to show all the databases in the server
		//Open the connections
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);) {
			System.out.println("Connected database Successfully");
			Statement stmt = conn.createStatement();
			ResultSet rs1 = stmt.executeQuery("SHOW DATABASES");
			System.out.println("DATABASES");
			System.out.println("--------------------------------------------------------------------");
			while(rs1.next()) {
				System.out.println(rs1.getString(1));
			}
			System.out.println("------------------------------------------------------------------------");		
		}

	}

}
