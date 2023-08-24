/*
 * This Class is Mainly used for Saving all the detials from the departments
 * It can save the Inserted Data,Upadated data & Deleted Data
 * It stores with Local time and Date
 */






package com.college.history;

import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

import com.college.database.DatabaseConnection;

public class DatabaseHistory{
	
	
	
	Statement history_statement = DatabaseConnection.getConnection();

    public DatabaseHistory() throws SQLException, ClassNotFoundException {
    }

    //  CSE HISTORY STATEMENT BEGINS
	
	public void insertCSEhistory(String name) throws SQLException {
		LocalDateTime ldt = LocalDateTime.now();
		String message = "s Detials inserted in CSE DataBase"+" "+ldt;
		String historytxt = "INSERT INTO history VALUES ('"+name+"'"+"'"+message+"');";
		history_statement.executeUpdate(historytxt);
	}
	
	public void deleteCSEhistory(String name) throws SQLException {
		LocalDateTime ldt = LocalDateTime.now();
		String message = " was Deleted from CSE DataBase"+" "+ldt;
		
		String historytxt = "INSERT INTO history VALUES ('"+name+message+"');";
		history_statement.executeUpdate(historytxt);
	}
	
	
	
	
	// CSE HISTORY STATEMENTS ENDS
	
	
	
	// IT HISTORY STATEMENTS ENDS
	
	public void insertIThistory(String name) throws SQLException {
		LocalDateTime ldt = LocalDateTime.now();
		String message = "s Detials inserted in IT DataBase"+" "+ldt;
		String historytxt = "INSERT INTO history VALUES ('"+name+"'"+"'"+message+"');";
		history_statement.executeUpdate(historytxt);
	}
	
	public void deleteIThistory(String name) throws SQLException {
		LocalDateTime ldt = LocalDateTime.now();
		String message = " was Deleted in IT DataBase"+" "+ldt;
		
		String historytxt = "INSERT INTO history VALUES ('"+name+message+"');";
		history_statement.executeUpdate(historytxt);
	}
	
	
	
	// IT HISTORY STATEMENT ENDS
	
	//EEE HISTORY STATEMENT STARTS
	
	public void insertEEEhistory(String name) throws SQLException {
		LocalDateTime ldt = LocalDateTime.now();
		String message = "s Detials inserted in EEE DataBase"+" "+ldt;
		String historytxt = "INSERT INTO history VALUES ('"+name+"'"+"'"+message+"');";
		history_statement.executeUpdate(historytxt);
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
		String message = "s Detials inserted in ECE DataBase"+" "+ldt;
		String historytxt = "INSERT INTO history VALUES ('"+name+"'"+"'"+message+"');";
		history_statement.executeUpdate(historytxt);
	}
	
	
	
	
	public void deleteECEhistory(String name) throws SQLException {
		LocalDateTime ldt = LocalDateTime.now();
		String message = " was Deleted from ECE DataBase"+" "+ldt;
		
		String historytxt = "INSERT INTO history VALUES ('"+name+message+"');";
		history_statement.executeUpdate(historytxt);
	}
	
	// ECE HISTORY STATEMENTS ENDS
	
	
	
	
public void updateNamehistory(String dept,String oldName,String newName) throws SQLException {
		
			LocalDateTime ldt = LocalDateTime.now();
		
			String message = oldName+" updated his name to "+newName+" from "+dept+" DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+message+"');";
			history_statement.executeUpdate(historytxt);
			
	}

public void updateMailhistory(String dept,String oldMail,String newMail) throws SQLException {
	
	LocalDateTime ldt = LocalDateTime.now();
	
	
	
	String message = oldMail+" Mail ID was updated to "+newMail+" Mail ID in "+dept+" DataBase"+" "+ldt;
	
	String historytxt = "INSERT INTO history VALUES ('"+message+"');";
	history_statement.executeUpdate(historytxt);
}

public void updatePhonehistory(String dept,String oldNo, String newNo) throws SQLException {
	
	LocalDateTime ldt = LocalDateTime.now();
	
	String message = oldNo+" was updated to "+newNo+" Phone Number in "+dept+" DataBase"+" "+ldt;
	
	String historytxt = "INSERT INTO history VALUES ('"+message+"');";
	history_statement.executeUpdate(historytxt);
}



	
	

}
