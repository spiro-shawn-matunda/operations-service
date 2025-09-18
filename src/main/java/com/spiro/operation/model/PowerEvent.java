package com.spiro.operation.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class PowerEvent {

    @Id
    private String id;


    @Column(updatable = false,nullable = false)
    private LocalDateTime startTime;



    @ManyToMany(fetch = FetchType.LAZY, targetEntity = Stations.class)
    @JoinTable(
            name = "Stations_PowerEvent",
            joinColumns = @JoinColumn(name = "Station_id"),
            inverseJoinColumns = @JoinColumn(name = "PowerEvent_id")
    )
    List<Stations> stations;




    @Column(updatable = false,nullable = false)
    private LocalDateTime endTime;

private PowerEventType powerEventType;


    @OneToOne(targetEntity = Status.class)
    @JoinColumn(name = "Status_id", referencedColumnName = "id")
    Status status;




    @Column(updatable = false,nullable = false )
    private LocalDateTime created;


}
