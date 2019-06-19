package com.sanish.timeclock.controller;

import com.sanish.timeclock.model.Punch;
import com.sanish.timeclock.service.PunchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PunchController {
    @Autowired
    private PunchService punchService;

    @RequestMapping(value= "/punch", method = RequestMethod.GET)
    public List<Punch> getPunches()
    {
        return punchService.getAllPunches();
    }

    @RequestMapping(value= "/punch/{id}", method = RequestMethod.GET)
    public Punch getPunch(@PathVariable("id") Integer id)     {

        return punchService.getPunchById(id);
    }

    @RequestMapping(value = "/punch/employee")
    public Iterable<Punch>  searchPunchByEmployee(@RequestParam("employee") String employeeid){
        return punchService.getPunchByEmployeeId(employeeid);

    }


    @RequestMapping(value = "/punch/search")
    public Iterable<Punch>  searchPunch(@RequestParam(value = "storeId") Integer storeId , @RequestParam(value = "deviceId") String deviceId){
        return punchService.getPunchByQuery(storeId,deviceId);

    }

    @RequestMapping(value = "/punch", method = RequestMethod.POST)
    public Punch addPunch(@Valid @RequestBody Punch punch){


        return punchService.savePunch(punch);
    }

    @RequestMapping(value = "/punch/{id}", method = RequestMethod.PUT)
    public Punch editPunch(@PathVariable("id") Integer id, @Valid @RequestBody Punch punch) {

        punch.setPunchId(id);
        return punchService.savePunch(punch);

    }

    @RequestMapping(value = "/punch/{id}", method = RequestMethod.DELETE)
    public  void removePunch(@PathVariable("id") Integer id) {
        punchService.deletePunch(id);

    }


}
