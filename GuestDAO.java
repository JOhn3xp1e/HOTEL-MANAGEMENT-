package com.hotel.dao;

import com.hotel.model.Guest;
import com.hotel.util.DatabaseUtil;
import com.hotel.date.dateUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GuestDAO {
    public boolean addGuest(Guest guest) throws SQLException {
        String sql = "INSERT INTO guest (username, fullname, age, phone, room_no, check_in_date, check_out_date, status, loyalty_points) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int retries = 3;
        while (retries > 0) {
            try (Connection conn = DatabaseUtil.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, guest.getUsername());
                pstmt.setString(2, guest.getFullName());
                pstmt.setInt(3, guest.getAge());
                pstmt.setString(4, guest.getPhone());
                pstmt.setString(5, guest.getRoomNo());
                pstmt.setString(6, guest.getCheckInDate() != null ? dateUtility.formatDateTime(guest.getCheckInDate()) : null);
                pstmt.setString(7, guest.getCheckOutDate() != null ? dateUtility.formatDateTime(guest.getCheckOutDate()) : null);
                pstmt.setString(8, guest.getStatus());
                pstmt.setInt(9, guest.getLoyaltyPoints());
                return pstmt.executeUpdate() > 0;
            } catch (SQLException e) {
                if (e.getErrorCode() == 5) { // SQLITE_BUSY
                    retries--;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                } else {
                    throw e;
                }
            }
        }
        throw new SQLException("Failed to add guest due to database lock");
    }

    public boolean updateGuest(Guest guest) throws SQLException {
        String sql = "UPDATE guest SET fullname = ?, age = ?, phone = ?, room_no = ?, check_in_date = ?, check_out_date = ?, status = ?, loyalty_points = ? WHERE username = ?";
        int retries = 3;
        while (retries > 0) {
            try (Connection conn = DatabaseUtil.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, guest.getFullName());
                pstmt.setInt(2, guest.getAge());
                pstmt.setString(3, guest.getPhone());
                pstmt.setString(4, guest.getRoomNo());
                pstmt.setString(5, guest.getCheckInDate() != null ? dateUtility.formatDateTime(guest.getCheckInDate()) : null);
                pstmt.setString(6, guest.getCheckOutDate() != null ? dateUtility.formatDateTime(guest.getCheckOutDate()) : null);
                pstmt.setString(7, guest.getStatus());
                pstmt.setInt(8, guest.getLoyaltyPoints());
                pstmt.setString(9, guest.getUsername());
                return pstmt.executeUpdate() > 0;
            } catch (SQLException e) {
                if (e.getErrorCode() == 5) { // SQLITE_BUSY
                    retries--;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                } else {
                    throw e;
                }
            }
        }
        throw new SQLException("Failed to update guest due to database lock");
    }

    public Guest getGuestByUsername(String username) throws SQLException {
        String sql = "SELECT * FROM guest WHERE username = ?";
        int retries = 3;
        while (retries > 0) {
            try (Connection conn = DatabaseUtil.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, username);
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    LocalDateTime checkInDate = rs.getString("check_in_date") != null 
                        ? dateUtility.parseDateTime(rs.getString("check_in_date")) : null;
                    LocalDateTime checkOutDate = rs.getString("check_out_date") != null 
                        ? dateUtility.parseDateTime(rs.getString("check_out_date")) : null;
                    return new Guest(
                        rs.getInt("guest_id"),
                        rs.getString("username"),
                        rs.getString("fullname"),
                        rs.getInt("age"),
                        rs.getString("phone"),
                        rs.getString("room_no"),
                        checkInDate,
                        checkOutDate,
                        rs.getString("status"),
                        rs.getInt("loyalty_points")
                    );
                }
                return null;
            } catch (SQLException e) {
                if (e.getErrorCode() == 5) { // SQLITE_BUSY
                    retries--;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                } else {
                    throw e;
                }
            }
        }
        throw new SQLException("Failed to retrieve guest due to database lock");
    }

    public List<Guest> getAllGuests() throws SQLException {
        List<Guest> guests = new ArrayList<>();
        String sql = "SELECT * FROM guest";
        int retries = 3;
        while (retries > 0) {
            try (Connection conn = DatabaseUtil.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    LocalDateTime checkInDate = rs.getString("check_in_date") != null 
                        ? dateUtility.parseDateTime(rs.getString("check_in_date")) : null;
                    LocalDateTime checkOutDate = rs.getString("check_out_date") != null 
                        ? dateUtility.parseDateTime(rs.getString("check_out_date")) : null;
                    guests.add(new Guest(
                        rs.getInt("guest_id"),
                        rs.getString("username"),
                        rs.getString("fullname"),
                        rs.getInt("age"),
                        rs.getString("phone"),
                        rs.getString("room_no"),
                        checkInDate,
                        checkOutDate,
                        rs.getString("status"),
                        rs.getInt("loyalty_points")
                    ));
                }
                return guests;
            } catch (SQLException e) {
                if (e.getErrorCode() == 5) { // SQLITE_BUSY
                    retries--;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                } else {
                    throw e;
                }
            }
        }
        throw new SQLException("Failed to retrieve guests due to database lock");
    }
}