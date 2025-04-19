package com.microservices.accounts.controller;

import com.microservices.accounts.constants.AccountsConstants;
import com.microservices.accounts.dto.CustomerDto;
import com.microservices.accounts.dto.ResponseDto;
import com.microservices.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/",produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class AccountController {
    private IAccountsService accountsService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount
            (@RequestBody CustomerDto customerDto) {
        accountsService.createAccount(customerDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ResponseDto
                        (AccountsConstants.STATUS_201,
                                AccountsConstants.MESSAGE_201));
    }
}
