package com.spiro.operation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class PowerEvents {
    @Id
    private String id;
    private String event;

    @Column(updatable = false,nullable = false)
    private LocalDateTime startTime;


    @Column(updatable = false,nullable = false)
    private LocalDateTime endTime;

    @Column(nullable = false)
    private String  status;

}
