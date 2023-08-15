package com.college.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseConnection {
	static Scanner in = new Scanner(System.in);
	
	static String URL = "jdbc:mysql://localhost:3306/college";
    
	private static String userName;
	
	private static String password;
	
	
	
	
    
	
	
	public DatabaseConnection(){
		System.out.println("Enter your Connection username:");
        DatabaseConnection.userName=in.nextLine();
        
        System.out.println("Enter your connection password:");
		DatabaseConnection.password=in.nextLine();
		
		
	}


	public static Statement getConnection() {
		Statement statement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection(URL,userName,password);
	        statement = connection.createStatement();
			
		} catch (ClassNotFoundException | SQLException e) {

			System.out.println(e.getMessage());
		}
        return statement;
        
	}
    
    

}
