package com.college.departments;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.Scanner;

import javax.swing.event.ListDataEvent;

import com.college.database.DatabaseConnection;
import com.college.history.DatabaseHistory;

public class ElectronicsandCommunicationEngineering {
	
	Scanner in = new Scanner(System.in);
	
	
	
	Statement ECEStatement = DatabaseConnection.getConnection();
	
	String stdName;
	DatabaseHistory historyECE = new DatabaseHistory();
	
	public void insertECEStudentData() throws SQLException {
		
		System.out.println("Enter the Student Name:");
		String name=in.nextLine();
		this.stdName=name;
		System.out.println("Enter the email:");
		String email = in.nextLine();
		
		String dept="ECE";
		
		System.out.println("Enter the Student Phone Number:");
		String phoneNo = in.nextLine();
		
		String query = "INSERT INTO ECE VALUES('"+name+"','"+email+"','"+phoneNo+"','"+dept+"');";
		ECEStatement.executeUpdate(query);
		
		historyECE.insertECEhistory(name);
		
		System.out.println("*************Detials was inserted successfully!!!*************");
		System.out.println();
		
		}
	
	public void updateECEStudentData() throws SQLException {
		
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
			
			String query = "UPDATE ECE SET name=" + "'" + newName + "'" + "WHERE name='" + oldname + "';";
			ECEStatement.executeUpdate(query);
			
			historyECE.updateECEhistory(txt, oldname);
			
			System.out.println("*************Name was updated successfully!!!*************");
			System.out.println();
		}
			break;
		
		case 2:{
			String txt = "mail";
			System.out.println("Enter the old email:");
			in.nextLine();
			String oldmail=in.nextLine();
			
			System.out.println("Enter the new email:");
			
			String newmail = in.nextLine();
			
			String query = "UPDATE ECE SET email=" + "'" + newmail + "'" + "WHERE email='" + oldmail + "';";
			ECEStatement.executeUpdate(query);
			
			historyECE.updateECEhistory(txt, stdName);
			System.out.println("*************email was updated successfully!!!*************");
			System.out.println();
		}
		break;
		case 3:{
			
			String txt="phone";
			System.out.println("Enter the old phone no:");
			in.nextLine();
			String old_no=in.nextLine();
			
			System.out.println("Enter the new phone no:");
			
			String new_no = in.nextLine();
			
			String query = "UPDATE ECE SET phoneNo='" + new_no + "'" + "WHERE phoneNo='" + old_no + "';";
			ECEStatement.executeUpdate(query);
			
			historyECE.updateECEhistory(txt, stdName);
			
			System.out.println("*************Phone Number was updated successfully!!!*************");
			System.out.println();
		}
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
		
	}
	
public void deleteECEStudentData() throws SQLException {
		
		System.out.println("Enter the Student name to delete:");
		String name=in.nextLine();
		
		String query="DELETE FROM ECE WHERE name='"+name+"';";
		ECEStatement.executeUpdate(query);
		
		historyECE.deleteECEhistory(name);
		
		System.out.println("*************Data was Deleted successfully!!!*************");
		System.out.println();
		
	}

	public void readECEStudentData() throws SQLException {
		
		String query ="SELECT * FROM ECE ORDER BY name;";
		
		ResultSet rs = ECEStatement.executeQuery(query);
		
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
