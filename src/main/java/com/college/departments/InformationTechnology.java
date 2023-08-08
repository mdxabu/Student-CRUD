package com.college.departments;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.Scanner;

import com.college.database.DatabaseConnection;
import com.college.history.DatabaseHistory;

public class InformationTechnology {
	
	Scanner in = new Scanner(System.in);
	
	DatabaseConnection dbIT = new DatabaseConnection();
	
	Statement ITStatement = dbIT.getConnection();
	
	DatabaseHistory histroyIT = new DatabaseHistory();
	
	String stdName;
	
	public void insertITStudentData() throws SQLException {
		
		System.out.println("Enter the Student Name:");
		String name=in.nextLine();
		this.stdName=name;
		
		System.out.println("Enter the email:");
		String email = in.nextLine();
		
		String dept="IT";
		
		System.out.println("Enter the Student Phone Number:");
		String phoneNo = in.nextLine();
		
		String query = "INSERT INTO IT VALUES('"+name+"','"+email+"','"+phoneNo+"','"+dept+"');";
		ITStatement.executeUpdate(query);
		
		histroyIT.insertIThistory(name);
		
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
			
			String txt="name";
			System.out.println("Enter the old name:");
			in.nextLine();
			String oldname=in.nextLine();
			
			System.out.println("Enter the new name:");
			
			String newName = in.nextLine();
			
			String query = "UPDATE IT SET name=" + "'" + newName + "'" + "WHERE name='" + oldname + "';";
			ITStatement.executeUpdate(query);
			
			histroyIT.updateIThistory(txt, oldname);
			
			System.out.println("*************Name was updated successfully!!!*************");
			System.out.println();
		}
			break;
		
		case 2:{
			
			String txt="mail";
			System.out.println("Enter the old email:");
			in.nextLine();
			String oldmail=in.nextLine();
			
			System.out.println("Enter the new email:");
			
			String newmail = in.nextLine();
			
			String query = "UPDATE IT SET email=" + "'" + newmail + "'" + "WHERE email='" + oldmail + "';";
			ITStatement.executeUpdate(query);
			
			histroyIT.updateIThistory(txt, stdName);
			
			System.out.println("*************email was updated successfully!!!*************");
			System.out.println();
		}
		break;
		case 3:{
			String txt = "phone";
			System.out.println("Enter the old phone no:");
			in.nextLine();
			String old_no=in.nextLine();
			
			System.out.println("Enter the new phone no:");
			
			String new_no = in.nextLine();
			
			String query = "UPDATE IT SET phoneNo='" + new_no + "'" + "WHERE phoneNo='" + old_no + "';";
			ITStatement.executeUpdate(query);
			
			histroyIT.updateIThistory(txt, stdName);
			
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
		
		histroyIT.deleteIThistory(name);
		
		System.out.println("*************Data was Deleted successfully!!!*************");
		System.out.println();
		
	}

	public void readITStudentData() throws SQLException {
		
		String query ="SELECT * FROM IT";
		
		ResultSet rs = ITStatement.executeQuery(query);
		
		System.out.println("name"
                +"          "+"email"
                +"          "+"phoneNo"
                +"          "+"dept");
		
		while (rs.next()){
            System.out.println(rs.getString("name")
                    +"          "+rs.getString("email")
                    +"          "+rs.getString("phoneNo")
                    +"          "+rs.getString("dept"));
        }
		
	}



}
