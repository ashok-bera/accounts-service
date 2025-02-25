package com.easybank.accounts.entity;


import jakarta.persistence.*;
import lombok.*;

import lombok.Data;

@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity {
    private long customerId;
    @Id
    @Column(name = "account_number")
    private long accountNumber;
    private String accountType;
    private String branchAddress;
}

