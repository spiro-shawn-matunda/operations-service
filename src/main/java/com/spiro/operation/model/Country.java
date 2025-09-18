package com.spiro.operation.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Country {
    @Id
    private String id;

    @Column(nullable = false, unique = true)
    private String name;


    @ManyToOne(targetEntity = Status.class)
    @JoinColumn(name = "Status_id", referencedColumnName = "id")
    Status status;



    @Column
    private String description;


    @OneToMany(fetch = FetchType.LAZY, targetEntity = Stations.class)
    @JoinTable(
            name = "Country_Stations",
            joinColumns = @JoinColumn(name = "Country_id"),
            inverseJoinColumns = @JoinColumn(name = "Stations_id")
    )
    private List<Stations> stations;



    public String getId() {
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
