package com.muhammet.sales.service;

import com.muhammet.sales.repository.AccountRepository;
import com.muhammet.sales.repository.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getListAll(){
        return accountRepository.findAll();
    }
}
