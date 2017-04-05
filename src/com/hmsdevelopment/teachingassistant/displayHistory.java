package com.hmsdevelopment.teachingassistant;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class displayHistory extends javax.swing.JFrame {

    private final String USERNAME;
    private final ArrayList<String> MESSAGES_LIST;

    public displayHistory(String username) {
        initComponents();
        this.getContentPane().setBackground(new Color(45, 64, 89));
        this.USERNAME = username;
        history h = new history(username);
        this.MESSAGES_LIST = h.getList();
        sName.setText("Welcome " + username);
        setMessages(courseList.getSelectedItem().toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        courseList = new javax.swing.JComboBox();
        jBack = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        exit1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 800));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        sName.setForeground(new java.awt.Color(255, 253, 237));
        sName.setText("jLabel2");
        getContentPane().add(sName, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 16, 454, 30));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 253, 237));
        jLabel2.setText("Select a past message");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 79, -1, -1));

        courseList.setBackground(new java.awt.Color(253, 229, 215));
        courseList.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        courseList.setForeground(new java.awt.Color(168, 67, 5));
        courseList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CMP101", "CMP102", "CMP103" }));
        courseList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseListActionPerformed(evt);
            }
        });
        getContentPane().add(courseList, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 138, 716, 34));

        jBack.setBackground(new java.awt.Color(48, 99, 142));
        jBack.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jBack.setForeground(new java.awt.Color(255, 253, 237));
        jBack.setText("Back");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });
        getContentPane().add(jBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 530, -1, -1));

        jDelete.setBackground(new java.awt.Color(215, 38, 56));
        jDelete.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jDelete.setForeground(new java.awt.Color(255, 253, 237));
        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 530, -1, -1));

        exit1.setBackground(new java.awt.Color(204, 51, 0));
        exit1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        exit1.setForeground(new java.awt.Color(255, 255, 255));
        exit1.setText("X");
        exit1.setBorder(null);
        exit1.setBorderPainted(false);
        exit1.setContentAreaFilled(false);
        exit1.setFocusPainted(false);
        exit1.setFocusable(false);
        exit1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exit1.setPreferredSize(new java.awt.Dimension(1280, 800));
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        getContentPane().add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1232, 0, 78, 52));

        messageList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(messageList);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 710, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void courseListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseListActionPerformed
        setMessages(courseList.getSelectedItem().toString());
    }//GEN-LAST:event_courseListActionPerformed

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        Student s = new Student(USERNAME);
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBackActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_exit1ActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        // get list item
        // message to delete == combobox item location + list item location
        int courseListModifier;

        if (courseList.getSelectedIndex() > 0) {
            courseListModifier = courseList.getSelectedIndex() + 1;
        } else {
            courseListModifier = 0;
        }

        int fieldLocation = courseListModifier + messageList.getSelectedIndex();

        String messageID = MESSAGES_LIST.get(fieldLocation);

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teachingassistant", "root", "");
            PreparedStatement preparedStmt = con.prepareStatement("delete from message where messageID = '" + messageID + "'");
            preparedStmt.execute();
            preparedStmt.close();
            con.close();
            System.out.println("Message Deleted");
        } catch (SQLException ex) {
            System.out.println("Message NOT Deleted");
        }

        displayHistory dh2 = new displayHistory(USERNAME);
        dh2.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox courseList;
    private javax.swing.JButton exit1;
    private javax.swing.JButton jBack;
    private javax.swing.JButton jDelete;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> messageList;
    public javax.swing.JLabel sName;
    // End of variables declaration//GEN-END:variables

    private void setMessages(String courseCode) {
        ArrayList<String> listData = new ArrayList<>();

        for (int i = 0; i < MESSAGES_LIST.size(); i++) {
            if (courseCode.equalsIgnoreCase(MESSAGES_LIST.get(i).substring(3, 9))) {
                listData.add(MESSAGES_LIST.get(i).substring(9));
            }
        }

        messageList.setListData(listData.toArray(new String[0]));
    }
}
