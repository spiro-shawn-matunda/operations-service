package com.spiro.operation.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class PowerEvent {

    @Id
    private String id;

    @Column(updatable = false, nullable = false)
    private LocalDateTime startTime;

    @Column(updatable = false, nullable = false)
    private LocalDateTime endTime;

    @Enumerated(EnumType.STRING)
    private PowerEventType type;

    @OneToOne
    @JoinColumn(name = "status_id", nullable = false)
    private Status status;

    @Column(updatable = false, nullable = false)
    private LocalDateTime created;

    public PowerEvent() {
    }

    public PowerEvent(String id, LocalDateTime startTime, LocalDateTime endTime,
                      PowerEventType type, LocalDateTime created) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.type = type;
        this.created = created;
    }


    public void setStatus(Status status) {
        this.status = status;
    }

}
