package com.muhammet.sales.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
  long id;

  @Column(name = "customer_id")
  long customer_id;


  @Column(name = "account_number")
  String account_number;

  @Column(name = "currency")
  String currency;


}
