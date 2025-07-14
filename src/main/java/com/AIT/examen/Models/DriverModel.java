package com.AIT.examen.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "driver")
public class DriverModel implements Serializable {

    @Id
    String id;
    String name;
    String licensenumber;
    Boolean active;
}
