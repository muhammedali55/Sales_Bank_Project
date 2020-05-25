package com.muhammet.sales.repository.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "table_customer")
@ApiModel(value = "Customer values for Entity"
        ,description = "all customer datas on Database  ")
public class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @ApiModelProperty(value = "uniqe key for customer")
        @Column(name = "id")
        long id;
        @NotNull
        String name;
        @NotNull
        String surname;
        String address;
        //min-> 55
        //max-> +190 555 555 55 55
        @Size(min = 2,max = 18)
        String phone;

        @Temporal(TemporalType.DATE)
        @Past()
        Date birth;

        @ManyToMany(fetch = FetchType.LAZY)
        @JoinColumn(name = "id",referencedColumnName = "customer_id",updatable = false,insertable = false)
        @Builder.Default
        Set<Account> accountList = new HashSet<>();
}
