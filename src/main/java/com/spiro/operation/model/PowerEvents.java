package com.spiro.operation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class PowerEvents {
    @Id
    @Column(nullable = false)
    private String stationId;

    @Column(nullable = false)
    private int agentId;

    private  String events;

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

    @Column(nullable = false,updatable = false)
    private LocalDateTime startTime;

    @Column(nullable = false,updatable = false)
    private LocalDateTime endTime;

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }
}
