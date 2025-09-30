package com.spiro.operation.controller;

import com.spiro.operation.dto.ShiftRecordDTO;
import com.spiro.operation.dto.ShiftRecordRequest;
import com.spiro.operation.service.ShiftRecordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shift-records")
public class ShiftRecordController {

    private final ShiftRecordService shiftRecordService;

    public ShiftRecordController(ShiftRecordService shiftRecordService) {
        this.shiftRecordService = shiftRecordService;
    }

    @PostMapping
    public ResponseEntity<ShiftRecordDTO> createShiftRecord(@RequestBody ShiftRecordRequest request) {
        ShiftRecordDTO dto = shiftRecordService.createShiftRecord(request);
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShiftRecordDTO> getShiftRecordById(@PathVariable String id) {
        return shiftRecordService.getShiftRecordById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<ShiftRecordDTO>> getAllShiftRecords() {
        return ResponseEntity.ok(shiftRecordService.getAllShiftRecords());
    }
}

