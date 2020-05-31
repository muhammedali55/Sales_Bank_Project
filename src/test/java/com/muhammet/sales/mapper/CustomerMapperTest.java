package com.muhammet.sales.mapper;

import static com.muhammet.sales.util.ModelFactory.buildCustomerRequestDto;
import static org.assertj.core.api.Assertions.assertThat;

import com.muhammet.sales.dto.request.CustomerRequestDto;
import com.muhammet.sales.repository.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CustomerMapperTest {

  CustomerMapper customerMapper = new CustomerMapperImpl();

  @Test
  public void map_formCustomerRequestDto_toCustomer() {
    CustomerRequestDto customerRequestDto = buildCustomerRequestDto();
    Customer customer = customerMapper.toCustomer(customerRequestDto);
    assertThat(customer.getName()).isEqualTo(customerRequestDto.getName());
    assertThat(customer.getSurname()).isEqualTo(customerRequestDto.getSurname());
    // continue please...
  }

}
