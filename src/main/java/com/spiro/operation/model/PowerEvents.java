package com.spiro.operation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class PowerEvents {
    @Id
    private String id;


    @Column(updatable = false,nullable = false)
    private LocalDateTime startTime;


    @Column(updatable = false,nullable = false)
    private LocalDateTime endTime;

    @Column(updatable = false,nullable = false )
    private LocalDateTime created;


}
