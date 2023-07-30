package com.college.student;

import com.college.Database;

import java.sql.*;

import java.util.Scanner;

public class Student {
    Scanner in;
    private final Database database;

    public Student(Database database, Scanner scanner) {
        this.database = database;
        in = scanner;
    }

    // ! Insert Method
    public String insertDetials() {
        //ArrayList<Integer> std_id = new ArrayList<>();
        int id;
        String name;
        String dept;

        String query;


        try {
            Statement statement = database.getStatement();

            System.out.println("Enter the Student ID:");
            id = in.nextInt();

            System.out.println("Enter the Student Name:");
            in.nextLine();
            name = in.nextLine();

            System.out.println("Enter the Student Department:");
            dept = in.nextLine();

            query = "INSERT INTO student VALUES(" + id + ",'" + name + "','" + dept + "');";
            statement.executeUpdate(query);


        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
        return "Details are Inserted successfully!!!";
    }

    // ! Update Method
    public String updateDetials() {

        try {
            Connection connection = DriverManager.getConnection(Database.HOST, Database.USERNAME, Database.PASSWORD);
            Statement statement = connection.createStatement();
            System.out.println("***********");
            System.out.println("what do you want to update");
            System.out.println("***********");
            System.out.println("1.Name");
            System.out.println("2.Department");
            System.out.println("Enter the choice:");
            int ch = in.nextInt();
            System.out.println("Enter the student id to find:");
            int id = in.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println("Enter the name to be update:");
                    in.nextLine();
                    String upd_name = in.nextLine();
                    String query = "UPDATE student SET name=" + "'" + upd_name + "'" + "WHERE id=" + id + ";";
                    statement.executeUpdate(query);
                }
                case 2 -> {
                    System.out.println("Enter the student id to find:");
                    id = in.nextInt();
                    System.out.println("Enter the department to be update:");
                    in.nextLine();
                    String upd_dept = in.nextLine();
                    String query = "UPDATE student SET name=" + "'" + upd_dept + "'" + "WHERE id=" + id + ";";
                    statement.executeUpdate(query);
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return "Detials are updated in database successfully!!!";
    }

    // ! Delete Method
    public String deleteDetials() {

        try {
            Connection connection = DriverManager.getConnection(Database.HOST, Database.USERNAME, Database.PASSWORD);
            Statement statement = connection.createStatement();
            int id;
            System.out.println("Enter the student ID to delete:");
            id = in.nextInt();
            String query = "DELETE FROM student WHERE id=" + id + ";";
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "Detials are deleted from database successfully!!!";
    }

    public void readDetials() {
        try {

            Statement statement = database.getStatement();

            String query = "SELECT * FROM STUDENT";
            ResultSet rs = statement.executeQuery(query);
            System.out.println("ID" + "           " + "Name" + "           " + "Department");
            while (rs.next()) {
                System.out.println(rs.getInt("id")
                        + "          " + rs.getString("name")
                        + "          " + rs.getString("dept"));
            }

            statement.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
