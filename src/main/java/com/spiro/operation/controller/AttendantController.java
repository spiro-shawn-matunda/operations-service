package com.spiro.operation.controller;

import com.spiro.operation.dto.AttendantRequest;
import com.spiro.operation.service.AttendantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attendants")
@CrossOrigin(origins = "*")
public class AttendantController {

    @Autowired
    private AttendantService attendantService;

    @PostMapping
    public ResponseEntity<?> createAttendant(@RequestBody AttendantRequest attendantRequest) {
        try {
            AttendantRequest createdAttendant = attendantService.createAttendant(attendantRequest);
            return ResponseEntity.ok(createdAttendant);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAttendantById(@PathVariable String id) {
        try {
            AttendantRequest attendant = attendantService.getAttendantById(id);
            return ResponseEntity.ok(attendant);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> getAllAttendants() {
        try {
            List<AttendantRequest> attendants = attendantService.getAllAttendants();
            return ResponseEntity.ok(attendants);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateAttendant(@PathVariable String id, @RequestBody AttendantRequest attendantRequest) {
        try {
            AttendantRequest updatedAttendant = attendantService.updateAttendant(id, attendantRequest);
            return ResponseEntity.ok(updatedAttendant);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


}
