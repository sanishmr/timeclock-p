package com.sanish.timeclock.service;

import com.sanish.timeclock.model.Punch;

import java.util.List;


public interface PunchService {
    Punch getPunchById(Integer id);
    List<Punch> getAllPunches();
    Punch savePunch(Punch punch);
    void deletePunch(Integer id);
    Iterable<Punch> getPunchByEmployeeId(String employeeId);
    Iterable<Punch> getPunchByQuery (Integer storeId, String deviceId);
}
