package com.easybank.accounts.service;

import com.easybank.accounts.dto.CustomerDto;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);
}
