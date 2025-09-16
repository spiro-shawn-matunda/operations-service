package com.spiro.operation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Stations {
    @Id
    private String id;
    private String name;
    private String location;
    private int batteryCapacity;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
