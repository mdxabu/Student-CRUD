package com.college.departments;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Scanner;

import com.college.database.DatabaseConnection;
import com.college.history.DatabaseHistory;

public class InformationTechnology {
	
	Scanner in = new Scanner(System.in);
	
	
	
	Statement ITStatement = DatabaseConnection.getConnection();
	
	DatabaseHistory histroyIT = new DatabaseHistory();
	
	String stdName;

    public InformationTechnology() throws SQLException, ClassNotFoundException {
    }

    
    //insert method for students in IT department
    public void insertITStudentData() throws SQLException {
		
    	try {
		System.out.println("Enter the Student Name:");
		String name=in.nextLine();
		this.stdName=name;
		
		System.out.println("Enter the email:");
		String email = in.nextLine();
		
		String dept="IT";
		
		System.out.println("Enter the Student Phone Number:");
		String phoneNo = in.nextLine();

        System.out.println("Enter your Year of birth [Ex:xxxx] :");
        int dob = in.nextInt();

        System.out.println("Enter your Academic year in College [Ex:1,2,3,4] :");
        int Academic_Year = in.nextInt();
        
            String query = "INSERT INTO IT VALUES('" + name + "','" + email + "','" + phoneNo + "','" + dept + "'," + dob + "," + Academic_Year + ");";
            ITStatement.executeUpdate(query);

            histroyIT.insertIThistory(name);
            
            System.out.println();
            System.out.println("*************Detials was inserted successfully!!!*************");
    		System.out.println();
        }
        catch (SQLIntegrityConstraintViolationException e){
            System.err.println("Duplicate Key are not allowed!!!");
        }
		
		
		}
	
    //update method for students in IT department
	public void updateITStudentData() throws SQLException {
		
		final String Dept = "IT";
		System.out.println("1.update Name");
		System.out.println("2.Update email");
		System.out.println("3.Update Phone Number");
		System.out.println("Enter Your choice:");
		int choice = in.nextInt();
        switch (choice) {
            case 1 -> {

               
                System.out.println("Enter the old name:");
                in.nextLine();
                String oldname = in.nextLine();

                System.out.println("Enter the new name:");

                String newName = in.nextLine();

                String query = "UPDATE IT SET name=" + "'" + newName + "'" + "WHERE name='" + oldname + "';";
                ITStatement.executeUpdate(query);

                histroyIT.updateNamehistory(Dept, oldname, newName);

                System.out.println();
                System.out.println("*************Name was updated successfully!!!*************");
                System.out.println();
            }
            case 2 -> {
            		
            	try {
                System.out.println("Enter the old email:");
                in.nextLine();
                String oldmail = in.nextLine();

                System.out.println("Enter the new email:");

                String newmail = in.nextLine();

                String query = "UPDATE IT SET email=" + "'" + newmail + "'" + "WHERE email='" + oldmail + "';";
                ITStatement.executeUpdate(query);

                histroyIT.updateMailhistory(Dept, oldmail, newmail);

                System.out.println();
                System.out.println("*************Email was updated successfully!!!*************");
                System.out.println();
            	}
            	catch (Exception e) {
					System.err.println("This Email is already Exist !!!");
				}
            }
            case 3 -> {
                
            	try {
                System.out.println("Enter the old phone no:");
                in.nextLine();
                String old_no = in.nextLine();

                System.out.println("Enter the new phone no:");

                String new_no = in.nextLine();

                String query = "UPDATE IT SET phoneNo='" + new_no + "'" + "WHERE phoneNo='" + old_no + "';";
                ITStatement.executeUpdate(query);

                histroyIT.updatePhonehistory(Dept, old_no, new_no);

                System.out.println();
                System.out.println("*************Phone Number was updated successfully!!!*************");
                System.out.println();
            	}
            	catch (Exception e) {
					System.err.println("This Phone Number is Already Exist!!!");
				}
            }
            default -> throw new IllegalArgumentException("Unexpected value: " + choice);
        }
		
		
		
	}
	
	
	//delete method for students in IT department
	public void deleteITStudentData() throws SQLException {
		
		System.out.println("Enter the Student name to delete:");
		String name=in.nextLine();
		
		String query="DELETE FROM IT WHERE name='"+name+"';";
		ITStatement.executeUpdate(query);
		
		histroyIT.deleteIThistory(name);
		
		System.out.println();
		System.out.println("*************Data was Deleted successfully!!!*************");
		System.out.println();
		
	}

	//read method for students in IT department
	public void readITStudentData() throws SQLException {
		
		String query ="SELECT * FROM IT ORDER BY name;";
		
		ResultSet rs = ITStatement.executeQuery(query);

        System.out.println("NAME"
                +"                    "+"EMAIL"
                +"                    "+"PHONE NUMBER"
                +"                    "+"DEPT"
                +"                    "+"DOB"
                +"                    "+"ACADEMIC YEAR");
		
		while (rs.next()){
            System.out.println(rs.getString("name")
                    +"          "+rs.getString("email")
                    +"          "+rs.getString("phoneNo")
                    +"          "+rs.getString("dept")
                    +"          "+rs.getInt("dob")
                    +"          "+rs.getInt("Academic_Year"));
        }
		
	}



}
