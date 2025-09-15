package com.spiro.operation.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class PowerEvents {

    @Id
    private String id;

    @ManyToOne(targetEntity = Station.class, optional = false)
    @JoinColumn(name = "Station")
    Station station;

/*    @ManyToOne(targetEntity = Agent.class, optional = false)
    @JoinColumn(name = "Agent")
    Agent agent;*/


    private String events;


    @Column(nullable = false, updatable = false)
    private LocalDateTime startTime;

    @Column(nullable = false, updatable = false)
    private LocalDateTime endTime;

    @ManyToOne(targetEntity = Status.class)
    @JoinColumn(name = "Status")
    Status status;

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


    public String getId() {
        return id;
    }

    public void setId(String stationId) {
        this.id = id;
    }


    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }
}
