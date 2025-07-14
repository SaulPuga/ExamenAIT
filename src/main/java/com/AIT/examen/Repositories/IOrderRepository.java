package com.AIT.examen.Repositories;

import com.AIT.examen.Models.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends JpaRepository<OrderModel, Long> {
}
