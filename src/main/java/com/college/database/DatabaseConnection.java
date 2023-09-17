/*
* Database is connected with AWS RDS
* But one problem it creates new ip address
* If you want to access the data you just want to creatr user and allow all grants
*/









package com.college.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import io.github.cdimascio.dotenv.Dotenv;



public class DatabaseConnection {


	static Dotenv getenvirnmentalVariables = Dotenv.configure().load();
	static Scanner in = new Scanner(System.in);

	//Getting an AWS endpoint

	String awsHost = getenvirnmentalVariables.get("AWSENDPOINT");


	//Getting an AWS port
	int awsPort = 3306;
	//Getting an AWS database name
	String awsDataBaseName = "college";
	


    //AWS username
	static String user;
	//AWS password
	static String password;


	static String URL;
	
	
	// Constructor for Initialize the above variables
	public DatabaseConnection(){

		// get the Environmental value using Key(USERNAME)
		DatabaseConnection.user = getenvirnmentalVariables.get("USERNAME");
		
		// get the Environmental value using Key(PASSWORD)
		DatabaseConnection.password = getenvirnmentalVariables.get("PASSWORD");

		//AWS RDS Connection URL
		DatabaseConnection.URL = "jdbc:mysql:aws://"+awsHost+":"+awsPort+"/"+awsDataBaseName;
		
	}


	/*
	 * This method is used for getConnection to the MySql database
	 * This function return the Statement type
	 * */

	public static Statement getConnection() throws ClassNotFoundException, SQLException {



		// AWS Driver class name
		Class.forName("software.aws.rds.jdbc.mysql.Driver");
		Statement statement;
		Connection connection = DriverManager.getConnection(URL, user, password);
		statement = connection.createStatement();

		return statement;

	}
    
    

}
