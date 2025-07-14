package com.AIT.examen.Repositories;

import com.AIT.examen.Models.DriverModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDriverRepository extends JpaRepository<DriverModel, Long> {
}
