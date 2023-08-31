package com.college.departments;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Scanner;

import com.college.database.DatabaseConnection;
import com.college.history.DatabaseHistory;

public class ElectronicsandCommunicationEngineering {
	
	Scanner in = new Scanner(System.in);
	
	
	
	Statement ECEStatement = DatabaseConnection.getConnection();
	
	String stdName;
	DatabaseHistory historyECE = new DatabaseHistory();

    public ElectronicsandCommunicationEngineering() throws SQLException, ClassNotFoundException {
    }

    //insert method for students in ECE department
    public void insertECEStudentData() throws SQLException {

    	try{
        System.out.println("Enter the Student Name:");
        String name = in.nextLine();
        this.stdName = name;
        System.out.println("Enter the email:");
        String email = in.nextLine();

        String dept = "ECE";

        System.out.println("Enter the Student Phone Number:");
        String phoneNo = in.nextLine();

        System.out.println("Enter your Year of birth [Ex:xxxx] :");
        int dob = in.nextInt();

        System.out.println("Enter your Academic year in College [Ex:1,2,3,4] :");
        int Academic_Year = in.nextInt();
        
        String query = "INSERT INTO ECE VALUES('" + name + "','" + email + "','" + phoneNo + "','" + dept + "'," + dob + "," + Academic_Year + ");";
        ECEStatement.executeUpdate(query);

        historyECE.insertECEhistory(name);
        
        System.out.println();
        System.out.println("*************Detials was inserted successfully!!!*************");
		System.out.println();
		
        }
        catch(SQLIntegrityConstraintViolationException e){
        System.err.println("Duplicate Key are not allowed!!!");
    }
		}
	
    //update method for students in ECE department
	public void updateECEStudentData() throws SQLException {
		
		final String Dept ="ECE"; 
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

                String query = "UPDATE ECE SET name=" + "'" + newName + "'" + "WHERE name='" + oldname + "';";
                ECEStatement.executeUpdate(query);

                historyECE.updateNamehistory(Dept, oldname, newName);

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

                String query = "UPDATE ECE SET email=" + "'" + newmail + "'" + "WHERE email='" + oldmail + "';";
                ECEStatement.executeUpdate(query);

                historyECE.updateMailhistory(Dept, oldmail, newmail);
                
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

                String query = "UPDATE ECE SET phoneNo='" + new_no + "'" + "WHERE phoneNo='" + old_no + "';";
                ECEStatement.executeUpdate(query);

                historyECE.updatePhonehistory(Dept, old_no, new_no);

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
	
	
	//delete method for students in ECE department
	public void deleteECEStudentData() throws SQLException {
		
		System.out.println("Enter the Student name to delete:");
		String name=in.nextLine();
		
		String query="DELETE FROM ECE WHERE name='"+name+"';";
		ECEStatement.executeUpdate(query);
		
		historyECE.deleteECEhistory(name);
		
		System.out.println();
		System.out.println("*************Data was Deleted successfully!!!*************");
		System.out.println();
		
	}

	//read method for students in ECE department
	public void readECEStudentData() throws SQLException {
		
		String query ="SELECT * FROM ECE ORDER BY name;";
		
		ResultSet rs = ECEStatement.executeQuery(query);

        System.out.println("---------------------------------------------------------------------------------------------------------");

        System.out.format("%7s %20s %20s %18s %15s %18s","NAME","EMAIL","PHONE","DEPT","DOB","ACADEMIC YEAR");
        System.out.println();

        System.out.println("----------------------------------------------------------------------------------------------------------");
		
		while (rs.next()){

            String name = rs.getString("name");

            String email = rs.getString("email");

            String phone = rs.getString("phoneNo");

            String dept = rs.getString("dept");

            int dob = rs.getInt("dob");

            int year = rs.getInt("Academic_Year");


            System.out.format("%7s %25s %18s %15s %15s %13s",name,email,phone,dept,dob,year);
            System.out.println();
            System.out.println("----------------------------------------------------------------------------------------------------------");

        }
		
	}
	
	

}
