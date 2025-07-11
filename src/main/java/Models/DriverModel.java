package Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "driver")
public class DriverModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;
    String name;
    String licenseNumber;
    Boolean active;
}
