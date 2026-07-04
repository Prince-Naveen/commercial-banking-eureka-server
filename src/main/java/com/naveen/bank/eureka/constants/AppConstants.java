package com.naveen.bank.eureka.constants;

public final class AppConstants {

    private AppConstants() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Application Details
     */
    public static final String APPLICATION_NAME = "eureka-server";
    public static final String APPLICATION_VERSION = "1.0.0";

    /**
     * API Paths
     */
    public static final String EUREKA_PATH = "/eureka";
    public static final String ACTUATOR_PATH = "/actuator";

    /**
     * Spring Profiles
     */
    public static final String LOCAL = "local";
    public static final String DEV = "dev";
    public static final String QA = "qa";
    public static final String PROD = "prod";

    /**
     * Health Status
     */
    public static final String STATUS_UP = "UP";
    public static final String STATUS_DOWN = "DOWN";

    /**
     * Messages
     */
    public static final String SERVER_STARTED =
            "Eureka Server Started Successfully";

    public static final String SERVER_STOPPED =
            "Eureka Server Stopped";

}