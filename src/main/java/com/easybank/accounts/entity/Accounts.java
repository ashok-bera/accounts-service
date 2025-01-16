package com.easybank.accounts.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
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
