/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;

/**
 *
 * @author 1styrGroupA
 */
public class DbConnection {

    Connection connection;
    Statement statement;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    String url = "";
    String username = "root";
    String password = "";

    public void connectionect() {
        try {
            this.connection = (Connection) DriverManager.getConnection(this.url, this.username, this.password);
            this.statement = (Statement) this.connection.createStatement();
        } catch (Exception e) {
            System.out.println("Error connectionecting to database.");
        }
    }
    
    public Connection getConnection(){
        return this.connection;
    }

}
