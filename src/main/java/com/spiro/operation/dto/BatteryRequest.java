package com.spiro.operation.dto;

import java.time.LocalDateTime;

public class BatteryRequest {
    private String attendantId;
    private String numberOfBatteries;
    private String faultyBatteries;
    private String numberOfChargers;

    // Constructors
    public BatteryRequest() {}

    public BatteryRequest(String attendantId, String numberOfBatteries, String faultyBatteries, String numberOfChargers) {
        this.attendantId = attendantId;
        this.numberOfBatteries = numberOfBatteries;
        this.faultyBatteries = faultyBatteries;
        this.numberOfChargers = numberOfChargers;
    }

    // Getters and Setters
    public String getAttendantId() {
        return attendantId;
    }

    public void setAttendantId(String attendantId) {
        this.attendantId = attendantId;
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
}