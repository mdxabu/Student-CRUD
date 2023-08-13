package com.college.departments;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.college.database.DatabaseConnection;
import com.college.history.DatabaseHistory;

public class ComputerScienceandEngineering {
	
	Scanner in = new Scanner(System.in);
	
	
	
	Statement CSEStatement = DatabaseConnection.getConnection();
	
	DatabaseHistory historyCSE = new DatabaseHistory();
	
	String stdName;
	
	public void insertCSEStudentData() throws SQLException {
		
		System.out.println("Enter the Student Name:");
		String name=in.nextLine();
		this.stdName=name;
		System.out.println("Enter the email:");
		String email = in.nextLine();
		
		String dept="CSE";
		
		System.out.println("Enter the Student Phone Number:");
		String phoneNo = in.nextLine();
		
		String query = "INSERT INTO CSE VALUES('"+name+"','"+email+"','"+phoneNo+"','"+dept+"');";
		CSEStatement.executeUpdate(query);
		
		historyCSE.insertCSEhistory(name);
		
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
            case 1 -> {
                String txt = "name";
                System.out.println("Enter the old name:");
                in.nextLine();
                String oldname = in.nextLine();

                System.out.println("Enter the new name:");

                String newName = in.nextLine();

                String query = "UPDATE CSE SET name=" + "'" + newName + "'" + "WHERE name='" + oldname + "';";
                CSEStatement.executeUpdate(query);


                historyCSE.updateCSEhistory(txt, oldname);

                System.out.println("*************Name was updated successfully!!!*************");
                System.out.println();
            }
            case 2 -> {

                String txt = "mail";
                System.out.println("Enter the old email:");
                in.nextLine();
                String oldmail = in.nextLine();

                System.out.println("Enter the new email:");

                String newmail = in.nextLine();

                String query = "UPDATE CSE SET email=" + "'" + newmail + "'" + "WHERE email='" + oldmail + "';";
                CSEStatement.executeUpdate(query);

                historyCSE.updateCSEhistory(txt, newmail);
                System.out.println("*************email was updated successfully!!!*************");
                System.out.println();
            }
            case 3 -> {
                String txt = "phone";
                System.out.println("Enter the old phone no:");
                in.nextLine();
                String old_no = in.nextLine();

                System.out.println("Enter the new phone no:");

                String new_no = in.nextLine();

                String query = "UPDATE CSE SET phoneNo='" + new_no + "'" + "WHERE phoneNo='" + old_no + "';";
                CSEStatement.executeUpdate(query);


                historyCSE.updateCSEhistory(txt, stdName);

                System.out.println("*************Phone Number was updated successfully!!!*************");
                System.out.println();
            }
            default -> throw new IllegalArgumentException("Unexpected value: " + choice);
        }
		
		
		
	}

	public void deleteCSEStudentData() throws SQLException {
		
		System.out.println("Enter the Student name to delete:");
		String name=in.nextLine();
		
		String query="DELETE FROM CSE WHERE name='"+name+"';";
		CSEStatement.executeUpdate(query);
		
		
		historyCSE.deleteCSEhistory(name);
		
		System.out.println("*************Data was Deleted successfully!!!*************");
		System.out.println();
		
	}

	public void readCSEStudentData() throws SQLException {
		
		String query ="SELECT * FROM CSE ORDER BY name;";
		
		ResultSet rs = CSEStatement.executeQuery(query);
		
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
