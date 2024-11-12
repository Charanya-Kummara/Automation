package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	static final String DB_URL = "jdbc:mysql://localhost/";
	static final String USER = "root";
	static final String PASSWORD = "";

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//to create the database
		//open the connection
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
				Statement stmt = conn.createStatement()
				) {
			String sql = "CREATE DATABASE STUDENTS";
			stmt.executeUpdate(sql);
			System.out.println("Database created Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
