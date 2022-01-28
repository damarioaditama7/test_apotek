package com.example.testinterview.service.impl;

import com.example.testinterview.entity.Customer;
import com.example.testinterview.repository.CustomerRepository;
import com.example.testinterview.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer create(Customer customer) {
        customer.setDeleted(false);
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAll(){
        List<Customer> customerList = customerRepository.findAll();
        List<Customer> newList = null;
        for (int i = 0; i < customerList.size(); i++) {
            if(!customerList.get(i).getDeleted()){
                newList.add(customerList.get(i));
            }
        }
        return newList;
    }

    @Override
    public void delete(String id) {
      Customer getCustomer = customerRepository.getById(id);
      getCustomer.setDeleted(true);
    }
}
