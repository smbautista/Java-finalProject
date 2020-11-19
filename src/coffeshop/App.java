/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeshop;

import services.DbConnection;
import views.auth.Login;

/**
 *
 * @author 1styrGroupA
 */
public class App {

    public void start() {
        
        new Login().showPage(new DbConnection());

    }

}
