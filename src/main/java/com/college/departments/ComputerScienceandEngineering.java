package com.college.departments;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.Scanner;

import com.college.database.DatabaseConnection;

public class ComputerScienceandEngineering {
	
	Scanner in = new Scanner(System.in);
	
	DatabaseConnection dbCSE = new DatabaseConnection();
	
	Statement CSEStatement = dbCSE.getConnection();
	
	public void insertCSEStudentData() throws SQLException {
		
		System.out.println("Enter the Student Name:");
		String name=in.nextLine();
		
		System.out.println("Enter the email:");
		String email = in.nextLine();
		
		String dept="CSE";
		
		System.out.println("Enter the Student Phone Number:");
		String phoneNo = in.nextLine();
		
		String query = "INSERT INTO CSE VALUES('"+name+"','"+email+"','"+phoneNo+"','"+dept+"');";
		CSEStatement.executeUpdate(query);
		LocalDateTime ldt = LocalDateTime.now();
		String message = "s Detials are inserted in CSE DataBase"+" "+ldt;
		String historytxt = "INSERT INTO history VALUES ('"+name+"'"+"'"+message+"');";
		CSEStatement.executeUpdate(historytxt);
		
		System.out.println("*************Detials was inserted successfully!!!*************");
		System.out.println();
		
		
		
	}

	public void updateCSEStudentData() throws SQLException {
		
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
			
			String query = "UPDATE CSE SET name=" + "'" + newName + "'" + "WHERE name='" + oldname + "';";
			CSEStatement.executeUpdate(query);
			
			LocalDateTime ldt = LocalDateTime.now();
			String message = "s Detials are updated in CSE DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+newName+"'"+"'"+message+"');";
			CSEStatement.executeUpdate(historytxt);
			
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
			
			String query = "UPDATE CSE SET email=" + "'" + newmail + "'" + "WHERE email='" + oldmail + "';";
			CSEStatement.executeUpdate(query);
			
			LocalDateTime ldt = LocalDateTime.now();
			String message = " was updated in CSE DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+newmail+"'"+"'"+message+"');";
			CSEStatement.executeUpdate(historytxt);
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
			
			String query = "UPDATE CSE SET phoneNo='" + new_no + "'" + "WHERE phoneNo='" + old_no + "';";
			CSEStatement.executeUpdate(query);
			
			LocalDateTime ldt = LocalDateTime.now();
			String message = " is  updated in CSE DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+new_no+"'"+"'"+message+"');";
			CSEStatement.executeUpdate(historytxt);
			
			System.out.println("*************Phone Number was updated successfully!!!*************");
			System.out.println();
		}
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
		
		
	}

	public void deleteCSEStudentData() throws SQLException {
		
		System.out.println("Enter the Student name to delete:");
		String name=in.nextLine();
		
		String query="DELETE FROM CSE WHERE name='"+name+"';";
		CSEStatement.executeUpdate(query);
		
		LocalDateTime ldt = LocalDateTime.now();
		String message = " was Deleted in CSE DataBase"+" "+ldt;
		
		String historytxt = "INSERT INTO history VALUES ('"+name+"'"+"'"+message+"');";
		CSEStatement.executeUpdate(historytxt);
		
		System.out.println("*************Data was Deleted successfully!!!*************");
		System.out.println();
		
	}

	public void readCSEStudentData() throws SQLException {
		
		String query ="SELECT * FROM CSE";
		
		ResultSet rs = CSEStatement.executeQuery(query);
		
		while (rs.next()){
            System.out.println(rs.getString("name")
                    +"          "+rs.getString("email")
                    +"          "+rs.getString("phoneNo")
                    +"          "+rs.getString("dept"));
        }
		
	}

	

}
