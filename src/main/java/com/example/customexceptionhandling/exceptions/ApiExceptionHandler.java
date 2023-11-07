package com.example.customexceptionhandling.exceptions;

import org.springframework.http.ResponseEntity;

public class ApiExceptionHandler {

    public ResponseEntity<Object> handleApiRequestException(ApiRequestException e){
        //1. Create payload containing exception details
        //2. Return responseEntity
    }

}
