package com.hotel.service;

import com.hotel.dao.RoomDAO;
import com.hotel.model.Room;
import com.hotel.model.RoomStatus;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoomService {
    private final RoomDAO roomDAO;

    public RoomService() {
        this.roomDAO = new RoomDAO();
    }

    public boolean addRoom(Room room) {
        try {
            // Validate room data
            if (room.getRoomNumber() == null || room.getRoomName() == null || 
                room.getRoomType() == null || room.getStatus() == null || room.getPrice() <= 0) {
                return false;
            }
            // Check if room number already exists
            Room existingRoom = roomDAO.getRoomByNumber(room.getRoomNumber());
            if (existingRoom == null) {
                return roomDAO.addRoom(room);
            }
            return false; // Room number already exists
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateRoomStatus(String roomNumber, RoomStatus status) {
        try {
            return roomDAO.updateRoomStatus(roomNumber, status);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Room> getAllRooms() {
        try {
            return roomDAO.getAllRooms();
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public Room getRoomByNumber(String roomNumber) {
        try {
            return roomDAO.getRoomByNumber(roomNumber);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}