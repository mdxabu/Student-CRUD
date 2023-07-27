package com.college;

import com.college.student.Student;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // the class needs to be loaded only once in the main
        Class.forName("com.mysql.cj.jdbc.Driver");

        Database database=new Database();

        Student student_obj = new Student(database);
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

        database.close();
    }
}
