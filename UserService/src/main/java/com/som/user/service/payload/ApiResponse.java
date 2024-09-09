package com.som.user.service.payload;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder //follow builder pattern to build object of this class
public class ApiResponse {

    private String message;
    private boolean success;
    private HttpStatus status;
}
