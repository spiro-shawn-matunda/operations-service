package com.spiro.operation.controller;


import com.spiro.operation.dto.AttendantsRequest;
import com.spiro.operation.dto.AttendantsResponse;
import com.spiro.operation.service.AttendantsService;
import com.spiro.operation.service.impl.AttendantsServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attendant")
public class AttendantsController {

    private final AttendantsServiceImpl attendantService;

    public AttendantsController(AttendantsServiceImpl attendantService) {
        this.attendantService = attendantService;
    }


    @PostMapping
    public ResponseEntity<?> createAttendant(@RequestBody AttendantsRequest attendantRequest) {
            AttendantsResponse createdAttendant = attendantService.createAttendant(attendantRequest);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdAttendant);
    }

    @GetMapping
    public ResponseEntity<List<AttendantsResponse>> getAllAttendants() {
        return ResponseEntity.ok(attendantService.getAllAttendants());
    }

}
