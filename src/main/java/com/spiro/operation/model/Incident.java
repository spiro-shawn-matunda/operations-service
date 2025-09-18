package com.spiro.operation.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Incident {
    @Id
    private String id;

    @Enumerated(EnumType.STRING)
    private IncidentType incidentType;

private String customerId;


    @ManyToOne(targetEntity = Status.class)
    @JoinColumn(name = "Status_id", referencedColumnName = "id")
    Status status;


private String bikeNumber;

    @ManyToMany(mappedBy = "incidents")
    private List<Battery> batteries;


}
