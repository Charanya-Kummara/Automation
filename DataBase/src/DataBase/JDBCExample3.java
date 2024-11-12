package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample3 {
	static final String DB_URL = "jdbc:mysql://localhost/Students";
	static final String USER = "root";
	static final String PASSWORD = "";

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//to fill the details
		//open a connection
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
				Statement stmt = conn.createStatement();
				) {
			String sql = "CREATE TABLE REGISTRATION " + "(id INTEGER not NULL, " + "first VARCHAR(255), " + "last VARCHAR(255), " + "age INTEGER, " + "PRIMARY KEY (id))";
			
			stmt.executeUpdate(sql);
			System.out.println("Create table in the given database");
	} catch (SQLException e) {
		e.printStackTrace();
	}

}
}
