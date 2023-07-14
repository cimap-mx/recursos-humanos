package sif.prueba.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseConnection {

	public static final String CONNECTION_URL = "jdbc:postgresql://localhost:5432/";
	
	public static final String USER = "postgres";
	
	public static final String PASSWORD = "postgres";
	
	public static final String DATABASE = "bd_sif20";
	
	public static void main(String args[]) {
		DatabaseConnection databaseConnection = new DatabaseConnection();
		databaseConnection.crearBaseDatos();
	}
	
	public void crearBaseDatos() {
		
		try {
			
			// Load SQL Server JDBC driver and establish connection.
			System.out.print("Connecting to Postgres  ... ");
			try (Connection connection = DriverManager.getConnection(DatabaseConnection.CONNECTION_URL, DatabaseConnection.USER, DatabaseConnection.PASSWORD)) {
				System.out.println("Done.");

				// Create a sample database
				System.out.print("Dropping and creating database '" + DatabaseConnection.DATABASE +"' ... ");
				try (Statement statement = connection.createStatement()) {
					String sql = "DROP DATABASE IF EXISTS " + DATABASE + ";";
					statement.executeUpdate(sql);
					
					sql = "CREATE DATABASE " + DATABASE +" OWNER postgres; ";
					statement.executeUpdate(sql);
				}
				System.out.println("Done.");
			}
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
