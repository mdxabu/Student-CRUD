package com.college;




import java.sql.SQLException;
import java.util.Scanner;

import com.college.departments.ComputerScienceandEngineering;
import com.college.departments.ElectricalandElectronicsEngineering;
import com.college.departments.ElectronicsandCommunicationEngineering;
import com.college.departments.InformationTechnology;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
    	
    	Scanner in = new Scanner(System.in);

        boolean flag =true;

    	while(flag) {
    		System.out.println();
    		
    		System.out.println("Choose the Department:");
    		
    		System.out.println("1.Computer Science and Engineering");
    		
    		System.out.println("2.Information Technology");
    		
    		System.out.println("3.Electrical and Electronics Engineering");
    		
    		System.out.println("4.Electronics and Communication Engineering");
    		
    		System.out.println("5.EXIT");
    		
    		System.out.println();
    		
    		System.out.println("Enter your Choice:");
    		
    		int choice = in.nextInt();
    		
    		switch(choice) {
    			
    		case 1:
    			ComputerScienceandEngineering CSE_obj = new ComputerScienceandEngineering();
    			
    			System.out.println();
    			
    			System.out.println("1.Insert Student Data in CSE Department");
    			
    			System.out.println("2.Update Student Data in CSE Department");
    			
    			System.out.println("3.Delete Student Data from CSE Department");
    			
    			System.out.println("4.Read Student Data from CSE Department");
    			
    			System.out.println("Enter your Choice:");
    			
    			int choice1=in.nextInt();
    			switch(choice1) {
    			case 1:
    				CSE_obj.insertCSEStudentData();
    				break;
    			case 2:
    				CSE_obj.updateCSEStudentData();
    				break;
    			case 3:
    				CSE_obj.deleteCSEStudentData();
    				break;
    			case 4:
    				CSE_obj.readCSEStudentData();
    				break;
    				}
    			break;
    			
    		case 2:
    			InformationTechnology IT_obj = new InformationTechnology();
    			
    			System.out.println();
    			
    			System.out.println("1.Insert Student Data in IT Department");
    			
    			System.out.println("2.Update Student Data in IT Department");
    			
    			System.out.println("3.Delete Student Data from IT Department");
    			
    			System.out.println("4.Read Student Data from IT Department");
    			
    			System.out.println("Enter your Choice:");
    			
    			int choice2=in.nextInt();
    			switch(choice2) {
    			case 1:
    				IT_obj.insertITStudentData();
    				break;
    			case 2:
    				IT_obj.updateITStudentData();
    				break;
    			case 3:
    				IT_obj.deleteITStudentData();
    				break;
    			case 4:
    				IT_obj.readITStudentData();
    				break;
    				}
    			break;
    			
    		case 3:
    			ElectricalandElectronicsEngineering EEE_obj = new ElectricalandElectronicsEngineering();
    			
    			System.out.println();
    			
    			System.out.println("1.Insert Student Data in EEE Department");
    			
    			System.out.println("2.Update Student Data in EEE Department");
    			
    			System.out.println("3.Delete Student Data from EEE Department");
    			
    			System.out.println("4.Read Student Data from EEE Department");
    			
    			System.out.println("Enter your Choice:");
    			
    			int choice3=in.nextInt();
    			switch(choice3) {
    			case 1:
    				EEE_obj.insertEEEStudentData();
    				break;
    			case 2:
    				EEE_obj.updateEEEStudentData();
    				break;
    			case 3:
    				EEE_obj.deleteEEEStudentData();
    				break;
    			case 4:
    				EEE_obj.readEEEStudentData();
    				break;
    				}
    			break;
    			
    		case 4:
    			ElectronicsandCommunicationEngineering ECE_obj = new ElectronicsandCommunicationEngineering();
    			
    			System.out.println();
    			
    			System.out.println("1.Insert Student Data in ECE Department");
    			
    			System.out.println("2.Update Student Data in ECE Department");
    			
    			System.out.println("3.Delete Student Data from ECE Department");
    			
    			System.out.println("4.Read Student Data from ECE Department");
    			
    			System.out.println("Enter your Choice:");
    			
    			int choice4=in.nextInt();
    			switch(choice4) {
    			case 1:
    				ECE_obj.insertECEStudentData();
    				break;
    			case 2:
    				ECE_obj.updateECEStudentData();
    				break;
    			case 3:
    				ECE_obj.deleteECEStudentData();
    				break;
    			case 4:
    				ECE_obj.readECEStudentData();
    				break;
    				}
    			break;
    			
    		case 5:
    			System.exit(0);
    			break;
    			
    			default:
    				System.err.println("please check the choice!!!");
    			
    			
    			
    		
    		}
    		
    		
    	}

        

        
    }
}