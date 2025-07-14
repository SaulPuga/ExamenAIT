package com.AIT.examen.Servicies;

import com.AIT.examen.Models.DriverModel;
import com.AIT.examen.Repositories.IDriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DriverService {

    @Autowired
    IDriverRepository driverRepository;

    public DriverModel saveDriver(DriverModel driver) {
        return driverRepository.save(driver);
    }

    public ArrayList<DriverModel> getDriver() {
        return (ArrayList<DriverModel>) driverRepository.findAll();
    }

    public List<DriverModel> getByParam(String param) {
        return driverRepository.findAll(Sort.by(param));
    }
}
