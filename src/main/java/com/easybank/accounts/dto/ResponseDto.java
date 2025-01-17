package com.easybank.accounts.dto;

import lombok.*;

@Data
@AllArgsConstructor
public class ResponseDto {

//    @Schema(
//            description = "Status code in the response"
//    )
    private String statusCode;

//    @Schema(
//            description = "Status message in the response"
//    )
    private String statusMsg;

}
