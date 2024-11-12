package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEXample1 {
	static final String DB_URL = "jdbc:mysql://localhost/Students";
	static final String USER = "root";
	static final String PASSWORD = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to connect the database which is to be update
		System.out.println("Connecting to the selected database");
		//open the connection
				try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);) {
					System.out.println("Connected database Successfully");
				} catch (SQLException e) {
					e.printStackTrace();
				}

	}

}
