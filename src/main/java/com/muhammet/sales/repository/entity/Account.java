package com.muhammet.sales.repository.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.util.Currency;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "table_account")
@ApiModel(value = "account entity",description = "get all account datas on database")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "search my id for account")
    long id;
    @NotNull
    @Column(name = "customer_id")
    long customer_id;
    @NotNull
    long account_type_id;
    @NotNull
    String account_number;
    @Digits(integer = 13,fraction = 2)
    Currency balance;


//    @OneToMany(fetch = FetchType.EAGER)
//    @JoinColumn(name = "account_id")
//    @Builder.Default
//    Set<AccountTransactions> accountTransactionList = new HashSet<>();
//
//    @OneToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "account_type_id", insertable = false,updatable = false)
//    @Builder.Default
//    AccountType accountType = new AccountType();


}
