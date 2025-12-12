package com.hotel.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    private static final String DB_URL = "jdbc:sqlite:hotelmanagement.db";

  public static Connection connect() throws SQLException {
    Connection conn = DriverManager.getConnection(DB_URL);
    conn.setAutoCommit(true);
    try {
        conn.createStatement().execute("PRAGMA foreign_keys = ON");
        conn.createStatement().execute("PRAGMA busy_timeout = 30000");
    } catch (SQLException e) {
        conn.close();
        throw e;
    }
    return conn;
}
}