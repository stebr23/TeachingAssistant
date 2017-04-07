package com.hmsdevelopment.teachingassistant;

import java.awt.Color;

/**
 *
 * @author S1127586
 */
public class Teacher extends javax.swing.JFrame {

    String username;

    public Teacher(String username) {
        initComponents();
        this.username = username;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        tName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        Vmessage = new javax.swing.JButton();
        SignOut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        exit = new javax.swing.JButton();

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

        jComboBox1.setBackground(new java.awt.Color(253, 229, 215));
        jComboBox1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(168, 67, 5));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 140, 131, 35));

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

        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(34, 34, 34));
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 950, 360));

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
    private javax.swing.JButton exit;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JLabel tName;
    // End of variables declaration//GEN-END:variables
}
