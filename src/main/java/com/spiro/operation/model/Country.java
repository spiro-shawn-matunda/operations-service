package com.spiro.operation.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Country {
    @Id
    private String id;

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToOne(targetEntity = Status.class)
    @JoinColumn(name = "Status", nullable = false)
    Status status;

    private String stateName;

    @Column(nullable = false)
private LocalDateTime createdAt;


}
