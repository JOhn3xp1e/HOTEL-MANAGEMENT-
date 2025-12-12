package com.hotel.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {
    public static void initialize() throws SQLException {
        try (Connection conn = DatabaseUtil.connect();
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS users (" +
                "username TEXT PRIMARY KEY, " +
                "password TEXT NOT NULL, " +
                "fullname TEXT NOT NULL, " +
                "age INTEGER, " +
                "phone TEXT, " +
                "address TEXT, " +
                "role TEXT NOT NULL)");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS guest (" +
                "guest_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "username TEXT NOT NULL, " +
                "fullname TEXT NOT NULL, " +
                "age INTEGER, " +
                "phone TEXT, " +
                "room_no TEXT, " +
                "check_in_date TEXT, " +
                "check_out_date TEXT, " +
                "status TEXT, " +
                "loyalty_points INTEGER, " +
                "FOREIGN KEY (username) REFERENCES users(username))");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Rooms (" +
                "room_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "room_number TEXT NOT NULL UNIQUE, " +
                "room_name TEXT NOT NULL, " +
                "room_type TEXT NOT NULL CHECK(room_type IN ('VIP', 'STANDARD')), " +
                "status TEXT NOT NULL CHECK(status IN ('Booked', 'Under Maintenance', 'Reserved', 'Free')), " +
                "price REAL NOT NULL, " +
                "image_path TEXT)");

            // Create room_status_counts table
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS room_status_counts (" +
                "status TEXT PRIMARY KEY, " +
                "room_count INTEGER NOT NULL DEFAULT 0)");

            // Initialize room status counts with all possible statuses
            stmt.executeUpdate("INSERT OR IGNORE INTO room_status_counts (status, room_count) VALUES " +
                "('Booked', 0), " +
                "('Under Maintenance', 0), " +
                "('Reserved', 0), " +
                "('Free', 0)");

            // Update counts based on existing rooms
            stmt.executeUpdate("UPDATE room_status_counts SET room_count = " +
                "(SELECT COUNT(*) FROM Rooms WHERE Rooms.status = room_status_counts.status)");
        }
    }
}