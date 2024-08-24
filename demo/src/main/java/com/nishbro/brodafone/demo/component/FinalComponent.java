package com.nishbro.brodafone.demo.component;

import org.springframework.stereotype.Component;

@Component
public class FinalComponent {

    public FinalComponent(Long long2) {
        this.long2 = long2;
    }

    private final Long long2;

    public Long getLong() {
        return this.long2;
    }

}
