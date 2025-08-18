package jdbc_table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleCRUD {
	public static void main(String[] args) throws SQLException, InterruptedException {
		
		// EStablishing database connection
		String url = "jdbc:mysql://localhost:3306/rjdbc";
		String usr = "root";
		String pass = "root@123";
		
		Connection con= DriverManager.getConnection(url, usr, pass);
		
		//SQL Query 
		String in = "INSERT INTO student VALUES(201,'Tanmay')";
		String in1 = "INSERT INTO student VALUES(200,'Raju')";
		String in2 = "Insert INTO student VALUES(203, 'Prathap')";
		String in3 = "Insert INTO student VALUES(204, 'Philip')";
		String up = "UPDATE student SET name = 'Rajesh' WHERE roll = 201"; // changing name Tanmay to Rajesh
		String del = "DELETE FROM student where roll = 200"; // Deleting data which contains roll 200
		
		//Sending SQL query to DBMS
		Statement st = con.createStatement();
		st.executeUpdate(in);
		st.executeUpdate(in1);
		st.executeUpdate(in2);
		st.executeUpdate(in3);
		System.out.println("DATA Inserted");

		st.executeUpdate(up);
		System.out.println("DATA updated");
		
		st.executeUpdate(del);
		System.out.println("DATA deleted");
	}
}
