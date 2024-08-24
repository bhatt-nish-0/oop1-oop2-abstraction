package com.nishbro.brodafone.demo.controllers;

import com.nishbro.brodafone.demo.pojo.Pojo;
import com.nishbro.brodafone.demo.pojo.PojoAnother;
import jakarta.validation.Valid;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/holidays")
    public Pojo test(@RequestParam String hello) {
        System.out.println(hello);
        Pojo pojo = new Pojo("ter",56);
        return pojo;
    }

    @GetMapping("/holidays2/{string}")
    public Pojo test2(@PathVariable String string) {
        System.out.println(string);
        Pojo pojo = new Pojo("ter",56);
        return pojo;
    }

    @PostMapping("/add")
    public void test3(@Valid @RequestBody PojoAnother pojoAnother, Errors errors) {

        if (errors.hasErrors()) {
            System.out.println("something is wrong");
            return;
        }

        System.out.println("all good!");
    }

    @GetMapping("/purposelyError")
    public void doing() {
        throw new RuntimeException();
    }
}
