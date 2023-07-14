package sif.prueba.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Liquibase {
	
	public static void main(String[] args) {
		
		Liquibase liquibase = new Liquibase();
		liquibase.start();
	}
		
	private String context = null;
	
	public void start() {
		
		/*
		try {
			
			// Load SQL Server JDBC driver and establish connection.
			System.out.print("Connecting to SQL Server ... ");
			try (Connection connection = DriverManager.getConnection(DatabaseConnection.CONNECTION_URL, DatabaseConnection.USER, DatabaseConnection.PASSWORD)) {
				System.out.println("Done.");

				// Create a sample database
				System.out.print("Dropping and creating database '" + DatabaseConnection.DATABASE +"' ... ");
				try (Statement statement = connection.createStatement()) {
					String sql = "DROP DATABASE IF EXISTS certipaq;";
					statement.executeUpdate(sql);
					
					sql = "CREATE DATABASE certipaq OWNER postgres; ";
					statement.executeUpdate(sql);
				}
				System.out.println("Done.");
			}
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
		*/
		String workingDirectory = Paths.get("../sif-db/").toAbsolutePath().normalize().toString();
	//	String workingDirectory = Paths.get("../negopaq-db/").toAbsolutePath().normalize().toString();
	//	String workingDirectory = Paths.get("../negopaq-db/changelog/test/env/logistica/").toAbsolutePath().normalize().toString();
		String liquibaseJarPath = Paths.get("../sif-db/liquibase-core-3.5.5.jar").toAbsolutePath().normalize().toString();
		String postgresJarPath = Paths.get("../sif-db/postgresql-42.2.5.jar").toAbsolutePath().normalize().toString();
		//liquibaseJarPath += "liquibase-core-3.5.5.jar"; 
		System.out.println(liquibaseJarPath);
		
		List<String> commands = new ArrayList<String>();
		commands.add("java");
		commands.add("-jar");
		commands.add(liquibaseJarPath);
		commands.add(postgresJarPath);
		commands.add("--contexts=dev");
		commands.add("--changeLogFile=db-changelog.xml");
		commands.add("--url=jdbc:postgresql://localhost:5432/sif20");
		commands.add("--username=postgres");
		commands.add("--password=postgres");
		commands.add("--driver=org.postgresql.Driver");
		commands.add("update");
		
		ProcessBuilder builder = new ProcessBuilder(commands);
		builder.directory(new File(workingDirectory));
		builder.redirectErrorStream(true);
		try {
		    Process process = builder.start();
		    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		    String line;
		    while ((line = reader.readLine()) != null)
		        System.out.println("tasklist: " + line);
		  //  process.waitFor();
		    /*
		    BufferedReader reader = 
	                new BufferedReader(new InputStreamReader(process.getInputStream()));
			StringBuilder stringBuilder = new StringBuilder();
			String line = null;
			while ( (line = reader.readLine()) != null) {
				stringBuilder.append(line);
				stringBuilder.append(System.getProperty("line.separator"));
			}
			String result = builder.toString();
			System.out.println(result);
			*/
			int status = process.waitFor();
			System.out.println("Exited with status: " + status);
		} catch (IOException e) {
		    e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
	
	
}
