package com.example.testinterview.service;

import com.example.testinterview.entity.Customer;

import java.util.List;

public interface CustomerService {
    public Customer create(Customer customer);
    public Customer update(Customer customer);
    public List<Customer> getAll();
    public void delete(String id);
}
