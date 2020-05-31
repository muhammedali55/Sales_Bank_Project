package com.muhammet.sales.dto.request;


import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequestDto implements Serializable {


  @NotNull
  @Size(max = 50, message = "name must not be greater than 50 characters")
  String name;

  @NotNull
  String surname;

  String phone;

  Date birth;


}
