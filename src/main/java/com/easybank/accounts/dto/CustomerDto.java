package com.easybank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold customer and account info"
)
public class CustomerDto {
    @Schema(description = "Name of the customer", example = "Ashok Bera")
    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min=3, max=20, message = "Name must be between 3 and 20 characters")
    private String name;

    @Schema(description = "Email of the customer", example = "akb.bera@gmail")
    @NotEmpty(message = "Email can not be a null or empty")
    @Email(message = "Invalid Email Address!")
    private String email;

    @Schema(description = "Mobile number of the customer", example = "1234567890")
    @NotEmpty(message = "MobileNumber can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "MobileNumber must be 10 digits")
    private String mobileNumber;

    @Schema(description = "Account details of the customer")
    private AccountsDto accountsDto;
}
