package mulesoft_assignment;

import java.sql.*;

public class Insertion {

	public static void main(String[] args) {
		try {

			Connection con = null; 		// Create Connection
			Statement stmt = null; 		//Declare Statement & Initialize with null

			con = DriverManager			//Connect to DataBase
					.getConnection("jdbc:sqlite:/C:\\Users\\mothe\\OneDrive\\Desktop\\Mulesoft\\db1.db");
			System.out.println("Database Connection Successful !!");

			stmt = con.createStatement(); // Create Statement

			String query1 = "INSERT INTO MovieTable values ('Pushpa','Sukumar','Allu Arjun','Rashmika',2021);";
			stmt.executeUpdate(query1); // Create Query-1

			String query2 = "INSERT INTO MovieTable values ('Jathiratnalu','Anudeep K V','Naveen P','Faria Abdullah',2021);";
			stmt.executeUpdate(query2); // Create Query-2

			String query3 = "INSERT INTO MovieTable values ('vakeelSab','Venu Sriram','Pavan Kalyan','Nivetha',2021);";
			stmt.executeUpdate(query3); // Create Query-3

			String query4 = "INSERT INTO MovieTable values ('SArkaru vari paata','Parasuram','Mahesh Babu','Keerthy Suresh',2022);";
			stmt.executeUpdate(query4); // Create Query-4

			String query5 = "INSERT INTO MovieTable values ('RRR','SS Rajamouli','Ramcharan','Alia Bhatt',2022);";
			stmt.executeUpdate(query5); // Create Query-5

			stmt.close();

			con.close(); 				//Close Connection
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Data  Insertion successful!!");
	}
}