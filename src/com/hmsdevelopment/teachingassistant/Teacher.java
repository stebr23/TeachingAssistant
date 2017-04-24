package com.hmsdevelopment.teachingassistant;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Teacher extends javax.swing.JFrame {

    private String username;
    private String message;
    private final ArrayList<String> messagesFromDb = new ArrayList<>();
    private final ArrayList<String> messageIds = new ArrayList<>();
    private final ArrayList<String> messageSender = new ArrayList<>();

    public Teacher(String username) throws SQLException {
        initComponents();
        this.getContentPane().setBackground(new Color(45, 64, 89));
        this.username = username;
        teacherName.setText("Welcome " + username);
        populateCourseCodes();
        helpPriority.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
            "All",
            "Low",
            "Medium",
            "High",
            "Email Support"
        }));
        getMessageForCourseFromDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        teacherName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        classList = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        helpPriority = new javax.swing.JComboBox();
        Vmessage = new javax.swing.JButton();
        SignOut = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageArea = new javax.swing.JList<>();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(45, 64, 89));
        setMinimumSize(new java.awt.Dimension(1280, 800));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        teacherName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        teacherName.setForeground(new java.awt.Color(255, 255, 255));
        teacherName.setText("jLabel2");
        getContentPane().add(teacherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 680, 60));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select a class");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 250, 35));

        classList.setBackground(new java.awt.Color(253, 229, 215));
        classList.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        classList.setForeground(new java.awt.Color(168, 67, 5));
        classList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        classList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classListActionPerformed(evt);
            }
        });
        getContentPane().add(classList, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 140, 131, 35));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select a priority");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 320, -1));

        helpPriority.setBackground(new java.awt.Color(253, 229, 215));
        helpPriority.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        helpPriority.setForeground(new java.awt.Color(168, 67, 5));
        helpPriority.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        helpPriority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpPriorityActionPerformed(evt);
            }
        });
        getContentPane().add(helpPriority, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 200, 131, 38));

        Vmessage.setBackground(new java.awt.Color(240, 123, 63));
        Vmessage.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        Vmessage.setForeground(new java.awt.Color(255, 255, 255));
        Vmessage.setText("view message");
        Vmessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VmessageActionPerformed(evt);
            }
        });
        getContentPane().add(Vmessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 660, 240, 60));

        SignOut.setText("Sign out");
        SignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutActionPerformed(evt);
            }
        });
        getContentPane().add(SignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 700, -1, -1));

        exit.setBackground(new java.awt.Color(204, 51, 0));
        exit.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.setBorder(null);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.setFocusPainted(false);
        exit.setFocusable(false);
        exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1235, 0, 40, 40));

        messageArea.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        messageArea.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(messageArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 980, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutActionPerformed
        LoginScreen login = new LoginScreen(false);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignOutActionPerformed

    private void VmessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VmessageActionPerformed
        if (!messageArea.isSelectionEmpty()) {
            message = messageArea.getSelectedValue();
            MessageTeacher messageTeacher;
            try {
                messageTeacher = new MessageTeacher(username, messageIds.get(messageArea.getSelectedIndex()));
                messageTeacher.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_VmessageActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void classListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classListActionPerformed
        try {
            getMessageForCourseFromDB();
        } catch (SQLException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_classListActionPerformed

    private void helpPriorityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpPriorityActionPerformed
        try {
            getMessageForCourseFromDB();
        } catch (SQLException ex) {
            Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_helpPriorityActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignOut;
    private javax.swing.JButton Vmessage;
    private javax.swing.JComboBox classList;
    private javax.swing.JButton exit;
    private javax.swing.JComboBox helpPriority;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> messageArea;
    public javax.swing.JLabel teacherName;
    // End of variables declaration//GEN-END:variables

    private void getMessageForCourseFromDB() throws SQLException {
        messagesFromDb.clear();
        messageIds.clear();
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teachingassistant", "root", "");
        Statement statement = con.createStatement();
        String queryPriority;
        
        if (String.valueOf(helpPriority.getSelectedItem()).equalsIgnoreCase("all")) {
            queryPriority = "";
        } else {
            queryPriority = " and messagePriority = '" + String.valueOf(helpPriority.getSelectedItem()) + "'";
        }
        
        ResultSet results = statement.executeQuery("select * from message where courseCode = '" 
                + String.valueOf(classList.getSelectedItem()) + "'" + queryPriority + " order by messageID");
        
        if (results.first()) {
            while (!results.isAfterLast()) {
                messagesFromDb.add(results.getString("username") + "               " + results.getString("messagePriority"));
                messageIds.add(results.getString("messageID"));
                results.next();
            }
        } 
        
        messageArea.setListData(messagesFromDb.toArray(new String[0]));
        
        results.close();
        statement.close();
        con.close();

    }

    private void populateCourseCodes() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teachingassistant", "root", "");
        Statement statement = con.createStatement();
        ResultSet results = statement.executeQuery("select course1, course2, course3 from teachers where username = '" + username + "'");
        results.first();
        classList.setModel(new javax.swing.DefaultComboBoxModel(new String[]{
            results.getString("course1"),
            results.getString("course2"),
            results.getString("course3")
        }));

        results.close();
        statement.close();
        con.close();
    }

}
