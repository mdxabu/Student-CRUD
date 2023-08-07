package com.college.departments;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.Scanner;

import com.college.database.DatabaseConnection;

public class ElectricalandElectronicsEngineering {
	
	Scanner in = new Scanner(System.in);
	
	DatabaseConnection dbEEE = new DatabaseConnection();
	
	Statement EEEStatement = dbEEE.getConnection();
	
	public void insertEEEStudentData() throws SQLException {
		
		System.out.println("Enter the Student Name:");
		String name=in.nextLine();
		
		System.out.println("Enter the email:");
		String email = in.nextLine();
		
		String dept="EEE";
		
		System.out.println("Enter the Student Phone Number:");
		String phoneNo = in.nextLine();
		
		String query = "INSERT INTO EEE VALUES('"+name+"','"+email+"','"+phoneNo+"','"+dept+"');";
		EEEStatement.executeUpdate(query);
		LocalDateTime ldt = LocalDateTime.now();
		String message = "s Detials are inserted in EEE DataBase"+" "+ldt;
		String historytxt = "INSERT INTO history VALUES ('"+name+"'"+"'"+message+"');";
		EEEStatement.executeUpdate(historytxt);
		
		System.out.println("*************Detials was inserted successfully!!!*************");
		System.out.println();
		
		}
	
	public void updateEEEStudentData() throws SQLException {
		
		System.out.println("1.update Name");
		System.out.println("2.Update email");
		System.out.println("3.Update Phone Number");
		System.out.println("Enter Your choice:");
		int choice = in.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Enter the old name:");
			in.nextLine();
			String oldname=in.nextLine();
			
			System.out.println("Enter the new name:");
			
			String newName = in.nextLine();
			
			String query = "UPDATE EEE SET name=" + "'" + newName + "'" + "WHERE name='" + oldname + "';";
			EEEStatement.executeUpdate(query);
			
			LocalDateTime ldt = LocalDateTime.now();
			String message = "s Detials are updated in EEE DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+newName+"'"+"'"+message+"');";
			EEEStatement.executeUpdate(historytxt);
			
			System.out.println("*************Name was updated successfully!!!*************");
			System.out.println();
		}
			break;
		
		case 2:{
			System.out.println("Enter the old email:");
			in.nextLine();
			String oldmail=in.nextLine();
			
			System.out.println("Enter the new email:");
			
			String newmail = in.nextLine();
			
			String query = "UPDATE EEE SET email=" + "'" + newmail + "'" + "WHERE email='" + oldmail + "';";
			EEEStatement.executeUpdate(query);
			
			LocalDateTime ldt = LocalDateTime.now();
			String message = " was updated in EEE DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+newmail+"'"+"'"+message+"');";
			EEEStatement.executeUpdate(historytxt);
			System.out.println("*************email was updated successfully!!!*************");
			System.out.println();
		}
		break;
		case 3:{
			System.out.println("Enter the old phone no:");
			in.nextLine();
			String old_no=in.nextLine();
			
			System.out.println("Enter the new phone no:");
			
			String new_no = in.nextLine();
			
			String query = "UPDATE EEE SET phoneNo='" + new_no + "'" + "WHERE phoneNo='" + old_no + "';";
			EEEStatement.executeUpdate(query);
			
			LocalDateTime ldt = LocalDateTime.now();
			String message = " is  updated in EEE DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+new_no+"'"+"'"+message+"');";
			EEEStatement.executeUpdate(historytxt);
			
			System.out.println("*************Phone Number was updated successfully!!!*************");
			System.out.println();
		}
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
		
		
	}
	
public void deleteEEEStudentData() throws SQLException {
		
		System.out.println("Enter the Student name to delete:");
		String name=in.nextLine();
		
		String query="DELETE FROM IT WHERE name='"+name+"';";
		EEEStatement.executeUpdate(query);
		
		LocalDateTime ldt = LocalDateTime.now();
		String message = " was Deleted in IT DataBase"+" "+ldt;
		
		String historytxt = "INSERT INTO history VALUES ('"+name+"'"+"'"+message+"');";
		EEEStatement.executeUpdate(historytxt);
		
		System.out.println("*************Data was Deleted successfully!!!*************");
		System.out.println();
		
	}

	public void readEEEStudentData() throws SQLException {
		
		String query ="SELECT * FROM EEE";
		
		ResultSet rs = EEEStatement.executeQuery(query);
		
		while (rs.next()){
            System.out.println(rs.getString("name")
                    +"          "+rs.getString("email")
                    +"          "+rs.getString("phoneNo")
                    +"          "+rs.getString("dept"));
        }
		
	}
	
	

}
	