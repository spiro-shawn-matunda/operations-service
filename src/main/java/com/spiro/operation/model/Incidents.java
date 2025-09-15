
package com.spiro.operation.model;

import jakarta.persistence.*;

@Entity
public class Incidents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerId;

   /* @ManyToOne(targetEntity = Battery.class, optional = false)
    @JoinColumn(name = "Battery_OEM")
    Battery battery;
*/



    private String vehicleNo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }



    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }
}
