package com.muhammet.sales.repository;

import com.muhammet.sales.repository.entity.AccountTransactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountTransactionsRepository extends JpaRepository<AccountTransactions,Long> {
}
