/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.ui;

import com.hotel.service.UserService;
import com.hotel.model.User;
import com.hotel.dao.UserDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Carla Jean Berjuega
 */
public class updateProfile extends javax.swing.JFrame {

    private User currentUser;
    private UserService userService;
   
    
    public updateProfile() {
        initComponents();
        
    }
    
    private void loadUserData() {
   
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        updatefullname = new javax.swing.JTextField();
        updateusername = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        updatephonenumber = new javax.swing.JTextField();
        saveeditprofile = new javax.swing.JButton();
        cancelditprofile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 222, 179));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/user.png"))); // NOI18N
        jLabel2.setText("EDIT PROFILE");

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/HOTELLPIC.jpg"))); // NOI18N
        jLabel30.setText("jLabel30");
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 150, 80), 2));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Full Name:");

        updatefullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatefullnameActionPerformed(evt);
            }
        });

        updateusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateusernameActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("User Name:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Phone Number:");

        updatephonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatephonenumberActionPerformed(evt);
            }
        });

        saveeditprofile.setBackground(new java.awt.Color(255, 255, 255));
        saveeditprofile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        saveeditprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/SAVEACCOUNT.png"))); // NOI18N
        saveeditprofile.setText("SAVE");
        saveeditprofile.setBorderPainted(false);
        saveeditprofile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveeditprofile.setFocusPainted(false);
        saveeditprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveeditprofileActionPerformed(evt);
            }
        });

        cancelditprofile.setBackground(new java.awt.Color(255, 255, 255));
        cancelditprofile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancelditprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/cancel.png"))); // NOI18N
        cancelditprofile.setText("CANCEL");
        cancelditprofile.setBorderPainted(false);
        cancelditprofile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelditprofile.setFocusPainted(false);
        cancelditprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelditprofileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateusername))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(updatephonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(updatefullname)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(saveeditprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelditprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGap(75, 75, 75)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(updatefullname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(updateusername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updatephonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveeditprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelditprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updatefullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatefullnameActionPerformed
        String fullName = updatefullname.getText().trim();
        if (fullName.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Full name cannot be empty.", 
                "Input Error", 
                JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, 
                "Full name updated. Click Save to confirm changes.", 
                "Info", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_updatefullnameActionPerformed

    private void updateusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateusernameActionPerformed
        
    }//GEN-LAST:event_updateusernameActionPerformed

    private void updatephonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatephonenumberActionPerformed
         String phoneNumber = updatephonenumber.getText().trim();
        if (phoneNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Phone number cannot be empty.", 
                "Input Error", 
                JOptionPane.ERROR_MESSAGE);
        } else if (!phoneNumber.matches("\\d{10}")) {
            JOptionPane.showMessageDialog(this, 
                "Phone number must be 10 digits.", 
                "Input Error", 
                JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, 
                "Phone number updated. Click Save to confirm changes.", 
                "Info", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_updatephonenumberActionPerformed

    private void saveeditprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveeditprofileActionPerformed
        
    }//GEN-LAST:event_saveeditprofileActionPerformed

    private void cancelditprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelditprofileActionPerformed
       this.dispose();
    }//GEN-LAST:event_cancelditprofileActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(updateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelditprofile;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton saveeditprofile;
    private javax.swing.JTextField updatefullname;
    private javax.swing.JTextField updatephonenumber;
    private javax.swing.JTextField updateusername;
    // End of variables declaration//GEN-END:variables
}
