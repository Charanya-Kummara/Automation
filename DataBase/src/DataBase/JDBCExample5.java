package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample5 {
	static final String DB_URL = "jdbc:mysql://localhost/students";
	static final String USER = "root";
	static final String PASSWORD = "";
	static final String QUERY = "SELECT id, first, last, age from the Registration";
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//Updating the database records
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
				Statement stmt = conn.createStatement();
			){
			String sql = "UPDATE Registration " + "SET age = 30 WHERE id in (2,3)";
			stmt.executeUpdate(sql);
			ResultSet rs = stmt.executeQuery(QUERY);
			while(rs.next()) {
				//Display values
				System.out.print("ID: " +rs.getInt("id"));
				System.out.print(",Age: " +rs.getInt("age"));
				System.out.print(",First: " +rs.getString("first"));
				System.out.print(",Last: " +rs.getString("last"));	
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
