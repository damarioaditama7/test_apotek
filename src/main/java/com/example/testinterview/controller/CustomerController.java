package com.example.testinterview.controller;

import com.example.testinterview.entity.Customer;
import com.example.testinterview.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    private ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
        Customer cust = customerService.create(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(cust);
    }

    @GetMapping
    private ResponseEntity<List<Customer>> getAllCustomer(){
        List<Customer> list = customerService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @PutMapping
    private ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
        Customer cust = customerService.update(customer);
        return ResponseEntity.status(HttpStatus.OK).body(cust);
    }

    @DeleteMapping("/{customerId}")
    private ResponseEntity<String> deleteCustomer(@PathVariable("customerId") String id){
        customerService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
