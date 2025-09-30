package com.spiro.operation.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Battery {

    @Id
    private String Oem;

    @Column(nullable = false)
    private boolean faulty;


    @Column(updatable = false,nullable = false)
    private LocalDateTime createdAt;

    @ManyToOne(targetEntity = Status.class)
    @JoinColumn(name = "Status", nullable = false)
    Status status;

    @Column(updatable = false,nullable = false )
    private LocalDateTime updatedAt;



}
