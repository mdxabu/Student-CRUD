package com.college.student;

import java.sql.*;

import java.util.Scanner;

public class student {
    Scanner in = new Scanner(System.in);


    private final String db_URL;
    private final String userName;
    private final String password;



    public student(String db_URL, String userName, String password) {
        this.db_URL = db_URL;
        this.userName = userName;
        this.password = password;
    }

    // ! Insert Method
    public String insertDetials()  {
        //ArrayList<Integer> std_id = new ArrayList<>();
        int id;
        String name;
        String dept;

        String query;


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(db_URL,userName,password);
            Statement statement = connection.createStatement();

            System.out.println("Enter the Student ID:");
            id=in.nextInt();

            System.out.println("Enter the Student Name:");
            in.nextLine();
            name=in.nextLine();

            System.out.println("Enter the Student Department:");
            dept=in.nextLine();

            query="INSERT INTO student VALUES("+id+",'"+name+"','"+dept+"');";
            statement.executeUpdate(query);



        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);

        }
        return "Details are Inserted successfully!!!";
    }

    // ! Update Method
    public String updateDetials(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(db_URL,userName,password);
            Statement statement = connection.createStatement();
            System.out.println("***********");
            System.out.println("what do you want to update");
            System.out.println("***********");
            System.out.println("1.Name");
            System.out.println("2.Department");
            System.out.println("Enter the choice:");
            int ch=in.nextInt();
            System.out.println("Enter the student id to find:");
            int id=in.nextInt();
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

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return "Detials are updated in database successfully!!!";
    }

    // ! Delete Method
    public String deleteDetials() throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(db_URL,userName,password);
            Statement statement = connection.createStatement();
            int id;
            System.out.println("Enter the student ID to delete:");
            id=in.nextInt();
            String query="DELETE FROM student WHERE id="+id+";";
            statement.executeUpdate(query);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return "Detials are deleted from database successfully!!!";
    }

    public void readDetials(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(db_URL,userName,password);
            Statement statement = connection.createStatement();

            String query="SELECT * FROM STUDENT";
            ResultSet rs = statement.executeQuery(query);
            System.out.println("ID"+"           "+"Name"+"           "+"Department");
            while (rs.next()){
                System.out.println(rs.getInt("id")
                        +"          "+rs.getString("name")
                        +"          "+rs.getString("dept"));
            }

            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }
}