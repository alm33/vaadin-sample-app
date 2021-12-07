package com.alm33.vaadin.sample.app.service;

import com.alm33.vaadin.sample.app.entity.Order;
import com.alm33.vaadin.sample.app.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order read(Integer id) {
        return orderRepository.getById(id);
    }

    public Order save(Order customer) {
        return orderRepository.save(customer);
    }

    public void delete(Integer id) {
        Order customer = orderRepository.getById(id);
        orderRepository.delete(customer);
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }
}
