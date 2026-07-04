package com.naveen.bank.eureka.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {

        return Health.up()
                .withDetail("Application", "Eureka Server")
                .withDetail("Status", "Running")
                .withDetail("Version", "1.0.0")
                .build();
    }

}