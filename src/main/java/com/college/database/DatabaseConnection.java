package com.college.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import io.github.cdimascio.dotenv.Dotenv;



public class DatabaseConnection {
	static Scanner in = new Scanner(System.in);
	
	//MySql Database Connection URL
	static String URL = "jdbc:mysql://localhost:3306/college";
    
	static String user;
	static String password;
	
	
	// Constructor for Initialize the above variables
	public DatabaseConnection(){
		

		
		Dotenv getenvirnmentalVariables = Dotenv.configure().load();
		
		// get the Environmental value using Key(USERNAME)
		DatabaseConnection.user = getenvirnmentalVariables.get("USERNAME");
		
		// get the Environmental value using Key(PASSWORD)
		DatabaseConnection.password = getenvirnmentalVariables.get("PASSWORD");
		
	}


	/*
	 * This method is used for getConnection to the MySql database
	 * This function return the Statement type
	 * */

	public static Statement getConnection() throws ClassNotFoundException, SQLException {


		Class.forName("com.mysql.cj.jdbc.Driver");
		Statement statement;
		Connection connection = DriverManager.getConnection(URL, user, password);
		statement = connection.createStatement();

		return statement;
        
	}
    
    

}
