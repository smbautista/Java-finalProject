/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeshop;

import java.sql.Connection;
import javax.swing.JOptionPane;
import services.DbConnection;
import views.auth.Login;

/**
 *
 * @author 1styrGroupA
 */
public class App {

    DbConnection dbConnection;

    App() {
        this.dbConnection = new DbConnection();
    }

    public void start() {
        
        if(this.dbConnection.getConnection() == null) {
            JOptionPane.showMessageDialog(null, "Server Error" + this.dbConnection.getError());
        }else{
            new Login().showPage(this.dbConnection);
        }

    }

}
