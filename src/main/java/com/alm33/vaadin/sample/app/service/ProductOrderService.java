package com.alm33.vaadin.sample.app.service;

import com.alm33.vaadin.sample.app.entity.ProductOrder;
import com.alm33.vaadin.sample.app.repository.ProductOrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductOrderService {

    private ProductOrderRepository productOrderRepository;

    public ProductOrderService(ProductOrderRepository productOrderRepository) {
        this.productOrderRepository = productOrderRepository;
    }

    public ProductOrder read(Integer id) {
        return productOrderRepository.getById(id);
    }

    public ProductOrder save(ProductOrder customer) {
        return productOrderRepository.save(customer);
    }

    public void delete(Integer id) {
        ProductOrder customer = productOrderRepository.getById(id);
        productOrderRepository.delete(customer);
    }

    public List<ProductOrder> findAll() {
        return productOrderRepository.findAll();
    }
}
