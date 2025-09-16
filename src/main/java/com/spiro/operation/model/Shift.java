package com.spiro.operation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Shift {

    @Id
    private String id;
    private String attendantName;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

}
