package com.muhammet.sales.repository;

import com.muhammet.sales.repository.entity.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountTypeRepository extends JpaRepository<AccountType,Long> {
}
