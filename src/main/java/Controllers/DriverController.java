package Controllers;

import Models.DriverModel;
import Models.OrderModel;
import Servicies.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Driver;
import java.util.Optional;

@RestController
@RequestMapping
public class DriverController {

    @Autowired
    DriverService driverService;

    @PostMapping("/driver")
    public DriverModel saveDriver(@RequestBody DriverModel driver){
        return this.driverService.saveDriver(driver);
    }

}
