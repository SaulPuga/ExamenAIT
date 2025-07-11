package Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "orders")
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;
    String status;
    String origin;
    String destination;
    Date createdAt;
    Date updatedAt;

}
