package com.muhammet.sales.repository.entity;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {

  @Id
  @Column(name = "id")
  long id;


  @Column(name = "name")
  String name;


  @Column(name = "surname")
  String surname;


  @Column(name = "address")
  String address;

  @Column(name = "phone")
  String phone;

  @Temporal(TemporalType.DATE)
  @Column(name = "birth")
  Date birth;

}
