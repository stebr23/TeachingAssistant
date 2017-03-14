package com.hmsdevelopment.teachingassistant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Validation {
    
    private String username;
    private String password;
    private final int DB_USERNAME_COLUMN = 2;
    private final int DB_PASSWORD_COLUMN = 3;
    private final int DB_TYPE_COLUMN = 4;
    
    public Validation(String username, String password) {
        this.username = username;
        this.password = password;
        
        try {
            connectToDB();
        } catch (Exception ex) {
            Logger.getLogger(Validation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void connectToDB() throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teachingassistant", "root", "");
        Statement test = con.createStatement();
        ResultSet results = test.executeQuery("select * from credentials");
        
        
        // Check username (db column 2)
        if (!checkMatch(DB_USERNAME_COLUMN, username, results)) {
            validationFailure();
        } else {
            // Check password (column 3)
            if (!checkMatch(DB_PASSWORD_COLUMN, password, results)) {
                validationFailure();
            } else {
                // Check user type
                if (checkMatch(DB_TYPE_COLUMN, "S", results)) {
                    /*
                    StudentScreen student = new StudentScreen(username);
                    student.setVisible(true);
                    */
                } else if (checkMatch(DB_TYPE_COLUMN, "T", results)) {
                    /*
                    TeacherScreen teacher = new TeacherScreen(username);
                    teacher.setVisible(true);
                    */
                }
            }
        }
        
        con.close();
    }
    
    private void validationFailure() {
        LoginScreen loginScreen = new LoginScreen(false);
        loginScreen.setVisible(true);
    }
    
    private boolean checkMatch(int columnNumber, String testString, ResultSet results) throws Exception {
        results.first();
        while (!results.isAfterLast()) {
            if (results.getString(columnNumber).equalsIgnoreCase(testString)) {
                return true;
            } else {
                results.next();
            }
        }
        
        return false;
    }
        
}
