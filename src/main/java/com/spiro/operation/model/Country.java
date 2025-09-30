package com.spiro.operation.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Country {
    @Id
    private String id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column
    private String description;

    @OneToMany(mappedBy = "country")
    private List<Status> statuses = new ArrayList<>();

    @OneToMany(mappedBy = "country")
    private List<Battery> batteries = new ArrayList<>();

    @OneToMany(mappedBy = "country")
    private List<Incidents> incidents = new ArrayList<>();

    @OneToMany(mappedBy = "country")
    private List<Stations> stations = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }


    public List<Battery> getBatteries() {
        return batteries;
    }

    public void setBatteries(List<Battery> batteries) {
        this.batteries = batteries;
    }

    public List<Incidents> getIncidents() {
        return incidents;
    }

    public void setIncidents(List<Incidents> incidents) {
        this.incidents = incidents;
    }

    public List<Stations> getStations() {
        return stations;
    }

    public void setStations(List<Stations> stations) {
        this.stations = stations;
    }

}
