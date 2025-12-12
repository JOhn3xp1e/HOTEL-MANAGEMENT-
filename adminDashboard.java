/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.ui;

import com.hotel.model.Guest;
import com.hotel.service.GuestService;
import com.hotel.util.DatabaseUtil;
import java.awt.Color;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class adminDashboard extends javax.swing.JFrame {


    Color DefaultColor, clickedColor, ACCENTColor, HIGHLIGHT_Color;

    public adminDashboard() {

        

        initComponents();

        DefaultColor = new Color(139, 69, 19);
        clickedColor = new Color(0, 51, 51);

        DashboardAd.setBackground(clickedColor);
        DashboardPanel.setBackground(DefaultColor);
        GuestPanel.setBackground(DefaultColor);
        RoomPanel.setBackground(DefaultColor);
        StaffDbPanel.setBackground(DefaultColor);
        SettingsAdPanel.setBackground(DefaultColor);

        MenuName.setText("WELCOME ADMIN");
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        scrollbar1 = new java.awt.Scrollbar();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        DashboardPanel = new javax.swing.JPanel();
        DashboardAd = new javax.swing.JLabel();
        GuestPanel = new javax.swing.JPanel();
        GuestAd = new javax.swing.JLabel();
        RoomPanel = new javax.swing.JPanel();
        RoomAd = new javax.swing.JLabel();
        StaffDbPanel = new javax.swing.JPanel();
        StaffDb = new javax.swing.JLabel();
        SettingsAdPanel = new javax.swing.JPanel();
        SettingsAd = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        MenuName = new javax.swing.JLabel();
        logoutBtnadminDb = new javax.swing.JButton();
        parentPanel = new javax.swing.JPanel();
        first = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        dashboardCard = new javax.swing.JPanel();
        AvailableRPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        displayAvailableRooms = new javax.swing.JLabel();
        OccupiedRpanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        DisplayOccRooms = new javax.swing.JLabel();
        ReservationPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        DisplayReservations = new javax.swing.JLabel();
        TodayReservPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        DisplayTodayReservation = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        guestTable1 = new javax.swing.JTable();
        guestCard = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchingfield = new javax.swing.JTextPane();
        searchBtn = new javax.swing.JButton();
        addnewGuest = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        guestTable = new javax.swing.JTable();
        roomCard = new javax.swing.JPanel();
        addnewRoom = new javax.swing.JButton();
        admintabdb = new javax.swing.JTabbedPane();
        vipScrollPane = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        imagelabelvip8 = new javax.swing.JLabel();
        viproompanel = new javax.swing.JPanel();
        vipaddroompaneldb = new javax.swing.JPanel();
        imagelabelvip1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        viproomnumber = new javax.swing.JLabel();
        viproomname = new javax.swing.JLabel();
        vippriceroom = new javax.swing.JLabel();
        viployaltypoints = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        vipstatusdisplay = new javax.swing.JLabel();
        vipaddroompaneldb1 = new javax.swing.JPanel();
        imagelabelvip4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        viproomnumber1 = new javax.swing.JLabel();
        viproomname2 = new javax.swing.JLabel();
        vippriceroom1 = new javax.swing.JLabel();
        viployaltypoints1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        vipstatusdisplay1 = new javax.swing.JLabel();
        vipaddroompaneldb2 = new javax.swing.JPanel();
        imagelabelvip5 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        viproomnumber2 = new javax.swing.JLabel();
        viproomname3 = new javax.swing.JLabel();
        vippriceroom2 = new javax.swing.JLabel();
        viployaltypoints2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        vipstatusdisplay2 = new javax.swing.JLabel();
        vipaddroompaneldb3 = new javax.swing.JPanel();
        imagelabelvip6 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        viproomnumber3 = new javax.swing.JLabel();
        viproomname4 = new javax.swing.JLabel();
        vippriceroom3 = new javax.swing.JLabel();
        viployaltypoints3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        vipstatusdisplay3 = new javax.swing.JLabel();
        vipaddroompaneldb4 = new javax.swing.JPanel();
        imagelabelvip7 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        viproomnumber4 = new javax.swing.JLabel();
        viproomname5 = new javax.swing.JLabel();
        vippriceroom4 = new javax.swing.JLabel();
        viployaltypoints4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        vipstatusdisplay4 = new javax.swing.JLabel();
        vipaddroompaneldb5 = new javax.swing.JPanel();
        imagelabelvip2 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        viproomnumber5 = new javax.swing.JLabel();
        viproomname6 = new javax.swing.JLabel();
        vippriceroom5 = new javax.swing.JLabel();
        viployaltypoints5 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        vipstatusdisplay5 = new javax.swing.JLabel();
        vipaddroompaneldb6 = new javax.swing.JPanel();
        imagelabelvip16 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        viproomnumber6 = new javax.swing.JLabel();
        viproomname14 = new javax.swing.JLabel();
        vippriceroom6 = new javax.swing.JLabel();
        viployaltypoints6 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        vipstatusdisplay6 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ordinaryroompanel = new javax.swing.JPanel();
        ordinaryaddroompaneldb = new javax.swing.JPanel();
        imagelabelvip3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        ordinaryroomnumber = new javax.swing.JLabel();
        viproomname1 = new javax.swing.JLabel();
        ordinaryroomprice = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        statusdisplayOrdinary = new javax.swing.JLabel();
        ordinaryaddroompaneldb1 = new javax.swing.JPanel();
        imagelabelvip9 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        ordinaryroomnumber1 = new javax.swing.JLabel();
        viproomname7 = new javax.swing.JLabel();
        ordinaryroomprice1 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        statusdisplayOrdinary1 = new javax.swing.JLabel();
        ordinaryaddroompaneldb2 = new javax.swing.JPanel();
        imagelabelvip10 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        ordinaryroomnumber2 = new javax.swing.JLabel();
        viproomname8 = new javax.swing.JLabel();
        ordinaryroomprice2 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        statusdisplayOrdinary2 = new javax.swing.JLabel();
        ordinaryaddroompaneldb3 = new javax.swing.JPanel();
        imagelabelvip11 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        ordinaryroomnumber3 = new javax.swing.JLabel();
        viproomname9 = new javax.swing.JLabel();
        ordinaryroomprice3 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        statusdisplayOrdinary3 = new javax.swing.JLabel();
        ordinaryaddroompaneldb4 = new javax.swing.JPanel();
        imagelabelvip12 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        ordinaryroomnumber4 = new javax.swing.JLabel();
        viproomname10 = new javax.swing.JLabel();
        ordinaryroomprice4 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        statusdisplayOrdinary4 = new javax.swing.JLabel();
        ordinaryaddroompaneldb5 = new javax.swing.JPanel();
        imagelabelvip13 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        ordinaryroomnumber5 = new javax.swing.JLabel();
        viproomname11 = new javax.swing.JLabel();
        ordinaryroomprice5 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        statusdisplayOrdinary5 = new javax.swing.JLabel();
        ordinaryaddroompaneldb6 = new javax.swing.JPanel();
        imagelabelvip14 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        ordinaryroomnumber6 = new javax.swing.JLabel();
        viproomname12 = new javax.swing.JLabel();
        ordinaryroomprice6 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        statusdisplayOrdinary6 = new javax.swing.JLabel();
        ordinaryaddroompaneldb7 = new javax.swing.JPanel();
        imagelabelvip15 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        ordinaryroomnumber7 = new javax.swing.JLabel();
        viproomname13 = new javax.swing.JLabel();
        ordinaryroomprice7 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        statusdisplayOrdinary7 = new javax.swing.JLabel();
        staffCard = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        settingCard = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jLabel13.setText("jLabel13");

        jButton1.setBackground(new java.awt.Color(139, 69, 19));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGOUT");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("jLabel7");

        jCheckBox1.setText("jCheckBox1");
        jScrollPane6.setViewportView(jCheckBox1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(139, 69, 19));

        DashboardPanel.setBackground(new java.awt.Color(139, 69, 19));
        DashboardPanel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DashboardPanelFocusLost(evt);
            }
        });
        DashboardPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DashboardPanelMousePressed(evt);
            }
        });

        DashboardAd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DashboardAd.setForeground(new java.awt.Color(245, 222, 179));
        DashboardAd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/dashboard (2).png"))); // NOI18N
        DashboardAd.setText("DASHBOARD");
        DashboardAd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DashboardAd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardAdMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DashboardAdMousePressed(evt);
            }
        });

        javax.swing.GroupLayout DashboardPanelLayout = new javax.swing.GroupLayout(DashboardPanel);
        DashboardPanel.setLayout(DashboardPanelLayout);
        DashboardPanelLayout.setHorizontalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardPanelLayout.createSequentialGroup()
                .addGap(0, 57, Short.MAX_VALUE)
                .addComponent(DashboardAd, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        DashboardPanelLayout.setVerticalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DashboardAd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        GuestPanel.setBackground(new java.awt.Color(139, 69, 19));
        GuestPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GuestPanelMousePressed(evt);
            }
        });

        GuestAd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        GuestAd.setForeground(new java.awt.Color(245, 222, 179));
        GuestAd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/GUEST.png"))); // NOI18N
        GuestAd.setText("GUEST");
        GuestAd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GuestAd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuestAdMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GuestAdMousePressed(evt);
            }
        });

        javax.swing.GroupLayout GuestPanelLayout = new javax.swing.GroupLayout(GuestPanel);
        GuestPanel.setLayout(GuestPanelLayout);
        GuestPanelLayout.setHorizontalGroup(
            GuestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GuestPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(GuestAd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        GuestPanelLayout.setVerticalGroup(
            GuestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GuestAd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        RoomPanel.setBackground(new java.awt.Color(139, 69, 19));
        RoomPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RoomPanelMousePressed(evt);
            }
        });

        RoomAd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        RoomAd.setForeground(new java.awt.Color(245, 222, 179));
        RoomAd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/bed.png"))); // NOI18N
        RoomAd.setText("ROOM");
        RoomAd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RoomAd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoomAdMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RoomAdMousePressed(evt);
            }
        });

        javax.swing.GroupLayout RoomPanelLayout = new javax.swing.GroupLayout(RoomPanel);
        RoomPanel.setLayout(RoomPanelLayout);
        RoomPanelLayout.setHorizontalGroup(
            RoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(RoomAd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        RoomPanelLayout.setVerticalGroup(
            RoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RoomAd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        StaffDbPanel.setBackground(new java.awt.Color(139, 69, 19));
        StaffDbPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                StaffDbPanelMousePressed(evt);
            }
        });

        StaffDb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        StaffDb.setForeground(new java.awt.Color(245, 222, 179));
        StaffDb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/STAFF.png"))); // NOI18N
        StaffDb.setText("STAFF");
        StaffDb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StaffDb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaffDbMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                StaffDbMousePressed(evt);
            }
        });

        javax.swing.GroupLayout StaffDbPanelLayout = new javax.swing.GroupLayout(StaffDbPanel);
        StaffDbPanel.setLayout(StaffDbPanelLayout);
        StaffDbPanelLayout.setHorizontalGroup(
            StaffDbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaffDbPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(StaffDb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        StaffDbPanelLayout.setVerticalGroup(
            StaffDbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StaffDb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        SettingsAdPanel.setBackground(new java.awt.Color(139, 69, 19));
        SettingsAdPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SettingsAdPanelMousePressed(evt);
            }
        });

        SettingsAd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        SettingsAd.setForeground(new java.awt.Color(245, 222, 179));
        SettingsAd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/settings.png"))); // NOI18N
        SettingsAd.setText("SETTINGS");
        SettingsAd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SettingsAd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingsAdMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SettingsAdMousePressed(evt);
            }
        });

        javax.swing.GroupLayout SettingsAdPanelLayout = new javax.swing.GroupLayout(SettingsAdPanel);
        SettingsAdPanel.setLayout(SettingsAdPanelLayout);
        SettingsAdPanelLayout.setHorizontalGroup(
            SettingsAdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsAdPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(SettingsAd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SettingsAdPanelLayout.setVerticalGroup(
            SettingsAdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SettingsAd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(GuestPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RoomPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(StaffDbPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SettingsAdPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(DashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(GuestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(RoomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(StaffDbPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(SettingsAdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 220, 550));

        jPanel6.setBackground(new java.awt.Color(245, 222, 179));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/HOTEL_DE_LULU-removebg-preview (2).png"))); // NOI18N

        MenuName.setBackground(new java.awt.Color(139, 69, 19));
        MenuName.setFont(new java.awt.Font("Serif", 1, 45)); // NOI18N
        MenuName.setForeground(new java.awt.Color(0, 51, 51));
        MenuName.setText("MAIN DASHBOARD");

        logoutBtnadminDb.setBackground(new java.awt.Color(139, 69, 19));
        logoutBtnadminDb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutBtnadminDb.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtnadminDb.setText("LOGOUT");
        logoutBtnadminDb.setBorderPainted(false);
        logoutBtnadminDb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtnadminDb.setFocusPainted(false);
        logoutBtnadminDb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnadminDbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(logoutBtnadminDb, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(MenuName))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(logoutBtnadminDb, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 150));

        parentPanel.setBackground(new java.awt.Color(204, 255, 102));
        parentPanel.setLayout(new java.awt.CardLayout());

        first.setBackground(new java.awt.Color(245, 245, 220));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/HOTELL (1).jpg"))); // NOI18N

        javax.swing.GroupLayout firstLayout = new javax.swing.GroupLayout(first);
        first.setLayout(firstLayout);
        firstLayout.setHorizontalGroup(
            firstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        firstLayout.setVerticalGroup(
            firstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        parentPanel.add(first, "card7");

        dashboardCard.setBackground(new java.awt.Color(245, 245, 220));

        AvailableRPanel.setBackground(new java.awt.Color(255, 255, 255));
        AvailableRPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        AvailableRPanel.setForeground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Available Rooms");

        displayAvailableRooms.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        displayAvailableRooms.setForeground(new java.awt.Color(0, 51, 51));
        displayAvailableRooms.setText("0");

        javax.swing.GroupLayout AvailableRPanelLayout = new javax.swing.GroupLayout(AvailableRPanel);
        AvailableRPanel.setLayout(AvailableRPanelLayout);
        AvailableRPanelLayout.setHorizontalGroup(
            AvailableRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AvailableRPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AvailableRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayAvailableRooms, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addGroup(AvailableRPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        AvailableRPanelLayout.setVerticalGroup(
            AvailableRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AvailableRPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(displayAvailableRooms)
                .addGap(29, 29, 29))
        );

        OccupiedRpanel.setBackground(new java.awt.Color(255, 255, 255));
        OccupiedRpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 2));
        OccupiedRpanel.setForeground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Occupied Rooms");

        DisplayOccRooms.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DisplayOccRooms.setForeground(new java.awt.Color(0, 51, 51));
        DisplayOccRooms.setText("0");

        javax.swing.GroupLayout OccupiedRpanelLayout = new javax.swing.GroupLayout(OccupiedRpanel);
        OccupiedRpanel.setLayout(OccupiedRpanelLayout);
        OccupiedRpanelLayout.setHorizontalGroup(
            OccupiedRpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OccupiedRpanelLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(29, 29, 29))
            .addGroup(OccupiedRpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DisplayOccRooms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        OccupiedRpanelLayout.setVerticalGroup(
            OccupiedRpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OccupiedRpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(DisplayOccRooms)
                .addGap(27, 27, 27))
        );

        ReservationPanel.setBackground(new java.awt.Color(255, 255, 255));
        ReservationPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 2));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Reservations");

        DisplayReservations.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DisplayReservations.setForeground(new java.awt.Color(0, 51, 51));
        DisplayReservations.setText("0");

        javax.swing.GroupLayout ReservationPanelLayout = new javax.swing.GroupLayout(ReservationPanel);
        ReservationPanel.setLayout(ReservationPanelLayout);
        ReservationPanelLayout.setHorizontalGroup(
            ReservationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservationPanelLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(34, 34, 34))
            .addGroup(ReservationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DisplayReservations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ReservationPanelLayout.setVerticalGroup(
            ReservationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(DisplayReservations)
                .addGap(24, 24, 24))
        );

        TodayReservPanel.setBackground(new java.awt.Color(255, 255, 255));
        TodayReservPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 2));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Today Reservations");

        DisplayTodayReservation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DisplayTodayReservation.setForeground(new java.awt.Color(0, 51, 51));
        DisplayTodayReservation.setText("₱0.0");

        javax.swing.GroupLayout TodayReservPanelLayout = new javax.swing.GroupLayout(TodayReservPanel);
        TodayReservPanel.setLayout(TodayReservPanelLayout);
        TodayReservPanelLayout.setHorizontalGroup(
            TodayReservPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodayReservPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TodayReservPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DisplayTodayReservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        TodayReservPanelLayout.setVerticalGroup(
            TodayReservPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodayReservPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(DisplayTodayReservation)
                .addGap(24, 24, 24))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Current Guests:");

        jScrollPane4.setBorder(null);

        guestTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 20, 20));
        guestTable1.setForeground(new java.awt.Color(255, 255, 255));
        guestTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Full Name", "Room Number", "Check-in Date", "C heck-in Out", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(guestTable1);

        javax.swing.GroupLayout dashboardCardLayout = new javax.swing.GroupLayout(dashboardCard);
        dashboardCard.setLayout(dashboardCardLayout);
        dashboardCardLayout.setHorizontalGroup(
            dashboardCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardCardLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(dashboardCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardCardLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardCardLayout.createSequentialGroup()
                        .addGroup(dashboardCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dashboardCardLayout.createSequentialGroup()
                                .addComponent(AvailableRPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(OccupiedRpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(ReservationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TodayReservPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );
        dashboardCardLayout.setVerticalGroup(
            dashboardCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardCardLayout.createSequentialGroup()
                .addGroup(dashboardCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TodayReservPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReservationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashboardCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(dashboardCardLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(OccupiedRpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dashboardCardLayout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(AvailableRPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        parentPanel.add(dashboardCard, "card6");

        guestCard.setBackground(new java.awt.Color(245, 245, 220));

        searchingfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(searchingfield);

        searchBtn.setBackground(new java.awt.Color(139, 69, 19));
        searchBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        searchBtn.setBorderPainted(false);
        searchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBtn.setFocusPainted(false);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        addnewGuest.setBackground(new java.awt.Color(139, 69, 19));
        addnewGuest.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addnewGuest.setForeground(new java.awt.Color(255, 255, 255));
        addnewGuest.setText("Add New Guest");
        addnewGuest.setBorderPainted(false);
        addnewGuest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addnewGuest.setFocusPainted(false);
        addnewGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewGuestActionPerformed(evt);
            }
        });

        jScrollPane3.setBorder(null);
        jScrollPane3.setWheelScrollingEnabled(false);

        guestTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 20, 20));
        guestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Full Name", "Age", "Phone Number", "Room Number", "Check-in Date", "Check-out Date", "Status", "Points"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(guestTable);
        if (guestTable.getColumnModel().getColumnCount() > 0) {
            guestTable.getColumnModel().getColumn(5).setHeaderValue("Check-out Date");
            guestTable.getColumnModel().getColumn(6).setHeaderValue("Status");
            guestTable.getColumnModel().getColumn(7).setHeaderValue("Points");
        }

        javax.swing.GroupLayout guestCardLayout = new javax.swing.GroupLayout(guestCard);
        guestCard.setLayout(guestCardLayout);
        guestCardLayout.setHorizontalGroup(
            guestCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guestCardLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(searchBtn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guestCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guestCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guestCardLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addnewGuest)))
                .addContainerGap())
        );
        guestCardLayout.setVerticalGroup(
            guestCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guestCardLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(addnewGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(guestCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBtn)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        parentPanel.add(guestCard, "card3");

        roomCard.setBackground(new java.awt.Color(245, 245, 220));
        roomCard.setFocusTraversalPolicyProvider(true);
        roomCard.setFocusable(false);

        addnewRoom.setBackground(new java.awt.Color(139, 69, 19));
        addnewRoom.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addnewRoom.setForeground(new java.awt.Color(255, 255, 255));
        addnewRoom.setText("Add New Room");
        addnewRoom.setBorderPainted(false);
        addnewRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addnewRoom.setFocusPainted(false);
        addnewRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewRoomActionPerformed(evt);
            }
        });

        admintabdb.setForeground(new java.awt.Color(139, 69, 19));
        admintabdb.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        admintabdb.setAutoscrolls(true);
        admintabdb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel7.setBackground(new java.awt.Color(245, 245, 220));

        imagelabelvip8.setBackground(new java.awt.Color(204, 255, 204));

        viproompanel.setBackground(new java.awt.Color(245, 222, 179));

        vipaddroompaneldb.setBackground(new java.awt.Color(255, 255, 255));

        imagelabelvip1.setBackground(new java.awt.Color(204, 255, 204));
        imagelabelvip1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hotel1111 (1).jpg"))); // NOI18N

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel8.setText("Loyalty Points:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel20.setText("ROOM NUMBER:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel23.setText("PRICE:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel24.setText("Status:");

        vipstatusdisplay.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vipstatusdisplay.setForeground(new java.awt.Color(0, 51, 51));
        vipstatusdisplay.setText("STATUSDISPLAY");

        javax.swing.GroupLayout vipaddroompaneldbLayout = new javax.swing.GroupLayout(vipaddroompaneldb);
        vipaddroompaneldb.setLayout(vipaddroompaneldbLayout);
        vipaddroompaneldbLayout.setHorizontalGroup(
            vipaddroompaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipaddroompaneldbLayout.createSequentialGroup()
                .addComponent(imagelabelvip1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vipaddroompaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viproomname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(vipaddroompaneldbLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(vipaddroompaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viproomnumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vipaddroompaneldbLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(97, 97, 97))))
                    .addGroup(vipaddroompaneldbLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viployaltypoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(vipaddroompaneldbLayout.createSequentialGroup()
                        .addGroup(vipaddroompaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(vipaddroompaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(vipaddroompaneldbLayout.createSequentialGroup()
                                .addComponent(vipstatusdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(vipaddroompaneldbLayout.createSequentialGroup()
                                .addComponent(vippriceroom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31)))))
                .addContainerGap())
        );
        vipaddroompaneldbLayout.setVerticalGroup(
            vipaddroompaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipaddroompaneldbLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addGroup(vipaddroompaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viproomnumber)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(viproomname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vipaddroompaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vippriceroom)
                    .addComponent(jLabel23))
                .addGroup(vipaddroompaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vipaddroompaneldbLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(vipaddroompaneldbLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vipstatusdisplay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(vipaddroompaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(viployaltypoints))
                .addContainerGap())
            .addComponent(imagelabelvip1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        vipaddroompaneldb1.setBackground(new java.awt.Color(255, 255, 255));

        imagelabelvip4.setBackground(new java.awt.Color(204, 255, 204));
        imagelabelvip4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hotel1111 (1).jpg"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(139, 69, 19));
        jLabel25.setText("VIP SUIT");

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

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel12.setText("Loyalty Points:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel26.setText("ROOM NUMBER:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel27.setText("PRICE:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel28.setText("Status:");

        vipstatusdisplay1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vipstatusdisplay1.setForeground(new java.awt.Color(0, 51, 51));
        vipstatusdisplay1.setText("STATUSDISPLAY");

        javax.swing.GroupLayout vipaddroompaneldb1Layout = new javax.swing.GroupLayout(vipaddroompaneldb1);
        vipaddroompaneldb1.setLayout(vipaddroompaneldb1Layout);
        vipaddroompaneldb1Layout.setHorizontalGroup(
            vipaddroompaneldb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipaddroompaneldb1Layout.createSequentialGroup()
                .addComponent(imagelabelvip4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vipaddroompaneldb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viproomname2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(vipaddroompaneldb1Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(vipaddroompaneldb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viproomnumber1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vipaddroompaneldb1Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(97, 97, 97))))
                    .addGroup(vipaddroompaneldb1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viployaltypoints1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(vipaddroompaneldb1Layout.createSequentialGroup()
                        .addGroup(vipaddroompaneldb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(vipaddroompaneldb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(vipaddroompaneldb1Layout.createSequentialGroup()
                                .addComponent(vipstatusdisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(vipaddroompaneldb1Layout.createSequentialGroup()
                                .addComponent(vippriceroom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31)))))
                .addContainerGap())
        );
        vipaddroompaneldb1Layout.setVerticalGroup(
            vipaddroompaneldb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipaddroompaneldb1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addGroup(vipaddroompaneldb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viproomnumber1)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(viproomname2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vipaddroompaneldb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vippriceroom1)
                    .addComponent(jLabel27))
                .addGroup(vipaddroompaneldb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vipaddroompaneldb1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(vipaddroompaneldb1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vipstatusdisplay1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(vipaddroompaneldb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(viployaltypoints1))
                .addContainerGap())
            .addComponent(imagelabelvip4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        vipaddroompaneldb2.setBackground(new java.awt.Color(255, 255, 255));

        imagelabelvip5.setBackground(new java.awt.Color(204, 255, 204));
        imagelabelvip5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hotel1111 (1).jpg"))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(139, 69, 19));
        jLabel29.setText("VIP SUIT");

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

        jLabel16.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel16.setText("Loyalty Points:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel30.setText("ROOM NUMBER:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel31.setText("PRICE:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel32.setText("Status:");

        vipstatusdisplay2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vipstatusdisplay2.setForeground(new java.awt.Color(0, 51, 51));
        vipstatusdisplay2.setText("STATUSDISPLAY");

        javax.swing.GroupLayout vipaddroompaneldb2Layout = new javax.swing.GroupLayout(vipaddroompaneldb2);
        vipaddroompaneldb2.setLayout(vipaddroompaneldb2Layout);
        vipaddroompaneldb2Layout.setHorizontalGroup(
            vipaddroompaneldb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipaddroompaneldb2Layout.createSequentialGroup()
                .addComponent(imagelabelvip5, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vipaddroompaneldb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viproomname3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(vipaddroompaneldb2Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(vipaddroompaneldb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viproomnumber2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vipaddroompaneldb2Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(97, 97, 97))))
                    .addGroup(vipaddroompaneldb2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viployaltypoints2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(vipaddroompaneldb2Layout.createSequentialGroup()
                        .addGroup(vipaddroompaneldb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(vipaddroompaneldb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(vipaddroompaneldb2Layout.createSequentialGroup()
                                .addComponent(vipstatusdisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(vipaddroompaneldb2Layout.createSequentialGroup()
                                .addComponent(vippriceroom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31)))))
                .addContainerGap())
        );
        vipaddroompaneldb2Layout.setVerticalGroup(
            vipaddroompaneldb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipaddroompaneldb2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addGroup(vipaddroompaneldb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viproomnumber2)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(viproomname3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vipaddroompaneldb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vippriceroom2)
                    .addComponent(jLabel31))
                .addGroup(vipaddroompaneldb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vipaddroompaneldb2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(vipaddroompaneldb2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vipstatusdisplay2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(vipaddroompaneldb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(viployaltypoints2))
                .addContainerGap())
            .addComponent(imagelabelvip5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        vipaddroompaneldb3.setBackground(new java.awt.Color(255, 255, 255));

        imagelabelvip6.setBackground(new java.awt.Color(204, 255, 204));
        imagelabelvip6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hotel1111 (1).jpg"))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(139, 69, 19));
        jLabel33.setText("VIP SUIT");

        viproomnumber3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomnumber3.setForeground(new java.awt.Color(0, 51, 51));
        viproomnumber3.setText("VIP ROOM NUMBER");

        viproomname4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomname4.setForeground(new java.awt.Color(0, 51, 51));
        viproomname4.setText("ROOM NAME");

        vippriceroom3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vippriceroom3.setForeground(new java.awt.Color(0, 51, 51));
        vippriceroom3.setText("PRICE");

        viployaltypoints3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viployaltypoints3.setForeground(new java.awt.Color(0, 51, 51));
        viployaltypoints3.setText("LOYALTY");

        jLabel17.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel17.setText("Loyalty Points:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel34.setText("ROOM NUMBER:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel35.setText("PRICE:");

        jLabel36.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel36.setText("Status:");

        vipstatusdisplay3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vipstatusdisplay3.setForeground(new java.awt.Color(0, 51, 51));
        vipstatusdisplay3.setText("STATUSDISPLAY");

        javax.swing.GroupLayout vipaddroompaneldb3Layout = new javax.swing.GroupLayout(vipaddroompaneldb3);
        vipaddroompaneldb3.setLayout(vipaddroompaneldb3Layout);
        vipaddroompaneldb3Layout.setHorizontalGroup(
            vipaddroompaneldb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipaddroompaneldb3Layout.createSequentialGroup()
                .addComponent(imagelabelvip6, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vipaddroompaneldb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viproomname4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(vipaddroompaneldb3Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(vipaddroompaneldb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viproomnumber3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vipaddroompaneldb3Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(97, 97, 97))))
                    .addGroup(vipaddroompaneldb3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viployaltypoints3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(vipaddroompaneldb3Layout.createSequentialGroup()
                        .addGroup(vipaddroompaneldb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(vipaddroompaneldb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(vipaddroompaneldb3Layout.createSequentialGroup()
                                .addComponent(vipstatusdisplay3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(vipaddroompaneldb3Layout.createSequentialGroup()
                                .addComponent(vippriceroom3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31)))))
                .addContainerGap())
        );
        vipaddroompaneldb3Layout.setVerticalGroup(
            vipaddroompaneldb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipaddroompaneldb3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addGroup(vipaddroompaneldb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viproomnumber3)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(viproomname4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vipaddroompaneldb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vippriceroom3)
                    .addComponent(jLabel35))
                .addGroup(vipaddroompaneldb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vipaddroompaneldb3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(vipaddroompaneldb3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vipstatusdisplay3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(vipaddroompaneldb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(viployaltypoints3))
                .addContainerGap())
            .addComponent(imagelabelvip6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        vipaddroompaneldb4.setBackground(new java.awt.Color(255, 255, 255));

        imagelabelvip7.setBackground(new java.awt.Color(204, 255, 204));
        imagelabelvip7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hotel1111 (1).jpg"))); // NOI18N

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(139, 69, 19));
        jLabel37.setText("VIP SUIT");

        viproomnumber4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomnumber4.setForeground(new java.awt.Color(0, 51, 51));
        viproomnumber4.setText("VIP ROOM NUMBER");

        viproomname5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomname5.setForeground(new java.awt.Color(0, 51, 51));
        viproomname5.setText("ROOM NAME");

        vippriceroom4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vippriceroom4.setForeground(new java.awt.Color(0, 51, 51));
        vippriceroom4.setText("PRICE");

        viployaltypoints4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viployaltypoints4.setForeground(new java.awt.Color(0, 51, 51));
        viployaltypoints4.setText("LOYALTY");

        jLabel18.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel18.setText("Loyalty Points:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel38.setText("ROOM NUMBER:");

        jLabel39.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel39.setText("PRICE:");

        jLabel40.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel40.setText("Status:");

        vipstatusdisplay4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vipstatusdisplay4.setForeground(new java.awt.Color(0, 51, 51));
        vipstatusdisplay4.setText("STATUSDISPLAY");

        javax.swing.GroupLayout vipaddroompaneldb4Layout = new javax.swing.GroupLayout(vipaddroompaneldb4);
        vipaddroompaneldb4.setLayout(vipaddroompaneldb4Layout);
        vipaddroompaneldb4Layout.setHorizontalGroup(
            vipaddroompaneldb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipaddroompaneldb4Layout.createSequentialGroup()
                .addComponent(imagelabelvip7, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vipaddroompaneldb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viproomname5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(vipaddroompaneldb4Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(vipaddroompaneldb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viproomnumber4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vipaddroompaneldb4Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(97, 97, 97))))
                    .addGroup(vipaddroompaneldb4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viployaltypoints4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(vipaddroompaneldb4Layout.createSequentialGroup()
                        .addGroup(vipaddroompaneldb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(vipaddroompaneldb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(vipaddroompaneldb4Layout.createSequentialGroup()
                                .addComponent(vipstatusdisplay4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(vipaddroompaneldb4Layout.createSequentialGroup()
                                .addComponent(vippriceroom4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31)))))
                .addContainerGap())
        );
        vipaddroompaneldb4Layout.setVerticalGroup(
            vipaddroompaneldb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipaddroompaneldb4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addGap(18, 18, 18)
                .addGroup(vipaddroompaneldb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viproomnumber4)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(viproomname5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vipaddroompaneldb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vippriceroom4)
                    .addComponent(jLabel39))
                .addGroup(vipaddroompaneldb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vipaddroompaneldb4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(vipaddroompaneldb4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vipstatusdisplay4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(vipaddroompaneldb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(viployaltypoints4))
                .addContainerGap())
            .addComponent(imagelabelvip7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        vipaddroompaneldb5.setBackground(new java.awt.Color(255, 255, 255));

        imagelabelvip2.setBackground(new java.awt.Color(204, 255, 204));
        imagelabelvip2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hotel1111 (1).jpg"))); // NOI18N

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(139, 69, 19));
        jLabel41.setText("VIP SUIT");

        viproomnumber5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomnumber5.setForeground(new java.awt.Color(0, 51, 51));
        viproomnumber5.setText("VIP ROOM NUMBER");

        viproomname6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomname6.setForeground(new java.awt.Color(0, 51, 51));
        viproomname6.setText("ROOM NAME");

        vippriceroom5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vippriceroom5.setForeground(new java.awt.Color(0, 51, 51));
        vippriceroom5.setText("PRICE");

        viployaltypoints5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viployaltypoints5.setForeground(new java.awt.Color(0, 51, 51));
        viployaltypoints5.setText("LOYALTY");

        jLabel42.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel42.setText("Loyalty Points:");

        jLabel43.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel43.setText("ROOM NUMBER:");

        jLabel44.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel44.setText("PRICE:");

        jLabel45.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel45.setText("Status:");

        vipstatusdisplay5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vipstatusdisplay5.setForeground(new java.awt.Color(0, 51, 51));
        vipstatusdisplay5.setText("STATUSDISPLAY");

        javax.swing.GroupLayout vipaddroompaneldb5Layout = new javax.swing.GroupLayout(vipaddroompaneldb5);
        vipaddroompaneldb5.setLayout(vipaddroompaneldb5Layout);
        vipaddroompaneldb5Layout.setHorizontalGroup(
            vipaddroompaneldb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipaddroompaneldb5Layout.createSequentialGroup()
                .addComponent(imagelabelvip2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vipaddroompaneldb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viproomname6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(vipaddroompaneldb5Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(vipaddroompaneldb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viproomnumber5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vipaddroompaneldb5Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(97, 97, 97))))
                    .addGroup(vipaddroompaneldb5Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viployaltypoints5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(vipaddroompaneldb5Layout.createSequentialGroup()
                        .addGroup(vipaddroompaneldb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(vipaddroompaneldb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(vipaddroompaneldb5Layout.createSequentialGroup()
                                .addComponent(vipstatusdisplay5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(vipaddroompaneldb5Layout.createSequentialGroup()
                                .addComponent(vippriceroom5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31)))))
                .addContainerGap())
        );
        vipaddroompaneldb5Layout.setVerticalGroup(
            vipaddroompaneldb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipaddroompaneldb5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addGroup(vipaddroompaneldb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viproomnumber5)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(viproomname6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vipaddroompaneldb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vippriceroom5)
                    .addComponent(jLabel44))
                .addGroup(vipaddroompaneldb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vipaddroompaneldb5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(vipaddroompaneldb5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vipstatusdisplay5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(vipaddroompaneldb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(viployaltypoints5))
                .addContainerGap())
            .addComponent(imagelabelvip2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        vipaddroompaneldb6.setBackground(new java.awt.Color(255, 255, 255));

        imagelabelvip16.setBackground(new java.awt.Color(204, 255, 204));
        imagelabelvip16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hotel1111 (1).jpg"))); // NOI18N

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(139, 69, 19));
        jLabel74.setText("VIP SUIT");

        viproomnumber6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomnumber6.setForeground(new java.awt.Color(0, 51, 51));
        viproomnumber6.setText("VIP ROOM NUMBER");

        viproomname14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomname14.setForeground(new java.awt.Color(0, 51, 51));
        viproomname14.setText("ROOM NAME");

        vippriceroom6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vippriceroom6.setForeground(new java.awt.Color(0, 51, 51));
        vippriceroom6.setText("PRICE");

        viployaltypoints6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viployaltypoints6.setForeground(new java.awt.Color(0, 51, 51));
        viployaltypoints6.setText("LOYALTY");

        jLabel75.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel75.setText("Loyalty Points:");

        jLabel76.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel76.setText("ROOM NUMBER:");

        jLabel77.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel77.setText("PRICE:");

        jLabel78.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel78.setText("Status:");

        vipstatusdisplay6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        vipstatusdisplay6.setForeground(new java.awt.Color(0, 51, 51));
        vipstatusdisplay6.setText("STATUSDISPLAY");

        javax.swing.GroupLayout vipaddroompaneldb6Layout = new javax.swing.GroupLayout(vipaddroompaneldb6);
        vipaddroompaneldb6.setLayout(vipaddroompaneldb6Layout);
        vipaddroompaneldb6Layout.setHorizontalGroup(
            vipaddroompaneldb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipaddroompaneldb6Layout.createSequentialGroup()
                .addComponent(imagelabelvip16, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vipaddroompaneldb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viproomname14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(vipaddroompaneldb6Layout.createSequentialGroup()
                        .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(vipaddroompaneldb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viproomnumber6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vipaddroompaneldb6Layout.createSequentialGroup()
                                .addComponent(jLabel74)
                                .addGap(97, 97, 97))))
                    .addGroup(vipaddroompaneldb6Layout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viployaltypoints6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(vipaddroompaneldb6Layout.createSequentialGroup()
                        .addGroup(vipaddroompaneldb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(vipaddroompaneldb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(vipaddroompaneldb6Layout.createSequentialGroup()
                                .addComponent(vipstatusdisplay6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(vipaddroompaneldb6Layout.createSequentialGroup()
                                .addComponent(vippriceroom6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31)))))
                .addContainerGap())
        );
        vipaddroompaneldb6Layout.setVerticalGroup(
            vipaddroompaneldb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipaddroompaneldb6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74)
                .addGap(18, 18, 18)
                .addGroup(vipaddroompaneldb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viproomnumber6)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(viproomname14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vipaddroompaneldb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vippriceroom6)
                    .addComponent(jLabel77))
                .addGroup(vipaddroompaneldb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vipaddroompaneldb6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(vipaddroompaneldb6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vipstatusdisplay6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(vipaddroompaneldb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(viployaltypoints6))
                .addContainerGap())
            .addComponent(imagelabelvip16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout viproompanelLayout = new javax.swing.GroupLayout(viproompanel);
        viproompanel.setLayout(viproompanelLayout);
        viproompanelLayout.setHorizontalGroup(
            viproompanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viproompanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viproompanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vipaddroompaneldb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vipaddroompaneldb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vipaddroompaneldb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vipaddroompaneldb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vipaddroompaneldb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vipaddroompaneldb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vipaddroompaneldb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        viproompanelLayout.setVerticalGroup(
            viproompanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viproompanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vipaddroompaneldb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vipaddroompaneldb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vipaddroompaneldb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vipaddroompaneldb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vipaddroompaneldb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vipaddroompaneldb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vipaddroompaneldb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(580, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(imagelabelvip8, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(viproompanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(viproompanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 542, Short.MAX_VALUE)
                .addComponent(imagelabelvip8, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );

        vipScrollPane.setViewportView(jPanel7);

        admintabdb.addTab("Vip Rooms", vipScrollPane);

        ordinaryroompanel.setBackground(new java.awt.Color(245, 222, 179));
        ordinaryroompanel.setDoubleBuffered(false);

        ordinaryaddroompaneldb.setBackground(new java.awt.Color(255, 255, 255));

        imagelabelvip3.setBackground(new java.awt.Color(204, 255, 204));
        imagelabelvip3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hotel1111 (1).jpg"))); // NOI18N

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

        javax.swing.GroupLayout ordinaryaddroompaneldbLayout = new javax.swing.GroupLayout(ordinaryaddroompaneldb);
        ordinaryaddroompaneldb.setLayout(ordinaryaddroompaneldbLayout);
        ordinaryaddroompaneldbLayout.setHorizontalGroup(
            ordinaryaddroompaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryaddroompaneldbLayout.createSequentialGroup()
                .addComponent(imagelabelvip3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ordinaryaddroompaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ordinaryaddroompaneldbLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel22)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ordinaryaddroompaneldbLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(ordinaryaddroompaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ordinaryaddroompaneldbLayout.createSequentialGroup()
                                .addGroup(ordinaryaddroompaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(viproomname1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(ordinaryaddroompaneldbLayout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ordinaryroomnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ordinaryaddroompaneldbLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ordinaryroomprice, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(48, 48, 48))
                            .addGroup(ordinaryaddroompaneldbLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusdisplayOrdinary, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        ordinaryaddroompaneldbLayout.setVerticalGroup(
            ordinaryaddroompaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryaddroompaneldbLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addGroup(ordinaryaddroompaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordinaryroomnumber)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(viproomname1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ordinaryaddroompaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordinaryroomprice)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(ordinaryaddroompaneldbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(statusdisplayOrdinary))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(imagelabelvip3, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );

        ordinaryaddroompaneldb1.setBackground(new java.awt.Color(255, 255, 255));

        imagelabelvip9.setBackground(new java.awt.Color(204, 255, 204));
        imagelabelvip9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hotel1111 (1).jpg"))); // NOI18N

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(139, 69, 19));
        jLabel46.setText("ORDINARY SUIT");

        ordinaryroomnumber1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ordinaryroomnumber1.setForeground(new java.awt.Color(0, 51, 51));
        ordinaryroomnumber1.setText("ordinary room num");

        viproomname7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomname7.setForeground(new java.awt.Color(0, 51, 51));
        viproomname7.setText("ROOM NAME");

        ordinaryroomprice1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ordinaryroomprice1.setForeground(new java.awt.Color(0, 51, 51));
        ordinaryroomprice1.setText("PRICE");

        jLabel47.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel47.setText("ROOM NUMBER:");

        jLabel48.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel48.setText("PRICE:");

        jLabel49.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel49.setText("Status");

        statusdisplayOrdinary1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        statusdisplayOrdinary1.setForeground(new java.awt.Color(0, 51, 51));
        statusdisplayOrdinary1.setText("STATUSDISPLAY");

        javax.swing.GroupLayout ordinaryaddroompaneldb1Layout = new javax.swing.GroupLayout(ordinaryaddroompaneldb1);
        ordinaryaddroompaneldb1.setLayout(ordinaryaddroompaneldb1Layout);
        ordinaryaddroompaneldb1Layout.setHorizontalGroup(
            ordinaryaddroompaneldb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryaddroompaneldb1Layout.createSequentialGroup()
                .addComponent(imagelabelvip9, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ordinaryaddroompaneldb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ordinaryaddroompaneldb1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel46)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ordinaryaddroompaneldb1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(ordinaryaddroompaneldb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ordinaryaddroompaneldb1Layout.createSequentialGroup()
                                .addGroup(ordinaryaddroompaneldb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(viproomname7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(ordinaryaddroompaneldb1Layout.createSequentialGroup()
                                        .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ordinaryroomnumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ordinaryaddroompaneldb1Layout.createSequentialGroup()
                                        .addComponent(jLabel48)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ordinaryroomprice1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(48, 48, 48))
                            .addGroup(ordinaryaddroompaneldb1Layout.createSequentialGroup()
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusdisplayOrdinary1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        ordinaryaddroompaneldb1Layout.setVerticalGroup(
            ordinaryaddroompaneldb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryaddroompaneldb1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46)
                .addGap(18, 18, 18)
                .addGroup(ordinaryaddroompaneldb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordinaryroomnumber1)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(viproomname7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ordinaryaddroompaneldb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordinaryroomprice1)
                    .addComponent(jLabel48))
                .addGap(18, 18, 18)
                .addGroup(ordinaryaddroompaneldb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(statusdisplayOrdinary1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(imagelabelvip9, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );

        ordinaryaddroompaneldb2.setBackground(new java.awt.Color(255, 255, 255));

        imagelabelvip10.setBackground(new java.awt.Color(204, 255, 204));
        imagelabelvip10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hotel1111 (1).jpg"))); // NOI18N

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(139, 69, 19));
        jLabel50.setText("ORDINARY SUIT");

        ordinaryroomnumber2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ordinaryroomnumber2.setForeground(new java.awt.Color(0, 51, 51));
        ordinaryroomnumber2.setText("ordinary room num");

        viproomname8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomname8.setForeground(new java.awt.Color(0, 51, 51));
        viproomname8.setText("ROOM NAME");

        ordinaryroomprice2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ordinaryroomprice2.setForeground(new java.awt.Color(0, 51, 51));
        ordinaryroomprice2.setText("PRICE");

        jLabel51.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel51.setText("ROOM NUMBER:");

        jLabel52.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel52.setText("PRICE:");

        jLabel53.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel53.setText("Status");

        statusdisplayOrdinary2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        statusdisplayOrdinary2.setForeground(new java.awt.Color(0, 51, 51));
        statusdisplayOrdinary2.setText("STATUSDISPLAY");

        javax.swing.GroupLayout ordinaryaddroompaneldb2Layout = new javax.swing.GroupLayout(ordinaryaddroompaneldb2);
        ordinaryaddroompaneldb2.setLayout(ordinaryaddroompaneldb2Layout);
        ordinaryaddroompaneldb2Layout.setHorizontalGroup(
            ordinaryaddroompaneldb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryaddroompaneldb2Layout.createSequentialGroup()
                .addComponent(imagelabelvip10, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ordinaryaddroompaneldb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ordinaryaddroompaneldb2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel50)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ordinaryaddroompaneldb2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(ordinaryaddroompaneldb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ordinaryaddroompaneldb2Layout.createSequentialGroup()
                                .addGroup(ordinaryaddroompaneldb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(viproomname8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(ordinaryaddroompaneldb2Layout.createSequentialGroup()
                                        .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ordinaryroomnumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ordinaryaddroompaneldb2Layout.createSequentialGroup()
                                        .addComponent(jLabel52)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ordinaryroomprice2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(48, 48, 48))
                            .addGroup(ordinaryaddroompaneldb2Layout.createSequentialGroup()
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusdisplayOrdinary2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        ordinaryaddroompaneldb2Layout.setVerticalGroup(
            ordinaryaddroompaneldb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryaddroompaneldb2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addGap(18, 18, 18)
                .addGroup(ordinaryaddroompaneldb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordinaryroomnumber2)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(viproomname8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ordinaryaddroompaneldb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordinaryroomprice2)
                    .addComponent(jLabel52))
                .addGap(18, 18, 18)
                .addGroup(ordinaryaddroompaneldb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(statusdisplayOrdinary2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(imagelabelvip10, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );

        ordinaryaddroompaneldb3.setBackground(new java.awt.Color(255, 255, 255));

        imagelabelvip11.setBackground(new java.awt.Color(204, 255, 204));
        imagelabelvip11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hotel1111 (1).jpg"))); // NOI18N

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(139, 69, 19));
        jLabel54.setText("ORDINARY SUIT");

        ordinaryroomnumber3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ordinaryroomnumber3.setForeground(new java.awt.Color(0, 51, 51));
        ordinaryroomnumber3.setText("ordinary room num");

        viproomname9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomname9.setForeground(new java.awt.Color(0, 51, 51));
        viproomname9.setText("ROOM NAME");

        ordinaryroomprice3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ordinaryroomprice3.setForeground(new java.awt.Color(0, 51, 51));
        ordinaryroomprice3.setText("PRICE");

        jLabel55.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel55.setText("ROOM NUMBER:");

        jLabel56.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel56.setText("PRICE:");

        jLabel57.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel57.setText("Status");

        statusdisplayOrdinary3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        statusdisplayOrdinary3.setForeground(new java.awt.Color(0, 51, 51));
        statusdisplayOrdinary3.setText("STATUSDISPLAY");

        javax.swing.GroupLayout ordinaryaddroompaneldb3Layout = new javax.swing.GroupLayout(ordinaryaddroompaneldb3);
        ordinaryaddroompaneldb3.setLayout(ordinaryaddroompaneldb3Layout);
        ordinaryaddroompaneldb3Layout.setHorizontalGroup(
            ordinaryaddroompaneldb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryaddroompaneldb3Layout.createSequentialGroup()
                .addComponent(imagelabelvip11, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ordinaryaddroompaneldb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ordinaryaddroompaneldb3Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel54)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ordinaryaddroompaneldb3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(ordinaryaddroompaneldb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ordinaryaddroompaneldb3Layout.createSequentialGroup()
                                .addGroup(ordinaryaddroompaneldb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(viproomname9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(ordinaryaddroompaneldb3Layout.createSequentialGroup()
                                        .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ordinaryroomnumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ordinaryaddroompaneldb3Layout.createSequentialGroup()
                                        .addComponent(jLabel56)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ordinaryroomprice3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(48, 48, 48))
                            .addGroup(ordinaryaddroompaneldb3Layout.createSequentialGroup()
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusdisplayOrdinary3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        ordinaryaddroompaneldb3Layout.setVerticalGroup(
            ordinaryaddroompaneldb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryaddroompaneldb3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54)
                .addGap(18, 18, 18)
                .addGroup(ordinaryaddroompaneldb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordinaryroomnumber3)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(viproomname9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ordinaryaddroompaneldb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordinaryroomprice3)
                    .addComponent(jLabel56))
                .addGap(18, 18, 18)
                .addGroup(ordinaryaddroompaneldb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(statusdisplayOrdinary3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(imagelabelvip11, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );

        ordinaryaddroompaneldb4.setBackground(new java.awt.Color(255, 255, 255));

        imagelabelvip12.setBackground(new java.awt.Color(204, 255, 204));
        imagelabelvip12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hotel1111 (1).jpg"))); // NOI18N

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(139, 69, 19));
        jLabel58.setText("ORDINARY SUIT");

        ordinaryroomnumber4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ordinaryroomnumber4.setForeground(new java.awt.Color(0, 51, 51));
        ordinaryroomnumber4.setText("ordinary room num");

        viproomname10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomname10.setForeground(new java.awt.Color(0, 51, 51));
        viproomname10.setText("ROOM NAME");

        ordinaryroomprice4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ordinaryroomprice4.setForeground(new java.awt.Color(0, 51, 51));
        ordinaryroomprice4.setText("PRICE");

        jLabel59.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel59.setText("ROOM NUMBER:");

        jLabel60.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel60.setText("PRICE:");

        jLabel61.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel61.setText("Status");

        statusdisplayOrdinary4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        statusdisplayOrdinary4.setForeground(new java.awt.Color(0, 51, 51));
        statusdisplayOrdinary4.setText("STATUSDISPLAY");

        javax.swing.GroupLayout ordinaryaddroompaneldb4Layout = new javax.swing.GroupLayout(ordinaryaddroompaneldb4);
        ordinaryaddroompaneldb4.setLayout(ordinaryaddroompaneldb4Layout);
        ordinaryaddroompaneldb4Layout.setHorizontalGroup(
            ordinaryaddroompaneldb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryaddroompaneldb4Layout.createSequentialGroup()
                .addComponent(imagelabelvip12, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ordinaryaddroompaneldb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ordinaryaddroompaneldb4Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel58)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ordinaryaddroompaneldb4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(ordinaryaddroompaneldb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ordinaryaddroompaneldb4Layout.createSequentialGroup()
                                .addGroup(ordinaryaddroompaneldb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(viproomname10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(ordinaryaddroompaneldb4Layout.createSequentialGroup()
                                        .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ordinaryroomnumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ordinaryaddroompaneldb4Layout.createSequentialGroup()
                                        .addComponent(jLabel60)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ordinaryroomprice4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(48, 48, 48))
                            .addGroup(ordinaryaddroompaneldb4Layout.createSequentialGroup()
                                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusdisplayOrdinary4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        ordinaryaddroompaneldb4Layout.setVerticalGroup(
            ordinaryaddroompaneldb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryaddroompaneldb4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58)
                .addGap(18, 18, 18)
                .addGroup(ordinaryaddroompaneldb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordinaryroomnumber4)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(viproomname10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ordinaryaddroompaneldb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordinaryroomprice4)
                    .addComponent(jLabel60))
                .addGap(18, 18, 18)
                .addGroup(ordinaryaddroompaneldb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(statusdisplayOrdinary4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(imagelabelvip12, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );

        ordinaryaddroompaneldb5.setBackground(new java.awt.Color(255, 255, 255));

        imagelabelvip13.setBackground(new java.awt.Color(204, 255, 204));
        imagelabelvip13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hotel1111 (1).jpg"))); // NOI18N

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(139, 69, 19));
        jLabel62.setText("ORDINARY SUIT");

        ordinaryroomnumber5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ordinaryroomnumber5.setForeground(new java.awt.Color(0, 51, 51));
        ordinaryroomnumber5.setText("ordinary room num");

        viproomname11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomname11.setForeground(new java.awt.Color(0, 51, 51));
        viproomname11.setText("ROOM NAME");

        ordinaryroomprice5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ordinaryroomprice5.setForeground(new java.awt.Color(0, 51, 51));
        ordinaryroomprice5.setText("PRICE");

        jLabel63.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel63.setText("ROOM NUMBER:");

        jLabel64.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel64.setText("PRICE:");

        jLabel65.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel65.setText("Status");

        statusdisplayOrdinary5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        statusdisplayOrdinary5.setForeground(new java.awt.Color(0, 51, 51));
        statusdisplayOrdinary5.setText("STATUSDISPLAY");

        javax.swing.GroupLayout ordinaryaddroompaneldb5Layout = new javax.swing.GroupLayout(ordinaryaddroompaneldb5);
        ordinaryaddroompaneldb5.setLayout(ordinaryaddroompaneldb5Layout);
        ordinaryaddroompaneldb5Layout.setHorizontalGroup(
            ordinaryaddroompaneldb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryaddroompaneldb5Layout.createSequentialGroup()
                .addComponent(imagelabelvip13, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ordinaryaddroompaneldb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ordinaryaddroompaneldb5Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel62)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ordinaryaddroompaneldb5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(ordinaryaddroompaneldb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ordinaryaddroompaneldb5Layout.createSequentialGroup()
                                .addGroup(ordinaryaddroompaneldb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(viproomname11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(ordinaryaddroompaneldb5Layout.createSequentialGroup()
                                        .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ordinaryroomnumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ordinaryaddroompaneldb5Layout.createSequentialGroup()
                                        .addComponent(jLabel64)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ordinaryroomprice5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(48, 48, 48))
                            .addGroup(ordinaryaddroompaneldb5Layout.createSequentialGroup()
                                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusdisplayOrdinary5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        ordinaryaddroompaneldb5Layout.setVerticalGroup(
            ordinaryaddroompaneldb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryaddroompaneldb5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62)
                .addGap(18, 18, 18)
                .addGroup(ordinaryaddroompaneldb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordinaryroomnumber5)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(viproomname11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ordinaryaddroompaneldb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordinaryroomprice5)
                    .addComponent(jLabel64))
                .addGap(18, 18, 18)
                .addGroup(ordinaryaddroompaneldb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(statusdisplayOrdinary5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(imagelabelvip13, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );

        ordinaryaddroompaneldb6.setBackground(new java.awt.Color(255, 255, 255));

        imagelabelvip14.setBackground(new java.awt.Color(204, 255, 204));
        imagelabelvip14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hotel1111 (1).jpg"))); // NOI18N

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(139, 69, 19));
        jLabel66.setText("ORDINARY SUIT");

        ordinaryroomnumber6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ordinaryroomnumber6.setForeground(new java.awt.Color(0, 51, 51));
        ordinaryroomnumber6.setText("ordinary room num");

        viproomname12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomname12.setForeground(new java.awt.Color(0, 51, 51));
        viproomname12.setText("ROOM NAME");

        ordinaryroomprice6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ordinaryroomprice6.setForeground(new java.awt.Color(0, 51, 51));
        ordinaryroomprice6.setText("PRICE");

        jLabel67.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel67.setText("ROOM NUMBER:");

        jLabel68.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel68.setText("PRICE:");

        jLabel69.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel69.setText("Status");

        statusdisplayOrdinary6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        statusdisplayOrdinary6.setForeground(new java.awt.Color(0, 51, 51));
        statusdisplayOrdinary6.setText("STATUSDISPLAY");

        javax.swing.GroupLayout ordinaryaddroompaneldb6Layout = new javax.swing.GroupLayout(ordinaryaddroompaneldb6);
        ordinaryaddroompaneldb6.setLayout(ordinaryaddroompaneldb6Layout);
        ordinaryaddroompaneldb6Layout.setHorizontalGroup(
            ordinaryaddroompaneldb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryaddroompaneldb6Layout.createSequentialGroup()
                .addComponent(imagelabelvip14, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ordinaryaddroompaneldb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ordinaryaddroompaneldb6Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel66)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ordinaryaddroompaneldb6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(ordinaryaddroompaneldb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ordinaryaddroompaneldb6Layout.createSequentialGroup()
                                .addGroup(ordinaryaddroompaneldb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(viproomname12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(ordinaryaddroompaneldb6Layout.createSequentialGroup()
                                        .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ordinaryroomnumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ordinaryaddroompaneldb6Layout.createSequentialGroup()
                                        .addComponent(jLabel68)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ordinaryroomprice6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(48, 48, 48))
                            .addGroup(ordinaryaddroompaneldb6Layout.createSequentialGroup()
                                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusdisplayOrdinary6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        ordinaryaddroompaneldb6Layout.setVerticalGroup(
            ordinaryaddroompaneldb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryaddroompaneldb6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel66)
                .addGap(18, 18, 18)
                .addGroup(ordinaryaddroompaneldb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordinaryroomnumber6)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(viproomname12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ordinaryaddroompaneldb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordinaryroomprice6)
                    .addComponent(jLabel68))
                .addGap(18, 18, 18)
                .addGroup(ordinaryaddroompaneldb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(statusdisplayOrdinary6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(imagelabelvip14, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );

        ordinaryaddroompaneldb7.setBackground(new java.awt.Color(255, 255, 255));

        imagelabelvip15.setBackground(new java.awt.Color(204, 255, 204));
        imagelabelvip15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/hotel1111 (1).jpg"))); // NOI18N

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(139, 69, 19));
        jLabel70.setText("ORDINARY SUIT");

        ordinaryroomnumber7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ordinaryroomnumber7.setForeground(new java.awt.Color(0, 51, 51));
        ordinaryroomnumber7.setText("ordinary room num");

        viproomname13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        viproomname13.setForeground(new java.awt.Color(0, 51, 51));
        viproomname13.setText("ROOM NAME");

        ordinaryroomprice7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ordinaryroomprice7.setForeground(new java.awt.Color(0, 51, 51));
        ordinaryroomprice7.setText("PRICE");

        jLabel71.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel71.setText("ROOM NUMBER:");

        jLabel72.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel72.setText("PRICE:");

        jLabel73.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel73.setText("Status");

        statusdisplayOrdinary7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        statusdisplayOrdinary7.setForeground(new java.awt.Color(0, 51, 51));
        statusdisplayOrdinary7.setText("STATUSDISPLAY");

        javax.swing.GroupLayout ordinaryaddroompaneldb7Layout = new javax.swing.GroupLayout(ordinaryaddroompaneldb7);
        ordinaryaddroompaneldb7.setLayout(ordinaryaddroompaneldb7Layout);
        ordinaryaddroompaneldb7Layout.setHorizontalGroup(
            ordinaryaddroompaneldb7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryaddroompaneldb7Layout.createSequentialGroup()
                .addComponent(imagelabelvip15, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ordinaryaddroompaneldb7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ordinaryaddroompaneldb7Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel70)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ordinaryaddroompaneldb7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(ordinaryaddroompaneldb7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ordinaryaddroompaneldb7Layout.createSequentialGroup()
                                .addGroup(ordinaryaddroompaneldb7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(viproomname13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(ordinaryaddroompaneldb7Layout.createSequentialGroup()
                                        .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ordinaryroomnumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ordinaryaddroompaneldb7Layout.createSequentialGroup()
                                        .addComponent(jLabel72)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ordinaryroomprice7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(48, 48, 48))
                            .addGroup(ordinaryaddroompaneldb7Layout.createSequentialGroup()
                                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusdisplayOrdinary7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        ordinaryaddroompaneldb7Layout.setVerticalGroup(
            ordinaryaddroompaneldb7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryaddroompaneldb7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70)
                .addGap(18, 18, 18)
                .addGroup(ordinaryaddroompaneldb7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordinaryroomnumber7)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(viproomname13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ordinaryaddroompaneldb7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordinaryroomprice7)
                    .addComponent(jLabel72))
                .addGap(18, 18, 18)
                .addGroup(ordinaryaddroompaneldb7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(statusdisplayOrdinary7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(imagelabelvip15, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ordinaryroompanelLayout = new javax.swing.GroupLayout(ordinaryroompanel);
        ordinaryroompanel.setLayout(ordinaryroompanelLayout);
        ordinaryroompanelLayout.setHorizontalGroup(
            ordinaryroompanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryroompanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ordinaryroompanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ordinaryaddroompaneldb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ordinaryaddroompaneldb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ordinaryaddroompaneldb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ordinaryaddroompaneldb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ordinaryaddroompaneldb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ordinaryaddroompaneldb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ordinaryaddroompaneldb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ordinaryaddroompaneldb7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        ordinaryroompanelLayout.setVerticalGroup(
            ordinaryroompanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordinaryroompanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ordinaryaddroompaneldb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ordinaryaddroompaneldb7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ordinaryaddroompaneldb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ordinaryaddroompaneldb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ordinaryaddroompaneldb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ordinaryaddroompaneldb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ordinaryaddroompaneldb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ordinaryaddroompaneldb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1082, Short.MAX_VALUE))
        );

        jScrollPane7.setViewportView(ordinaryroompanel);

        admintabdb.addTab("Ordinary Rooms", jScrollPane7);

        javax.swing.GroupLayout roomCardLayout = new javax.swing.GroupLayout(roomCard);
        roomCard.setLayout(roomCardLayout);
        roomCardLayout.setHorizontalGroup(
            roomCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roomCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(admintabdb, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                    .addGroup(roomCardLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addnewRoom)))
                .addGap(34, 34, 34))
        );
        roomCardLayout.setVerticalGroup(
            roomCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomCardLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(addnewRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(admintabdb, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        parentPanel.add(roomCard, "card4");

        staffCard.setBackground(new java.awt.Color(245, 245, 220));

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(139, 69, 19));
        jLabel10.setText("will be update soonest");

        javax.swing.GroupLayout staffCardLayout = new javax.swing.GroupLayout(staffCard);
        staffCard.setLayout(staffCardLayout);
        staffCardLayout.setHorizontalGroup(
            staffCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffCardLayout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
        );
        staffCardLayout.setVerticalGroup(
            staffCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffCardLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel10)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        parentPanel.add(staffCard, "card5");

        settingCard.setBackground(new java.awt.Color(245, 245, 220));

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 25)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(139, 69, 19));
        jLabel11.setText("will be update soonest");

        javax.swing.GroupLayout settingCardLayout = new javax.swing.GroupLayout(settingCard);
        settingCard.setLayout(settingCardLayout);
        settingCardLayout.setHorizontalGroup(
            settingCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingCardLayout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
        );
        settingCardLayout.setVerticalGroup(
            settingCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingCardLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel11)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        parentPanel.add(settingCard, "card2");

        jPanel1.add(parentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 800, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1017, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void DashboardAdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardAdMousePressed
    DashboardPanel.setBackground(clickedColor);
    GuestPanel.setBackground(DefaultColor);
    RoomPanel.setBackground(DefaultColor);
    StaffDbPanel.setBackground(DefaultColor); // Fixed: Changed StaffDb to StaffDbPanel
    SettingsAdPanel.setBackground(DefaultColor); // Reset Settings panel
    MenuName.setText("MAIN DASHBOARD");
    }//GEN-LAST:event_DashboardAdMousePressed

    private void GuestAdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuestAdMousePressed
         DashboardPanel.setBackground(DefaultColor);
    GuestPanel.setBackground(clickedColor);
    RoomPanel.setBackground(DefaultColor);
    StaffDbPanel.setBackground(DefaultColor); // Fixed: Changed StaffDb to StaffDbPanel
    SettingsAdPanel.setBackground(DefaultColor); // Reset Settings panel
    MenuName.setText("GUEST MANAGEMENT");
    }//GEN-LAST:event_GuestAdMousePressed

    private void RoomAdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomAdMousePressed
        DashboardPanel.setBackground(DefaultColor);
    GuestPanel.setBackground(DefaultColor);
    RoomPanel.setBackground(clickedColor);
    StaffDbPanel.setBackground(DefaultColor); // Fixed: Changed StaffDb to StaffDbPanel
    SettingsAdPanel.setBackground(DefaultColor); // Reset Settings panel
    MenuName.setText("ROOM MANAGEMENT");
    }//GEN-LAST:event_RoomAdMousePressed

    private void DashboardPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardPanelMousePressed
        DashboardAd.setBackground(clickedColor);
        GuestAd.setBackground(DefaultColor);
        RoomAd.setBackground(DefaultColor);
        StaffDb.setBackground(DefaultColor);
    }//GEN-LAST:event_DashboardPanelMousePressed

    private void GuestPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuestPanelMousePressed
       DashboardAd.setBackground(DefaultColor);
        GuestAd.setBackground(clickedColor);
        RoomAd.setBackground(DefaultColor);
        StaffDb.setBackground(DefaultColor);
    }//GEN-LAST:event_GuestPanelMousePressed

    private void RoomPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomPanelMousePressed
       DashboardAd.setBackground(DefaultColor);
        GuestAd.setBackground(DefaultColor);
        RoomAd.setBackground(clickedColor);
        StaffDb.setBackground(DefaultColor);
    }//GEN-LAST:event_RoomPanelMousePressed

    private void StaffDbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StaffDbMousePressed
     DashboardPanel.setBackground(DefaultColor);
    GuestPanel.setBackground(DefaultColor);
    RoomPanel.setBackground(DefaultColor);
    StaffDbPanel.setBackground(clickedColor);
    SettingsAdPanel.setBackground(DefaultColor); // Reset Settings panel
    MenuName.setText("STAFF MANAGEMENT");
    }//GEN-LAST:event_StaffDbMousePressed

    private void StaffDbPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StaffDbPanelMousePressed
     DashboardPanel.setBackground(DefaultColor);
    GuestPanel.setBackground(DefaultColor);
    RoomPanel.setBackground(DefaultColor);
    StaffDbPanel.setBackground(clickedColor);
    SettingsAdPanel.setBackground(DefaultColor); // Reset Settings panel

    }//GEN-LAST:event_StaffDbPanelMousePressed

    private void SettingsAdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsAdMousePressed
    DashboardPanel.setBackground(DefaultColor);
    GuestPanel.setBackground(DefaultColor);
    RoomPanel.setBackground(DefaultColor);
    StaffDbPanel.setBackground(DefaultColor);
    SettingsAdPanel.setBackground(clickedColor);
    MenuName.setText("SYSTEM SETTINGS");
    }//GEN-LAST:event_SettingsAdMousePressed

    private void SettingsAdPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsAdPanelMousePressed
    DashboardPanel.setBackground(DefaultColor);
    GuestPanel.setBackground(DefaultColor);
    RoomPanel.setBackground(DefaultColor);
    StaffDbPanel.setBackground(DefaultColor);
    SettingsAdPanel.setBackground(clickedColor);
  
    }//GEN-LAST:event_SettingsAdPanelMousePressed

    private void DashboardPanelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DashboardPanelFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_DashboardPanelFocusLost

    private void DashboardAdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardAdMouseClicked
        parentPanel.removeAll();
        parentPanel.add(dashboardCard);
        parentPanel.repaint();
        parentPanel.revalidate();
       
    }//GEN-LAST:event_DashboardAdMouseClicked

    private void GuestAdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuestAdMouseClicked
        parentPanel.removeAll();
        parentPanel.add(guestCard);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_GuestAdMouseClicked

    private void RoomAdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomAdMouseClicked
        parentPanel.removeAll();
        parentPanel.add(roomCard);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_RoomAdMouseClicked

    private void StaffDbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StaffDbMouseClicked
        parentPanel.removeAll();
        parentPanel.add(staffCard);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_StaffDbMouseClicked

    private void SettingsAdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsAdMouseClicked
        parentPanel.removeAll();
        parentPanel.add(settingCard);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_SettingsAdMouseClicked

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
      
    }//GEN-LAST:event_searchBtnActionPerformed

    private void addnewGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewGuestActionPerformed
    AddGuest ad = new AddGuest();
    ad.setVisible(true);

    }//GEN-LAST:event_addnewGuestActionPerformed

    private void addnewRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewRoomActionPerformed
      AddRoom ar = new AddRoom();
      ar.setVisible(true);
    
    }//GEN-LAST:event_addnewRoomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       login LG =new login();
       LG.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void logoutBtnadminDbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnadminDbActionPerformed
        login lg = new login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnadminDbActionPerformed

   
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
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
                
                adminDashboard ad = new adminDashboard();
                ad.setVisible(true);
         
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AvailableRPanel;
    private javax.swing.JLabel DashboardAd;
    private javax.swing.JPanel DashboardPanel;
    private javax.swing.JLabel DisplayOccRooms;
    private javax.swing.JLabel DisplayReservations;
    private javax.swing.JLabel DisplayTodayReservation;
    private javax.swing.JLabel GuestAd;
    private javax.swing.JPanel GuestPanel;
    private javax.swing.JLabel MenuName;
    private javax.swing.JPanel OccupiedRpanel;
    private javax.swing.JPanel ReservationPanel;
    private javax.swing.JLabel RoomAd;
    private javax.swing.JPanel RoomPanel;
    private javax.swing.JLabel SettingsAd;
    private javax.swing.JPanel SettingsAdPanel;
    private javax.swing.JLabel StaffDb;
    private javax.swing.JPanel StaffDbPanel;
    private javax.swing.JPanel TodayReservPanel;
    private javax.swing.JButton addnewGuest;
    private javax.swing.JButton addnewRoom;
    private javax.swing.JTabbedPane admintabdb;
    private javax.swing.JPanel dashboardCard;
    private javax.swing.JLabel displayAvailableRooms;
    private javax.swing.JPanel first;
    private javax.swing.JPanel guestCard;
    private javax.swing.JTable guestTable;
    private javax.swing.JTable guestTable1;
    private javax.swing.JLabel imagelabelvip1;
    private javax.swing.JLabel imagelabelvip10;
    private javax.swing.JLabel imagelabelvip11;
    private javax.swing.JLabel imagelabelvip12;
    private javax.swing.JLabel imagelabelvip13;
    private javax.swing.JLabel imagelabelvip14;
    private javax.swing.JLabel imagelabelvip15;
    private javax.swing.JLabel imagelabelvip16;
    private javax.swing.JLabel imagelabelvip2;
    private javax.swing.JLabel imagelabelvip3;
    private javax.swing.JLabel imagelabelvip4;
    private javax.swing.JLabel imagelabelvip5;
    private javax.swing.JLabel imagelabelvip6;
    private javax.swing.JLabel imagelabelvip7;
    private javax.swing.JLabel imagelabelvip8;
    private javax.swing.JLabel imagelabelvip9;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton logoutBtnadminDb;
    private javax.swing.JPanel ordinaryaddroompaneldb;
    private javax.swing.JPanel ordinaryaddroompaneldb1;
    private javax.swing.JPanel ordinaryaddroompaneldb2;
    private javax.swing.JPanel ordinaryaddroompaneldb3;
    private javax.swing.JPanel ordinaryaddroompaneldb4;
    private javax.swing.JPanel ordinaryaddroompaneldb5;
    private javax.swing.JPanel ordinaryaddroompaneldb6;
    private javax.swing.JPanel ordinaryaddroompaneldb7;
    private javax.swing.JLabel ordinaryroomnumber;
    private javax.swing.JLabel ordinaryroomnumber1;
    private javax.swing.JLabel ordinaryroomnumber2;
    private javax.swing.JLabel ordinaryroomnumber3;
    private javax.swing.JLabel ordinaryroomnumber4;
    private javax.swing.JLabel ordinaryroomnumber5;
    private javax.swing.JLabel ordinaryroomnumber6;
    private javax.swing.JLabel ordinaryroomnumber7;
    private javax.swing.JPanel ordinaryroompanel;
    private javax.swing.JLabel ordinaryroomprice;
    private javax.swing.JLabel ordinaryroomprice1;
    private javax.swing.JLabel ordinaryroomprice2;
    private javax.swing.JLabel ordinaryroomprice3;
    private javax.swing.JLabel ordinaryroomprice4;
    private javax.swing.JLabel ordinaryroomprice5;
    private javax.swing.JLabel ordinaryroomprice6;
    private javax.swing.JLabel ordinaryroomprice7;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JPanel roomCard;
    private java.awt.Scrollbar scrollbar1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextPane searchingfield;
    private javax.swing.JPanel settingCard;
    private javax.swing.JPanel staffCard;
    private javax.swing.JLabel statusdisplayOrdinary;
    private javax.swing.JLabel statusdisplayOrdinary1;
    private javax.swing.JLabel statusdisplayOrdinary2;
    private javax.swing.JLabel statusdisplayOrdinary3;
    private javax.swing.JLabel statusdisplayOrdinary4;
    private javax.swing.JLabel statusdisplayOrdinary5;
    private javax.swing.JLabel statusdisplayOrdinary6;
    private javax.swing.JLabel statusdisplayOrdinary7;
    private javax.swing.JScrollPane vipScrollPane;
    private javax.swing.JPanel vipaddroompaneldb;
    private javax.swing.JPanel vipaddroompaneldb1;
    private javax.swing.JPanel vipaddroompaneldb2;
    private javax.swing.JPanel vipaddroompaneldb3;
    private javax.swing.JPanel vipaddroompaneldb4;
    private javax.swing.JPanel vipaddroompaneldb5;
    private javax.swing.JPanel vipaddroompaneldb6;
    private javax.swing.JLabel viployaltypoints;
    private javax.swing.JLabel viployaltypoints1;
    private javax.swing.JLabel viployaltypoints2;
    private javax.swing.JLabel viployaltypoints3;
    private javax.swing.JLabel viployaltypoints4;
    private javax.swing.JLabel viployaltypoints5;
    private javax.swing.JLabel viployaltypoints6;
    private javax.swing.JLabel vippriceroom;
    private javax.swing.JLabel vippriceroom1;
    private javax.swing.JLabel vippriceroom2;
    private javax.swing.JLabel vippriceroom3;
    private javax.swing.JLabel vippriceroom4;
    private javax.swing.JLabel vippriceroom5;
    private javax.swing.JLabel vippriceroom6;
    private javax.swing.JLabel viproomname;
    private javax.swing.JLabel viproomname1;
    private javax.swing.JLabel viproomname10;
    private javax.swing.JLabel viproomname11;
    private javax.swing.JLabel viproomname12;
    private javax.swing.JLabel viproomname13;
    private javax.swing.JLabel viproomname14;
    private javax.swing.JLabel viproomname2;
    private javax.swing.JLabel viproomname3;
    private javax.swing.JLabel viproomname4;
    private javax.swing.JLabel viproomname5;
    private javax.swing.JLabel viproomname6;
    private javax.swing.JLabel viproomname7;
    private javax.swing.JLabel viproomname8;
    private javax.swing.JLabel viproomname9;
    private javax.swing.JLabel viproomnumber;
    private javax.swing.JLabel viproomnumber1;
    private javax.swing.JLabel viproomnumber2;
    private javax.swing.JLabel viproomnumber3;
    private javax.swing.JLabel viproomnumber4;
    private javax.swing.JLabel viproomnumber5;
    private javax.swing.JLabel viproomnumber6;
    private javax.swing.JPanel viproompanel;
    private javax.swing.JLabel vipstatusdisplay;
    private javax.swing.JLabel vipstatusdisplay1;
    private javax.swing.JLabel vipstatusdisplay2;
    private javax.swing.JLabel vipstatusdisplay3;
    private javax.swing.JLabel vipstatusdisplay4;
    private javax.swing.JLabel vipstatusdisplay5;
    private javax.swing.JLabel vipstatusdisplay6;
    // End of variables declaration//GEN-END:variables
}
