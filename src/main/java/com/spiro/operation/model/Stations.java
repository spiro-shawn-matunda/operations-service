package com.spiro.operation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Stations {
    @Id
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, updatable = false)
    private String location;


    private int batteryCapacity;

    @Column(nullable = false)
    private LocalDateTime createdAt;
}
