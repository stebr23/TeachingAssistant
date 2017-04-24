package com.hmsdevelopment.teachingassistant;

import java.sql.SQLException;


public class TeachingAssistant {
    
    
    public static void main(String[] args) throws SQLException {
        
        LoginScreen login = new LoginScreen(false);
        login.setVisible(true);
        
    }
    
}
