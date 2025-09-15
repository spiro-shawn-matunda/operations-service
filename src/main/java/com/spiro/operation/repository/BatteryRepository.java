package com.spiro.operation.repository;

import com.spiro.operation.model.Attendants;
import com.spiro.operation.model.Battery;

import java.util.List;

public interface BatteryRepository {
    List<Battery> findBynumberOfChargers(String Battery);
    List<Battery> findByfaultyBattereies(String Battery);
    List<Battery> findBynumberOfBatteries(String Battery);

}
