package com.muhammet.sales.service;

import com.muhammet.sales.repository.CustomerRepository;
import com.muhammet.sales.repository.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllList(){
       return customerRepository.findAll();
    }

    public void saveCustomer(Customer customer){
        customerRepository.save(customer);
    }
}
