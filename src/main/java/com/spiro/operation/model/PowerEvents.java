package com.spiro.operation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class PowerEvents {
    @Id
    private String id;
    private String event;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

}
