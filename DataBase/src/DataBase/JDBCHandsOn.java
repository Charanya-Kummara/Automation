package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCHandsOn {
	static final String DB_URL = "jdbc:mysql://localhost/institute";
	static final String USER = "root";
	static final String PASSWORD = "";
//	static final String QUERY = "SELECT training_id, training_name, training_duration, training_date from the Training";

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
				Statement stmt1 = conn.createStatement())

		{

			// CREATING THE DATABASE
			
			/* String sql = "CREATE DATABASE INSTITUTE"; stmt1.executeUpdate(sql);
			  System.out.println("Database is Created!"); 
			 System.out.println("----------------------------------------------------------------")*/
			 

			// CREATING THE TABLE//EXECUTE THE QUERY
			
			  /*String sql =
			  "CREATE TABLE TRAINING (training_id INTEGER not NULL, training_name VARCHAR(255), training_duration VARCHAR(255), training_date DATE, PRIMARY KEY (training_id))";
			  stmt1.executeUpdate(sql); System.out.println("Table is Created!");
			  System.out.println( "----------------------------------------------------------------")*/
			 

			// INSERTING THE DATABINTO THE TABLE
			
			  /*String sql =(String)"INSERT INTO TRAINING VALUES(1, 'Java Foundation', '3 months', '2024-10-18')";
			  stmt1.executeUpdate(sql); 
			  sql ="INSERT INTO TRAINING VALUES(2, 'Selenium Java', '2 months', '2024-10-24')";
			  stmt1.executeUpdate(sql); 
			  sql = "INSERT INTO TRAINING VALUES(3, 'Java Full Stack', '1.5 months', '2024-11-30' )";
			  stmt1.executeUpdate(sql); 
			  sql ="INSERT INTO TRAINING VALUES(4, 'Big Data', '2.5 months', '2024-11-26')";
			  stmt1.executeUpdate(sql);
			  System.out.println("Inserted records into the table"); 
			  System.out.println( "----------------------------------------------------------------");*/
			 

			// UPDATING THE TABLE WITH NEW COLUMN
			
			 /* String altertable = "ALTER TABLE training ADD COLUMN train_location VARCHAR(255)";
			  stmt1.executeUpdate(altertable); System.out.println("Updated the table");
			  System.out.println( "----------------------------------------------------------------");*/
			

			// INSERTING THE NEW COLUMN WITH THE VALUES
			  String sql = "INSERT INTO training(training_location) VALUES('Pune')";
			  stmt1.executeUpdate(sql);
			  System.out.println("Inserted values into new column ");
			   System.out.println("----------------------------------------------------------------");
			  
			 
			// UPDATING THE RECORD
			/*String sql = "UPDATE TRAINING SET training_duration = '3 months' WHERE training_name ='Big Data'";
			stmt1.executeUpdate(sql);
			 ResultSet rs1 = stmt1.executeQuery(QUERY);
			while(rs1.next()) {
					//Display values
					System.out.print("training_id: " +rs1.getInt("training_id"));
					System.out.print(",training_name: " +rs1.getString("training_name"));
					System.out.print(",training_duration: " +rs1.getString("training_duration"));
					System.out.print(",training_date: " +rs1.getDate("training_date"));	
				System.out.print(",training_location: " +rs1.getString("training_location"));
//				}*/
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}
}
