package com.hmsdevelopment.teachingassistant;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class History {
    String end;
    String username;
    String next;
    String message;
    int i;
    int number = 0;
    String CMP;

    private ResultSet results;

    ArrayList list = new ArrayList();

    public History(String username) {
        this.username = username;

        System.out.println(username);

        try {
            connectToDB();
        } catch (Exception ex) {
            Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void connectToDB() throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teachingassistant", "root", "");
        Statement statement = con.createStatement();
        //results = statement.executeQuery("select * from message");
        results = statement.executeQuery("select * from message where username = '" + username + "' order by courseCode");

        results.first();
        
        System.out.println("Username: " + username);
        System.out.println("Username in db: " + results.getString(1));
        
//        do {
//            if (results.getString(1).equalsIgnoreCase(username)) {
//                message = results.getString(4) + results.getString(2) + results.getString(3);
//                System.out.println("Message : " + message);
//                list.add(message);
//            } else {
//                System.out.println("isn't the particular user");
//            }
//            results.next();
//        } while (!results.isAfterLast());

            while (!results.isAfterLast()) {
                message = results.getString(5) + results.getString(2) + results.getString(3);
                System.out.println("Message : " + message);
                list.add(message);
                results.next();
            }

        
        System.out.println(list.toString());
        
    }

    public ArrayList getList() {
        return list;
    }
    
    

}
