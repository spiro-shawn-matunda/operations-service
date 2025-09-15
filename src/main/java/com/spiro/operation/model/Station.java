package com.spiro.operation.model;


import jakarta.persistence.*;


import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Station {
    @Id
    private String id;

    @Column(nullable = false)
    private String stationName;

    @Column(nullable = false)
    private String location;
    private int batteryCapacity;

    @OneToMany(fetch = FetchType.LAZY,targetEntity = PowerEvents.class)
    @JoinTable(
            name = "Station_PowerEvents",
            joinColumns=@JoinColumn(name = "Power_events_id"),
            inverseJoinColumns = @JoinColumn(name = "Station_id")
    )
    @Column(nullable = false)
    private String attendant;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationName() {
        return stationName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getAttendant() {
        return attendant;
    }

    public void setAttendant(String attendant) {
        this.attendant = attendant;
    }

}
