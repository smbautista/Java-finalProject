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
public final class DbConnection {

    Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/coffee_shop?zeroDateTimeBehavior=convertToNull";
    String username = "root";
    String password = "";

    String error;

    public DbConnection() {

        this.connect();
    }

    public void connect() {
        try {
            Class.forName(this.driver);
            this.connection = DriverManager.getConnection(this.url, this.username, this.password);
            this.setStatement(this.connection.createStatement());
            System.out.println("Connected to database.");
        } catch (ClassNotFoundException | SQLException e) {
            this.error = e.toString();
            System.out.println("Error connectionecting to database." + e);
        }
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void disconnect() {
        if (this.connection != null) {
            try {
                this.connection.close();
            } catch (Exception e) {
                this.error = e.toString();
                System.out.println("Error in closing.../n" + e);
            }
        }
    }

    public String getError() {
        return this.error;
    }

    /**
     * @return the statement
     */
    public Statement getStatement() {
        return statement;
    }

    /**
     * @param statement the statement to set
     */
    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    /**
     * @return the preparedStatement
     */
    public PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    /**
     * @param preparedStatement the preparedStatement to set
     */
    public void setPreparedStatement(PreparedStatement preparedStatement) {
        this.preparedStatement = preparedStatement;
    }

    /**
     * @return the resultSet
     */
    public ResultSet getResultSet() {
        return resultSet;
    }

    /**
     * @param resultSet the resultSet to set
     */
    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

}
