package com.AIT.examen.Controllers;

import com.AIT.examen.Models.DriverModel;
import com.AIT.examen.Servicies.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class DriverController {

    @Autowired
    DriverService driverService;

    @PostMapping("/driver")
    public DriverModel saveDriver(@RequestBody DriverModel driver){
        return this.driverService.saveDriver(driver);
    }

}
