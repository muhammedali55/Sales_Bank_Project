package com.muhammet.sales.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResponseDto {

    @NotNull
    String name;

    @NotNull
    String surname;

    @Size(min = 2, max = 18)
    String phone;

    Date birth;

}
