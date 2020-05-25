package com.muhammet.sales.repository;

import com.muhammet.sales.repository.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long>
{
}
