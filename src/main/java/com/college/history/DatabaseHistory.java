package com.college.history;

import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

import com.college.database.DatabaseConnection;

public class DatabaseHistory{
	
	
	
	Statement history_statement = DatabaseConnection.getConnection();
	
	//  CSE HISTORY STATEMENT BEGINS
	
	public void insertCSEhistory(String name) throws SQLException {
		LocalDateTime ldt = LocalDateTime.now();
		String message = "s Detials are inserted in CSE DataBase"+" "+ldt;
		String historytxt = "INSERT INTO history VALUES ('"+name+"'"+"'"+message+"');";
		history_statement.executeUpdate(historytxt);
	}
	
	public void deleteCSEhistory(String name) throws SQLException {
		LocalDateTime ldt = LocalDateTime.now();
		String message = " was Deleted from CSE DataBase"+" "+ldt;
		
		String historytxt = "INSERT INTO history VALUES ('"+name+message+"');";
		history_statement.executeUpdate(historytxt);
	}
	
	
	public void updateCSEhistory(String txt,String name) throws SQLException {
		
		LocalDateTime ldt = LocalDateTime.now();
		
		if(txt=="mail") {
			
			String message = " is the updated  email in CSE DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+name+message+"');";
			history_statement.executeUpdate(historytxt);
		}
		else if (txt=="name") {
			String message = " updated the Name in CSE DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+name+message+"');";
			history_statement.executeUpdate(historytxt);
			
		}
		else if (txt=="phone") {
			String message = " is  updated the Phone Number in CSE DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+name+message+"');";
			history_statement.executeUpdate(historytxt);
		}
		
	}
	
	// CSE HISTORY STATEMENTS ENDS
	
	
	
	// IT HISTORY STATEMENTS ENDS
	
	public void insertIThistory(String name) throws SQLException {
		LocalDateTime ldt = LocalDateTime.now();
		String message = "s Detials are inserted in IT DataBase"+" "+ldt;
		String historytxt = "INSERT INTO history VALUES ('"+name+"'"+"'"+message+"');";
		history_statement.executeUpdate(historytxt);
	}
	
	public void deleteIThistory(String name) throws SQLException {
		LocalDateTime ldt = LocalDateTime.now();
		String message = " was Deleted in IT DataBase"+" "+ldt;
		
		String historytxt = "INSERT INTO history VALUES ('"+name+message+"');";
		history_statement.executeUpdate(historytxt);
	}
	
	public void updateIThistory(String txt,String name) throws SQLException {
		
		LocalDateTime ldt = LocalDateTime.now();
		
		if(txt=="mail") {
			
			String message = " is the updated email in IT DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+name+message+"');";
			history_statement.executeUpdate(historytxt);
		}
		else if (txt=="name") {
			String message = " updated the Name from IT DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+name+message+"');";
			history_statement.executeUpdate(historytxt);
			
		}
		else if (txt=="phone") {
			String message = " updated the Phone Number from IT DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+name+message+"');";
			history_statement.executeUpdate(historytxt);
		}
		
	}
	
	// IT HISTORY STATEMENT ENDS
	
	//EEE HISTORY STATEMENT STARTS
	
	public void insertEEEhistory(String name) throws SQLException {
		LocalDateTime ldt = LocalDateTime.now();
		String message = "s Detials are inserted in EEE DataBase"+" "+ldt;
		String historytxt = "INSERT INTO history VALUES ('"+name+"'"+"'"+message+"');";
		history_statement.executeUpdate(historytxt);
	}
	
	public void updateEEEhistory(String txt,String name) throws SQLException {
		
		LocalDateTime ldt = LocalDateTime.now();
		
		if(txt=="mail") {
			
			String message = " is the updated  email in EEE DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+name+message+"');";
			history_statement.executeUpdate(historytxt);
		}
		else if (txt=="name") {
			String message = " updated the Name from EEE DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+name+message+"');";
			history_statement.executeUpdate(historytxt);
			
		}
		else if (txt=="phone") {
			String message = " updated the Phone Number in EEE DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+name+message+"');";
			history_statement.executeUpdate(historytxt);
		}
		
	}
	
	public void deleteEEEhistory(String name) throws SQLException {
		LocalDateTime ldt = LocalDateTime.now();
		String message = " was Deleted from EEE DataBase"+" "+ldt;
		
		String historytxt = "INSERT INTO history VALUES ('"+name+message+"');";
		history_statement.executeUpdate(historytxt);
	}
	
	
	
	// EEE HISTORY STATEMENT ENDS
	
	// ECE HISTORY STATEMENT STARTS
	
	
	
	public void insertECEhistory(String name) throws SQLException {
		LocalDateTime ldt = LocalDateTime.now();
		String message = "s Detials are inserted in ECE DataBase"+" "+ldt;
		String historytxt = "INSERT INTO history VALUES ('"+name+"'"+"'"+message+"');";
		history_statement.executeUpdate(historytxt);
	}
	
	public void updateECEhistory(String txt,String name) throws SQLException {
		
		LocalDateTime ldt = LocalDateTime.now();
		
		if(txt=="mail") {
			
			String message = " is the updated email in ECE DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+name+message+"');";
			history_statement.executeUpdate(historytxt);
		}
		else if (txt=="name") {
			String message = " updated the Name from ECE DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+name+message+"');";
			history_statement.executeUpdate(historytxt);
			
		}
		else if (txt=="phone") {
			String message = " updated the Phone Number in ECE DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+name+message+"');";
			history_statement.executeUpdate(historytxt);
		}
		
	}
	
	
	public void deleteECEhistory(String name) throws SQLException {
		LocalDateTime ldt = LocalDateTime.now();
		String message = " was Deleted from ECE DataBase"+" "+ldt;
		
		String historytxt = "INSERT INTO history VALUES ('"+name+message+"');";
		history_statement.executeUpdate(historytxt);
	}
	
	// ECE HISTORY STATEMENTS ENDS
	
	

}
