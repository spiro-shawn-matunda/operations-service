package com.spiro.operation.repository;

import com.spiro.operation.model.PowerEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PowerEventRepository extends JpaRepository<PowerEvent, String> {
}
