package com.spiro.operation.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class ShiftTable {

    @Id
    private String id;

    @Column(nullable = false)
    private LocalDateTime startTime;

    @OneToOne(targetEntity = Status.class)
    @JoinColumn(name = "Status",nullable = false)
    Status status;

    @Column(nullable = false)
    private LocalDateTime endTime;

    @Enumerated(EnumType.STRING)
    private ShiftType shiftType;

    @OneToMany(fetch = FetchType.LAZY, targetEntity = Attendants.class)
    @JoinTable(
            name = "Attendants_ShiftRecord",
            joinColumns = @JoinColumn(name = "Attendants_id"),
            inverseJoinColumns = @JoinColumn(name = "ShiftRecord-id")
    )
    List<Attendants> attendants;

    @Column(nullable = false,updatable = false)
    private LocalDateTime createdAt;
}
