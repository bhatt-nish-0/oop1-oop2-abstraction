package com.nishbro.brodafone.demo.advices;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AdviceExample {

    @ExceptionHandler(Exception.class)
    public String someStuffWentWrong() {
        System.out.println("in here!");
        return "aiyo!";
    }
}
