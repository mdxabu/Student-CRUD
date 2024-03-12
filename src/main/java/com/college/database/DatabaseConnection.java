/*
* Database is connected with AWS RDS
* But one problem it creates new ip address
* If you want to access the data you just want to create user and allow all grants
*
* @author: mdxabu
* @since: 2023
*/

package com.college.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class DatabaseConnection {



	static Scanner in = new Scanner(System.in);

	//Getting an AWS endpoint

	String awsHost = "localhost";


	//Getting an AWS port
	int awsPort = 3306;
	//Getting an AWS database name
	String awsDataBaseName = "college";
	


    
 //AWS username stored in .env file
	static String user;

	//AWS password stored in .env file
	static String password;


	static String URL;
	
	
	// Constructor for Initialize the above variables
	public DatabaseConnection(){

		// get the Environmental value using Key(USERNAME)
		DatabaseConnection.user = System.getenv("USERNAME");
		
		// get the Environmental value using Key(PASSWORD)
		DatabaseConnection.password = System.getenv("PASSWORD");

		//AWS RDS Connection URL
		DatabaseConnection.URL = "jdbc:mysql://"+awsHost+":"+awsPort+"/"+awsDataBaseName;
		
	}


	/*
	 * This method is used for getConnection to the MySql database
	 * This function return the Statement type
	 * */

	public static Statement getConnection() throws ClassNotFoundException, SQLException {



		// AWS Driver class name
		Class.forName("com.mysql.cj.jdbc.Driver");
		Statement statement;
		Connection connection = DriverManager.getConnection(URL, user, password);
		statement = connection.createStatement();

		return statement;

	}
    
    

}
