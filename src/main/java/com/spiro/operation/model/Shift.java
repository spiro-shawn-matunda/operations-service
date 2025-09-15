package com.spiro.operation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class Shift{

    @Id
    private String id;

   /* @ManyToOne(targetEntity = Agent.class)
    @JoinColumn(name="Status")
    Status status;*/


    @Column(nullable = false)
    private LocalDateTime startTime;

    @ManyToOne(targetEntity = Status.class)
    @JoinColumn(name="Status")
    Status status;

    @Column(nullable = false)
    private LocalDateTime endTime;


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
