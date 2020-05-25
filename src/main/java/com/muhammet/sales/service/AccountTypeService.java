package com.muhammet.sales.service;

import com.muhammet.sales.repository.AccountTypeRepository;
import com.muhammet.sales.repository.entity.AccountType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountTypeService {

    @Autowired
    private AccountTypeRepository accountTypeRepository;

    public List<AccountType> getListAll(){
        return accountTypeRepository.findAll();
    }
}
