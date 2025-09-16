package com.spiro.operation.model;

import jakarta.persistence.*;

@Entity
<<<<<<< HEAD
=======
@Table(name = "countries")
>>>>>>> 85865daaf2b9e34f98ca3b63ee80a01932dd2469
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    @Column( nullable = false)
    private Long id;


    private String name;

    private String code;
    private String state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
=======
    private String id;

    @Column
    private String name;

    @Column
    private String code;
    @Column

    private String state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
>>>>>>> 85865daaf2b9e34f98ca3b63ee80a01932dd2469
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 85865daaf2b9e34f98ca3b63ee80a01932dd2469
