package com.alm33.vaadin.sample.app.service;

import com.alm33.vaadin.sample.app.entity.Customer;
import com.alm33.vaadin.sample.app.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer read(Integer id) {
        return customerRepository.getById(id);
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public void delete(Integer id) {
        Customer customer = customerRepository.getById(id);
        customerRepository.delete(customer);
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
