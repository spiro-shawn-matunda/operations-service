package com.spiro.operation.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Stations {
    @Id
    private String id;

    @Column(nullable = false)
    private String name;

    @ManyToOne(targetEntity = Status.class)
    @JoinColumn(name = "Status_id", referencedColumnName = "id")
    Status status;

    @ManyToMany(fetch = FetchType.LAZY, targetEntity = PowerEvent.class)
    @JoinTable(
            name = "Stations_PowerEvent",
            joinColumns = @JoinColumn(name = "Station_id"),
            inverseJoinColumns = @JoinColumn(name = "PowerEvent_id")
    )
    List<PowerEvent> powerEvents;


    @Column(nullable = false, updatable = false,length = 2000)
    private String location;


    @ManyToMany(fetch = FetchType.LAZY, targetEntity = Attendants.class)
    @JoinTable(
            name = "Stations_Attendants",
            joinColumns = @JoinColumn(name = "Station_id"),
            inverseJoinColumns = @JoinColumn(name = "Attendants_id")
    )
    List<Attendants> attendants;

    @Column(nullable = false)
    private LocalDateTime createdAt;


    @ManyToOne(targetEntity =   Country.class)
    @JoinColumn(name = "Country_id", referencedColumnName = "id")
    Country country;
}
