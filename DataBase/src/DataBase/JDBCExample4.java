package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample4 {
	static final String DB_URL = "jdbc:mysql://localhost/Students";
	static final String USER = "root";
	static final String PASSWORD = "";

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//to insert the data into the database
		//open the connection
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
				Statement stmt = conn.createStatement();
				) {
			//Execute a query
			System.out.println("Inserting records into the table");
			String sql = "INSERT INTO Registration VALUES(100, 'Charanya', 'Nithish', 18)";
			stmt.executeUpdate(sql);
			 sql = "INSERT INTO Registration VALUES(200, 'Pragna', 'Bharath', 19)";
			stmt.executeUpdate(sql);
			 sql = "INSERT INTO Registration VALUES(300, 'Varshitha', 'Vardhan', 20)";
			stmt.executeUpdate(sql);
			 sql = "INSERT INTO Registration VALUES(400, 'Krishna', 'Sweety', 21)";
			stmt.executeUpdate(sql);
			System.out.println("Inserted records into the table");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
