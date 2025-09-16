package com.spiro.operation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class ShiftRecord {

    @Id
    private String id;

    @Column(nullable = false)
    private LocalDateTime timeIn;


    @Column(nullable = false)
    private LocalDateTime timeOut;

    private String units;

    private String comments;

    @Column(nullable = false)
    private String status;

    @Column(updatable = false, unique = true)
    private LocalDateTime createdAt;

    @Column(updatable = false, unique = true)
    private LocalDateTime updatedAt;


}
