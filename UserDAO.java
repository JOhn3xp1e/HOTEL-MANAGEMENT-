package com.hotel.dao;

import com.hotel.model.User;
import com.hotel.util.DatabaseUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public boolean addUser(User user) throws SQLException {
        String sql = "INSERT INTO users (username, password, fullname, age, phone, address, role) VALUES (?, ?, ?, ?, ?, ?, ?)";
        int retries = 3;
        while (retries > 0) {
            try (Connection conn = DatabaseUtil.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, user.getUsername());
                pstmt.setString(2, user.getPassword());
                pstmt.setString(3, user.getFullName());
                pstmt.setInt(4, user.getAge());
                pstmt.setString(5, user.getPhoneNumber());
                pstmt.setString(6, user.getAddress());
                pstmt.setString(7, user.getRole());
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
        throw new SQLException("Failed to add user due to database lock");
        
        
    }

    public boolean deleteUser(String username) throws SQLException {
        String sql = "DELETE FROM users WHERE username = ?";
        int retries = 3;
        while (retries > 0) {
            try (Connection conn = DatabaseUtil.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, username);
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
        throw new SQLException("Failed to delete user due to database lock");
    }

    public User getUserByCredentials(String username, String password) throws SQLException {
        String sql = "SELECT username, password, fullname, age, phone, address, role FROM users WHERE username = ? AND password = ?";
        int retries = 3;
        while (retries > 0) {
            try (Connection conn = DatabaseUtil.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, username);
                pstmt.setString(2, password);
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    return new User(
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("fullname"),
                        rs.getInt("age"),
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getString("role")
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
        throw new SQLException("Failed to authenticate user due to database lock");
    }
}