package com.muhammet.sales.controller;

import static com.muhammet.sales.constants.RestApiUrls.CUSTOMER;
import static com.muhammet.sales.constants.RestApiUrls.CUSTOMERS;
import static com.muhammet.sales.constants.RestApiUrls.CUSTOMER_MANAGER_API_VERSION;
import static com.muhammet.sales.util.ModelFactory.buildCustomerRequestDto;
import static com.muhammet.sales.utils.JsonUtils.convertToJson;
import static org.mockito.Mockito.doNothing;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.muhammet.sales.controllers.CustomerController;
import com.muhammet.sales.dto.request.CustomerRequestDto;
import com.muhammet.sales.exceptions.GlobalExceptionHandler;
import com.muhammet.sales.service.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class CustomerControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Mock
  private CustomerService customerService;

  @InjectMocks
  private CustomerController customerController;

  @BeforeEach
  public void init() {
    mockMvc = MockMvcBuilders.standaloneSetup(customerController)
        .setControllerAdvice(new GlobalExceptionHandler())
        .build();
  }

  //Note: /Users/hakankuzudisli/Desktop/ProductManager/Sales_Bank_Project/src/test/java/com/muhammet/sales/controller/CustomerControllerTest.java uses or overrides a deprecated API.
  //Note: Recompile with -Xlint:deprecation for details.
  // Please check it out ...

  @Test
  public void save_customer_return_success() throws Exception {
    CustomerRequestDto customerRequestDto = buildCustomerRequestDto();
    doNothing().when(customerService).saveCustomer(customerRequestDto);
    this.mockMvc
        .perform(post(CUSTOMER_MANAGER_API_VERSION + CUSTOMERS + CUSTOMER)
            .contentType(APPLICATION_JSON_UTF8_VALUE)  // SPRING 5.1.9 UPDATE PLEASE
            .content(convertToJson(customerRequestDto)))
        .andExpect(status().isOk());
  }



  /*
  @Test
  public void save_account_return_bad_request_for_min_balance_bigger_than_max_balance()
      throws Exception {
    accountRequestDto.setMinBalance(new BigDecimal("500.00"));
    accountRequestDto.setMaxBalance(new BigDecimal("100.000"));

    doThrow(new ProductManagerException(INVALID_MIN_BALANCE_GREATER_THAN_MAX_BALANCE))
        .when(accountService)
        .saveAccount(accountRequestDto);

    String payload = convertToJson(accountRequestDto);

    this.mockMvc
        .perform(post(PRODUCT_MANAGER_API_VERSION + PRODUCTS + ACCOUNT)
            .contentType(APPLICATION_JSON_UTF8_VALUE)
            .content(payload))
        .andExpect(status().isBadRequest())
        .andExpect(
            jsonPath("$.code").value(INVALID_MIN_BALANCE_GREATER_THAN_MAX_BALANCE.getCode()))
        .andExpect(
            jsonPath("$.message")
                .value(INVALID_MIN_BALANCE_GREATER_THAN_MAX_BALANCE.getMessage()));
  }

   */

}
