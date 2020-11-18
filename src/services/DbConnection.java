/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 1styrGroupA
 */
public class DbConnection {

    Connection connection;
    Statement statement;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/computer_inventory?zeroDateTimeBehavior=convertToNull";
    String username = "root";
    String password = "";

    public void connect() {
        try {
            Class.forName(this.driver);
            this.connection = DriverManager.getConnection(this.url, this.username, this.password);
            this.statement = this.connection.createStatement();
            System.out.println("Connected to database.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error connectionecting to database." + e);
        }
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void close(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (Exception e) {
                System.out.println("Error in closing.../n" + e);
            }
        }
    }

    public void close(Statement statement) {

        if (statement != null) {
            try {
                statement.close();
            } catch (Exception e) {
                System.out.println("Error in closing.../n" + e);
            }
        }
    }

    public void disconnect() {
        if (this.connection != null) {
            try {
                this.connection.close();
            } catch (Exception e) {
                System.out.println("Error in closing.../n" + e);
            }
        }
    }

}
