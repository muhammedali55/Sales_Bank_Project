package com.muhammet.sales.service;

import com.muhammet.sales.repository.AccountTransactionsRepository;
import com.muhammet.sales.repository.entity.AccountTransactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountTransactionsService {

    @Autowired
    private AccountTransactionsRepository accountTransactionsRepository;

    public List<AccountTransactions> getListAll(){
        return accountTransactionsRepository.findAll();
    }
}
