package com.spiro.operation.dto;

import java.time.LocalDateTime;

public class BatteryRequest {

    private String Oem;
    private String faulty;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public BatteryRequest(String oem, String faulty, LocalDateTime createdAt, LocalDateTime updatedAt) {
        Oem = oem;
        this.faulty = faulty;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getOem() {
        return Oem;
    }

    public void setOem(String oem) {
        Oem = oem;
    }

    public String getFaulty() {
        return faulty;
    }

    public void setFaulty(String faulty) {
        this.faulty = faulty;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
