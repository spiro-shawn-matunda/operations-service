package com.spiro.operation.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Status {
    @Id
    private String id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column
    private String description;

    public Status() {}

    public String getId()
    {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
