package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample6 {
	//this class demonstrates use of update using the preparedStatement
	static final String DB_URL = "jdbc:mysql://localhost/Students";
	static final String USER = "root";
	static final String PASSWORD = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			String upd_qry = "update Registration set age = ? where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(upd_qry);
			pstmt.setInt(1,51);
			pstmt.setInt(2, 31);
			pstmt.executeUpdate();
			
			String sel_qry = "select * from Registration where id =4 ";
			ResultSet rs = pstmt.executeQuery(sel_qry);
			
			System.out.println("Displaying the updated record");
			while(rs.next()) {
				System.out.print("ID: " +rs.getInt(1));
				System.out.print(",First: " +rs.getString(2));
				System.out.print(",Last: " +rs.getString(3));
				System.out.print(",Age: " +rs.getInt(4));
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		

	}


}