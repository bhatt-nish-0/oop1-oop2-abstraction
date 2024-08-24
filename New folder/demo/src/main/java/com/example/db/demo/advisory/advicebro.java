package com.example.db.demo.advisory;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class advicebro {

    @ExceptionHandler(Exception.class)
    public String lol() {
        return "oops!";
    }
}
