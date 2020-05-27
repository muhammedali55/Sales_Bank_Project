package com.muhammet.sales.repositories;

import com.muhammet.sales.repository.CustomerRepository;
import com.muhammet.sales.repository.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(properties = {"spring.profiles.active=local"})
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void AddCustomer(){
        Customer customer = new Customer();
        //customer.setId(1);
        customer.setName("Ali");
        customer.setSurname("HOCA");
        customer.setAddress("Ankara");
        customerRepository.save(customer);
    }

}
