package com.muhammet.sales.dto.request;


import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequestDto implements Serializable {

  @NotNull
  String name;

  @NotNull
  String surname;

  @Size(min = 2, max = 18)
  String phone;

  Date birth;


}
