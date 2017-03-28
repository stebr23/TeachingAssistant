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
    private final int DB_courseCode_COLUMN = 1;
    private final int DB_messageID_COLUMN = 2;
    private final int DB_message_COLUMN = 3;
    private final int DB_messagePriority_COLUMN = 4;
    private final int DB_username_COLUMN = 5;
    
   public Submit(String courseCode , String message, String messagePriority, String username) {
       this.username = username;
       this.courseCode = courseCode;
       this.message = message;
       this.messagePriority = messagePriority;
       
        
        
        try {
            //connectToDB();
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teachingassistant", "root", "");
        Statement statement = con.createStatement();
        //statement.executeUpdate("INSERT INTO message " + "VALUES (courseCode, message, messagePriority,username)");
       // statement.executeUpdate("INSERT INTO message " + "VALUES (1001, courseCode', 'Mr.', 'Springfield')");
        
        String SQL = "INSERT INTO message (username,coursecode,message,messagePriority) VALUES ('" + username + "','" + courseCode +  "','" + message +  "','"  + messagePriority + "')";
        statement.executeUpdate(SQL);

        
        
        } catch (Exception ex) {
            Logger.getLogger(Validation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //private void connectToDB() throws Exception {
     //   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teachingassistant", "root", "");
    //    Statement statement = con.createStatement();
        //statement.executeUpdate("INSERT INTO message " + "VALUES (courseCode, message, messagePriority,username)");
   //     statement.executeUpdate("INSERT INTO message " + "VALUES (1001, 'courseCode', 'Mr.', 'Springfield')");

        //results = statement.executeQuery("select * from credentials");
        //results.first();
   // }
}
    
