package com.muhammet.sales.mapper;

import com.muhammet.sales.dto.request.CustomerRequestDto;
import com.muhammet.sales.dto.response.CustomerResponseDto;
import com.muhammet.sales.repository.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CustomerMapper {

  Customer toCustomer(final CustomerRequestDto customerRequestDto);


  CustomerResponseDto toCustomerResponseDto(final Customer customer);

}
