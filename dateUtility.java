package com.hotel.date;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class dateUtility {
    public static LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
    }

    public static LocalDateTime addTime(LocalDateTime dateTime, int minutesToAdd) {
        return dateTime.plusMinutes(minutesToAdd).truncatedTo(ChronoUnit.MINUTES);
    }

    // Utility to parse SQLite date string (YYYY-MM-DD HH:MM:SS) to LocalDateTime
    public static LocalDateTime parseDateTime(String dateTimeStr) {
        return LocalDateTime.parse(dateTimeStr.replace(" ", "T")); // e.g., "2025-05-20 14:30:00" -> "2025-05-20T14:30:00"
    }

    // Utility to format LocalDateTime to SQLite date string (YYYY-MM-DD HH:MM:SS)
    public static String formatDateTime(LocalDateTime dateTime) {
        return dateTime.toString().replace("T", " ").substring(0, 19); // e.g., "2025-05-20T14:30:00" -> "2025-05-20 14:30:00"
    }
}