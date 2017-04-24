package com.hmsdevelopment.teachingassistant;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MessageTeacher extends javax.swing.JFrame {

    private String username;
    private String messageId;
    private Connection con;
    private Statement statement;
    
    public MessageTeacher(String username, String messageId) throws SQLException {
        initComponents();
        this.username = username;
        this.messageId = messageId;
        this.getContentPane().setBackground(new Color(45, 64, 89));
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teachingassistant", "root", "");
        statement = con.createStatement();
        ResultSet results = statement.executeQuery("select * from message where messageID = '" + messageId + "'");
        results.first();
        selectedMessage.setText(results.getString("message"));
        tName.setText("Welcome, " + username);
        studentName.setText(results.getString("username") + "     " + results.getString("courseCode"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentName = new javax.swing.JLabel();
        tName = new javax.swing.JLabel();
        jBack = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        selectedMessage = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(45, 64, 89));
        setMinimumSize(new java.awt.Dimension(1280, 800));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1275, 729));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        studentName.setForeground(new java.awt.Color(255, 253, 237));
        studentName.setText("jLabel2");
        getContentPane().add(studentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 550, 40));

        tName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tName.setForeground(new java.awt.Color(255, 253, 237));
        tName.setText("jLabel2");
        getContentPane().add(tName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 550, 40));

        jBack.setBackground(new java.awt.Color(48, 99, 142));
        jBack.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jBack.setForeground(new java.awt.Color(255, 255, 255));
        jBack.setText("Back");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });
        getContentPane().add(jBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 650, 210, 50));

        jDelete.setBackground(new java.awt.Color(215, 38, 56));
        jDelete.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jDelete.setForeground(new java.awt.Color(255, 255, 255));
        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 650, 200, 50));

        selectedMessage.setColumns(20);
        selectedMessage.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        selectedMessage.setForeground(new java.awt.Color(34, 34, 34));
        selectedMessage.setRows(5);
        jScrollPane1.setViewportView(selectedMessage);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 829, 444));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        try {
            con.close();
            Teacher teacher = new Teacher(username);
            teacher.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(MessageTeacher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBackActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        try {
            statement.execute("delete from message where messageID = '" + messageId + "'");
            Teacher teacher = new Teacher(username);
            con.close();
            teacher.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(displayHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBack;
    private javax.swing.JButton jDelete;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea selectedMessage;
    public javax.swing.JLabel studentName;
    public javax.swing.JLabel tName;
    // End of variables declaration//GEN-END:variables
}
