package com.hmsdevelopment.teachingassistant;

import java.awt.Color;

/**
 *
 * @author S1127586
 */
public class Student extends javax.swing.JFrame {
    String history;
    String username;
    String courseID;
    String messagePriority;

    /**
     * Creates new form Student
     *
     * @param username
     */
    public Student(String username) {
        initComponents();
        this.username = username;
        this.getContentPane().setBackground(new Color(45,64,89));
        sName.setText("Welcome " + username);
        history = "hello";
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        courseCode = new javax.swing.JComboBox();
        jMessage = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        messPrio = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        SignOut = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(45, 64, 89));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 800));

        sName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        sName.setForeground(new java.awt.Color(255, 253, 237));
        sName.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 253, 237));
        jLabel2.setText("Select a class");

        courseCode.setBackground(new java.awt.Color(253, 229, 215));
        courseCode.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        courseCode.setForeground(new java.awt.Color(168, 67, 5));
        courseCode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CMP101", "CMP102", "CMP103", }));
        courseCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseCodeActionPerformed(evt);
            }
        });

        jMessage.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jMessage.setForeground(new java.awt.Color(34, 34, 34));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 253, 237));
        jLabel3.setText("Set priority");

        messPrio.setBackground(new java.awt.Color(253, 229, 215));
        messPrio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        messPrio.setForeground(new java.awt.Color(168, 67, 5));
        messPrio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "High", "Medium", "Low", "Email" }));

        jButton1.setBackground(new java.awt.Color(48, 99, 142));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Past messages");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(240, 123, 63));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        SignOut.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        SignOut.setForeground(new java.awt.Color(45, 64, 89));
        SignOut.setText("Sign out");
        SignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(631, 631, 631)
                            .addComponent(courseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(messPrio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jMessage))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(275, 275, 275)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218)
                        .addComponent(SignOut)))
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(sName, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sName))
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(courseCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(messPrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(SignOut))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutActionPerformed
        LoginScreen LI = new LoginScreen(false);
        LI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignOutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        displayHistory dh = new displayHistory(username);
        dh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        courseID = String.valueOf(courseCode.getSelectedItem());
        messagePriority = String.valueOf(messPrio.getSelectedItem());
        Submit submit = new Submit(courseID, jMessage.getText(),messagePriority,username);
        confirmation cfm = new confirmation();
        cfm.getContentPane().setBackground(new Color(45,64,89));
        cfm.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void courseCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseCodeActionPerformed
       
    }//GEN-LAST:event_courseCodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignOut;
    private javax.swing.JComboBox courseCode;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jMessage;
    private javax.swing.JComboBox messPrio;
    public javax.swing.JLabel sName;
    // End of variables declaration//GEN-END:variables



}
