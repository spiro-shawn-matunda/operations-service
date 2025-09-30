package com.spiro.operation.repository;

import com.spiro.operation.model.Stations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationsRepository extends JpaRepository<Stations,String> {
}
