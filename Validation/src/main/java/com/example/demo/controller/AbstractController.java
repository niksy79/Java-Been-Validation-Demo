package com.example.demo.controller;

import com.example.demo.exception.AuthenticationException;
import com.example.demo.exception.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Date;

@ControllerAdvice
public class AbstractController {

    @ExceptionHandler(AuthenticationException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ErrorDTO handleNotAuthorizedException(AuthenticationException e) {
        return new ErrorDTO(new Date(), "Validation error", e.getMessage());

    }
}
