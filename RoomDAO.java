package com.hotel.dao;

import com.hotel.model.Room;
import com.hotel.model.RoomStatus;
import com.hotel.util.DatabaseUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoomDAO {

    public boolean addRoom(Room room) throws SQLException {
        String sql = "INSERT INTO Rooms (room_number, room_name, room_type, status, price, image_path) VALUES (?, ?, ?, ?, ?, ?)";
        int retries = 3;
        while (retries > 0) {
            try (Connection conn = DatabaseUtil.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, room.getRoomNumber());
                pstmt.setString(2, room.getRoomName());
                pstmt.setString(3, room.getRoomType());
                pstmt.setString(4, room.getStatus().toString());
                pstmt.setDouble(5, room.getPrice());
                pstmt.setString(6, room.getImagePath());
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
        throw new SQLException("Failed to add room due to database lock");
    }

    public boolean updateRoomStatus(String roomNumber, RoomStatus status) throws SQLException {
        String sql = "UPDATE Rooms SET status = ? WHERE room_number = ?";
        int retries = 3;
        while (retries > 0) {
            try (Connection conn = DatabaseUtil.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, status.toString());
                pstmt.setString(2, roomNumber);
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
        throw new SQLException("Failed to update room status due to database lock");
    }

    public Room getRoomByNumber(String roomNumber) throws SQLException {
        String sql = "SELECT * FROM Rooms WHERE room_number = ?";
        int retries = 3;
        while (retries > 0) {
            try (Connection conn = DatabaseUtil.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, roomNumber);
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    return new Room(
                        rs.getInt("room_id"),
                        rs.getString("room_number"),
                        rs.getString("room_name"),
                        rs.getString("room_type"),
                        RoomStatus.valueOf(rs.getString("status").toUpperCase().replace(" ", "_")),
                        rs.getDouble("price"),
                        rs.getString("image_path")
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
        throw new SQLException("Failed to retrieve room due to database lock");
    }

    public List<Room> getAllRooms() throws SQLException {
        List<Room> rooms = new ArrayList<>();
        String sql = "SELECT * FROM Rooms";
        int retries = 3;
        while (retries > 0) {
            try (Connection conn = DatabaseUtil.connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    rooms.add(new Room(
                        rs.getInt("room_id"),
                        rs.getString("room_number"),
                        rs.getString("room_name"),
                        rs.getString("room_type"),
                        RoomStatus.valueOf(rs.getString("status").toUpperCase().replace(" ", "_")),
                        rs.getDouble("price"),
                        rs.getString("image_path")
                    ));
                }
                return rooms;
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
        throw new SQLException("Failed to retrieve rooms due to database lock");
    }
}