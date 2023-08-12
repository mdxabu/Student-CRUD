package com.college.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
	
	static String URL = "jdbc:mysql://localhost:3306/college";
    static String userName = "root";
    static String password = "@bdul1ah";
    
	
	
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
