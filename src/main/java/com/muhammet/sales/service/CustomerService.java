package com.muhammet.sales.service;

import com.muhammet.sales.dto.request.CustomerRequestDto;
import com.muhammet.sales.mapper.CustomerMapper;
import com.muhammet.sales.repository.CustomerRepository;
import com.muhammet.sales.repository.entity.Customer;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerService {

  @Autowired
  CustomerMapper customerMapper;
  @Autowired
  private CustomerRepository customerRepository;

  public List<Customer> getCustomers() {
    return customerRepository.findAll();
  }

  public void saveCustomer(CustomerRequestDto customerRequestDto) {
    log.info("saveCustomer() - save customer service processing started.");
    Customer customer = customerMapper.toCustomer(customerRequestDto);
    customerRepository.save(customer);
  }
}
