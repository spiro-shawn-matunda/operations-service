package com.spiro.operation.controller;

import com.spiro.operation.dto.BatteryRequest;
import com.spiro.operation.dto.BatteryResponse;
import com.spiro.operation.service.BatteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/batteries")
public class BatteryController {

    @Autowired
    private BatteryService batteryService;

    @PostMapping
    public ResponseEntity<BatteryResponse> createBatteryRecord(@RequestBody BatteryRequest batteryRequest) {
        BatteryResponse response = batteryService.createBatteryRecord(batteryRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BatteryResponse> getBatteryRecordById(@PathVariable String id) {
        BatteryResponse response = batteryService.getBatteryRecordById(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/attendant/{attendantId}")
    public ResponseEntity<List<BatteryResponse>> getBatteryRecordsByAttendant(@PathVariable String attendantId) {
        List<BatteryResponse> responses = batteryService.getBatteryRecordsByAttendant(attendantId);
        return ResponseEntity.ok(responses);
    }

    @GetMapping
    public ResponseEntity<List<BatteryResponse>> getAllBatteryRecords() {
        List<BatteryResponse> responses = batteryService.getAllBatteryRecords();
        return ResponseEntity.ok(responses);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BatteryResponse> updateBatteryRecord(@PathVariable String id, @RequestBody BatteryRequest batteryRequest) {
        BatteryResponse response = batteryService.updateBatteryRecord(id, batteryRequest);
        return ResponseEntity.ok(response);
    }


}