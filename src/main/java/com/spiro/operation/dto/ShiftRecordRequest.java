package com.spiro.operation.dto;

import java.time.LocalDateTime;

public class ShiftRecordRequest {

    private String StatusId;
    private String IncidentIds;
    private LocalDateTime timeIn;
    private LocalDateTime timeOut;
    private String units;
    private String Comments;

    public void setTimeIn(LocalDateTime timeIn) {
        this.timeIn = timeIn;
    }

    public LocalDateTime getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(LocalDateTime timeOut) {
        this.timeOut = timeOut;
    }

    public String getIncidentIds() {
        return IncidentIds;
    }

    public void setIncidentIds(String incidentIds) {
        IncidentIds = incidentIds;
    }

    public String getStatusId() {
        return StatusId;
    }

    public void setStatusId(String statusId) {
        StatusId = statusId;
    }

    public LocalDateTime getTimeIn() {
        return timeIn;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }
}

