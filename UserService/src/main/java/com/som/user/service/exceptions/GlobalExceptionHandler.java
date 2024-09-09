package com.som.user.service.exceptions;

import com.som.user.service.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//This will be the centralized exception handler any exception
// that comes will be handled here
@RestControllerAdvice
public class GlobalExceptionHandler {

    //here we will send data and the response status code
    @ExceptionHandler(ResourceNotFoundException.class)//this will identify wherever the given error occurs this method will execute
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex){

        String message = ex.getMessage();
        ApiResponse response = ApiResponse.builder()
                .message(message)
                .success(true)
                .status(HttpStatus.NOT_FOUND)
                .build();
        return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);

    }
}
