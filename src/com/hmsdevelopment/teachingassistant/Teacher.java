package com.hmsdevelopment.teachingassistant;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author S1127586
 */
public class Teacher extends javax.swing.JFrame {

    String username;
    
    private final ArrayList<String> messagesFromDb = new ArrayList<>();
    private final ArrayList<String> messageIds = new ArrayList<>();
    private Connection con;
    private Statement statement;
    private ResultSet results;

    public Teacher(String username) throws SQLException {
        initComponents();
        this.username = username;
        populateCourseCodes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        tName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        classList = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        Vmessage = new javax.swing.JButton();
        SignOut = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

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
        setPreferredSize(new java.awt.Dimension(1280, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        tName.setForeground(new java.awt.Color(255, 255, 255));
        tName.setText("jLabel2");
        getContentPane().add(tName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 60));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select a class");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 250, 35));

        classList.setBackground(new java.awt.Color(253, 229, 215));
        classList.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        classList.setForeground(new java.awt.Color(168, 67, 5));
        classList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(classList, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 140, 131, 35));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select a priority");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 320, -1));

        jComboBox2.setBackground(new java.awt.Color(253, 229, 215));
        jComboBox2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(168, 67, 5));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 200, 131, 38));

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

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 980, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutActionPerformed
        LoginScreen LI = new LoginScreen(false);
        LI.show();
        this.hide();
    }//GEN-LAST:event_SignOutActionPerformed

    private void VmessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VmessageActionPerformed
        MessageTeacher MT = new MessageTeacher();
        MT.getContentPane().setBackground(new Color(45,64,89));
        //NAME
        username = tName.getText();
        MT.tName.setText(username);

        MT.show();
        this.hide();
    }//GEN-LAST:event_VmessageActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignOut;
    private javax.swing.JButton Vmessage;
    private javax.swing.JComboBox classList;
    private javax.swing.JButton exit;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel tName;
    // End of variables declaration//GEN-END:variables

      private void getMessageForCourseFromDB() throws SQLException {
        messagesFromDb.clear();
        messageIds.clear();
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teachingassistant", "root", "");
        statement = con.createStatement();
        results = statement.executeQuery("select * from message where username = '" 
                + username + "' and courseCode = '" + classList.getSelectedItem() + "' order by courseCode");
        
        if (results.first()) {
            while (!results.isAfterLast()) {
                messagesFromDb.add(results.getString("message"));
                messageIds.add(results.getString("messageID"));
                results.next();
            }
        } 
        
        jList1.setListData(messagesFromDb.toArray(new String[0]));
        
    }
     private void populateCourseCodes() throws SQLException {
        Connection pCCCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/teachingassistant", "root", "");
        Statement pCCStatement = pCCCon.createStatement();
        ResultSet pCCResults = pCCStatement.executeQuery("select * from students");
        pCCResults.first();
        System.out.println(pCCResults.getString(4));
        if(pCCResults.getString(4).equalsIgnoreCase("student")){
            classList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { 
              pCCResults.getString("course1"), 
              pCCResults.getString("course2"), 
              pCCResults.getString("course3") }));
        }
        pCCResults.close();
        pCCStatement.close();
        pCCCon.close();
    }
    


}
