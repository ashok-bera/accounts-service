package com.easybank.accounts.service.impl;

import com.easybank.accounts.dto.CustomerDto;
import com.easybank.accounts.repos.AccountsRepo;
import com.easybank.accounts.repos.CustomerRepo;
import com.easybank.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountsService {

    private AccountsRepo accountsRepo;
    private CustomerRepo customerRepo;
    /**
     * @param customerDto
     */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
