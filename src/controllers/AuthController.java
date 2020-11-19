/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.User;
import services.DbConnection;
import view.pages.Dashboard;
import views.auth.Login;

/**
 *
 * @author 1styrGroupA
 */
public class AuthController {
    
    public static void login(User user, DbConnection dbConnection, Login login) {
        try {
            String query = "SELECT * FROM users WHERE username = ? AND password = ?;";
            dbConnection.setPreparedStatement(dbConnection.getConnection().prepareStatement(query));
            dbConnection.getPreparedStatement().setString(1, user.getUsername());
            dbConnection.getPreparedStatement().setString(2, user.getPasword());
            if (dbConnection.getPreparedStatement().executeQuery().next()) {
                login.setVisible(false);
                ProductController.index(user, dbConnection);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid credentials.");
            }
            
        } catch (SQLException ex) {
            System.out.println("Server error : " + ex);
            
        }
    }
    
    public static void logout(Dashboard dashboard, DbConnection dbConnection) {
        
        dashboard.setVisible(false);
        dbConnection.disconnect();
        System.exit(0);
        
    }
}
