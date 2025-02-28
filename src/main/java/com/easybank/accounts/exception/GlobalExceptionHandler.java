package com.easybank.accounts.exception;


import com.easybank.accounts.dto.ErrorRespDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Handle {@link CustomerAlreadyExistsException} thrown from the application.
     * This exception is thrown when a customer tries to create an account with an existing mobile number.
     *
     * @param exception   the {@link CustomerAlreadyExistsException} exception
     * @param webRequest  the {@link WebRequest} object
     *
     * @return a {@link ResponseEntity} with a {@link ErrorRespDto} as body and
     *         a status of {@link HttpStatus#BAD_REQUEST}
     */
    @ExceptionHandler(CustomerAlreadyExistsException.class)
    public ResponseEntity<ErrorRespDto> handleCustomerAlreadyExistsException(CustomerAlreadyExistsException exception,
                                                                             WebRequest webRequest){
        ErrorRespDto errorResponseDTO = new ErrorRespDto(
                webRequest.getDescription(false),
                HttpStatus.BAD_REQUEST,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorRespDto> handleResourceNotFoundException(ResourceNotFoundException exception,
                                                                             WebRequest webRequest){
        ErrorRespDto errorResponseDTO = new ErrorRespDto(
                webRequest.getDescription(false),
                HttpStatus.NOT_FOUND,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.NOT_FOUND);
    }

}
