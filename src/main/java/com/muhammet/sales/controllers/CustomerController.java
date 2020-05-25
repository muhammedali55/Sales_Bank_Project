package com.muhammet.sales.controllers;

import com.muhammet.sales.repository.entity.Customer;
import com.muhammet.sales.service.CustomerService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@Api(value = "get All actions for customers")
public class CustomerController {

    @Autowired
    private CustomerService _customerService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        return ResponseEntity.ok(_customerService.getAllList());
    }

    @PostMapping("/save")
    public ResponseEntity<List<Customer>> saveCustomer(@RequestBody Customer customer){
        _customerService.saveCustomer(customer);
        return  ResponseEntity.ok(_customerService.getAllList());
    }

}
