package com.spiro.operation.repository;

import com.spiro.operation.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, String> {
}
