package com.spiro.operation.repository;

import com.spiro.operation.model.ShiftRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShiftRecordRepository extends JpaRepository<ShiftRecord,String> {
}
