package com.spiro.operation.repository;

import com.spiro.operation.model.ShiftRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftRecordRepository extends JpaRepository<ShiftRecord, String> {
}