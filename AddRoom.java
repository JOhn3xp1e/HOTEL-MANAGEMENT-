/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.ui;

import com.hotel.util.DatabaseUtil;
import com.hotel.util.DatabaseInitializer;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carla Jean Berjuega
 */
public class AddRoom extends javax.swing.JFrame {

    /**
     * Creates new form AddRoom
     */
    public AddRoom() {
        initComponents();
        try {
            // Ensure database is initialized
            DatabaseInitializer.initialize();
            // Initial table refresh
            refreshRoomTable();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error initializing database: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statusUpdate = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        categoriesCheck = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nameaddNewRoom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        categoriesUpdate = new javax.swing.JComboBox<>();
        statusCheck = new javax.swing.JComboBox<>();
        priceUpdate = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        chooseFileBtn = new javax.swing.JButton();
        updatePathFile = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        saveBtn = new javax.swing.JButton();

        statusUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Booked", "Under Maintenance", "Reserved", "Free" }));
        statusUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusUpdateActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(245, 222, 179));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 51));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/back.png"))); // NOI18N
        jButton5.setText("BACK");
        jButton5.setBorderPainted(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/extra-bed.png"))); // NOI18N
        jLabel2.setText("ADD NEW ROOM");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "RNum", "RName", "RType", "RStatus", "Price", "imgId"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Refresh\n");

        categoriesCheck.setBackground(new java.awt.Color(139, 69, 19));
        categoriesCheck.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        categoriesCheck.setForeground(new java.awt.Color(255, 255, 255));
        categoriesCheck.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "VIP", "STANDARD" }));
        categoriesCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton6.setBackground(new java.awt.Color(139, 69, 19));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Refresh");
        jButton6.setBorderPainted(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusPainted(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Name");

        nameaddNewRoom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameaddNewRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Categories");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Status");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Price");

        categoriesUpdate.setBackground(new java.awt.Color(139, 69, 39));
        categoriesUpdate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        categoriesUpdate.setForeground(new java.awt.Color(255, 255, 255));
        categoriesUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIP", "STANDARD" }));
        categoriesUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        statusCheck.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "Booked", "Under Maintenance", "Reserved", "Free" }));
        statusCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        statusCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusCheckActionPerformed(evt);
            }
        });

        priceUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        addBtn.setBackground(new java.awt.Color(255, 255, 255));
        addBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/extra-bed.png"))); // NOI18N
        addBtn.setText("Add");
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/bin.png"))); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        EditBtn.setBackground(new java.awt.Color(255, 255, 255));
        EditBtn.setFont(new java.awt.Font("Tahoma", 1, 16));
        EditBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/edit.png"))); // NOI18N
        EditBtn.setText("Edit");
        EditBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        chooseFileBtn.setBackground(new java.awt.Color(255, 255, 255));
        chooseFileBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        chooseFileBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/folder.png"))); // NOI18N
        chooseFileBtn.setText("Choose File");
        chooseFileBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileBtnActionPerformed(evt);
            }
        });

        saveBtn = new javax.swing.JButton();
        saveBtn.setBackground(new java.awt.Color(255, 255, 255));
        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 16));
        saveBtn.setText("Save");
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Booked", "Under Maintenance", "Reserved", "Free" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(deleteBtn)
                        .addGap(18, 18, 18)
                        .addComponent(saveBtn)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(82, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(addBtn)
                                .addGap(63, 63, 63)
                                .addComponent(EditBtn)
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(chooseFileBtn)
                                .addGap(133, 133, 133))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(priceUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(updatePathFile, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(categoriesUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(nameaddNewRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(74, 74, 74)))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(categoriesCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(1000, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(28, 28, 28))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriesCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(statusCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameaddNewRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoriesUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updatePathFile, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chooseFileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);

        // Add action listeners for filter changes
        categoriesCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshRoomTable();
            }
        });

        statusCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshRoomTable();
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

         this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void statusUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusUpdateActionPerformed

    private void statusCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusCheckActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        boolean success = insertRoomIntoDatabase();
        if (success) {
            // Clear form fields after successful addition
            clearForm();
            // Refresh the table
            refreshRoomTable();
            // Show success message
            JOptionPane.showMessageDialog(this, "Room added successfully!");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a room to edit");
            return;
        }

        // Get values from selected row
        currentRoomNumber = jTable1.getValueAt(selectedRow, 0).toString();
        String roomName = jTable1.getValueAt(selectedRow, 1).toString();
        String roomType = jTable1.getValueAt(selectedRow, 2).toString();
        currentOldStatus = jTable1.getValueAt(selectedRow, 3).toString();
        double price = Double.parseDouble(jTable1.getValueAt(selectedRow, 4).toString());
        String imagePath = jTable1.getValueAt(selectedRow, 5).toString();

        // Set values to form fields
        nameaddNewRoom.setText(roomName);
        categoriesUpdate.setSelectedItem(roomType);
        jComboBox1.setSelectedItem(currentOldStatus);
        priceUpdate.setText(String.valueOf(price));
        updatePathFile.setText(imagePath);

        // Enable editing of the form fields
        nameaddNewRoom.setEditable(true);
        categoriesUpdate.setEnabled(true);
        jComboBox1.setEnabled(true);
        priceUpdate.setEditable(true);
        updatePathFile.setEditable(true);
        chooseFileBtn.setEnabled(true);
        saveBtn.setEnabled(true);
        EditBtn.setEnabled(false);
        addBtn.setEnabled(false); // Disable add button while editing
    }//GEN-LAST:event_EditBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        if (currentRoomNumber == null || currentOldStatus == null) {
            JOptionPane.showMessageDialog(this, "No room selected for editing");
            return;
        }

        // Show confirmation dialog
        int confirm = JOptionPane.showConfirmDialog(this,
            "Do you want to save the changes?",
            "Confirm Save",
            JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            updateRoom(currentRoomNumber, currentOldStatus);
            
            // Reset editing state
            nameaddNewRoom.setEditable(true);
            categoriesUpdate.setEnabled(true);
            jComboBox1.setEnabled(true);
            priceUpdate.setEditable(true);
            updatePathFile.setEditable(true);
            chooseFileBtn.setEnabled(true);
            saveBtn.setEnabled(false);
            EditBtn.setEnabled(true);
            addBtn.setEnabled(true);
            
            // Clear current room data
            currentRoomNumber = null;
            currentOldStatus = null;
            
            // Clear form fields
            clearForm();
            
            // Refresh the table
            refreshRoomTable();
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void updateRoom(String roomNumber, String oldStatus) {
        // Validate input fields
        if (nameaddNewRoom.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a room name");
            return;
        }
        
        try {
            Double.parseDouble(priceUpdate.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid price");
            return;
        }
        
        if (updatePathFile.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select an image file");
            return;
        }

        String updateRoomSql = "UPDATE Rooms SET room_name = ?, room_type = ?, status = ?, price = ?, image_path = ? WHERE room_number = ?";
        String decreaseOldStatusSql = "UPDATE room_status_counts SET room_count = room_count - 1 WHERE status = ?";
        String increaseNewStatusSql = "UPDATE room_status_counts SET room_count = room_count + 1 WHERE status = ?";
        
        try (Connection conn = DatabaseUtil.connect()) {
            conn.setAutoCommit(false);
            try {
                // Update room details
                try (PreparedStatement pstmt = conn.prepareStatement(updateRoomSql)) {
                    pstmt.setString(1, nameaddNewRoom.getText().trim());
                    pstmt.setString(2, categoriesUpdate.getSelectedItem().toString());
                    pstmt.setString(3, jComboBox1.getSelectedItem().toString());
                    pstmt.setDouble(4, Double.parseDouble(priceUpdate.getText().trim()));
                    pstmt.setString(5, updatePathFile.getText().trim());
                    pstmt.setString(6, roomNumber);
                    pstmt.executeUpdate();
                }

                String newStatus = jComboBox1.getSelectedItem().toString();
                
                // Only update status counts if status has changed
                if (!oldStatus.equals(newStatus)) {
                    // Decrease count for old status
                    try (PreparedStatement pstmt = conn.prepareStatement(decreaseOldStatusSql)) {
                        pstmt.setString(1, oldStatus);
                        pstmt.executeUpdate();
                    }
                    
                    // Increase count for new status
                    try (PreparedStatement pstmt = conn.prepareStatement(increaseNewStatusSql)) {
                        pstmt.setString(1, newStatus);
                        pstmt.executeUpdate();
                    }
                }
                
                // Commit transaction
                conn.commit();
                JOptionPane.showMessageDialog(this, "Room updated successfully");
                refreshRoomTable();
                clearForm();
            } catch (SQLException e) {
                // Rollback transaction on error
                conn.rollback();
                throw e;
            } finally {
                // Reset auto-commit
                conn.setAutoCommit(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating room: " + e.getMessage());
        }
    }

    private void chooseFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileBtnActionPerformed
        JFileChooser fc = new JFileChooser();
        // Add file filter for JPEG images only
        javax.swing.filechooser.FileNameExtensionFilter filter = 
            new javax.swing.filechooser.FileNameExtensionFilter("JPEG Images", "jpg", "jpeg");
        fc.setFileFilter(filter);
        
        int result = fc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File imgfile = fc.getSelectedFile();
            String filepath = imgfile.getAbsolutePath();
            
            // Validate file extension
            if (!filepath.toLowerCase().endsWith(".jpg") && !filepath.toLowerCase().endsWith(".jpeg")) {
                JOptionPane.showMessageDialog(this, 
                    "Please select a JPEG image file (.jpg or .jpeg)", 
                    "Invalid File Type", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            updatePathFile.setText(filepath);
        }
    }//GEN-LAST:event_chooseFileBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a room to delete");
            return;
        }

        String roomNumber = jTable1.getValueAt(selectedRow, 0).toString();
        String roomName = jTable1.getValueAt(selectedRow, 1).toString();
        String currentStatus = jTable1.getValueAt(selectedRow, 3).toString();
        
        int confirm = JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to delete room: " + roomName + "?", 
            "Confirm Delete", 
            JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            String deleteSql = "DELETE FROM Rooms WHERE room_number = ?";
            String updateStatusCountSql = "UPDATE room_status_counts SET room_count = room_count - 1 WHERE status = ?";
            
            try (Connection conn = DatabaseUtil.connect()) {
                conn.setAutoCommit(false);
                try {
                    // Delete the room
                    try (PreparedStatement pstmt = conn.prepareStatement(deleteSql)) {
                        pstmt.setString(1, roomNumber);
                        int rowsAffected = pstmt.executeUpdate();
                        
                        if (rowsAffected == 0) {
                            throw new SQLException("No room was deleted. Room number: " + roomNumber);
                        }
                    }
                    
                    // Update the status count
                    try (PreparedStatement pstmt = conn.prepareStatement(updateStatusCountSql)) {
                        pstmt.setString(1, currentStatus);
                        pstmt.executeUpdate();
                    }
                    
                    // Commit transaction
                    conn.commit();
                    JOptionPane.showMessageDialog(this, "Room deleted successfully");
                    refreshRoomTable();
                } catch (SQLException e) {
                    // Rollback transaction on error
                    conn.rollback();
                    throw e;
                } finally {
                    // Reset auto-commit
                    conn.setAutoCommit(true);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error deleting room: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

   private boolean insertRoomIntoDatabase() {
        // Validate input fields
        if (nameaddNewRoom.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a room name");
            return false;
        }
        
        if (priceUpdate.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a price");
            return false;
        }
        
        try {
            Double.parseDouble(priceUpdate.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid price");
            return false;
        }
        
        if (updatePathFile.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select an image file");
            return false;
        }

        // First, get the next available room number
        String getNextRoomNumber = "SELECT MAX(CAST(room_number AS INTEGER)) + 1 as next_number FROM Rooms";
        String insertSql = "INSERT INTO Rooms (room_number, room_name, room_type, status, price, image_path) VALUES (?, ?, ?, ?, ?, ?)";
        String updateStatusCountSql = "UPDATE room_status_counts SET room_count = room_count + 1 WHERE status = ?";
        
        try (Connection conn = DatabaseUtil.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(getNextRoomNumber)) {
            
            // Get the next room number
            int nextRoomNumber = 1; // Default to 1 if no rooms exist
            if (rs.next()) {
                nextRoomNumber = rs.getInt("next_number");
            }
            
            // Start transaction
            conn.setAutoCommit(false);
            try {
                // Insert the new room
                try (PreparedStatement pstmt = conn.prepareStatement(insertSql)) {
                    pstmt.setInt(1, nextRoomNumber);
                    pstmt.setString(2, nameaddNewRoom.getText().trim());
                    pstmt.setString(3, categoriesUpdate.getSelectedItem().toString());
                    pstmt.setString(4, jComboBox1.getSelectedItem().toString());
                    pstmt.setDouble(5, Double.parseDouble(priceUpdate.getText().trim()));
                    pstmt.setString(6, updatePathFile.getText().trim());
                    pstmt.executeUpdate();
                }
                
                // Update the status count
                try (PreparedStatement pstmt = conn.prepareStatement(updateStatusCountSql)) {
                    pstmt.setString(1, jComboBox1.getSelectedItem().toString());
                    pstmt.executeUpdate();
                }
                
                // Commit transaction
                conn.commit();
                return true;
            } catch (SQLException e) {
                // Rollback transaction on error
                conn.rollback();
                throw e;
            } finally {
                // Reset auto-commit
                conn.setAutoCommit(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding room: " + e.getMessage());
            return false;
        }
    }

    private void clearForm() {
        nameaddNewRoom.setText("");
        categoriesUpdate.setSelectedIndex(0);
        jComboBox1.setSelectedIndex(0);
        priceUpdate.setText("");
        updatePathFile.setText("");
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Reset all form fields and their states
        nameaddNewRoom.setText("");
        categoriesUpdate.setSelectedIndex(0);
        jComboBox1.setSelectedIndex(0);
        priceUpdate.setText("");
        updatePathFile.setText("");
        
        // Enable all form fields for new room entry
        nameaddNewRoom.setEditable(true);
        categoriesUpdate.setEnabled(true);
        jComboBox1.setEnabled(true);
        priceUpdate.setEditable(true);
        updatePathFile.setEditable(true);
        chooseFileBtn.setEnabled(true);
        
        // Reset button states
        saveBtn.setEnabled(false);
        EditBtn.setEnabled(true);
        addBtn.setEnabled(true);
        
        // Clear current editing state
        currentRoomNumber = null;
        currentOldStatus = null;
        
        // Refresh the table with current filters
        refreshRoomTable();
        
        // Show confirmation message
        JOptionPane.showMessageDialog(this, 
            "Form has been reset and is ready for new room entry.",
            "Refresh Complete",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void notifyRoomAdded() {
        JOptionPane.showMessageDialog(this, "Room added successfully!");
        refreshRoomTable();
    }

    private void refreshRoomTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear existing rows
        
        String selectedCategory = categoriesCheck.getSelectedItem().toString();
        String selectedStatus = statusCheck.getSelectedItem().toString();
        
        StringBuilder query = new StringBuilder("SELECT * FROM Rooms WHERE 1=1");
        if (!selectedCategory.equals("ALL")) {
            query.append(" AND room_type = '").append(selectedCategory).append("'");
        }
        if (!selectedStatus.equals("ALL")) {
            query.append(" AND status = '").append(selectedStatus).append("'");
        }
        
        try (Connection conn = DatabaseUtil.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query.toString())) {
            
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("room_number"),
                    rs.getString("room_name"),
                    rs.getString("room_type"),
                    rs.getString("status"),
                    rs.getDouble("price"),
                    rs.getString("image_path")
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error refreshing room table: " + e.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JComboBox<String> categoriesCheck;
    private javax.swing.JComboBox<String> categoriesUpdate;
    private javax.swing.JButton chooseFileBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameaddNewRoom;
    private javax.swing.JTextField priceUpdate;
    private javax.swing.JComboBox<String> statusCheck;
    private javax.swing.JComboBox<String> statusUpdate;
    private javax.swing.JTextField updatePathFile;
    private javax.swing.JButton saveBtn;
    private String currentRoomNumber;
    private String currentOldStatus;
    // End of variables declaration//GEN-END:variables
}
