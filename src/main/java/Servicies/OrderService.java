package Servicies;

import Models.OrderModel;
import Repositories.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    IOrderRepository orderRepository;

    public OrderModel saveOrder(OrderModel order) {
        return orderRepository.save(order);
    }

    public ArrayList<OrderModel> getOrder() {
        return (ArrayList<OrderModel>) orderRepository.findAll();
    }

    public List<OrderModel> getByParam(String param) {
        return orderRepository.findAll(Sort.by(param));
    }

    public Optional<OrderModel> getById(Long id) {
        return orderRepository.findById(id);
    }

}