package com.spiro.operation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class Shift{
    @Id
    @Column(nullable = false)
    private String agentId;

    @Column(nullable = false)
    private LocalDateTime startTime;
    @Column(nullable = false)
    private LocalDateTime endTime;

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
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
}
