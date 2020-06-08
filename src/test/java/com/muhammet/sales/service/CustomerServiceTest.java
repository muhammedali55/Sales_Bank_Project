package com.muhammet.sales.service;


import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.*;

import com.muhammet.sales.dto.request.CustomerRequestDto;
import com.muhammet.sales.dto.response.CustomerResponseDto;
import com.muhammet.sales.mapper.CustomerMapper;
import com.muhammet.sales.repository.CustomerRepository;
import com.muhammet.sales.repository.entity.Customer;
import com.muhammet.sales.util.ModelFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {

  @Mock
  private CustomerMapper customerMapper;

  @Mock
  private CustomerRepository customerRepository;


  @InjectMocks
  private CustomerService customerService;



  @Test
  public void save_customer_return_success() {
    CustomerRequestDto customerRequestDto = ModelFactory.buildCustomerRequestDto();
    Customer customer = ModelFactory.buildCustomer();
    when(customerMapper.toCustomer(customerRequestDto)).thenReturn(customer);
    customerService.saveCustomer(customerRequestDto);
    verify(customerRepository, times(1)).save(customer);
  }
  @Test
  public  void get_customer_by_key_success(){
    CustomerResponseDto customerResponseDto = ModelFactory.buildcustomerResponseDto();
    Customer customer = ModelFactory.buildCustomer();
    lenient().when(customerRepository.getOne(1L)).thenReturn(customer);
    customerService.getCustomerByKey(1L);
    verify(customerRepository,times(1)).getOne(1L);
    lenient().when(customerService.getCustomerByKey(1L)).thenReturn(customerResponseDto);
  }


  /*
  @Test
  public void getChargesFeeByProductKey_chargesFeeNotFound() throws ParseException {
    when(productService.getProductByProductKey(PRODUCT_KEY)).thenReturn(buildProduct());
    when(productRepository.findByProductKey(PRODUCT_KEY)).thenReturn(Optional.of(buildProduct()));
    when(chargesFeeRepository.findByProductKey(PRODUCT_KEY)).thenReturn(Optional.empty());

    ProductManagerException exceptionThrown =
        assertThrows(
            ProductManagerException.class,
            () -> {
              chargesFeeService
                  .getChargesFeeByProductKey(PRODUCT_KEY);
            });

    MatcherAssert.assertThat(exceptionThrown.getMessage(),
        is(equalTo(CHARGES_FEE_GET_LIST_NOT_FOUND.getMessage())));
    MatcherAssert.assertThat(exceptionThrown.getErrorType().getCode(),
        is(equalTo(CHARGES_FEE_GET_LIST_NOT_FOUND.getCode())));
  }

   */


}
