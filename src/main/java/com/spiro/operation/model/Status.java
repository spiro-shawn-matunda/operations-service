package com.spiro.operation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Status {

    @Id
    private String id;


    @Column
    private String description;


    public String getId()

    {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   /* public boolean getStatus() {
        return status;
    }

    public void setName(boolean status) {
        this.status = status;
    }
*/
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
