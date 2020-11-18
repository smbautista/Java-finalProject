/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author 1styrGroupA
 */
public class Model {

    protected String name;
    
    protected ArrayList<String> attributes;
    
    Model(){
        
    }

    /**
     *
     * @param attributes
     * @param table
     */
    
    public String getClassName() {
        
       return  this.getClass().getSimpleName();
    }
    
    public static String create(String feild){
        
        return feild;
    }
    
}
