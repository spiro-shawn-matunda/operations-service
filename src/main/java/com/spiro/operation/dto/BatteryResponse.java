package com.spiro.operation.dto;

import java.time.LocalDateTime;

public class BatteryResponse {
    private String id;
    private String attendantId;
    private String attendantName;
    private String numberOfBatteries;
    private String faultyBatteries;
    private String numberOfChargers;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Constructors
    public BatteryResponse() {}

    public BatteryResponse(String id, String attendantId, String attendantName, String numberOfBatteries,
                           String faultyBatteries, String numberOfChargers, LocalDateTime createdAt,
                           LocalDateTime updatedAt) {
        this.id = id;
        this.attendantId = attendantId;
        this.attendantName = attendantName;
        this.numberOfBatteries = numberOfBatteries;
        this.faultyBatteries = faultyBatteries;
        this.numberOfChargers = numberOfChargers;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAttendantId() {
        return attendantId;
    }

    public void setAttendantId(String attendantId) {
        this.attendantId = attendantId;
    }

    public String getAttendantName() {
        return attendantName;
    }

    public void setAttendantName(String attendantName) {
        this.attendantName = attendantName;
    }

    public String getNumberOfBatteries() {
        return numberOfBatteries;
    }

    public void setNumberOfBatteries(String numberOfBatteries) {
        this.numberOfBatteries = numberOfBatteries;
    }

    public String getFaultyBatteries() {
        return faultyBatteries;
    }

    public void setFaultyBatteries(String faultyBatteries) {
        this.faultyBatteries = faultyBatteries;
    }

    public String getNumberOfChargers() {
        return numberOfChargers;
    }

    public void setNumberOfChargers(String numberOfChargers) {
        this.numberOfChargers = numberOfChargers;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}