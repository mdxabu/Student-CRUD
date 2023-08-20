package com.college.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class DatabaseConnection {
	static Scanner in = new Scanner(System.in);
	
	//Mysql Database Connection URL
	static String URL = "jdbc:mysql://localhost:3306/college";
    
	static String user;
	static String password;

	public DatabaseConnection(){
		
		System.out.println("Enter the Mysql Connection username:");// like: root (or) anything
		DatabaseConnection.user = in.nextLine();
		System.out.println("Enter the Mysql Connection password:");// your password
		DatabaseConnection.password = in.nextLine();
		
	}


	/*
	 * This nethod is used for getconnection to the mysql database
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
