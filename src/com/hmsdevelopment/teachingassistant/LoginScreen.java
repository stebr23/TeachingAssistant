package com.hmsdevelopment.teachingassistant;

public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     * @param authError
     */
    public LoginScreen(boolean authError) {
        initComponents();
        if (!authError) {
            errorMessage.setVisible(false);
        }
        
    }
//hello
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JButton();
        errorMessage = new javax.swing.JLabel();
        loginHeader = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(45, 64, 89));
        setMaximumSize(new java.awt.Dimension(1280, 800));
        setMinimumSize(new java.awt.Dimension(1280, 800));
        setName("Login Screen"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 80, 60));

        errorMessage.setBackground(new java.awt.Color(253, 229, 215));
        errorMessage.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        errorMessage.setForeground(new java.awt.Color(168, 67, 5));
        errorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorMessage.setText("username or password incorrect");
        errorMessage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        errorMessage.setOpaque(true);
        getContentPane().add(errorMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 80));

        loginHeader.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 128)); // NOI18N
        loginHeader.setForeground(new java.awt.Color(255, 253, 237));
        loginHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginHeader.setText("Login");
        getContentPane().add(loginHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 180, -1, 197));

        username.setBackground(new java.awt.Color(255, 253, 237));
        username.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 56)); // NOI18N
        username.setForeground(new java.awt.Color(34, 34, 34));
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(null);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 497, 628, 78));

        submit.setBackground(new java.awt.Color(240, 123, 63));
        submit.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 253, 237));
        submit.setText("submit");
        submit.setBorder(null);
        submit.setBorderPainted(false);
        submit.setContentAreaFilled(false);
        submit.setOpaque(true);
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 690, 420, 60));

        password.setBackground(new java.awt.Color(255, 253, 237));
        password.setFont(new java.awt.Font("Arial", 0, 50)); // NOI18N
        password.setForeground(new java.awt.Color(34, 34, 34));
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(null);
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 590, 628, 78));

        background.setBackground(new java.awt.Color(45, 64, 89));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34), 5));
        background.setOpaque(true);
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        Validation validation = new Validation(username.getText(), String.copyValueOf(password.getPassword()));
        this.dispose();
    }//GEN-LAST:event_submitActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JButton exit;
    private javax.swing.JLabel loginHeader;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton submit;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
