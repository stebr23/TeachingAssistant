/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hmsdevelopment.teachingassistant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author harvey.horton
 */
public class Submit {
    
    String message;
    String messagePriority;
    String courseCode;
    String username;
   
    
   public Submit(String courseCode , String message, String messagePriority, String username) {
       this.username = username;
       this.courseCode = courseCode;
       this.message = message;
       this.messagePriority = messagePriority;
       
        
        
        try {
            //connectToDB();
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teachingassistant", "root", "");
        Statement statement = con.createStatement();
       
        
        String SQL = "INSERT INTO message (username,coursecode,message,messagePriority) VALUES ('" + username + "','" + courseCode +  "','" + message +  "','"  + messagePriority + "')";
        statement.executeUpdate(SQL);

        
        
        } catch (Exception ex) {
            Logger.getLogger(Validation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
}
    
