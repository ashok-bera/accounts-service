package com.easybank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Schema(
        name = "Accounts",
        description = "Schema to hold account info"
)
public class AccountsDto {

    @Schema(description = "Account number of the customer")
    @NotEmpty(message = "AccountNumber can not be a null or empty")
    @Pattern(regexp="(^$|[0-9]{10})",message = "AccountNumber must be 10 digits")
    private Long accountNumber;

    @Schema(description = "Account type for the account", example = "Savings")
    @NotEmpty(message = "AccountType can not be a null or empty")
    private String accountType;

    @Schema(description = "Easy Bank Branch Address", example = "123, 3rd floor, New Delhi")
    @NotEmpty(message = "BranchAddress can not be a null or empty")
    private String branchAddress;
}