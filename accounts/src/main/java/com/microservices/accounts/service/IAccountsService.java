package com.microservices.accounts.service;

import com.microservices.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     *
     * @param customerDto- CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

}
