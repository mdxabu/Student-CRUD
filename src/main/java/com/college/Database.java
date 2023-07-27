package com.college;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    public static final String USERNAME="root";
    public static final String PASSWORD="@bdul1ah";
    public static final String HOST="jdbc:mysql://localhost:3306/college";

    private Connection connection;
    public Database(String host, String username, String password) throws SQLException {
        connection = DriverManager.getConnection(host,username,password);
    }

    public Database() throws SQLException {
        this(HOST, USERNAME, PASSWORD);
    }

    public Statement getStatement() throws SQLException {
        return connection.createStatement();
    }


    public void close() throws SQLException {
        connection.close();
    }
}
