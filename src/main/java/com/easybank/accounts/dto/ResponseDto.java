package com.easybank.accounts.dto;

import lombok.*;

@Data
@AllArgsConstructor
public class ResponseDto {
    private String statusCode;
    private String statusMsg;

}
