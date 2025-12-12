package com.hotel.service;

import com.hotel.dao.GuestDAO;
import com.hotel.date.dateUtility;
import com.hotel.model.Guest;
import com.hotel.model.Room;
import com.hotel.model.RoomStatus;
import com.hotel.model.User;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GuestService {
    private final GuestDAO guestDAO;

    public GuestService() {
        this.guestDAO = new GuestDAO();
    }

    public boolean addGuestOnLogin(User user) {
        // Only add if no active guest record exists for this username
        try {
            Guest existingGuest = guestDAO.getGuestByUsername(user.getUsername());
            if (existingGuest == null) {
                Guest newGuest = new Guest(
                    0, // guest_id will be auto-incremented
                    user.getUsername(),
                    user.getFullName(),
                    user.getAge(),
                    user.getPhoneNumber(),
                    null, // room_no
                    null, // check_in_date
                    null, // check_out_date
                    null, // status
                    0     // loyalty_points
                );
                return guestDAO.addGuest(newGuest);
            }
            return false; // Already exists, no need to add
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Guest> getAllGuests() {
        try {
            return guestDAO.getAllGuests();
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
    
    public boolean checkInGuest(String username, String roomNumber) {
    try {
        Guest guest = guestDAO.getGuestByUsername(username);
        if (guest != null && guest.getRoomNo() == null) {
            RoomService roomService = new RoomService();
            Room room = roomService.getRoomByNumber(roomNumber);
            if (room != null && room.getStatus() == RoomStatus.FREE) {
                guest.setRoomNo(roomNumber);
                guest.setCheckInDate(dateUtility.getCurrentDateTime());
                guest.setStatus("CHECKED_IN");
                boolean guestUpdated = guestDAO.updateGuest(guest);
                boolean roomUpdated = roomService.updateRoomStatus(roomNumber, RoomStatus.BOOKED);
                return guestUpdated && roomUpdated;
            }
        }
        return false;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

    // Existing methods (checkInGuest, checkOutGuest, etc.)
}