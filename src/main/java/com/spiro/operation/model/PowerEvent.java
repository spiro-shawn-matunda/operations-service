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



    @Column(updatable = false,nullable = false)
    private LocalDateTime endTime;

    @Enumerated(EnumType.STRING)
    private PowerEventType powerEventType;

    @OneToOne(targetEntity = Status.class)
    @JoinColumn(name = "Status",nullable = false)
    Status status;

    @Column(updatable = false,nullable = false )
    private LocalDateTime created;



}
