package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnectivity {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//Declare a variable with URL of database
		String url="jdbc:mysql://localhost/capgemini";
		String userName="root";
		String password="";
		
		//register with DriverManager
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, userName, password);
			//System.out.println("Database connection Established successfully");
			Statement sm=con.createStatement();
			ResultSet set=sm.executeQuery("SELECT EMP_ID,EMP_NAME,EMP_CITY from EMPLOYEE");
			
			while(set.next())
			{
				int emp_id=set.getInt("EMP_ID");
				String emp_name=set.getString("EMP_NAME");
				String emp_city=set.getString("EMP_CITY");
				System.out.println(emp_id+"||"+emp_name+"||"+emp_city+"||");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
