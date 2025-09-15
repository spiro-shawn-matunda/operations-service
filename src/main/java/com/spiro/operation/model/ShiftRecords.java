package com.spiro.operation.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class ShiftRecords {

    @Id
    private String id;


    @Column
    private String StationId;

    @Column
    private LocalDateTime timeIn;

    @Column
    private LocalDateTime timeOut;

    @Column
    private String location;

    @Column
    private int units;

    @Column
    private String comments;


    public String getStationId() {
        return StationId;
    }

    public void setStationId(String stationId) {
        StationId = stationId;
    }

    public LocalDateTime getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(LocalDateTime timeIn) {
        this.timeIn = timeIn;
    }

    public LocalDateTime getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(LocalDateTime timeOut) {
        this.timeOut = timeOut;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
