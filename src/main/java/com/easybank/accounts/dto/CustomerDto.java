package com.easybank.accounts.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {
    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min=3, max=20, message = "Name must be between 3 and 20 characters")
    private String name;
    @NotEmpty(message = "Email can not be a null or empty")
    @Email(message = "Invalid Email Address!")
    private String email;
    @NotEmpty(message = "MobileNumber can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "MobileNumber must be 10 digits")
    private String mobileNumber;
    private AccountsDto accountsDto;
}
