package com.spiro.operation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Battery {

    @Id
    private String Oem;

    private String faulty;

    private String numberOfBatteries;

    private String numberOfChargers;

    private String numberOfFaultyChargers;

    @Column(nullable = false)
    private String status;

    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Column(updatable = false)
    private LocalDateTime updatedAt;


}
