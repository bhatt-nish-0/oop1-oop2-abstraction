package com.nishbro.brodafone.demo.component;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

//@Component
public class NewComponent {

    private String test;

    public String getTest() {
        return test;
    }

    //@PostConstruct
    private  void instantiate() {
        this.test = "to hell with u!";
    }

    public void setTest(String a) {
        this.test = a;
    }
}
