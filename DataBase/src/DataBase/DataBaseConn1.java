package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class DataBaseConn1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost/company";
		String userName="root";
		String password="";
		
		//register with DriverManager
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, userName, password);
			//System.out.println("Database connection Established successfully");
			Statement sm=con.createStatement();
			String alterTable = "ALTER TABLE DEPARTMENT ADD COLUMN DEPT_SALARY INT";
            sm.executeUpdate(alterTable);
			ResultSet set=sm.executeQuery("SELECT DEPT_ID,DEPT_NAME,DEPT_HOURS from DEPARTMENT");
			
			while(set.next())
			{
				int dept_id=set.getInt("DEPT_ID");
				String dept_name=set.getString("DEPT_NAME");
				String dept_hours=set.getString("DEPT_HOURS");
				int dept_salary=set.getInt("DEPT_SALARY");
				System.out.println(dept_id+"||"+dept_name+"||"+dept_hours+"||"+dept_salary+"||");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		
	}

	
	}
}

	


