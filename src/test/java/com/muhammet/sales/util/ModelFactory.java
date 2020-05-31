package com.muhammet.sales.util;

import com.muhammet.sales.dto.request.CustomerRequestDto;
import com.muhammet.sales.repository.entity.Customer;
import java.util.Date;

public class ModelFactory {

  public static final String NAME = "MUHAMMET";
  public static final Date BIRTH = new Date();
  public static final String SURNAME = "KAYA";
  public static final String UK_PHONE_NUMBER = "07429195711";

  public static CustomerRequestDto buildCustomerRequestDto() {
    return CustomerRequestDto.builder()
        .birth(BIRTH)
        .name(NAME)
        .surname(SURNAME)
        .phone(UK_PHONE_NUMBER)
        .build();
  }

  public static Customer buildCustomer() {
    return Customer.builder()
        .birth(BIRTH)
        .name(NAME)
        .surname(SURNAME)
        .phone(UK_PHONE_NUMBER)
        .build();
  }
}
