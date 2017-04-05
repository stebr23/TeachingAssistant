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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author harvey.horton
 */
public class history {
    String end;
   String username;
   String next;
   String message;
   int i;
   int number = 0;
   String CMP;
   
    private ResultSet results;
    
    ArrayList list = new ArrayList();
    
    
      public history(String username,String CMP) {
        this.username = username;
        this.CMP = CMP;
        
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
        
       
       //end = results.getString(3);
       
       
       
       
       
       
       
       
       
       ///this is causing lots of history tabs to display. I need a while loop collecting the data and then setting it somewhere else, incremental values
      while(number <= 4){
        if(results.getString(1).equals(username)){
            
            checkHistory(username);
            //NEED TO WRITE IF SOMETHING IS THE SAME AS THE SELECTED COURSE THEN ADD IT TO LIST
            System.out.println(message);
            System.out.println(results.getString(3)+"                "+message);
            list.add(message);
            System.out.println(list);
            
            
            number++;
            
        
      
        }
        else{
            System.out.println("not responding");
            System.out.println(username+"           "+results.getString(3));
        }
        
       }
      displayHistory DH = new displayHistory(username,list);
            DH.getContentPane().setBackground(new Color(45,64,89));
            DH.setVisible(true);
}
       
private void checkHistory(String username) throws Exception{
    
    if(results.getString(1).equalsIgnoreCase(username)){
        message = results.getString(3);
       // CMP = results.getString(2);
        System.out.println(message+"   this is the while loop");
        results.next();
      
        
    
    }
}

private boolean checkMessage(int usernameColumn, String username) throws Exception {
        while (!results.isAfterLast()) {
            if (results.getString(usernameColumn).equalsIgnoreCase(username)) {
                return true;
            } else {
                results.next();
            }
        }
        return false;
    }
}