package com.muhammet.sales.repository.entity;

import io.swagger.annotations.ApiModelProperty;
import java.util.Currency;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "table_account")
public class Account {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(value = "search my id for account")
  long id;
  
  @NotNull
  @Column(name = "customer_id")
  long customer_id;

  @NotNull
  @Column(name = "account_type_id")
  long account_type_id;

  @NotNull
  @Column(name = "account_number")
  String account_number;

  @Column(name = "balance")
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
