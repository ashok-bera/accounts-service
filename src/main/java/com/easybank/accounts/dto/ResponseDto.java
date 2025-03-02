package com.easybank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@AllArgsConstructor
@Schema(
        name = "Response",
        description = "Schema to hold successful response"
)
public class ResponseDto {
    @Schema(description = "Status code of the response")
    private String statusCode;
    @Schema(description = "Status message of the response")
    private String statusMsg;

}
