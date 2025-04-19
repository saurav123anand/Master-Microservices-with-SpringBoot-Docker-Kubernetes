package com.microservices.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccountsDto {
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
}
