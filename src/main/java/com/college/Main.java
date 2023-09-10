package com.college;

import com.college.database.DatabaseConnection;
import com.college.departments.ComputerScienceandEngineering;
import com.college.departments.ElectricalandElectronicsEngineering;
import com.college.departments.ElectronicsandCommunicationEngineering;
import com.college.departments.InformationTechnology;
import com.college.history.DatabaseHistory;

import java.util.Scanner;


public class Main {



    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {




    	// Just Creating an object for the DatabaseConnection class

       new DatabaseConnection();

        while(true) {
    		System.out.println();
    		
    		System.out.println("Choose the Department:");
    		
    		System.out.println("1.Computer Science and Engineering");
    		
    		System.out.println("2.Information Technology");
    		
    		System.out.println("3.Electrical and Electronics Engineering");
    		
    		System.out.println("4.Electronics and Communication Engineering");

            System.out.println("5.Read history");

    		System.out.println("6.EXIT");
    		
    		System.out.println();
    		
    		System.out.println("Enter your Choice:");
    		
    		int choice = in.nextInt();

            switch (choice) {

                // CSE Class Properties
                case 1 -> {
                    ComputerScienceandEngineering CSE_obj = new ComputerScienceandEngineering();
                    System.out.println();
                    System.out.println("1.Insert Student Data in CSE Department");
                    System.out.println("2.Update Student Data in CSE Department");
                    System.out.println("3.Delete Student Data from CSE Department");
                    System.out.println("4.Read Student Data from CSE Department");
                    System.out.println("Enter your Choice:");
                    int choice1 = in.nextInt();
                    switch (choice1) {
                    	
                    	// Insert method for CSE students
                        case 1 -> CSE_obj.insertCSEStudentData();
                        
                        // Update method for CSE students
                        case 2 -> CSE_obj.updateCSEStudentData();
                        
                        // Delete method for CSE students
                        case 3 -> CSE_obj.deleteCSEStudentData();
                        
                        // Read method for CSE students
                        case 4 -> CSE_obj.readCSEStudentData();
                    }
                }

                // IT Class Properties
                case 2 -> {
                    InformationTechnology IT_obj = new InformationTechnology();
                    System.out.println();
                    System.out.println("1.Insert Student Data in IT Department");
                    System.out.println("2.Update Student Data in IT Department");
                    System.out.println("3.Delete Student Data from IT Department");
                    System.out.println("4.Read Student Data from IT Department");
                    System.out.println("Enter your Choice:");
                    int choice2 = in.nextInt();
                    switch (choice2) {
                    	// Insert method for IT students
                        case 1 -> IT_obj.insertITStudentData();
                        
                        // Update method for IT students
                        case 2 -> IT_obj.updateITStudentData();
                        
                        // Delete method for IT students
                        case 3 -> IT_obj.deleteITStudentData();
                        
                        // Read Data method for IT students
                        case 4 -> IT_obj.readITStudentData();
                    }
                }

                // EEE Class Properties
                case 3 -> {
                    ElectricalandElectronicsEngineering EEE_obj = new ElectricalandElectronicsEngineering();
                    System.out.println();
                    System.out.println("1.Insert Student Data in EEE Department");
                    System.out.println("2.Update Student Data in EEE Department");
                    System.out.println("3.Delete Student Data from EEE Department");
                    System.out.println("4.Read Student Data from EEE Department");
                    System.out.println("Enter your Choice:");
                    int choice3 = in.nextInt();
                    switch (choice3) {
                    
                    	// Insert method for EEE students
                        case 1 -> EEE_obj.insertEEEStudentData();
                        
                        // Update method for EEE students
                        case 2 -> EEE_obj.updateEEEStudentData();
                        
                        // Delete method for EEE students
                        case 3 -> EEE_obj.deleteEEEStudentData();
                        
                        // Read method for EEE students
                        case 4 -> EEE_obj.readEEEStudentData();
                    }
                }

                // ECE Class Properties
                case 4 -> {
                    ElectronicsandCommunicationEngineering ECE_obj = new ElectronicsandCommunicationEngineering();
                    System.out.println();
                    System.out.println("1.Insert Student Data in ECE Department");
                    System.out.println("2.Update Student Data in ECE Department");
                    System.out.println("3.Delete Student Data from ECE Department");
                    System.out.println("4.Read Student Data from ECE Department");
                    System.out.println("Enter your Choice:");
                    int choice4 = in.nextInt();
                    switch (choice4) {
                    
                    	// Insert method for ECE students
                        case 1 -> ECE_obj.insertECEStudentData();
                        
                        // Update method for ECE students
                        case 2 -> ECE_obj.updateECEStudentData();
                        
                        // Delete method for ECE students
                        case 3 -> ECE_obj.deleteECEStudentData();
                        
                        // Read method for ECE students
                        case 4 -> ECE_obj.readECEStudentData();
                    }
                }
                case 5 -> {
                    // Creating an instance for DatabaseHistory class
                    DatabaseHistory history = new DatabaseHistory();
                    history.readHistory();
                }
                case 6 -> {
                    System.err.println("Thanks for using this project😊!!!");
                    System.exit(0);
                }
                default -> System.err.println("please check the choice!!!");
            }

    	}
    }
}