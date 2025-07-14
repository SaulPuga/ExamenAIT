package com.AIT.examen.Models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "orders")
public class OrderModel implements Serializable {

    @Id
    String id;
    String status;
    String origin;
    String destination;
    @CreationTimestamp
    Date createdat;
    @CreationTimestamp
    Date updatedat;

}
