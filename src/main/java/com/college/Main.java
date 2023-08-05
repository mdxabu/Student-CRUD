package com.college;

import com.college.student.student;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {

        String URL = "jdbc:mysql://localhost:3306/college";
        String userName = "root";
        String password = "@bdul1ah";

        student student_obj = new student(URL, userName, password);



        boolean condition = true;

        while (condition) {
            System.out.println("1.Insert the Student detials in database");
            System.out.println("2.Delete the student detials in database");
            System.out.println("3.Update the student detials in database");
            System.out.println("4.Read the student detials from database");
            System.out.println("5.Exit this Execution");
            System.out.println("*******************************************");
            System.out.println("Enter your choice:");
            int choice=in.nextInt();
            switch (choice) {
                case 1 -> System.out.println("*******************************************\n"
                        +student_obj.insertDetials()
                        +"\n*******************************************\n");

                case 2 -> System.out.println("*******************************************\n"
                        +student_obj.deleteDetials()
                        +"\n*******************************************\n");
                case 3 -> System.out.println("*******************************************\n"
                        +student_obj.updateDetials()
                        +"\n*******************************************\n");
                case 4 -> student_obj.readDetials();
                case 5 -> condition = false;
                default -> System.err.println("*** Enter the correct choice ***");
            }
        }
    }
}