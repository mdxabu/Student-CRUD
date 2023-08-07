package com.college.departments;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.Scanner;

import com.college.database.DatabaseConnection;

public class InformationTechnology {
	
	Scanner in = new Scanner(System.in);
	
	DatabaseConnection dbIT = new DatabaseConnection();
	
	Statement ITStatement = dbIT.getConnection();
	
	public void insertITStudentData() throws SQLException {
		
		System.out.println("Enter the Student Name:");
		String name=in.nextLine();
		
		System.out.println("Enter the email:");
		String email = in.nextLine();
		
		String dept="IT";
		
		System.out.println("Enter the Student Phone Number:");
		String phoneNo = in.nextLine();
		
		String query = "INSERT INTO IT VALUES('"+name+"','"+email+"','"+phoneNo+"','"+dept+"');";
		ITStatement.executeUpdate(query);
		LocalDateTime ldt = LocalDateTime.now();
		String message = "s Detials are inserted in IT DataBase"+" "+ldt;
		String historytxt = "INSERT INTO history VALUES ('"+name+"'"+"'"+message+"');";
		ITStatement.executeUpdate(historytxt);
		
		System.out.println("*************Detials was inserted successfully!!!*************");
		System.out.println();
		
		}
	
	public void updateITStudentData() throws SQLException {
		
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
			
			String query = "UPDATE IT SET name=" + "'" + newName + "'" + "WHERE name='" + oldname + "';";
			ITStatement.executeUpdate(query);
			
			LocalDateTime ldt = LocalDateTime.now();
			String message = "s Detials are updated in IT DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+newName+"'"+"'"+message+"');";
			ITStatement.executeUpdate(historytxt);
			
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
			
			String query = "UPDATE IT SET email=" + "'" + newmail + "'" + "WHERE email='" + oldmail + "';";
			ITStatement.executeUpdate(query);
			
			LocalDateTime ldt = LocalDateTime.now();
			String message = " was updated in IT DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+newmail+"'"+"'"+message+"');";
			ITStatement.executeUpdate(historytxt);
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
			
			String query = "UPDATE IT SET phoneNo='" + new_no + "'" + "WHERE phoneNo='" + old_no + "';";
			ITStatement.executeUpdate(query);
			
			LocalDateTime ldt = LocalDateTime.now();
			String message = " is  updated in IT DataBase"+" "+ldt;
			
			String historytxt = "INSERT INTO history VALUES ('"+new_no+"'"+"'"+message+"');";
			ITStatement.executeUpdate(historytxt);
			
			System.out.println("*************Phone Number was updated successfully!!!*************");
			System.out.println();
		}
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
		
		
	}
	
	public void deleteITStudentData() throws SQLException {
		
		System.out.println("Enter the Student name to delete:");
		String name=in.nextLine();
		
		String query="DELETE FROM IT WHERE name='"+name+"';";
		ITStatement.executeUpdate(query);
		
		LocalDateTime ldt = LocalDateTime.now();
		String message = " was Deleted in IT DataBase"+" "+ldt;
		
		String historytxt = "INSERT INTO history VALUES ('"+name+"'"+"'"+message+"');";
		ITStatement.executeUpdate(historytxt);
		
		System.out.println("*************Data was Deleted successfully!!!*************");
		System.out.println();
		
	}

	public void readITStudentData() throws SQLException {
		
		String query ="SELECT * FROM IT";
		
		ResultSet rs = ITStatement.executeQuery(query);
		
		while (rs.next()){
            System.out.println(rs.getString("name")
                    +"          "+rs.getString("email")
                    +"          "+rs.getString("phoneNo")
                    +"          "+rs.getString("dept"));
        }
		
	}



}
