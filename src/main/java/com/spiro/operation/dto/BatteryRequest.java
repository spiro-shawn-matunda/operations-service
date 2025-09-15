package com.spiro.operation.dto;

import java.time.LocalDateTime;

public class BatteryRequest {

    private String numberOfBatteries;
    private String faultyBattereies;
    private String numberOfChargers;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;

    public String getNumberOfBatteries() {
        return numberOfBatteries;
    }

    public void setNumberOfBatteries(String numberOfBatteries) {
        this.numberOfBatteries = numberOfBatteries;
    }

    public String getFaultyBattereies() {
        return faultyBattereies;
    }

    public void setFaultyBattereies(String faultyBattereies) {
        this.faultyBattereies = faultyBattereies;
    }

    public String getNumberOfChargers() {
        return numberOfChargers;
    }

    public void setNumberOfChargers(String numberOfChargers) {
        this.numberOfChargers = numberOfChargers;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
