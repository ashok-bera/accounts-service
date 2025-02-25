package com.easybank.accounts.service;

import com.easybank.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * Create a new account in the system.
     *
     * @param customerDto - Data Transfer Object that contains the customer
     *                     information.
     */
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);


}
