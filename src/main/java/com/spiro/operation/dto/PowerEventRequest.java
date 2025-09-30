package com.spiro.operation.dto;

import com.spiro.operation.model.PowerEventType;

import java.time.LocalDateTime;

public class PowerEventRequest {
    private String id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private PowerEventType powerEventType;
    private LocalDateTime created;
    private String statusId;

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public PowerEventType getPowerEventType() {
        return powerEventType;
    }

    public void setPowerEventType(PowerEventType powerEventType) {
        this.powerEventType = powerEventType;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
