package mulesoft_assignment;


import java.sql.*;

public class Tablecreation {
	public static void main(String[] args) {

		try {

			Connection con = null; // Create Connection
			Statement stmt = null; // Declare Statement & Initialize with null

			con = DriverManager // Connect to DataBase
					.getConnection("jdbc:sqlite:/C:\\Users\\mothe\\OneDrive\\Desktop\\Mulesoft\\db1.db");
			System.out.println("Database Connection Successful !!");

			stmt = con.createStatement(); // Create Statement

			String qry = "CREATE TABLE MovieTable " + "(MovieName TEXT NOT NULL," + " DirectorName TEXT NOT NULL, " // CreateQuery
					+ "ActorName TEXT NOT NULL, " + "ActressName TEXT NOT NULL, " + " YearOfRelease INTEGER NOT NULL)";

			stmt.executeUpdate(qry); // Execute Query

			stmt.close(); // Close Statement
			con.close(); // Close Connection
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Table Created successfully!!!!");
	}
}