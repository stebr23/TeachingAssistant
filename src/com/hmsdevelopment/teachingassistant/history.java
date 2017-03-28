/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hmsdevelopment.teachingassistant;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author harvey.horton
 */
public class history {
    String end;
   String username;
    private ResultSet results;
    
    
    
    
      public history(String username) {
        this.username = username;
        System.out.println(username);
        
        
        
        try {
            connectToDB();
        } catch (Exception ex) {
            Logger.getLogger(history.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
      
      
       private void connectToDB() throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teachingassistant", "root", "");
        Statement statement = con.createStatement();
        results = statement.executeQuery("select * from message");
        results.first();
       // this.username = username;
        
       
       end = results.getString(3);
       
        if(results.getString(1).equals(username)){
            System.out.println(results.getString(3)+"                "+end);
            displayHistory DH = new displayHistory(username,end);
            DH.getContentPane().setBackground(new Color(45,64,89));
            DH.setVisible(true);
            
            
        
      
        }
        else{
            System.out.println("not responding");
            System.out.println(username+"           "+results.getString(3));
        }
        
      
}
}
