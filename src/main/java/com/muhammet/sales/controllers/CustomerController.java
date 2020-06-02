package com.muhammet.sales.controllers;

import com.muhammet.sales.dto.request.CustomerRequestDto;
import com.muhammet.sales.dto.response.CustomerResponseDto;
import com.muhammet.sales.repository.entity.Customer;
import com.muhammet.sales.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.muhammet.sales.constants.RestApiUrls.*;

@RestController
@RequestMapping(CUSTOMER_MANAGER_API_VERSION + CUSTOMERS)
@Api(value = "Customer Manager Rest APIs")
@Slf4j
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  @GetMapping()
  public ResponseEntity<List<Customer>> getCustomers() {
    return ResponseEntity.ok(customerService.getCustomers());
  }

  @GetMapping(CUSTOMER_BY_KEY)
  public ResponseEntity<CustomerResponseDto> getCustomerFindByKey(long customerKey){
      return ResponseEntity.ok(customerService.getCustomerByKey(customerKey));
  }


  @PostMapping(CUSTOMER)
  @ApiOperation(value = "save customer", nickname = "saveCustomer", response = ResponseEntity.class)
  public ResponseEntity<Void> saveCustomer(
      @RequestBody @Valid CustomerRequestDto customerRequestDto) {

    log.info("controller(saveCustomer) - validated customerRequestDto:{}", customerRequestDto);
    customerService.saveCustomer(customerRequestDto);

    return ResponseEntity.ok().build();
  }


}
