package com.naveen.bank.eureka.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public final class AppUtils {

    private AppUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Generate Random UUID
     */
    public static String generateUuid() {
        return UUID.randomUUID().toString();
    }

    /**
     * Current Date Time
     */
    public static LocalDateTime now() {
        return LocalDateTime.now();
    }

    /**
     * Current Date Time as String
     */
    public static String nowAsString() {
        return LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    /**
     * Check Null or Empty
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Remove Extra Spaces
     */
    public static String trim(String value) {

        if (value == null) {
            return null;
        }

        return value.trim();
    }

}