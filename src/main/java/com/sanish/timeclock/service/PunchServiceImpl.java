package com.sanish.timeclock.service;

import com.sanish.timeclock.model.Punch;
import com.sanish.timeclock.repository.PunchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("punchService")
public class PunchServiceImpl implements PunchService {

    @Autowired
    private PunchRepository punchRepository;

    @Override
    public Punch getPunchById(Integer id) {
        return punchRepository.getOne(id);
    }

    @Override
    public List<Punch> getAllPunches() {
        return punchRepository.findAll();
    }

    @Override
    public Punch savePunch(Punch punch) {
        return punchRepository.save(punch);
    }

    @Override
    public void deletePunch(Integer id) {

        punchRepository.delete(getPunchById(id));
    }

    @Override
    public Iterable<Punch>  getPunchByEmployeeId(String employeeid) {
       return punchRepository.findByEmployeeId(employeeid);
    }

    @Override
    public Iterable<Punch> getPunchByQuery(Integer storeId, String deviceId) {
        return punchRepository.findByStoreIdAndDeviceId(storeId,deviceId);
    }


}
