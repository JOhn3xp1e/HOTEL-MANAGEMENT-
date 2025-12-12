/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.ui;

import com.hotel.model.User;
import com.hotel.service.UserService;
import com.hotel.util.DatabaseUtil;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class userDashboard extends javax.swing.JFrame {
    
   
    private User user;

    
    private final Color DEFAULT_COLOR = new Color(34, 45, 65); // Default panel color
    private final Color CLICKED_COLOR = new Color(255, 150, 80);
   
    public userDashboard(User user) {
    this.user = user; // Store user
    initComponents();
    roomspanelguest.setBackground(CLICKED_COLOR);
    reservationspanelguest.setBackground(DEFAULT_COLOR);
    profilepanelguest.setBackground(DEFAULT_COLOR);
    fullnamedisplay.setText(user.getFullName());
    namedisplayprofile.setText(user.getFullName());
    usernameDisplay.setText(user.getUsername());
    phonenumdisplay.setText(user.getPhoneNumber());
    
     displayLoyaltyPoints();
    
    }
    
    private void displayLoyaltyPoints() {
        String sql = "SELECT loyalty_points FROM guest WHERE username = ?";
        try (Connection conn = DatabaseUtil.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getUsername());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int points = rs.getInt("loyalty_points");
                loyaltydisply.setText(String.valueOf(points));
                loyaltypdisplay.setText(String.valueOf(points));
            } else {
                loyaltydisply.setText("0");
                loyaltypdisplay.setText("0");
            }
        } catch (SQLException e) {
            System.out.println("Error fetching loyalty points: " + e.getMessage());
            loyaltydisply.setText("Error");
            loyaltypdisplay.setText("Error");
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fullnamedisplay = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loyaltydisply = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        reservationdisplay = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        roomspanelguest = new javax.swing.JPanel();
        ROOMSDB = new javax.swing.JLabel();
        reservationspanelguest = new javax.swing.JPanel();
        RESERVATIONSDB = new javax.swing.JLabel();
        profilepanelguest = new javax.swing.JPanel();
        PROFILEDB = new javax.swing.JLabel();
        ParentPanel = new javax.swing.JPanel();
        RoomGuestPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        guesttab = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        vipmainpanel = new javax.swing.JPanel();
        viproomaddpanel = new javax.swing.JPanel();
        imagelabelvip = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        viproomnumber = new javax.swing.JLabel();
        viproomname = new javax.swing.JLabel();
        vippriceroom = new javax.swing.JLabel();
        viployaltypoints = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        vipstatusdisplay = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        viproomaddpanel1 = new javax.swing.JPanel();
        imagelabelvip1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        viproomnumber1 = new javax.swing.JLabel();
        viproomname2 = new javax.swing.JLabel();
        vippriceroom1 = new javax.swing.JLabel();
        viployaltypoints1 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        vipstatusdisplay1 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        viproomaddpanel2 = new javax.swing.JPanel();
        imagelabelvip2 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        viproomnumber2 = new javax.swing.JLabel();
        viproomname3 = new javax.swing.JLabel();
        vippriceroom2 = new javax.swing.JLabel();
        viployaltypoints2 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        vipstatusdisplay2 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ordinarymainpanelroom = new javax.swing.JPanel();
        ordinaryaddroompanel = new javax.swing.JPanel();
        imagelabelvip3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        ordinaryroomnumber = new javax.swing.JLabel();
        viproomname1 = new javax.swing.JLabel();
        ordinaryroomprice = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        statusdisplayOrdinary = new javax.swing.JLabel();
        chooseRoom = new javax.swing.JButton();
        ReservationsGuestPanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        totalprice = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        ProfileGuestPanel = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        namedisplayprofile = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        usernameDisplay = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        phonenumdisplay = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        loyaltypdisplay = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        jButton5.setText("jButton5");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton7.setText("jButton7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(34, 45, 65));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome,");

        fullnamedisplay.setFont(new java.awt.Font("Serif", 1, 22)); // NOI18N
        fullnamedisplay.setForeground(new java.awt.Color(255, 255, 255));
        fullnamedisplay.setText("fullname!");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Loyalty Points:");

        loyaltydisply.setForeground(new java.awt.Color(255, 255, 255));
        loyaltydisply.setText("displayloyaltypoints");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("| Current Reservation:");

        reservationdisplay.setForeground(new java.awt.Color(255, 255, 255));
        reservationdisplay.setText("None");

        jButton1.setBackground(new java.awt.Color(255, 150, 80));
        jButton1.setText("LOGOUT ");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loyaltydisply, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reservationdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(633, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fullnamedisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(30, 30, 30))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(fullnamedisplay))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(loyaltydisply)
                    .addComponent(jLabel4)
                    .addComponent(reservationdisplay))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 140));

        jPanel3.setBackground(new java.awt.Color(34, 45, 65));

        jButton4.setBackground(new java.awt.Color(255, 150, 80));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("PROFILE");
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/HOTEL_DE_LULU-removebg-preview (2).png"))); // NOI18N

        roomspanelguest.setBackground(new java.awt.Color(34, 45, 65));
        roomspanelguest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                roomspanelguestMousePressed(evt);
            }
        });

        ROOMSDB.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        ROOMSDB.setForeground(new java.awt.Color(255, 255, 255));
        ROOMSDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/roomsguest.png"))); // NOI18N
        ROOMSDB.setText("ROOMS");
        ROOMSDB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ROOMSDB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ROOMSDBMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ROOMSDBMousePressed(evt);
            }
        });

        javax.swing.GroupLayout roomspanelguestLayout = new javax.swing.GroupLayout(roomspanelguest);
        roomspanelguest.setLayout(roomspanelguestLayout);
        roomspanelguestLayout.setHorizontalGroup(
            roomspanelguestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomspanelguestLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(ROOMSDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roomspanelguestLayout.setVerticalGroup(
            roomspanelguestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ROOMSDB, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        reservationspanelguest.setBackground(new java.awt.Color(34, 45, 65));
        reservationspanelguest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reservationspanelguestMousePressed(evt);
            }
        });

        RESERVATIONSDB.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        RESERVATIONSDB.setForeground(new java.awt.Color(255, 255, 255));
        RESERVATIONSDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/booking (1).png"))); // NOI18N
        RESERVATIONSDB.setText("RESERVATIONS");
        RESERVATIONSDB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RESERVATIONSDB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RESERVATIONSDBMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RESERVATIONSDBMousePressed(evt);
            }
        });

        javax.swing.GroupLayout reservationspanelguestLayout = new javax.swing.GroupLayout(reservationspanelguest);
        reservationspanelguest.setLayout(reservationspanelguestLayout);
        reservationspanelguestLayout.setHorizontalGroup(
            reservationspanelguestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reservationspanelguestLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RESERVATIONSDB, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        reservationspanelguestLayout.setVerticalGroup(
            reservationspanelguestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RESERVATIONSDB, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        profilepanelguest.setBackground(new java.awt.Color(34, 45, 65));
        profilepanelguest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilepanelguestMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                profilepanelguestMousePressed(evt);
            }
        });

        PROFILEDB.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        PROFILEDB.setForeground(new java.awt.Color(255, 255, 255));
        PROFILEDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/user.png"))); // NOI18N
        PROFILEDB.setText("PROFILE");
        PROFILEDB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PROFILEDB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PROFILEDBMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PROFILEDBMousePressed(evt);
            }
        });

        javax.swing.GroupLayout profilepanelguestLayout = new javax.swing.GroupLayout(profilepanelguest);
        profilepanelguest.setLayout(profilepanelguestLayout);
        profilepanelguestLayout.setHorizontalGroup(
            profilepanelguestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilepanelguestLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(PROFILEDB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        profilepanelguestLayout.setVerticalGroup(
            profilepanelguestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PROFILEDB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roomspanelguest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reservationspanelguest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profilepanelguest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(roomspanelguest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reservationspanelguest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(profilepanelguest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 240, 680));

        ParentPanel.setBackground(new java.awt.Color(255, 245, 230));
        ParentPanel.setLayout(new java.awt.CardLayout());

        RoomGuestPanel.setBackground(new java.awt.Color(255, 245, 230));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(34, 45, 65));
        jLabel5.setText("Available Rooms");

        guesttab.setForeground(new java.awt.Color(34, 45, 65));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        vipmainpanel.setBackground(new java.awt.Color(255, 245, 230));

        viproomaddpanel.setBackground(new java.awt.Color(255, 255, 255));

        imagelabelvip.setBackground(new java.awt.Color(204, 255, 204));
        imagelabelvip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hotel1111 (1).jpg"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(139, 69, 19));
        jLabel21.setText("VIP SUIT");

        viproomnumber.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomnumber.setForeground(new java.awt.Color(0, 51, 51));
        viproomnumber.setText("VIP ROOM NUMBER");

        viproomname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomname.setForeground(new java.awt.Color(0, 51, 51));
        viproomname.setText("ROOM NAME");

        vippriceroom.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vippriceroom.setForeground(new java.awt.Color(0, 51, 51));
        vippriceroom.setText("PRICE");

        viployaltypoints.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viployaltypoints.setForeground(new java.awt.Color(0, 51, 51));
        viployaltypoints.setText("LOYALTY");

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel9.setText("Loyalty Points:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel20.setText("ROOM NUMBER:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel23.setText("PRICE:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel24.setText("Status:");

        vipstatusdisplay.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vipstatusdisplay.setForeground(new java.awt.Color(0, 51, 51));
        vipstatusdisplay.setText("STATUSDISPLAY");

        jButton10.setBackground(new java.awt.Color(255, 150, 80));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/check-mark.png"))); // NOI18N
        jButton10.setBorderPainted(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setFocusPainted(false);

        javax.swing.GroupLayout viproomaddpanelLayout = new javax.swing.GroupLayout(viproomaddpanel);
        viproomaddpanel.setLayout(viproomaddpanelLayout);
        viproomaddpanelLayout.setHorizontalGroup(
            viproomaddpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viproomaddpanelLayout.createSequentialGroup()
                .addComponent(imagelabelvip, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(viproomaddpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viproomaddpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(viproomaddpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viproomname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(viproomaddpanelLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viproomnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(viproomaddpanelLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vippriceroom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31))
                            .addGroup(viproomaddpanelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viployaltypoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(viproomaddpanelLayout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vipstatusdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viproomaddpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addGap(120, 120, 120))))
        );
        viproomaddpanelLayout.setVerticalGroup(
            viproomaddpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viproomaddpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addGroup(viproomaddpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viproomnumber)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(viproomname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(viproomaddpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vippriceroom)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(viproomaddpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(vipstatusdisplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(viproomaddpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(viployaltypoints)
                    .addComponent(jButton10))
                .addContainerGap())
            .addComponent(imagelabelvip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        viproomaddpanel1.setBackground(new java.awt.Color(255, 255, 255));

        imagelabelvip1.setBackground(new java.awt.Color(204, 255, 204));
        imagelabelvip1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hotel1111 (1).jpg"))); // NOI18N

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(139, 69, 19));
        jLabel31.setText("VIP SUIT");

        viproomnumber1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomnumber1.setForeground(new java.awt.Color(0, 51, 51));
        viproomnumber1.setText("VIP ROOM NUMBER");

        viproomname2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomname2.setForeground(new java.awt.Color(0, 51, 51));
        viproomname2.setText("ROOM NAME");

        vippriceroom1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vippriceroom1.setForeground(new java.awt.Color(0, 51, 51));
        vippriceroom1.setText("PRICE");

        viployaltypoints1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viployaltypoints1.setForeground(new java.awt.Color(0, 51, 51));
        viployaltypoints1.setText("LOYALTY");

        jLabel32.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel32.setText("Loyalty Points:");

        jLabel33.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel33.setText("ROOM NUMBER:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel34.setText("PRICE:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel35.setText("Status:");

        vipstatusdisplay1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vipstatusdisplay1.setForeground(new java.awt.Color(0, 51, 51));
        vipstatusdisplay1.setText("STATUSDISPLAY");

        jButton12.setBackground(new java.awt.Color(255, 150, 80));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/check-mark.png"))); // NOI18N
        jButton12.setBorderPainted(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setFocusPainted(false);

        javax.swing.GroupLayout viproomaddpanel1Layout = new javax.swing.GroupLayout(viproomaddpanel1);
        viproomaddpanel1.setLayout(viproomaddpanel1Layout);
        viproomaddpanel1Layout.setHorizontalGroup(
            viproomaddpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viproomaddpanel1Layout.createSequentialGroup()
                .addComponent(imagelabelvip1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(viproomaddpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viproomaddpanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(viproomaddpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viproomname2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(viproomaddpanel1Layout.createSequentialGroup()
                                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viproomnumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(viproomaddpanel1Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vippriceroom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31))
                            .addGroup(viproomaddpanel1Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viployaltypoints1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(viproomaddpanel1Layout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vipstatusdisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viproomaddpanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel31)
                        .addGap(120, 120, 120))))
        );
        viproomaddpanel1Layout.setVerticalGroup(
            viproomaddpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viproomaddpanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addGroup(viproomaddpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viproomnumber1)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(viproomname2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(viproomaddpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vippriceroom1)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(viproomaddpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(vipstatusdisplay1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(viproomaddpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(viployaltypoints1)
                    .addComponent(jButton12))
                .addContainerGap())
            .addComponent(imagelabelvip1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        viproomaddpanel2.setBackground(new java.awt.Color(255, 255, 255));

        imagelabelvip2.setBackground(new java.awt.Color(204, 255, 204));
        imagelabelvip2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hotel1111 (1).jpg"))); // NOI18N

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(139, 69, 19));
        jLabel36.setText("VIP SUIT");

        viproomnumber2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomnumber2.setForeground(new java.awt.Color(0, 51, 51));
        viproomnumber2.setText("VIP ROOM NUMBER");

        viproomname3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomname3.setForeground(new java.awt.Color(0, 51, 51));
        viproomname3.setText("ROOM NAME");

        vippriceroom2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vippriceroom2.setForeground(new java.awt.Color(0, 51, 51));
        vippriceroom2.setText("PRICE");

        viployaltypoints2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viployaltypoints2.setForeground(new java.awt.Color(0, 51, 51));
        viployaltypoints2.setText("LOYALTY");

        jLabel37.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel37.setText("Loyalty Points:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel38.setText("ROOM NUMBER:");

        jLabel39.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel39.setText("PRICE:");

        jLabel40.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel40.setText("Status:");

        vipstatusdisplay2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vipstatusdisplay2.setForeground(new java.awt.Color(0, 51, 51));
        vipstatusdisplay2.setText("STATUSDISPLAY");

        jButton13.setBackground(new java.awt.Color(255, 150, 80));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/check-mark.png"))); // NOI18N
        jButton13.setBorderPainted(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setFocusPainted(false);

        javax.swing.GroupLayout viproomaddpanel2Layout = new javax.swing.GroupLayout(viproomaddpanel2);
        viproomaddpanel2.setLayout(viproomaddpanel2Layout);
        viproomaddpanel2Layout.setHorizontalGroup(
            viproomaddpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viproomaddpanel2Layout.createSequentialGroup()
                .addComponent(imagelabelvip2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(viproomaddpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viproomaddpanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(viproomaddpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viproomname3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(viproomaddpanel2Layout.createSequentialGroup()
                                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viproomnumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(viproomaddpanel2Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vippriceroom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31))
                            .addGroup(viproomaddpanel2Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viployaltypoints2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(viproomaddpanel2Layout.createSequentialGroup()
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vipstatusdisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viproomaddpanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel36)
                        .addGap(120, 120, 120))))
        );
        viproomaddpanel2Layout.setVerticalGroup(
            viproomaddpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viproomaddpanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addGap(18, 18, 18)
                .addGroup(viproomaddpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viproomnumber2)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(viproomname3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(viproomaddpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vippriceroom2)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(viproomaddpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(vipstatusdisplay2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(viproomaddpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(viployaltypoints2)
                    .addComponent(jButton13))
                .addContainerGap())
            .addComponent(imagelabelvip2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout vipmainpanelLayout = new javax.swing.GroupLayout(vipmainpanel);
        vipmainpanel.setLayout(vipmainpanelLayout);
        vipmainpanelLayout.setHorizontalGroup(
            vipmainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipmainpanelLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(vipmainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viproomaddpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viproomaddpanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viproomaddpanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        vipmainpanelLayout.setVerticalGroup(
            vipmainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipmainpanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(viproomaddpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329)
                .addComponent(viproomaddpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(viproomaddpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(552, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vipmainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(vipmainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel5);

        guesttab.addTab("Vip Rooms", jScrollPane1);

        ordinarymainpanelroom.setBackground(new java.awt.Color(255, 245, 230));

        ordinaryaddroompanel.setBackground(new java.awt.Color(255, 255, 255));
        ordinaryaddroompanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        imagelabelvip3.setBackground(new java.awt.Color(204, 255, 204));
        imagelabelvip3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hotel1111 (1).jpg"))); // NOI18N
        imagelabelvip3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imagelabelvip3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagelabelvip3MouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(139, 69, 19));
        jLabel22.setText("ORDINARY SUIT");

        ordinaryroomnumber.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ordinaryroomnumber.setForeground(new java.awt.Color(0, 51, 51));
        ordinaryroomnumber.setText("ordinary room num");

        viproomname1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomname1.setForeground(new java.awt.Color(0, 51, 51));
        viproomname1.setText("ROOM NAME");

        ordinaryroomprice.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ordinaryroomprice.setForeground(new java.awt.Color(0, 51, 51));
        ordinaryroomprice.setText("PRICE");

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel14.setText("ROOM NUMBER:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel15.setText("PRICE:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel19.setText("Status");

        statusdisplayOrdinary.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        statusdisplayOrdinary.setForeground(new java.awt.Color(0, 51, 51));
        statusdisplayOrdinary.setText("STATUSDISPLAY");

        chooseRoom.setBackground(new java.awt.Color(255, 150, 80));
        chooseRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/check-mark.png"))); // NOI18N
        chooseRoom.setBorderPainted(false);
        chooseRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chooseRoom.setFocusPainted(false);
        chooseRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseRoomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ordinaryaddroompanelLayout = new javax.swing.GroupLayout(ordinaryaddroompanel);
        ordinaryaddroompanel.setLayout(ordinaryaddroompanelLayout);
        ordinaryaddroompanelLayout.setHorizontalGroup(
            ordinaryaddroompanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryaddroompanelLayout.createSequentialGroup()
                .addComponent(imagelabelvip3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ordinaryaddroompanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ordinaryaddroompanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(ordinaryaddroompanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ordinaryaddroompanelLayout.createSequentialGroup()
                                .addGroup(ordinaryaddroompanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(viproomname1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(ordinaryaddroompanelLayout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ordinaryroomnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ordinaryaddroompanelLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ordinaryroomprice, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(48, 48, 48))
                            .addGroup(ordinaryaddroompanelLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusdisplayOrdinary, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(ordinaryaddroompanelLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel22)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ordinaryaddroompanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chooseRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        ordinaryaddroompanelLayout.setVerticalGroup(
            ordinaryaddroompanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryaddroompanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addGroup(ordinaryaddroompanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordinaryroomnumber)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(viproomname1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ordinaryaddroompanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordinaryroomprice)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(ordinaryaddroompanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(statusdisplayOrdinary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chooseRoom)
                .addContainerGap())
            .addComponent(imagelabelvip3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ordinarymainpanelroomLayout = new javax.swing.GroupLayout(ordinarymainpanelroom);
        ordinarymainpanelroom.setLayout(ordinarymainpanelroomLayout);
        ordinarymainpanelroomLayout.setHorizontalGroup(
            ordinarymainpanelroomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinarymainpanelroomLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(ordinaryaddroompanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ordinarymainpanelroomLayout.setVerticalGroup(
            ordinarymainpanelroomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinarymainpanelroomLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(ordinaryaddroompanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1699, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(ordinarymainpanelroom);

        guesttab.addTab("Ordinary Rooms", jScrollPane2);

        javax.swing.GroupLayout RoomGuestPanelLayout = new javax.swing.GroupLayout(RoomGuestPanel);
        RoomGuestPanel.setLayout(RoomGuestPanelLayout);
        RoomGuestPanelLayout.setHorizontalGroup(
            RoomGuestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomGuestPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(RoomGuestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(guesttab, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        RoomGuestPanelLayout.setVerticalGroup(
            RoomGuestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomGuestPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGap(44, 44, 44)
                .addComponent(guesttab, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        ParentPanel.add(RoomGuestPanel, "card2");

        ReservationsGuestPanel.setBackground(new java.awt.Color(255, 245, 230));

        jLabel10.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel10.setText("My Reservations");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel10)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Booking Date:");

        jLabel8.setText("\n");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("Total:");

        totalprice.setText("price");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Room:");

        jLabel16.setText("roomtype");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setText("Status:");

        jLabel18.setText("status");

        jButton2.setBackground(new java.awt.Color(255, 150, 80));
        jButton2.setText("Pay Now");
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);

        jButton3.setBackground(new java.awt.Color(255, 150, 80));
        jButton3.setText("Cancel Boooking");
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalprice, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(totalprice)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jCalendar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout ReservationsGuestPanelLayout = new javax.swing.GroupLayout(ReservationsGuestPanel);
        ReservationsGuestPanel.setLayout(ReservationsGuestPanelLayout);
        ReservationsGuestPanelLayout.setHorizontalGroup(
            ReservationsGuestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservationsGuestPanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(ReservationsGuestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservationsGuestPanelLayout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservationsGuestPanelLayout.createSequentialGroup()
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))))
        );
        ReservationsGuestPanelLayout.setVerticalGroup(
            ReservationsGuestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservationsGuestPanelLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ParentPanel.add(ReservationsGuestPanel, "card3");

        ProfileGuestPanel.setBackground(new java.awt.Color(255, 245, 230));

        jLabel11.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel11.setText("Profile Information");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel11)
                .addContainerGap(633, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel11)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Name:");

        namedisplayprofile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        namedisplayprofile.setText("namedisplay");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("UserName:");

        usernameDisplay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameDisplay.setText("usernameDisplay");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Phone Number:");

        phonenumdisplay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phonenumdisplay.setText("PHONENUMBER");

        jButton6.setBackground(new java.awt.Color(255, 150, 80));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Edit Profile");
        jButton6.setBorderPainted(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Total Loyalty:");

        loyaltypdisplay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loyaltypdisplay.setText("points");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("REWARD: DISCOUNT IN EVEY TRANSACTION!");

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/HOTELLPIC.jpg"))); // NOI18N
        jLabel30.setText("jLabel30");
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 150, 80), 2));

        javax.swing.GroupLayout ProfileGuestPanelLayout = new javax.swing.GroupLayout(ProfileGuestPanel);
        ProfileGuestPanel.setLayout(ProfileGuestPanelLayout);
        ProfileGuestPanelLayout.setHorizontalGroup(
            ProfileGuestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ProfileGuestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProfileGuestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfileGuestPanelLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loyaltypdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel29)
                    .addGroup(ProfileGuestPanelLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phonenumdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProfileGuestPanelLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProfileGuestPanelLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namedisplayprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        ProfileGuestPanelLayout.setVerticalGroup(
            ProfileGuestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileGuestPanelLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ProfileGuestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfileGuestPanelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(ProfileGuestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(namedisplayprofile))
                        .addGap(40, 40, 40)
                        .addGroup(ProfileGuestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(usernameDisplay))
                        .addGap(51, 51, 51)
                        .addGroup(ProfileGuestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(phonenumdisplay))
                        .addGap(37, 37, 37)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(ProfileGuestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(loyaltypdisplay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jLabel29))
                    .addGroup(ProfileGuestPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );

        ParentPanel.add(ProfileGuestPanel, "card4");

        jPanel1.add(ParentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 920, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ROOMSDBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ROOMSDBMousePressed
    roomspanelguest.setBackground(CLICKED_COLOR);
    reservationspanelguest.setBackground(DEFAULT_COLOR);
    profilepanelguest.setBackground(DEFAULT_COLOR);
    }//GEN-LAST:event_ROOMSDBMousePressed

    private void RESERVATIONSDBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RESERVATIONSDBMousePressed
    roomspanelguest.setBackground(DEFAULT_COLOR);
    reservationspanelguest.setBackground(CLICKED_COLOR);
    profilepanelguest.setBackground(DEFAULT_COLOR);
    }//GEN-LAST:event_RESERVATIONSDBMousePressed

    private void PROFILEDBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROFILEDBMousePressed
    roomspanelguest.setBackground(DEFAULT_COLOR);
    reservationspanelguest.setBackground(DEFAULT_COLOR);
    profilepanelguest.setBackground(CLICKED_COLOR);
    }//GEN-LAST:event_PROFILEDBMousePressed

    private void ROOMSDBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ROOMSDBMouseClicked
        ParentPanel.removeAll();
        ParentPanel.add(RoomGuestPanel);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_ROOMSDBMouseClicked

    private void RESERVATIONSDBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RESERVATIONSDBMouseClicked
        ParentPanel.removeAll();
        ParentPanel.add(ReservationsGuestPanel);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_RESERVATIONSDBMouseClicked

    private void profilepanelguestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilepanelguestMouseClicked
    roomspanelguest.setBackground(DEFAULT_COLOR);
    reservationspanelguest.setBackground(DEFAULT_COLOR);
    profilepanelguest.setBackground(CLICKED_COLOR);
    }//GEN-LAST:event_profilepanelguestMouseClicked

    private void roomspanelguestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomspanelguestMousePressed
    roomspanelguest.setBackground(CLICKED_COLOR);
    reservationspanelguest.setBackground(DEFAULT_COLOR);
    profilepanelguest.setBackground(DEFAULT_COLOR);
    }//GEN-LAST:event_roomspanelguestMousePressed

    private void reservationspanelguestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationspanelguestMousePressed
    roomspanelguest.setBackground(DEFAULT_COLOR);
    reservationspanelguest.setBackground(CLICKED_COLOR);
    profilepanelguest.setBackground(DEFAULT_COLOR);
    }//GEN-LAST:event_reservationspanelguestMousePressed

    private void profilepanelguestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilepanelguestMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_profilepanelguestMousePressed

    private void PROFILEDBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROFILEDBMouseClicked
        ParentPanel.removeAll();
        ParentPanel.add(ProfileGuestPanel);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_PROFILEDBMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        JOptionPane.showConfirmDialog(this, "Are you sure log out?", "Thankyou User!", JOptionPane.YES_NO_OPTION);
        
      login lg = new login();
      lg.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void imagelabelvip3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagelabelvip3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_imagelabelvip3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       updateProfile ip = new updateProfile();
        ip.setVisible(true);
  
    }//GEN-LAST:event_jButton6ActionPerformed

    private void chooseRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseRoomActionPerformed
       StatusChoices sc = new StatusChoices();
       sc.setVisible(true);
    }//GEN-LAST:event_chooseRoomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PROFILEDB;
    private javax.swing.JPanel ParentPanel;
    private javax.swing.JPanel ProfileGuestPanel;
    private javax.swing.JLabel RESERVATIONSDB;
    private javax.swing.JLabel ROOMSDB;
    private javax.swing.JPanel ReservationsGuestPanel;
    private javax.swing.JPanel RoomGuestPanel;
    private javax.swing.JButton chooseRoom;
    private javax.swing.JLabel fullnamedisplay;
    private javax.swing.JTabbedPane guesttab;
    private javax.swing.JLabel imagelabelvip;
    private javax.swing.JLabel imagelabelvip1;
    private javax.swing.JLabel imagelabelvip2;
    private javax.swing.JLabel imagelabelvip3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel loyaltydisply;
    private javax.swing.JLabel loyaltypdisplay;
    private javax.swing.JLabel namedisplayprofile;
    private javax.swing.JPanel ordinaryaddroompanel;
    private javax.swing.JPanel ordinarymainpanelroom;
    private javax.swing.JLabel ordinaryroomnumber;
    private javax.swing.JLabel ordinaryroomprice;
    private javax.swing.JLabel phonenumdisplay;
    private javax.swing.JPanel profilepanelguest;
    private javax.swing.JLabel reservationdisplay;
    private javax.swing.JPanel reservationspanelguest;
    private javax.swing.JPanel roomspanelguest;
    private javax.swing.JLabel statusdisplayOrdinary;
    private javax.swing.JLabel totalprice;
    private javax.swing.JLabel usernameDisplay;
    private javax.swing.JLabel viployaltypoints;
    private javax.swing.JLabel viployaltypoints1;
    private javax.swing.JLabel viployaltypoints2;
    private javax.swing.JPanel vipmainpanel;
    private javax.swing.JLabel vippriceroom;
    private javax.swing.JLabel vippriceroom1;
    private javax.swing.JLabel vippriceroom2;
    private javax.swing.JPanel viproomaddpanel;
    private javax.swing.JPanel viproomaddpanel1;
    private javax.swing.JPanel viproomaddpanel2;
    private javax.swing.JLabel viproomname;
    private javax.swing.JLabel viproomname1;
    private javax.swing.JLabel viproomname2;
    private javax.swing.JLabel viproomname3;
    private javax.swing.JLabel viproomnumber;
    private javax.swing.JLabel viproomnumber1;
    private javax.swing.JLabel viproomnumber2;
    private javax.swing.JLabel vipstatusdisplay;
    private javax.swing.JLabel vipstatusdisplay1;
    private javax.swing.JLabel vipstatusdisplay2;
    // End of variables declaration//GEN-END:variables
}
